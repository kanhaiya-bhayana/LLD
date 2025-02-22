
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());


        // Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        // constructor.setAccessible(true);
        // Singleton singleton2 = constructor.newInstance();
        // System.out.println(singleton2.hashCode());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
        oos.writeObject(singleton);

        System.out.println("serialization done.");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));
        Singleton singleton2 = (Singleton)ois.readObject();
        System.out.println(singleton2.hashCode());
    }
}
