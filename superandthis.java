class A{
    public A(){
        super();//by default
        System.out.println("A  default constructor");
    }
    public A(int i){
        super();//by default
        System.out.println("A  parameterized constructor");
    }
}
class B extends A{
    public B(){
        super();//by default
        System.out.println("B  default constructor");
    }
    public B(int i){
        // super(78);//by default
        this();
        System.out.println("B  parameterized constructor");
    }
}
public class superandthis {
    public static void main(String[] args) {
        B obj = new B(5);
    }   
}
