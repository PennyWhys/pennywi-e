import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class PennywiseApp {
    public static void main(String[] args) {
        // Create a JFrame for the floating image
        JFrame frame = new JFrame();
        frame.setUndecorated(true);
        frame.setAlwaysOnTop(true);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);

        // Add the image
        JLabel label = new JLabel(new ImageIcon("pennywise.png"));
        frame.add(label);
        frame.setBackground(new Color(0, 0, 0, 0));
        frame.setVisible(true);

        // Play the sound
        try {
            File soundFile = new File("pennywise_laugh.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(soundFile));
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Close the app after 3 seconds
        new Timer(3000, e -> System.exit(0)).start();
    }
}
