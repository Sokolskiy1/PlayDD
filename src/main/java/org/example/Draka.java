package org.example;

import org.example.Pers.*;
import org.example.Skils.SkillAction;

import javax.swing.*;
import javax.swing.text.PlainView;
import java.awt.*;
//import java.awt.*;
//import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Draka extends JPanel implements ActionListener,Runnable{//
    public String sostoynie;
    public String sostoynieboss;
    SkillAction action = new SkillAction();
    BossDevushka boss = new BossDevushka();
    Gerald gerald = new Gerald();
    Gravedigger mogilshic = new Gravedigger();
    Teta teta = new Teta();
    Krasavchic krasava = new Krasavchic();
    Image img =new ImageIcon("res/fon/fon2.jpg").getImage();//res/fon1 G:/Plays/MyPlayVersionTwo/src/res/fon.jpg
    Image firstvoin =new ImageIcon("res/fon/Mogilnik.png").getImage();
    Image Secondtvoin =new ImageIcon("res/fon/Vedmak.png").getImage();
    Image ThreePers =new ImageIcon("res/fon/newsuperdama.png").getImage();

    Image Krutoy =new ImageIcon("res/udar/KrasStoit.png").getImage();
    Image vrag =new ImageIcon("res/fon/vrag.png").getImage();

    Image hp1 =new ImageIcon("res/hp/1.png").getImage();
    Image hp2 =new ImageIcon("res/hp/1.png").getImage();
    Image hp3 =new ImageIcon("res/hp/1.png").getImage();
    Image hp4 =new ImageIcon("res/hp/1.png").getImage();
    Image hp5 =new ImageIcon("res/hp/1.png").getImage();
    Image fakel =new ImageIcon("res/hp/fakelhp.png").getImage();

    Icon icon = new ImageIcon("res/capabilities/1.png");
    Icon icon2 = new ImageIcon("res/capabilities/5.png");
    Icon icon3 = new ImageIcon("res/capabilities/4.png");
    Icon icon4 = new ImageIcon("res/capabilities/geraldvipad.png");
    Icon icon5 = new ImageIcon("res/capabilities/2.png");
    Icon icon6 = new ImageIcon("res/capabilities/6.png");
    Icon icon7 = new ImageIcon("res/capabilities/7.png");
    Icon icon8 = new ImageIcon("res/capabilities/8.png");
    Icon icon9 = new ImageIcon("res/capabilities/10.png");



    JButton button1 = new JButton(icon);
    JButton button2 = new JButton(icon2);
    JButton button3 = new JButton(icon3);
    JButton button4 = new JButton(icon4);
    JButton button5 = new JButton(icon5);
    JButton button6 = new JButton(icon6);
    JButton button7 = new JButton(icon7);
    JButton button8 = new JButton(icon8);
    JButton startNewRaund = new JButton(icon9);

    JButton button1no = new JButton(icon);
    JButton button2no = new JButton(icon2);
    JButton button3no = new JButton(icon3);
    JButton button4no = new JButton(icon4);
    JButton button5no = new JButton(icon5);
    JButton button6no = new JButton(icon6);
    JButton button7no = new JButton(icon7);
    JButton button8no = new JButton(icon8);
    JPanel buttonPane = new JPanel();

    //счетчик ходов игрока
    public int hodilornetcount = 0;
    public Draka(){

        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.LINE_AXIS));
        buttonPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 500));
        buttonPane.add(Box.createHorizontalGlue());
        buttonPane.add(Box.createRigidArea(new Dimension(100, 0)));
        button1.setMargin(new Insets(0,0,0,0));
        button2.setMargin(new Insets(0,0,0,0));
        button3.setMargin(new Insets(0,0,0,0));
        button4.setMargin(new Insets(0,0,0,0));
        button5.setMargin(new Insets(0,0,0,0));
        button6.setMargin(new Insets(0,0,0,0));
        button7.setMargin(new Insets(0,0,0,0));
        button8.setMargin(new Insets(0,0,0,0));
        startNewRaund.setMargin(new Insets(0,0,0,0));
        buttonPane.add(button1);
        buttonPane.add(Box.createRigidArea(new Dimension(30, 0)));
        buttonPane.add(button2);
        buttonPane.add(Box.createRigidArea(new Dimension(180, 0)));
        buttonPane.add(button3);
        buttonPane.add(Box.createRigidArea(new Dimension(30, 0)));
        buttonPane.add(button4);
        buttonPane.add(Box.createRigidArea(new Dimension(180, 0)));
        buttonPane.add(button5);
        buttonPane.add(Box.createRigidArea(new Dimension(30, 0)));
        buttonPane.add(button6);
        buttonPane.add(Box.createRigidArea(new Dimension(180, 0)));
        buttonPane.add(button7);
        buttonPane.add(Box.createRigidArea(new Dimension(30, 0)));
        buttonPane.add(button8);
        buttonPane.add(Box.createRigidArea(new Dimension(100, 0)));
        buttonPane.add(startNewRaund);
        this.add(buttonPane);
        //this.add(startNewRaund);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Вот тут как раз вызываем второе окно
                if(mogilshic.live==true){
                System.out.println("skill1");
                sostoynie = "MogilshicUdar";
                //repaint();
                hod(mogilshic);
                mogilshic.skilOne(boss);
                deactivateButton(1);}
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Вот тут как раз вызываем второе окно
                if(mogilshic.live==true){
                System.out.println("skill2");
                sostoynie = "MogilshicLech";
                mogilshic.skilTwo(gerald);
                mogilshic.skilTwo(mogilshic);
                mogilshic.skilTwo(teta);
                mogilshic.skilTwo(krasava);
                //repaint();
                hod(mogilshic);
                deactivateButton(1);}
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Вот тут как раз вызываем второе окно
                if(gerald.live==true){
                System.out.println("skill3");
                gerald.skilOne(boss);//GeraldUdar

                sostoynie="GeraldUdar";
                //Image Secondtvoin =new ImageIcon("res/fon/GeraldUdar.png").getImage();
                //repaint();
                hod(gerald);
                deactivateButton(2);}
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Вот тут как раз вызываем второе окно
                if(gerald.live==true){
                System.out.println("skill4");
                System.out.println("skill3");
                gerald.skilTwo(boss);//GeraldUdar
                sostoynie="GeraldBrosok";
                //Image Secondtvoin =new ImageIcon("res/fon/GeraldUdar.png").getImage();
                //repaint();
                hod(gerald);
                deactivateButton(2);}
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Вот тут как раз вызываем второе окно
                if(teta.live==true){
                System.out.println("skill5");
                        sostoynie = "TetaUdar";
                //repaint();
                hod(teta);
                teta.skilOne(boss, gerald,mogilshic,krasava);
                deactivateButton(3);}
            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Вот тут как раз вызываем второе окно
                if(teta.live==true){
                System.out.println("skill6");
                sostoynie = "TetaSupUdar";
                teta.skilTwo(boss);
                //repaint();
                hod(teta);
                teta.skilTwo(boss);
                deactivateButton(3);}
            }
        });
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Вот тут как раз вызываем второе окно
                if(krasava.live==true){
                System.out.println("skill7");
                //gerald.skilTwo(boss);//GeraldUdar
                sostoynie = "KrutoyUdar";
                krasava.skilOne(boss);
                //repaint();

                hod(krasava);
                deactivateButton(4);}
            }
        });
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Вот тут как раз вызываем второе окно
                if(krasava.live==true){
                System.out.println("skill8");
                sostoynie = "KrutoyBumaga";
                deactivateButton(4);
                krasava.skilTwo(boss);
//                Krutoy = new ImageIcon("res/fon/KrutoyChel.png").getImage();
                //updateUI();
//                try {
//                    TimeUnit.SECONDS.sleep(2);
//
//                } catch (InterruptedException ie) {
//                    Thread.currentThread().interrupt();
//                }

//                Krutoy = new ImageIcon("res/udar/KrasStoit.png").getImage();
                //outputGUIView.graphScrollPanel.getViewport().repaint();
                invalidate();
                repaint();
                //repaint();
                //fun();
                hod(krasava);}

            }
        });
        startNewRaund.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("kkk");
                hodVraga();
            }
        });

    }
    public void deactivateButton(int n)
    {
        if (n == 1) {
            button1.setEnabled(false);
            button2.setEnabled(false);
        }
        if (n == 2) {
            button3.setEnabled(false);
            button4.setEnabled(false);
        }
        if (n == 3) {
            button5.setEnabled(false);
            button6.setEnabled(false);
        }
        if (n == 4) {
            button7.setEnabled(false);
            button8.setEnabled(false);
        }

    }
    public void activateButton()
    {
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);

    }
    public void hod(Herose pers)
    {
        repaint();
        pers.setHodil();
        hodilornetcount++;
        System.out.println(hodilornetcount);
        if (hodilornetcount == 4) {
            System.out.println("Конец раунда");
            //fun();
            //fun();
            //staticpol();
            //fun();
            //staticpol();
            hodilornetcount = 0;
            //hodVraga();
        }

    }
    public void hodVraga()
    {
        SkillAction skill = new SkillAction();
        double a = Math.random()*6;
        if (a<3) {
            udarBossOne();
        } else if (a<=5) {
            udarBossTwo();
        }else udarBossThree();

        if (sostoynieboss == "udarboss1")
        {
            vrag =new ImageIcon("res/udar/Boss1.png").getImage();
            //g.drawImage(vrag, 1600, 490, this);

            skill.damageToPerson(mogilshic, (int)(Math.random()*20));
            skill.damageToPerson(gerald, (int)(Math.random()*20));
            skill.damageToPerson(teta, (int)(Math.random()*20));
            skill.damageToPerson(krasava, (int)(Math.random()*20));
            invalidate();
            repaint();
        }
        if (sostoynieboss == "udarboss2")
        {
            vrag =new ImageIcon("res/udar/Boss2.png").getImage();
            //g.drawImage(vrag, 1600, 490, this);
            skill.damageToPerson(mogilshic, (int)(Math.random()*20) + 20);
            skill.damageToPerson(gerald, (int)(Math.random()*20)+ 20);
            skill.damageToPerson(teta, (int)(Math.random()*20)+ 20);
            skill.damageToPerson(krasava, (int)(Math.random()*20)+ 20);
            invalidate();
            repaint();
        }
        if (sostoynieboss == "udarboss3")
        {
            vrag =new ImageIcon("res/udar/Boss3.png").getImage();
            //g.drawImage(vrag, 1600, 490, this);
            skill.damageToPerson(mogilshic, (int)(Math.random()*20) + 40);
            skill.damageToPerson(gerald, (int)(Math.random()*20) + 40);
            skill.damageToPerson(teta, (int)(Math.random()*20) + 40);
            skill.damageToPerson(krasava, (int)(Math.random()*20) + 40);
            skill.hilPointToPerson(boss, 100);
            invalidate();
            repaint();
        }
        if(mogilshic.getHps()<=0){
            System.out.println("govth");
            firstvoin = new ImageIcon("res/udar/grob.png").getImage();
            button1 = button1no;
            button1.setEnabled(false);
            button2 = button2no;
            mogilshic.live=false;}
        if(gerald.getHps()<=0){
            System.out.println("govth");
            Secondtvoin= new ImageIcon("res/udar/grob.png").getImage();
            gerald.live=false;}
        if(teta.getHps()<=0){
            System.out.println("govth");
            ThreePers = new ImageIcon("res/udar/grob.png").getImage();
            teta.live=false;}
        if(krasava.getHps()<=0){
            System.out.println("govth");
            Krutoy = new ImageIcon("res/udar/grob.png").getImage();
            krasava.live=false;}
        try {
            TimeUnit.SECONDS.sleep(1);

        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        vrag =new ImageIcon("res/fon/vrag.png").getImage();
        invalidate();
        repaint();
    }

    public void udarBossOne(){
        sostoynieboss = "udarboss1";
        repaint();
    }
    public void udarBossTwo(){
        sostoynieboss = "udarboss2";
        repaint();
    }
    public void udarBossThree(){
        sostoynieboss = "udarboss3";
        repaint();
    }
    public void staticpol ()
    {

            try {
                TimeUnit.SECONDS.sleep(2);
                sostoynie = "";
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
         firstvoin =new ImageIcon("res/fon/Mogilnik.png").getImage();
         Secondtvoin =new ImageIcon("res/fon/Vedmak.png").getImage();
         ThreePers =new ImageIcon("res/fon/newsuperdama.png").getImage();

         Krutoy =new ImageIcon("res/udar/KrasStoit.png").getImage();
         vrag =new ImageIcon("res/fon/vrag.png").getImage();

    }

    public void paint(Graphics g) {

        g = (Graphics2D) g;
        g.drawImage(img, 0, 0, this);


        if(sostoynie=="vozvrat"){
        try {
            TimeUnit.SECONDS.sleep(2);
            sostoynie = "";
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }}
        //firstvoin =new ImageIcon("res/fon/Mogilnik.png").getImage();
        //Secondtvoin =new ImageIcon("res/fon/Vedmak.png").getImage();
        //ThreePers =new ImageIcon("res/fon/newsuperdama.png").getImage();

        //Krutoy =new ImageIcon("res/udar/KrasStoit.png").getImage();
        //vrag =new ImageIcon("res/fon/vrag.png").getImage();
//        g.drawImage(firstvoin, 0, 450, this);
//        g.drawImage(Secondtvoin, 250, 500, this);
//        g.drawImage(ThreePers, 600, 160, this);
//        g.drawImage(Krutoy, 1000, 460, this);
//        g.drawImage(vrag, 1600, 490, this);


//        if (sostoynie=="vozvrat")
//        {firstvoin =new ImageIcon("res/fon/Mogilnik.png").getImage();
//            Secondtvoin =new ImageIcon("res/fon/Vedmak.png").getImage();
//            ThreePers =new ImageIcon("res/fon/newsuperdama.png").getImage();
//
//            Krutoy =new ImageIcon("res/udar/KrasStoit.png").getImage();
//            vrag =new ImageIcon("res/fon/vrag.png").getImage();}
        if (sostoynie=="MogilshicUdar")
        {
            System.out.println("llll");
            Image firstvoin =new ImageIcon("res/udar/MogilUdar.png").getImage();
            g.drawImage(firstvoin, 0, 450, this);
            sostoynie = "vozvrat";

            Image vrag =new ImageIcon("res/poluchenyeurona/boss.png").getImage();
            g.drawImage(vrag, 1600, 490, this);

            repaint();

        }else if (sostoynie=="MogilshicLech")
        {
            System.out.println("llll");
            Image firstvoin =new ImageIcon("res/udar/MogilLech.png").getImage();
            g.drawImage(firstvoin, 0, 450, this);
            sostoynie = "vozvrat";
            g.drawImage(vrag, 1600, 490, this);
            repaint();
        }else
            g.drawImage(firstvoin, 0, 450, this);

        if (sostoynie=="GeraldUdar")
        {
            System.out.println("llll");
            Image Secondtvoin =new ImageIcon("res/udar/GeraldUdar.png").getImage();
            g.drawImage(Secondtvoin, 250, 500, this);
            sostoynie = "vozvrat";

            Image vrag =new ImageIcon("res/poluchenyeurona/boss.png").getImage();
            g.drawImage(vrag, 1600, 490, this);

            repaint();

        } else if (sostoynie=="GeraldBrosok") {
            System.out.println("llll");
            Image Secondtvoin =new ImageIcon("res/udar/GeraldBrosok.png").getImage();
            g.drawImage(Secondtvoin, 250, 500, this);
            sostoynie = "vozvrat";
            Image vrag =new ImageIcon("res/poluchenyeurona/boss.png").getImage();
            g.drawImage(vrag, 1600, 490, this);
            repaint();
        } else {
            g.drawImage(Secondtvoin, 250, 500, this);
            //g.drawImage(vrag, 250, 500, this);
        }

        if (sostoynie=="KrutoyUdar")
        {
            System.out.println("llll");
            Image Krutoy =new ImageIcon("res/udar/KrasUdar.png").getImage();
            g.drawImage(Krutoy, 1000, 460, this);
            sostoynie = "vozvrat";

            Image vrag =new ImageIcon("res/poluchenyeurona/boss.png").getImage();
            g.drawImage(vrag, 1600, 490, this);

            repaint();

        }else if (sostoynie=="KrutoyBumaga")
        {
            System.out.println("llll");
            Image Krutoy =new ImageIcon("res/fon/KrutoyChel.png").getImage();
            g.drawImage(Krutoy, 1000, 460, this);
            sostoynie = "vozvrat";

            vrag =new ImageIcon("res/poluchenyeurona/boss.png").getImage();
            g.drawImage(vrag, 1600, 490, this);

            repaint();

        }else
            g.drawImage(Krutoy, 1000, 450, this);

        //TetaUdar
        if (sostoynie=="TetaUdar")
        {
            System.out.println("llll");
            Image ThreePers =new ImageIcon("res/udar/TetaUdar.png").getImage();
            g.drawImage(ThreePers, 600, 460, this);
            sostoynie = "vozvrat";

            Image vrag =new ImageIcon("res/poluchenyeurona/boss.png").getImage();
            g.drawImage(vrag, 1600, 490, this);

            repaint();

        }else if (sostoynie=="TetaSupUdar")
        {
            System.out.println("llll");
            Image ThreePers =new ImageIcon("res/udar/TetaUdar.png").getImage();
            g.drawImage(ThreePers, 600, 460, this);
            sostoynie = "vozvrat";

            Image vrag =new ImageIcon("res/poluchenyeurona/boss.png").getImage();
            g.drawImage(vrag, 1600, 490, this);

            repaint();

        }else
            g.drawImage(ThreePers, 600, 160, this);


        if (sostoynieboss == "udarboss1")
        {

            Image vrag =new ImageIcon("res/udar/Boss1.png").getImage();
            g.drawImage(vrag, 1600, 490, this);
            sostoynieboss = "";
            sostoynie = "";
            activateButton();
            //repaint();

        }else if(sostoynieboss == "udarboss2")
        {
            Image vrag =new ImageIcon("res/udar/Boss2.png").getImage();
            g.drawImage(vrag, 1400, 490, this);
            sostoynie = "";
            sostoynieboss = "";
            activateButton();
            //repaint();
        } else if (sostoynieboss == "udarboss3") {
            Image vrag =new ImageIcon("res/udar/Boss3.png").getImage();
            g.drawImage(vrag, 1400, 490, this);
            sostoynie = "";
            sostoynieboss = "";
            activateButton();
            //repaint();
        }
        else if (sostoynie!="vozvrat" ){//&& sostoynieboss == ""
            g.drawImage(vrag, 1600, 490, this);
            sostoynie = "";

            }
//        if (sostoynie=="" && sostoynieboss != ""){//&& sostoynieboss == ""
//            g.drawImage(vrag, 1600, 490, this);
//            sostoynie = "";
//
//        }
        //Враг



        //hp
        g.drawImage(fakel, 50, 100, 70,70 ,null);
        //g.drawImage(hp1, 0, 100, this);
       // g.drawImage(hp2, 400, 100, this);
        //g.drawImage(hp3, 800, 100, this);
       // g.drawImage(hp4, 1200, 100, this);
       // g.drawImage(hp5, 1600, 100, this);
        g.setColor(Color.RED);
        g.setFont(new Font("serif",Font.BOLD, 30));
        g.drawString(String.valueOf(mogilshic.getHps()),100,120);
        g.drawString(String.valueOf(gerald.getHps()),400,120);
        g.drawString(String.valueOf(teta.getHps()),800,120);
        g.drawString(String.valueOf(krasava.getHps()),1200,120);
        g.drawString(String.valueOf(boss.getHps()),1600,120);

        //this.add(buttonPane);
       // this.add(new TextArea("100"));

        //this.add(button1);
        //this.add(button2);


        // g.drawString("Hello",40,40);
       // setBackground(Color.WHITE);
      //  g.fillRect(130, 30,100, 80);
       // g.drawOval(30,130,50, 60);
      //  setForeground(Color.RED);
       // g.fillOval(130,130,50, 60);
        //g.drawArc(30, 200, 40,50,90,60);
       // g.fillArc(30, 130, 40,50,180,40);

    }
    public void actionPerformed(ActionEvent e){

        repaint();

    }


    @Override
    public void run(){

    }


}
