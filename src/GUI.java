import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private static JLabel userLabel;                private static JTextField userText;
    private static JLabel passwordLabel;    private static JPasswordField passwordText;
    private static JButton button;                  private static JLabel successLabel;

    public static void main(String[] args){

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(350, 200);
        frame.setTitle("Bruh");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener(new GUI());
        panel.add(button);

        successLabel = new JLabel("");
        successLabel.setBounds(10,110,300,25);
        panel.add(successLabel);


        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        char[] password = passwordText.getPassword();

        System.out.println(user + ", " + new String(password));
    }
}
