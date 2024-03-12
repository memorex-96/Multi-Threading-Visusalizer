import javax.swing.JFrame; 
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon; 
import java.awt.event.ActionListener; 
import java.awt.Dimension;  
import java.awt.Color; 
import java.io.OutputStream;
import java.io.PrintStream; 

public class App {
    private static int WIDTH = 800;
    private static int HEIGHT = 600; 
    private static JTextArea outputTextArea; 
    
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Carson's Multi-Threading Visualizer");
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setLayout(null); //important
        ImageIcon img = new ImageIcon("C:\\Users\\batb2\\OneDrive\\Pictures\\Screenshots\\Multi-Threading Program Icon.png"); 
        ActionListener listener = new ThreadOne(); 
        JButton button1 = new JButton("Click for Thread");
        JLabel label1 = new JLabel(" These are the Threads that are running ^^^." + 
        "\n Watch the Threads execute code at the same time!");    

        outputTextArea = new JTextArea(); 
        JScrollPane scrollPane = new JScrollPane(outputTextArea);
        scrollPane.setBounds(10,60,580,330); 

        button1.setPreferredSize(new Dimension(40,40)); 
        button1.setBounds(0, 0, 200, 50);
        label1.setPreferredSize(new Dimension(400,50));
        label1.setBounds(20,400,800,50);

        button1.addActionListener(listener);
        frame.setSize(WIDTH, HEIGHT); 
        frame.setVisible(true);
        frame.setIconImage(img.getImage());
        frame.add(button1);
        frame.add(scrollPane);
        frame.add(label1);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PrintStream printStream = new PrintStream(new CustomOutputStream(outputTextArea));
        System.setOut(printStream);    //reassigning the output stream to the JScrollPanel
    }
}
class CustomOutputStream extends OutputStream {
    private JTextArea textArea;
    public CustomOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }
    @Override
    public void write(int b) {
        textArea.append(String.valueOf((char) b));
        textArea.setCaretPosition(textArea.getDocument().getLength());  //scrolls the bar down
    }
}