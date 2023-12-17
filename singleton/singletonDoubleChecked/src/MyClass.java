public class MyClass {
    //Eagerly creating singleton class
    //private static Singleton uniqueInstance = new Singleton();
    private volatile static MyClass uniqueInstance;
    String name;
    private MyClass(){
    }
    //Double-Check locking.
    public static MyClass getInstance() {
        if (uniqueInstance == null){
            synchronized ((Singleton.class)) {
                uniqueInstance = new MyClass();
            }
        }
        return uniqueInstance;
    }
}
