package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gui3 extends JFrame
{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton("Add them up");

    Font fnt = new Font("Georgia&",Font.BOLD,20);

    Gui3()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,150);
        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);
        add(button);

        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent
                                                ae)

            {
                try
                {
                    double x1 =

                            Double.parseDouble(jta1.getText().trim());

                    double x2 =

                            Double.parseDouble(jta2.getText().trim());

                    JOptionPane.showMessageDialog(null, "Result = "+(x1+x2),"Alert",JOptionPane.INFORMATION_MESSAGE);

                }
                catch(Exception e)
                {

                    JOptionPane.showMessageDialog(null, "Error in Numbers!","alert" , JOptionPane.ERROR_MESSAGE);

                }
            }
        });

        setVisible(true);
    }

    public static void main(String[]args)
    {
        new Gui3();
    }

}