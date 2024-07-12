import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class prog91 extends JFrame{
    private JTextField textField1,textField2,textField3;
    public prog91()
    {
        setTitle("calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField textField1=new JTextField(10);
        JTextField textField2=new JTextField(10);
        JTextField textField3=new JTextField(10);
        JButton mybutton=new JButton("calulator");
        mybutton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double num1=Double.parseDouble(textField1.getText());
                double num2=Double.parseDouble(textField2.getText());
                double num3=Double.parseDouble(textField3.getText());
                double sum=num1+num2+num3;
                double largest=Math.max(Math.max(num1, num2),num3);
                JOptionPane.showMessageDialog(null,"sum: "+sum+"\n largest :"+largest,"reusult",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        JPanel panel=new JPanel(new GridLayout(4,2));
        panel.add(new JLabel("1st number"));
        panel.add(textField1);
        panel.add(new JLabel());
        panel.add(new JLabel("2nd number"));
        panel.add(textField2);
        panel.add(new JLabel());
        panel.add(new JLabel("3rd number"));
        panel.add(textField3);
        panel.add(new JLabel());
        panel.add(mybutton);
        getContentPane().add(panel);
        setSize(300,200);
        setVisible(true);

    }

    public static void main(String[] args)
    {
        prog91 p1=new prog91();
    }


}