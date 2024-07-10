abstract class A {
    public abstract void run();

    public void walk() {
        System.out.println("I am walking");
    }
}

class B extends A {
    public void run() {
        System.out.println("I am running");
    }
}

public class Abstract {
    public static void main(String[] args) {
        B b = new B();
        b.run();
    }
}
