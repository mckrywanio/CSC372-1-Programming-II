//----------------------------------------------------
//Program Name: CriticalThinkingMod#3
//Author: Michael C Krywanio
//Date: OCT 29 2023
//----------------------------------------------------
//----------------------------------------------------
//Program Name: HPSOrderringSystem
//Description: A GUI-based for setting time/saving/changing background color/ or exiting.
//----------------------------------------------------
//Start
// Import necessary Java Swing and AWT libraries

// Define HPSOrderingSystem class extending JFrame

    // Declare a JPanel for background color

    // Define constructor for HPSOrderingSystem
        // Set frame title, size, default close operation, and layout
        // Initialize background panel, set its layout, and add it to the frame

        // Create a menu bar and a menu with four items: Show Date and Time, Save to File, Change Background, and Exit
        // Add menu items to the menu and the menu to the menu bar
        // Set the created menu bar as the frame's menu bar

        // Create a text area for displaying date/time and saving content to a file
        // Make text area and its scroll pane transparent
        // Add the scroll pane with the text area to the background panel

        // Add action listener to menu item1 to display current date and time in text area
        // Add action listener to menu item2 to save text area content to a file named "log.txt"
        // Add action listener to menu item3 to change the background color to a random orange hue
            // Define a method to generate a random orange hue
        // Add action listener to menu item4 to exit the program

    // Define main method
        // Create and display an instance of HPSOrderingSystem within the event-dispatching thread
//End
//-----------------------------------------------------
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Date;
import java.util.Random;

public class HPSOrderingSystem extends JFrame {

    private JPanel backgroundPanel; // Panel for background color

    public HPSOrderingSystem() {
        // Frame setup
        setTitle("HPS Ordering System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Background panel
        backgroundPanel = new JPanel();
        backgroundPanel.setLayout(new BorderLayout());
        add(backgroundPanel, BorderLayout.CENTER); // Add the panel to the frame

        // Top Bar and Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        JMenuItem menuItem1 = new JMenuItem("Show Date and Time");
        JMenuItem menuItem2 = new JMenuItem("Save to File");
        JMenuItem menuItem3 = new JMenuItem("Change Background");
        JMenuItem menuItem4 = new JMenuItem("Exit");

        // Adding Menu Items
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);
        menu.add(menuItem4);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        // Text Box
        JTextArea textBox = new JTextArea();
        textBox.setOpaque(false); // Make JTextArea transparent
        JScrollPane scrollPane = new JScrollPane(textBox);
        scrollPane.setOpaque(false); // Make JScrollPane transparent
        scrollPane.getViewport().setOpaque(false); // Make the viewport of the scroll pane transparent
        backgroundPanel.add(scrollPane, BorderLayout.CENTER); // Add to the background panel

        // Action Listeners
        menuItem1.addActionListener(e -> {
            Date date = new Date();
            textBox.setText(date.toString());
        });

        menuItem2.addActionListener(e -> {
            try (PrintWriter out = new PrintWriter("log.txt")) {
                out.println(textBox.getText());
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        });

        menuItem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color initialColor = getRandomOrangeHue(); // Initial random orange hue
                backgroundPanel.setBackground(initialColor); // Change the background panel's color
                repaint(); // Ensures the update is visible
            }

            private Color getRandomOrangeHue() {
                // Generating a random hue within the orange spectrum
                float hue = 0.05f + new Random().nextFloat() * 0.15f; // Range for orange hues
                return Color.getHSBColor(hue, 0.8f, 0.9f); // Adjust saturation and brightness as needed
            }
        });

        menuItem4.addActionListener(e -> {
            System.exit(0);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HPSOrderingSystem frame = new HPSOrderingSystem();
            frame.setVisible(true);
        });
    }
}