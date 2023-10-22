import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankApp {
    private JFrame frame;
    private JPanel panel;
    private JButton depositButton;
    private JButton withdrawButton;
    private JButton displayButton;
    private JTextField amountField;
    private JLabel balanceLabel;
    private double balance = 0.0;

    public BankApp() {
        frame = new JFrame("Bank Balance App");
        panel = new JPanel();
        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");
        displayButton = new JButton("Display Balance");
        amountField = new JTextField(10);
        balanceLabel = new JLabel("Balance: $0.0");

        panel.setLayout(new FlowLayout());
        panel.add(amountField);
        panel.add(depositButton);
        panel.add(withdrawButton);
        panel.add(displayButton);
        panel.add(balanceLabel);

        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(amountField.getText());
                balance += amount;
                JOptionPane.showMessageDialog(frame, "Deposited: $" + amount);
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(amountField.getText());
                if (amount <= balance) {
                    balance -= amount;
                    JOptionPane.showMessageDialog(frame, "Withdrew: $" + amount);
                } else {
                    JOptionPane.showMessageDialog(frame, "Insufficient funds!");
                }
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                balanceLabel.setText("Balance: $" + balance);
            }
        });

        frame.add(panel);
        frame.setSize(250, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BankApp();
    }
}