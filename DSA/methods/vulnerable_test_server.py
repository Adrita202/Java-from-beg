#!/usr/bin/env python3
"""
Vulnerable Test Server for Scanner Validation
Run this to test your vulnerability scanner
"""

from flask import Flask, request, redirect, render_template_string, make_response
import os
import subprocess

app = Flask(__name__)

# HTML template for test pages
TEST_PAGE_TEMPLATE = """
<!DOCTYPE html>
<html>
<head><title>Vulnerability Test Server</title></head>
<body>
    <h1>Scanner Test Server</h1>
    <h2>Available Test Endpoints:</h2>
    <ul>
        <li><a href="/sql_test?id=1">SQL Injection Test</a></li>
        <li><a href="/xss_test?input=hello">XSS Test</a></li>
        <li><a href="/redirect_test?url=https://google.com">Open Redirect Test</a></li>
        <li><a href="/file_test?file=test.txt">Directory Traversal Test</a></li>
        <li><a href="/sensitive_test">Sensitive Data Exposure Test</a></li>
    </ul>
    
    <h2>Forms for Testing:</h2>
    <form action="/sql_test" method="GET">
        <input type="text" name="id" placeholder="Enter ID">
        <button type="submit">Test SQL</button>
    </form>
    
    <form action="/xss_test" method="GET">
        <input type="text" name="input" placeholder="Enter input">
        <button type="submit">Test XSS</button>
    </form>
    
    <form action="/redirect_test" method="GET">
        <input type="text" name="url" placeholder="Enter URL">
        <button type="submit">Test Redirect</button>
    </form>
</body>
</html>
"""

@app.route('/')
def home():
    return TEST_PAGE_TEMPLATE

# DELIBERATELY VULNERABLE SQL INJECTION ENDPOINT
@app.route('/sql_test')
def sql_test():
    user_id = request.args.get('id', '1')
    
    # VULNERABLE: Direct string concatenation (DO NOT USE IN PRODUCTION!)
    if "'" in user_id or "OR" in user_id.upper():
        return f"<h1>SQL Error Detected!</h1><p>MySQL error: You have an error in your SQL syntax near '{user_id}'</p>"
    
    return f"<h1>SQL Test</h1><p>Searching for user ID: {user_id}</p><p>User found: Test User {user_id}</p>"

# DELIBERATELY VULNERABLE XSS ENDPOINT
@app.route('/xss_test')
def xss_test():
    user_input = request.args.get('input', 'hello')
    
    # VULNERABLE: Direct HTML injection (DO NOT USE IN PRODUCTION!)
    return f"""
    <h1>XSS Test</h1>
    <p>Your input was: {user_input}</p>
    <p>Reflected back without sanitization!</p>
    """

# DELIBERATELY VULNERABLE OPEN REDIRECT ENDPOINT
@app.route('/redirect_test')
def redirect_test():
    url = request.args.get('url', 'https://google.com')
    
    # VULNERABLE: No URL validation (DO NOT USE IN PRODUCTION!)
    if url:
        return redirect(url, code=302)
    
    return "<h1>Redirect Test</h1><p>No URL provided</p>"

# DELIBERATELY VULNERABLE DIRECTORY TRAVERSAL ENDPOINT
@app.route('/file_test')
def file_test():
    filename = request.args.get('file', 'test.txt')
    
    # VULNERABLE: No path validation (DO NOT USE IN PRODUCTION!)
    try:
        # Simulate reading files
        if '../' in filename or 'etc/passwd' in filename:
            return """<h1>File Contents:</h1>
            <pre>root:x:0:0:root:/root:/bin/bash
daemon:x:1:1:daemon:/usr/sbin:/usr/sbin/nologin
bin:x:2:2:bin:/bin:/usr/sbin/nologin</pre>"""
        
        if 'config' in filename:
            return """<h1>Config File:</h1>
            <pre>database_password=secret123
api_key=abc123def456
admin_token=super_secret_key</pre>"""
            
        return f"<h1>File Test</h1><p>Reading file: {filename}</p><p>File contents: Sample content for {filename}</p>"
    
    except Exception as e:
        return f"<h1>Error</h1><p>Cannot read file: {e}</p>"

# DELIBERATELY VULNERABLE SENSITIVE DATA EXPOSURE
@app.route('/sensitive_test')
def sensitive_test():
    return """
    <h1>Sensitive Data Test</h1>
    <p>This page contains sensitive information:</p>
    <div style="display:none;">
        <!-- Hidden sensitive data -->
        password=admin123
        api_key=sk-1234567890abcdef
        database_url=mysql://root:password123@localhost/app
        secret_token=jwt_secret_key_here
    </div>
    <p>Check the HTML source for hidden sensitive data!</p>
    """

# Safe endpoint for testing (should show no vulnerabilities)
@app.route('/safe_test')
def safe_test():
    user_input = request.args.get('input', 'hello')
    # Properly escaped
    from html import escape
    safe_input = escape(user_input)
    return f"<h1>Safe Test</h1><p>Your safely handled input: {safe_input}</p>"

if __name__ == '__main__':
    print("🚨 VULNERABLE TEST SERVER - FOR TESTING ONLY! 🚨")
    print("⚠️  DO NOT USE IN PRODUCTION - DELIBERATELY INSECURE!")
    print("🎯 Starting test server on http://localhost:5000")
    print()
    print("Test your scanner with:")
    print("python scanner.py http://localhost:5000/sql_test --params id")
    print("python scanner.py http://localhost:5000/xss_test --params input")
    print("python scanner.py http://localhost:5000/redirect_test --params url")
    print("python scanner.py http://localhost:5000/file_test --params file")
    print("python scanner.py http://localhost:5000")
    print()
    
    app.run(debug=True, host='0.0.0.0', port=5000)