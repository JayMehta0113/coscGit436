package e14.dialog;


import e14.btn.WindowsButton;
import e14.btn.Button;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}