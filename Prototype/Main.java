public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hola");
        NetworkConfiguration nc = new NetworkConfiguration();
        nc.setIp("198.168.4.1");
        nc.loadData();
        System.out.println(nc);

        try {
            NetworkConfiguration nc1 = (NetworkConfiguration) nc.clone();
            System.out.println(nc1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
