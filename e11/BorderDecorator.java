public class BorderDecorator extends Decorator {
    
    public BorderDecorator(Widget w) {
        super(w);
    }
    
    @Override
    public void draw() {
        super.draw();
        System.out.println(" BorderDecorator");
    }
}
