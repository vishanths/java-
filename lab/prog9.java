import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class prog9 extends JFrame
{
    // private JTextField textField1, textField2, textField3;

    public prog9()
    {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);
        JTextField textField3 = new JTextField(10);

        JButton myButton = new JButton("Calculate");

        myButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                double num3 = Double.parseDouble(textField3.getText());
                 
                double sum = num1 + num2 + num3;
                double avg = sum / 3;
                double largest = Math.max(Math.max(num1, num2), num3);
                                                                                                                                 
                String result = "Sum : " + sum + "\nAvg : " + avg + "\nlargest : " + largest;
                JOptionPane.showMessageDialog(null, result, "Result message", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(new JLabel("enter first number : "));
        panel.add(textField1);
        panel.add(new JLabel());
        panel.add(new JLabel("enter second number : "));
        panel.add(textField2);
        panel.add(new JLabel());
        panel.add(new JLabel("enter third number : "));
        panel.add(textField3);
        panel.add(new JLabel());
        panel.add(myButton);

        getContentPane().add(panel);
        setSize(300, 200);
        setVisible(true);
    };

    public static void main(String[] args)
    {
        prog9 myframe = new prog9();
    }
}
