package ichiranRamen;

public class MediumRamen extends Ramen {
    public MediumRamen() {
        this.size = "Médio";
        this.price = 12.90;
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

