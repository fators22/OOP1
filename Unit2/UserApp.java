import javax.swing.*;

public class UserApp extends JFrame {

    public UserApp() {
        setTitle("Users and Items Info");
        setSize(300, 300);
     
        // Default JPanel uses FlowLayout
        JPanel panel = new JPanel();

        // Create one object of each type
        Player player = new Player();
        Vlogger vlogger = new Vlogger();
        Painting painting = new Painting();

        // Add Player info
        panel.add(new JLabel("Player Name: " + player.getName()));
        panel.add(new JLabel("Level: " + player.getLevel()));

        // Add Vlogger info
        panel.add(new JLabel("Vlogger Name: " + vlogger.getName()));
        panel.add(new JLabel("Year Joined: " + vlogger.getYearJoined()));

        // Add Painting info
        panel.add(new JLabel("Painting Title: " + painting.getTitle()));
        panel.add(new JLabel("Year Created: " + painting.getYear()));

        // Add panel to frame
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new UserApp(); // Launch GUI
    }
}
