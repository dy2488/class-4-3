public class ProxyPatterDemo {
    public static void main(String[] args) {
        Image image=new ProxyImage("test_10mb.jpg");
        image.display();
        System.out.println("hello");
        image.display();
    }
}
