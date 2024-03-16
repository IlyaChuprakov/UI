import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App
{
    private JButton button1;
    private JPanel panel1;
    private JTextField input;

    static int num;

    private String inputText = input.getText();

    public App() {
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                int userNum = Integer.parseInt(input.getText());
                if (userNum > num)
                    JOptionPane.showMessageDialog( null, "Число меньше");
                else if (userNum < num)
                    JOptionPane.showMessageDialog( null, "Число больше");
                else
                    JOptionPane.showMessageDialog( null, "Вы угадали!");
            }
        });
    }
    
    public static void main(String[] args)
    {
        num = (int)Math.floor(Math.random() * 10);
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}