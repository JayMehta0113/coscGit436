public class e11Client {
    public static void main(String [] args) {
        Widget widget = new TextField(80, 24);
        widget.draw();

        Widget widget2 = new ScrollDecorator(new TextField(80, 24));
        widget2.draw();

        Widget widget3 = new BorderDecorator(new BorderDecorator(new ScrollDecorator(new TextField(80, 24))));
        widget3.draw();
    }
}
