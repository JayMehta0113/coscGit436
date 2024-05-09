public class DisplayMenuCommand implements Command {
    private Menu menu;

    public DisplayMenuCommand(Menu menu) {
        this.menu = menu;
    }
    @Override
    public void execute() {
        System.out.println("Menu:");
        for(MenuItem item : menu.getItems()) {
            System.out.println(item.getItemNumber() + ") " + item.getItemDescription() + " - $" + item.getItemCost());
        }
    }
}
