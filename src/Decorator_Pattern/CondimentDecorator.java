package Decorator_Pattern;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
