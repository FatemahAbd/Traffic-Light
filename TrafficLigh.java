import javax.swing.JFrame;

public class TrafficLigh
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(200, 350);
      frame.setTitle("A Traffic Light");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       DrawTrafficLigh component = new DrawTrafficLigh();
      frame.add(component);

      frame.setVisible(true);

    } 
}  
