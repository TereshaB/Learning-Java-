import java.awt.Color;
import javax.swing.JFrame;
public class color 
{
public static void main(String[]args)
{
    JFrame frame1 = new JFrame();
    frame1.setSize(400,300);
    frame1.setResizable(false);
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame1.getContentPane().setBackground(Color.red);
    JFrame frame2 =new JFrame();
    frame2.getContentPane().setBackground(Color.yellow);
    frame2.setSize(300,400);
    frame2.setVisible(true);
    frame1.setVisible(true);

}
    
}
