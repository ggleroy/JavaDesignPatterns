public class MyClass {
    private static MyClass uniqueInstance;
    String name;
    private MyClass(){
    }
    public static synchronized MyClass getInstance(){
        //adding synchronized to make singleton thread safe.
        if(uniqueInstance == null) {
            uniqueInstance = new MyClass();
        }

        return uniqueInstance;
    }
}
