package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

/**
 * Created by user on 6/3/2016.
 */
public class LocalFrame extends JFrame  {

    public static int P_WIDTH = 498;
    public static int P_HEIGHT = 574;
    public static JPanel panel;
    public static JButton button1;

        public LocalFrame(String name) {
            super(name);
            panel = new JPanel();
            panel.setLayout(new FlowLayout(100,140,160));
            button1 = new JButton("Старт!");
            button1.setPreferredSize(new Dimension(200,100));
            button1.setActionCommand("ЭЭ");
            panel.add(button1,BorderLayout.CENTER);
            getContentPane().add(panel);
            setPreferredSize(new Dimension(P_WIDTH, P_HEIGHT));
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            button1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    getContentPane().add(new Ground(P_WIDTH,P_HEIGHT));
                    LocalFrame.button1.setVisible(false);
                    pack();
                }
            });

            pack(); //упорядочивает все объекты на форме
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (int) ((dimension.getWidth() - getWidth()) / 2);
            int y = (int) ((dimension.getHeight() - getHeight()) / 2);
            setLocation(x, y);
        }
}
