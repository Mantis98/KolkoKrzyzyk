import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program implements ActionListener {

    JFrame frame;
    JButton[] buttons = new JButton[9];
    JButton one, two, three, four, five, six, seven, eight, nine;
    JPanel panel;
    JTextField textField;

    Font font = new Font("Serif", Font.BOLD, 50);
    char ring = 'O';
    char cross = 'X';
    boolean playerX_Turn = true;

    public Program() {

        frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);


        textField = new JTextField();
        textField.setBounds(100, 400, 400, 80);
        textField.setFont(font);
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setText("So it begins");


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
            buttons[i].setFont(font);
            buttons[i].setFocusable(false);
        }

        panel = new JPanel();
        panel.setBounds(150, 50, 300, 300);
        panel.setLayout(new GridLayout(3, 3, 15, 15));
        panel.setBackground(Color.GRAY);

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
        frame.add(textField);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (playerX_Turn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setText(String.valueOf(cross));
                        playerX_Turn = false;
                        textField.setText("Player O turn");
                        checkWinner();
                    }
                } else {
                    if (buttons[i].getText() == "") {
                        buttons[i].setText(String.valueOf(ring));
                        playerX_Turn = true;
                        textField.setText("Player X turn");
                        checkWinner();
                    }
                }

            }

        }
    }

    public void checkWinner() {
        if (
                (one.getText().equals("X")) &&
                        (two.getText().equals("X")) &&
                        (three.getText().equals("X"))
        ) {
            xWins();
        }
        if (
                (four.getText().equals("X")) &&
                        (five.getText().equals("X")) &&
                        (six.getText().equals("X"))
        ) {
            xWins();
        }
        if (
                (seven.getText().equals("X")) &&
                        (eight.getText().equals("X")) &&
                        (nine.getText().equals("X"))
        ) {
            xWins();
        }
        if (
                (one.getText().equals("X")) &&
                        (four.getText().equals("X")) &&
                        (seven.getText().equals("X"))
        ) {
            xWins();
        }
        if (
                (two.getText().equals("X")) &&
                        (five.getText().equals("X")) &&
                        (eight.getText().equals("X"))
        ) {
            xWins();
        }
        if (
                (three.getText().equals("X")) &&
                        (six.getText().equals("X")) &&
                        (nine.getText().equals("X"))
        ) {
            xWins();
        }
        if (
                (one.getText().equals("X")) &&
                        (five.getText().equals("X")) &&
                        (nine.getText().equals("X"))
        ) {
            xWins();
        }
        if (
                (three.getText().equals("X")) &&
                        (five.getText().equals("X")) &&
                        (seven.getText().equals("X"))
        ) {
            xWins();
        }
        if (
                (one.getText().equals("O")) &&
                        (two.getText().equals("O")) &&
                        (three.getText().equals("O"))
        ) {
            oWins();
        }
        if (
                (four.getText().equals("O")) &&
                        (five.getText().equals("O")) &&
                        (six.getText().equals("O"))
        ) {
            oWins();
        }
        if (
                (seven.getText().equals("O")) &&
                        (eight.getText().equals("O")) &&
                        (nine.getText().equals("O"))
        ) {
            oWins();
        }
        if (
                (one.getText().equals("O")) &&
                        (four.getText().equals("O")) &&
                        (eight.getText().equals("O"))
        ) {
            oWins();
        }
        if (
                (two.getText().equals("O")) &&
                        (five.getText().equals("O")) &&
                        (eight.getText().equals("O"))
        ) {
            oWins();
        }
        if (
                (three.getText().equals("O")) &&
                        (six.getText().equals("O")) &&
                        (nine.getText().equals("O"))
        ) {
            oWins();
        }
        if (
                (one.getText().equals("O")) &&
                        (five.getText().equals("O")) &&
                        (nine.getText().equals("O"))
        ) {
            oWins();
        }
        if (
                (three.getText().equals("O")) &&
                        (five.getText().equals("O")) &&
                        (seven.getText().equals("O"))
        ) {
            oWins();

        }


    }

    public void xWins() {
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        textField.setText("Player X wins!");
    }

    public void oWins() {
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        textField.setText("Player O wins!");
    }



}
