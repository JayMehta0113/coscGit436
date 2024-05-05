public class DisplayMenu implements Command{

    private Aggregator aggregator;

    public DisplayMenu(Aggregator aggregator){
        this.aggregator = aggregator;
    }

    public void execute() {
       Menu menu = aggregator.getMenu();
       System.out.println("The menu is");
       for(int i =0; i<menu.getMenuItem().size(); i++){
            System.out.println(menu.getMenuItem().get(i));
       }
    }
    
}
