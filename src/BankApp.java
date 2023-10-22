//----------------------------------------------------
//Program Name: CriticalThinkingMod#2
//Author: Michael C Krywanio
//Date: OCT 21 2023
//----------------------------------------------------
//----------------------------------------------------
//Program Name: BankApp
//Description: A GUI-based bank balance application
//----------------------------------------------------
// CLASS BankApp:

    // Private attributes:
    // - frame: JFrame
    // - panel: JPanel
    // - depositButton: JButton
    // - withdrawButton: JButton
    // - displayButton: JButton
    // - amountField: JTextField
    // - balanceLabel: JLabel
    // - balance: Double, initialized to 0.0

    // CONSTRUCTOR BankApp():
    //     SET frame TO a new JFrame with title "Bank Balance App"
    //     SET panel TO a new JPanel
    //     SET depositButton TO a new JButton labeled "Deposit"
    //     SET withdrawButton TO a new JButton labeled "Withdraw"
    //     SET displayButton TO a new JButton labeled "Display Balance"
    //     SET amountField TO a new JTextField with size 10
    //     SET balanceLabel TO a new JLabel with text "Balance: $0.0"

    //     SET panel's layout to a new FlowLayout
    //     ADD amountField TO panel
    //     ADD depositButton TO panel
    //     ADD withdrawButton TO panel
    //     ADD displayButton TO panel
    //     ADD balanceLabel TO panel

    //     ADD an ActionListener to depositButton:
    //         WHEN button is clicked:
    //             GET amount from amountField and convert to double
    //             INCREMENT balance BY amount
    //             DISPLAY a message dialog with "Deposited: $" + amount

    //     ADD an ActionListener to withdrawButton:
    //         WHEN button is clicked:
    //             GET amount from amountField and convert to double
    //             IF amount is less than or equal to balance:
    //                 DECREMENT balance BY amount
    //                 DISPLAY a message dialog with "Withdrew: $" + amount
    //             ELSE:
    //                 DISPLAY a message dialog with "Insufficient funds!"

    //     ADD an ActionListener to displayButton:
    //         WHEN button is clicked:
    //             SET balanceLabel's text to "Balance: $" + balance

    //     ADD panel TO frame
    //     SET frame's size to 250x200
    //     SET frame's default close operation to EXIT_ON_CLOSE
    //     SET frame's visibility to true

    // END CONSTRUCTOR

    // FUNCTION main():
    //     CREATE a new instance of BankApp

    // END FUNCTION main()

// END CLASS BankApp
//-----------------------------------------------------

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// created BankAPP with all attributes
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
  // defined depositButton for depositing funds
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(amountField.getText());
                balance += amount;
                JOptionPane.showMessageDialog(frame, "Deposited: $" + amount);
            }
        });
  // defined withdrawbutton for withdrawing funds
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
  // defined displayButton for displaying current balance of account
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                balanceLabel.setText("Balance: $" + balance);
            }
        });
  // defined frame sizes and exit on close button
        frame.add(panel);
        frame.setSize(250, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BankApp();
    }
}