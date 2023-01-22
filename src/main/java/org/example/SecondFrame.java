package org.example;//import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class SecondFrame extends JFrame{
    private JFrame label;

    public SecondFrame() {
        //setVisible(true);
        //setName("My cool window");
        //label = new JLabel("Second window");
        //setContentPane(label);
        //pack();
        //setPreferredSize(new Dimension(1000, 1000));

        //setLocationRelativeTo(null);
        //setPreferredSize(new Dimension(400, 400));
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JFrame frame = new JFrame("LoL");

        //Image img =new ImageIcon("res/fon.jpg").getImage();

        JFrame label = new JFrame( "KEK");
        //setSize(1920,1500);
        label.setSize(1920,1500);
        label.add(new Draka());

      //  Icon icon = new ImageIcon("res/capabilities/1.png");

      //  JButton button = new JButton(icon);

       // label.add(button);
        label.setVisible(true);
        //label.add(new Draka());
       // Pizdelka();

    }

    public void Pizdelka()
    {

    }

}
