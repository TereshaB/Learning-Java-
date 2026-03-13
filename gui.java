
import javax.swing.JFrame;
public class gui
{
    public static void main(String[]args)
    {
        JFrame frame = new JFrame(); // creates a gui frame 
        frame.setSize(800,900); // sets size of the frame 
        frame.setTitle("TereshaB"); // set the title for JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // make the exit button actually work 
        frame.setResizable(false); // the JFrame isn't resizable
        frame.setVisible(true); // JFrame is made visible 
    }
}
