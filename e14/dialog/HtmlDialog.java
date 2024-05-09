package e14.dialog;

import e14.btn.Button;
import e14.btn.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}