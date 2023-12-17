package ichiranRamen;

public abstract class Ramen {
    protected String size;
    protected double price;

    public abstract double getPrice();
    public abstract String getDescription();

}
