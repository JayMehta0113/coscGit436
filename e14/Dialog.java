package e14;

public abstract class Dialog {
    public abstract Button createButton();

    public void renderWindow() {
        Button button = createButton();
        button.render();
    }
}