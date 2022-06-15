import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxAndSoOn extends JFrame{
    private JPanel jPanel;
    private JLabel Label;
    private JCheckBox toggleOnOffCheckBox;

    public CheckBoxAndSoOn() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(jPanel);
        this.pack();

        toggleOnOffCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = (toggleOnOffCheckBox.isSelected()) ? "On" : "Off";
                Label.setText(text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame checkBox= new CheckBoxAndSoOn();
        checkBox.pack();
        checkBox.setVisible(true);
    }
}
