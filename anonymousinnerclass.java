class Animal{
    public void show(){
        System.out.println("Animal Show");
    }
}
public class anonymousinnerclass {
    public static void main(String[] args) {
        Animal obj =new Animal(){
            public void show(){
                System.out.println("Anonymous Inner Class Show");
            }
        };
        obj.show();
    }
}
