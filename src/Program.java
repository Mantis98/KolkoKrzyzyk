import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program implements ActionListener {

    JFrame frame;
    JButton[] buttons = new JButton[9];
    JButton one, two, three, four, five, six, seven, eight, nine;
    JPanel panel;

    Font czcionka = new Font("Arial", Font.BOLD, 50);
    char kolko = 'O';
    char krzyzyk = 'X';
    boolean playerX_Turn = true;

    public Program() {

        frame = new JFrame("Gra");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);

        one = new JButton("");
        two = new JButton("");
        three = new JButton("");
        four = new JButton("");
        five = new JButton("");
        six = new JButton("");
        seven = new JButton("");
        eight = new JButton("");
        nine = new JButton("");

        buttons[0] = one;
        buttons[1] = two;
        buttons[2] = three;
        buttons[3] = four;
        buttons[4] = five;
        buttons[5] = six;
        buttons[6] = seven;
        buttons[7] = eight;
        buttons[8] = nine;

        for (int i = 0; i < 9; i++) {
            buttons[i].addActionListener(this);
            buttons[i].setFont(czcionka);
            buttons[i].setFocusable(false);
        }

        panel = new JPanel();
        panel.setBounds(130, 50, 300, 300);
        panel.setLayout(new GridLayout(3, 3, 15, 15));

        panel.add(one);
        panel.add(two);
        panel.add(three);
        panel.add(four);
        panel.add(five);
        panel.add(six);
        panel.add(seven);
        panel.add(eight);
        panel.add(nine);


        frame.add(panel);
        frame.setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (playerX_Turn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setText(String.valueOf(krzyzyk));
                        playerX_Turn = false;
                    }
                } else {
                    if (buttons[i].getText() == "") {
                        buttons[i].setText(String.valueOf(kolko));
                        playerX_Turn = true;
                    }
                }

            }

        }
    }
}