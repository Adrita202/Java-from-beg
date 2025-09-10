public class DemoString {
    public static void main(String[] args) {
        String   name=     "Alpaca";
    //  datatype variable object
        System.out.println(name);
        String a="Kunal";
        System.out.println(a);
        String b="Kunal";
        a="kusha";
        System.out.println(a);

        //comparison of strings
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2);// true, because both point to the same object in the pool


    }
}

/* String Pool  :seperate memory structure inside the heap.All similar values of strting are not recreated, makes program optimised
If wanted change via on variable, it can't be done as string are immutable
 
### **String Pool**

* The **String Pool** is a special memory region inside the **heap** in Java.
* When you create a string using string literals (e.g., `"hello"`), Java first checks if the same string already exists in the pool.
* If it does, Java reuses the existing object instead of creating a new one.
* This saves memory and makes string handling more efficient.

  ```
* But if you create a string with `new String("Java")`, a new object is created in the heap, **outside** the pool.



### **Immutability of Strings**

* Strings in Java are **immutable**, which means once a string object is created, its value **cannot be changed**.
* If you try to modify a string, a **new object** is created instead.
* Example:


  String s = "Hello";
  s = s.concat(" World");
  System.out.println(s); // "Hello World" (a new string object was created)
  ```
* **Why immutability?**

  * **Security** → Strings are used in sensitive areas like network connections, database credentials, and file paths. If they were mutable, someone could change them after creation, causing serious issues.
  * **Caching & String Pool** → Because strings can’t be changed, the same string object can safely be reused from the pool.
  * **Thread-safety** → Immutable objects can be shared between multiple threads without synchronization problems.
 */