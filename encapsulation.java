class Human{
    private int age=10;
    private String name="Pratik";
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        Human h=new Human();
        System.out.println(h.getAge());
        System.out.println(h.getName()); 
    }
}
