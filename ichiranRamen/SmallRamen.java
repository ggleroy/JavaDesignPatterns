package ichiranRamen;

public class SmallRamen extends Ramen {
    public SmallRamen() {
        this.size = "Pequeno";
        this.price = 9.90;
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

