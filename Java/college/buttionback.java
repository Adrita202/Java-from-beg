import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="ColorButtonsApplet" width=300 height=300></applet> */
public class ColorButtonsApplet extends Applet implements ActionListener {
    Button redButton, greenButton, blueButton;

    @Override
    public void init() {
        redButton = new Button("Red");
        greenButton = new Button("Green");
        blueButton = new Button("Blue");

        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);

        add(redButton);
        add(greenButton);
        add(blueButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            setBackground(Color.RED);
        } else if (e.getSource() == greenButton) {
            setBackground(Color.GREEN);
        } else if (e.getSource() == blueButton) {
            setBackground(Color.BLUE);
        }
    }
}

