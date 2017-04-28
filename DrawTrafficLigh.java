
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class DrawTrafficLigh extends JComponent 
{
  public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      Rectangle box=new Rectangle(20,20,70,190);
      Color c =new Color(192,192,192);
      g2.setColor(c);
      g2.fill(box);
      g2.draw(box);
      
      g2.setColor(Color.RED);
      Ellipse2D.Double c1 = new Ellipse2D.Double(30, 30, 50, 50);
     g2.draw(c1);
     g2.fill(c1);
     
     g2.setColor(Color.YELLOW);
      Ellipse2D.Double c2 = new Ellipse2D.Double(30, 90, 50, 50);
      g2.draw(c2);
      g2.fill(c2);
      
      Ellipse2D.Double c3 = new Ellipse2D.Double(30, 150, 50, 50);
      g2.draw(c3);
      g2.setColor(Color.GREEN);
      g2.fill(c3);

      

     



   }
}
