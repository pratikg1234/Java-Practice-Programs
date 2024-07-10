interface A{
    void show();
    void config();
}
class B implements A{
    public void show(){
        System.out.println("show method");
    }
    public void config(){
        System.out.println("config method");
    }
}
public class interfaces {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }
}
