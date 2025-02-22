public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee){
        decoratedCoffee = coffee;
    }

    @Override
    public double getCost(){
        return decoratedCoffee.getCost();
    }

    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription();
    }
}
