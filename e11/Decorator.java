public abstract class Decorator implements Widget {
    Widget widget;

    public Decorator() {
        widget.draw();
    }
}