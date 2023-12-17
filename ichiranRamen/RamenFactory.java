package ichiranRamen;

public class RamenFactory {
    public Ramen getRamen(String size) {
        switch(size) {
            case "small":
                return new SmallRamen();
            case "medium":
                return new MediumRamen();
            case "large":
                return new LargeRamen();
            default:
                return null;
        }
    }
}
