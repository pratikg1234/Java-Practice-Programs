@FunctionalInterface
interface E{
    void show();
}
public class FunctionalinterfaceExample{
    public static void main(String[] args) {
        // E obj =new E(){
        //     public void show() {
        //         System.out.println("Using annonymous Inner Class");
        //     }
        // };
        //we can write same using lambda expression
        E obj = () -> System.out.println("Using lambda expression");
        obj.show();
    }
}
