import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.*;

import java.awt.*;

public class TryAgain extends JFrame {

    TryAgain() {

        JLabel imageLabel = new JLabel();
        ImageIcon toniImage = new ImageIcon("mga-bobo.gif");
        imageLabel.setIcon(toniImage);
        // Add image to frame
        this.add(imageLabel);

        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("Play Again");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));
        EventHandler handler = new EventHandler();
        tryAgainButton.addActionListener(handler);
 
        JButton exitButton = new JButton();
    
        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 25));
        EventHandler1 handler1 = new EventHandler1();
        exitButton.addActionListener(handler1);

        

        this.add(tryAgainButton);
        this.add(exitButton);


        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // set background color of frame
        this.getContentPane().setBackground(Color.GREEN);
        // lock frame
        this.setResizable(true);
        






    }

    private class EventHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            App.main(null);
            dispose(); 
            
        }
    } 
    private class EventHandler1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
   
            dispose(); 
}

    }
}
