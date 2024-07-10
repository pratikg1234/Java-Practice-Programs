class A{
    int age=10;
    public void show(){
        System.out.println("In show");
    }
    A(){
        System.out.println("In A constructor");
    }
    class B{
        public void config(){
            System.out.println("In config");
        }
        public void config1(){
            System.out.println("In config1");
        }
    }
}
class C extends A{
    C(){
        // super();
    }
}
public class innerclass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1= obj.new B();
        obj1.config();
        obj1.config1();
        C c=new C();
    }   
}
