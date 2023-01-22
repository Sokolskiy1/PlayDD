package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main  extends JFrame{
    //public static void main(String[] args) {
      //  System.out.println("Hello world!");
   // }
    public static void main(String[] args) {
        /*JFrame a = new JFrame("example");
        JButton b = new JButton("click me");
        b.setBounds(40,90,85,20);
        a.add(b);
        a.setSize(900,900);
        a.setLayout(null);
        a.setVisible(true);
        System.out.println("Hello world!");*/
        Main app = new Main();
        //app.setLocationRelativeTo(null);
        app.setVisible(true);
    }
    private JLabel label;

    public Main() {

        //Создаем фрейм (окно)
        setName("My cool window");

        //Просим программу закрыться при закрытии фрейма
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Создадим лейбл и поместим его во фрейм
        label = new JLabel("First window");
        add(label, BorderLayout.CENTER);
        setPreferredSize(new Dimension(400, 400));
        //Создадим кнопку  и поместим ее во фрейм
        JButton newGame = new JButton("Push me");
        JButton options = new JButton("Push me1");
        JButton exit = new JButton("Push me");
        Container container = getContentPane();
        container.setLayout(new FlowLayout( FlowLayout.LEFT, 10, 10));
        container.add(newGame);
        container.add(options);
        container.add(exit);
        //container.add(options);
        //add(container, BorderLayout.SOUTH);
        //add(options, BorderLayout.SOUTH);
        //add(exit, BorderLayout.SOUTH);
        setLocationRelativeTo(null);

        //Добавим к кнопке слушатель события
        newGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Вот тут как раз вызываем второе окно
                SecondFrame frame = new SecondFrame();
            }
        });

        //Выровниваем размер фрейма под контент
        pack();
    }
}