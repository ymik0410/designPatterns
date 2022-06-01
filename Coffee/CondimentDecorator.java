public abstract class CondimentDecorator extends Beverage {
    
    Beverage beverage;
    public abstract String getDescription();

    // adding size
    public Size getSize() {
        return beverage.getSize();
    }
}
