package factory2;

public class SteakKnife implements Knife {

    @Override
    public void sharpen() {
        throw new UnsupportedOperationException("Unimplemented method 'sharpen'");
    }

    @Override
    public void polish() {
        throw new UnsupportedOperationException("Unimplemented method 'polish'");
    }

    @Override
    public void packageKnife() {
        throw new UnsupportedOperationException("Unimplemented method 'packageKnife'");
    }
    
}
