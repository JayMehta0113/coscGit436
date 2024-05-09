package e14.btn;

import javax.swing.*;

public class HtmlButton extends SwingButton {
    public HtmlButton() {
        super("Test Button");
    }

    @Override
    public void onClick() {
        JOptionPane.showMessageDialog(frame, "Click! Button says - 'Hello World!'");
    }
}
