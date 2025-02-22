public class MyThread extends Thread{
    @Override
    public void run(){
        Singleton s = Singleton.getInstance();
        System.out.println("Thread: " + s.hashCode());
    }
}
