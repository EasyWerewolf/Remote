import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        jFrameWithJPanel();
    }

    public static void jFrameWithJPanel(){//Begin jFrameWithJPanel

        //create frame to hold components
        JFrame myJFrame = new JFrame();

        //set layout
        myJFrame.setLayout(new BorderLayout());

        //create panel for buttons
        JPanel buttonsPanel = new JPanel(new GridLayout(8,3));

        //creating buttons
        JButton powerButton = new JButton("Power");
        JButton selectButton = new JButton("Select");
        JButton backButton = new JButton("Back");
        JButton homeButton = new JButton("Home");
        JButton settingsButton = new JButton("Settings");
        JButton jumpBackButton = new JButton("Jump Back");
        JButton optionsButton = new JButton("Options");
        JButton jumpForwardButton = new JButton("Jump Forward");
        JButton rewindButton= new JButton("Rewind");
        JButton playButton = new JButton("Play / Pause");
        JButton forwardButton = new JButton("Forward");
        JButton muteButton = new JButton("Mute");
        JButton volumeUpButton= new JButton("Volume Up");
        JButton volumeDownButton= new JButton("Volume Down");
        JButton upButton = new BasicArrowButton(BasicArrowButton.NORTH);
        JButton downButton = new BasicArrowButton(BasicArrowButton.SOUTH);
        JButton leftButton = new BasicArrowButton(BasicArrowButton.WEST);
        JButton rightButton = new BasicArrowButton(BasicArrowButton.EAST);

        //create blank spaces
        JLabel blankSpace = new JLabel("");
        JLabel blankSpace1 = new JLabel("");
        JLabel blankSpace2 = new JLabel("");
        JLabel blankSpace3 = new JLabel("");
        JLabel blankSpace4 = new JLabel("");
        JLabel blankSpace5 = new JLabel("");

        //row1
        buttonsPanel.add(blankSpace);
        buttonsPanel.add(powerButton);
        buttonsPanel.add(blankSpace1);

        //row2
        buttonsPanel.add(backButton);
        buttonsPanel.add(homeButton);
        buttonsPanel.add(settingsButton);

        //row3
        buttonsPanel.add(blankSpace2);
        buttonsPanel.add(upButton);
        buttonsPanel.add(blankSpace3);

        //row4
        buttonsPanel.add(leftButton);
        buttonsPanel.add(selectButton);
        buttonsPanel.add(rightButton);

        //row5
        buttonsPanel.add(blankSpace4);
        buttonsPanel.add(downButton);
        buttonsPanel.add(blankSpace5);

        //row6
        buttonsPanel.add(jumpBackButton);
        buttonsPanel.add(optionsButton);
        buttonsPanel.add(jumpForwardButton);

        //row7
        buttonsPanel.add(rewindButton);
        buttonsPanel.add(playButton);
        buttonsPanel.add(forwardButton);

        //row 8
        buttonsPanel.add(muteButton);
        buttonsPanel.add(volumeUpButton);
        buttonsPanel.add(volumeDownButton);

        //set a text field for results
        JTextField result = new JTextField();
        result.setHorizontalAlignment(JTextField.CENTER);
        myJFrame.add(result, BorderLayout.NORTH);
        //add button panel
        myJFrame.add(buttonsPanel);



        //add action listener for each button
        powerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Power Button was pressed");
                JOptionPane.showMessageDialog(powerButton, "Are you sure you would like to Power off?"
                );
            }
        });
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The Select Button was pressed.");
                JOptionPane.showMessageDialog(selectButton, "Entry Selected.");
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The back button has been pressed.");
                JOptionPane.showMessageDialog(backButton, "Are you sure you would like to go back?");
            }
        });
        settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The Settings Button was pressed.");
                JOptionPane.showMessageDialog(settingsButton, "Here are your settings.");
            }
        });
        jumpBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The Jump Back Button was pressed.");
                JOptionPane.showMessageDialog(jumpBackButton, "You have jumped back 30 seconds.");
            }
        });
        optionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The options button was pressed.");
                JOptionPane.showMessageDialog(optionsButton, "Here are your options.");
            }
        });
        jumpForwardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The Jump Forward Button was pressed.");
                JOptionPane.showMessageDialog(jumpForwardButton, "You have jumped forward 30 seconds.");
            }
        });
        rewindButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The rewind button has been pressed.");
                JOptionPane.showMessageDialog(rewindButton, "You are now rewinding.");
            }
        });
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The Play button has been pressed");
                JOptionPane.showMessageDialog(playButton, "You are now playing.");
            }
        });
        forwardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The Forward button has been pressed.");
                JOptionPane.showMessageDialog(forwardButton, "You are now Fast Forwarding." );
            }
        });
        muteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The Mute button has been pressed.");
                JOptionPane.showMessageDialog(muteButton, "The TV is now Muted.");
            }
        });
        volumeUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The volume Up button has been pressed.");
                JOptionPane.showMessageDialog(volumeUpButton, "The volume has been turned up.");
            }
        });
        volumeDownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The volume down button has been pressed.");
                JOptionPane.showMessageDialog(volumeDownButton, "The volume has been turned down.");
            }
        });
        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The up button has been pressed.");
                JOptionPane.showMessageDialog(upButton, "The up button has been pressed.");
            }
        });
        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The down button has been pressed");
                JOptionPane.showMessageDialog(downButton, "The down button has been pressed");
            }
        });
        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The left button has been pressed.");
                JOptionPane.showMessageDialog(leftButton, "The left button has been pressed.");
            }
        });
        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The right button has been pressed.");
                JOptionPane.showMessageDialog(rightButton, "The right button has been pressed.");
            }
        });
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The home button has been pressed.");
                JOptionPane.showMessageDialog(homeButton, "You are now being taken to the home menu.");
            }
        });

        //set title, size, location, and exit behavior
        myJFrame.setTitle("Universal Remote");
        myJFrame.setSize(400, 800);
        myJFrame.setLocation(200,100);
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //make the frame visible
        myJFrame.setVisible(true);
    }

}

