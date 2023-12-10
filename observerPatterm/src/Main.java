public class Main {
    public static void main(String[] args) {
        Channel leroy = new Channel();

        Subscriber s1 = new Subscriber("João");
        Subscriber s2 = new Subscriber("Gabriel");
        Subscriber s3 = new Subscriber("Rafela");
        Subscriber s4 = new Subscriber("Vinicius");
        Subscriber s5 = new Subscriber("Pedro");

        leroy.subscribe(s1);
        leroy.subscribe(s2);
        leroy.subscribe(s3);
        leroy.subscribe(s4);
        leroy.subscribe(s5);

        leroy.unsubscribe(s3);

        s1.subscribeChannel(leroy);
        s2.subscribeChannel(leroy);
        s3.subscribeChannel(leroy);
        s4.subscribeChannel(leroy);
        s5.subscribeChannel(leroy);

        leroy.upload("How to choose your gaming mouse??");
    }
}