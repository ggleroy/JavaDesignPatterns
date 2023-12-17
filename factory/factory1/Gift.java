package factory;

public abstract class Gift {
    private boolean isSeparated = false;
    private boolean isPackaged = false;

    public void separate() {
        this.isSeparated = true;
    }
    public void packageGift() {
        this.isPackaged = true;
    }
    public boolean isSeparated() {
        return isSeparated;
    }

    public boolean isPackaged() {
        return isPackaged;
    }
}
