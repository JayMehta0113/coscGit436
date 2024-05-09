package e14.dialog;

import e14.btn.Button;

public abstract class Dialog {
    public abstract Button createButton();

    public void renderWindow() {
        Button button = createButton();
        button.render();
    }
}