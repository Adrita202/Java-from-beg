import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="WelcomeApplet" width=300 height=300></applet> */
public class WelcomeApplet extends Applet implements ActionListener {
    Button welcomeButton;

    @Override
    public void init() {
        welcomeButton = new Button("Click Me");
        welcomeButton.addActionListener(this);
        add(welcomeButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == welcomeButton) {
            System.out.println("Welcome!");
        }
    }
}

