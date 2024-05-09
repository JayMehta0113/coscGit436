package e14.btn;

import javax.swing.JOptionPane;


public class WindowsButton extends SwingButton {
    public WindowsButton() {
        super("Windows Button");
    }

    @Override
    public void onClick() {
        JOptionPane.showMessageDialog(frame, "Click! Windows button activated.");
    }
}


