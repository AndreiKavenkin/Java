package lesson81;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ProgTest extends JFrame {
    public static void main(String args[]) {
        ProgTest progTest = new ProgTest();
    }
        public ProgTest() {
        Font font = new Font("Arrial",Font.PLAIN,20);
        Font font1 = new Font("Arrial",Font.BOLD,15);
            setTitle("Java programm");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBounds(400,400,600,200);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("FILE");
        JMenu menu2 = new JMenu("Help");
            menuBar.add(menu1);
            menuBar.add(menu2);
        JMenuItem menuItem11 = new JMenuItem("New");
        JMenuItem menuItem12 = new JMenuItem("Open");
        JMenuItem menuItem13 = new JMenuItem("Save All");
        JMenuItem menuItem14 = new JMenuItem("Exit");
            menu1.add(menuItem11);
            menu1.add(menuItem12);
            menu1.add(menuItem13);
            menu1.add(menuItem14);
        JMenuItem menuItem15 = new JMenuItem("Help");
        JMenuItem menuItem16 = new JMenuItem("About");
            menu2.add(menuItem15);
            menu2.add(menuItem16);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Введите пароль");
        JPasswordField password = new JPasswordField(10);
        JButton enter = new JButton("OK");
        JButton reset = new JButton("Сброс");
            panel.add(label);
            label.setFont(font1);
            panel.add(password);
            password.setFont(font1);
            panel.add(enter);
            enter.setFont(font1);
            panel.add(reset);
            reset.setFont(font1);
        JButton myButton = new JButton("Сгенерировать номера");
            myButton.setForeground(Color.WHITE);
            myButton.setPreferredSize(new Dimension(300,40));
            myButton.setBackground(Color.RED);
            myButton.setFont(font);
            add(myButton);
        TextField textField = new TextField();
            textField.setFont(font);
            add(textField);

        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(generateTelephoneNumber());
            }
        });
        add(BorderLayout.WEST, myButton);
        add(BorderLayout.CENTER,textField);
        add(BorderLayout.SOUTH, panel);
        add(BorderLayout.NORTH, menuBar);
        setVisible(true);
    }
    public static String generateTelephoneNumber() {
        Random random = new Random();
        String telephoneNumber = "";
        telephoneNumber += "+375";
        telephoneNumber += "(29)";
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += "-";
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += "-";
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        return telephoneNumber;
    }
}
