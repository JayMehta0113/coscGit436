public class SpicyPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildDough() {
        pizza.setDough("spicy dough");
    }

    public void buildSauce(){
        pizza.setSauce("spicy tomato");
    }

    public void buildToppings(){
        pizza.setToppings("spicy pineapple");
    }
}
