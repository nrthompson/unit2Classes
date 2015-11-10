import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Color;
public class ItalianFlagComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle leftRectangle = new Rectangle(100, 100, 30, 60);
        Rectangle rightRectangle = new Rectangle(160, 100, 30, 60);
        Line2D.Double topLine = new Line2D.Double(130, 100, 160, 100);
        Line2D.Double bottomLine = new Line2D.Double(130, 160, 160, 160);
        g2.setColor(Color.GREEN);
        g2.fill(leftRectangle);
        g2.setColor(Color.RED);
        g2.fill(rightRectangle);
        g2.setColor(Color.BLACK);
        g2.draw(topLine);
        g2.draw(bottomLine);
    }
}