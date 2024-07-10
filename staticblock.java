class Mobile {
    String brand;
    int price;
    static String name;
    static {
        name = "Mobile";
        System.out.println("Static block will be called only once....");
    }

    Mobile() {// no argument constructor
        brand = "";
        price = 100;
        System.out.println("In constructor..");
    }
}

public class staticblock {
    public static void main(String[] args) throws ClassNotFoundException {
        // Mobile obj1 = new Mobile();
        // Mobile obj2= new Mobile();
        Class.forName("Mobile");
    }
}
