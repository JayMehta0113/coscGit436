public class ScrollDecorator extends Decorator {
    public ScrollDecorator(Widget w) {
        super(w);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" ScrollDecorator");
    }
}
