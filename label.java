import javax.swing.JFrame;
import javax.swing.JLabel;
public class label 
{
public static void main(String[]args)
{
    JLabel label =new JLabel();
    label.setText("Where does this show up?");
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.TOP);
    JFrame frame = new JFrame();
    frame.setSize(500,500);
    frame.setVisible(true);
    frame.add(label);
   
}
}
