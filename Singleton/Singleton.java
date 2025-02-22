
import java.io.Serializable;

public class Singleton implements Serializable{

    private static Singleton singleton;
    private Singleton(){
        if (singleton != null){
            throw new RuntimeException("Breaching the security of Singleton pattern, access denied!");
        }
    }

    public Object readResolve(){
        return singleton;
    }

    public static Singleton getInstance(){
        if (singleton == null){

            synchronized (Singleton.class) {
                    singleton = new Singleton();
            }
        }
        return singleton;
    }
}
