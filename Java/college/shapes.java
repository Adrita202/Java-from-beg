import java.applet.*;
import java.awt.*;

/* <applet code="ShapesApplet" width=300 height=300></applet> */
public class ShapesApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawRect(50, 50, 100, 50); // Rectangle

        g.setColor(Color.BLUE);
        g.drawOval(50, 150, 100, 100); // Circle

        g.setColor(Color.GREEN);
        g.drawLine(200, 50, 300, 150); // Line
    }
}

