package e14;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class SwingButton implements Button {
    protected JPanel panel = new JPanel();
    protected JFrame frame = new JFrame();
    protected JButton button;

    public SwingButton(String buttonText) {
        button = new JButton(buttonText);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onClick();
            }
        });

        panel.add(button);
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void render() {
        frame.setVisible(true);
    }

    // Abstract method to define specific onClick behavior
    @Override
    public abstract void onClick();
}

