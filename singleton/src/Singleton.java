public class Singleton {
    private volatile static Singleton instance; //volatile is used to make sure that multi threads will acees the same variable

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) // synchronized is a heavy rocess, here we do it only once
            {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
