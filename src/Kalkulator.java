import javax.swing.*;
import java.awt.*;

public class Kalkulator extends JFrame {
    private JTextField textField;
    private JPanel panel;

    public Kalkulator() {
        // Membuat frame
        setTitle("Kalkulator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Menggunakan GridBagLayout untuk mengatur layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Membuat text field
        textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.2;
        add(textField, gbc);

        // Membuat panel untuk tombol
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 5, 5, 5));
        
        // Membuat tombol
        String[] buttons = {
                "1", "2", "3", "4", "5",
                "6", "7", "8", "9", "0",
                "+", "-", "*", "/", "=",
                "%", "Mod", "Exit"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            panel.add(button);
        }

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 5;
        gbc.gridheight = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 0.8;
        add(panel, gbc);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Kalkulator kalkulator = new Kalkulator();
            kalkulator.setVisible(true);
        });
    }
}
