import javax.swing.*;

public class GUI {

    public static void main(String[] args){

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();


        frame.setSize(300, 300);
        frame.setTitle("Bruh");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);

        JLabel label = new JLabel("User");
        label.setBounds(10,20,80,25);
        panel.add(label);

        JTextField userText = new JTextField();

        frame.setVisible(true);

    }
}
