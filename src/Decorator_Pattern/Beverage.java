package Decorator_Pattern;

public abstract class Beverage {
    public Beverage beverage;
    public enum Size {TALL,GRANDE,VENTI};

    Size size = Size.TALL;
    String description = "제목 없음";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize(){
        return this.size;
    }
}
