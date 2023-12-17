package ichiranRamen;

public class LargeRamen extends Ramen {
    public LargeRamen() {
        this.size = "Grande";
        this.price = 15.90;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getDescription() {
        return "Ramen tamanho " + this.size;
    }
}
