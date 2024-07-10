class Mobile{
    String brand;
    static String name;
    int price;
}
public class statickeyword {
    public static void main(String[] args) {
        Mobile  obj = new Mobile();
        obj.brand ="Shawmi";
        Mobile.name = "Redmi";
        System.out.println(obj.brand + " : "+ Mobile.name);
    }
}
