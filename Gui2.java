package GUI;

import java.awt.*;
import javax.swing.*;
public class Gui2 extends JFrame
{
    JTextField jta = new JTextField(10);

    Font fnt = new Font("Georgia",Font.BOLD,20);
    Gui2()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,100);
        add(jta);
        jta.setForeground(Color.BLACK);
        jta.setFont(fnt);
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new Gui2();
    }
}