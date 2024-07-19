class Student {
    // instance variables
    String name;
    int age;
    int marks;
}

public class arrayOfObjects {
    public static void main(String[] args) {
        // objects of Student class s1 & s2
        Student s1 = new Student();
        s1.name = "Pratik";
        s1.age = 10;
        s1.marks = 90;

        Student s2 = new Student();
        s2.name = "Rahul";
        s2.age = 20;
        s2.marks = 80;

        // we are creating array which can hold references. We have to manually create
        // objects & assign it to array
        Student students[] = new Student[2];
        // first reference stored in students[0] & likewise
        students[0] = s1;
        students[1] = s2;
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + ": " + students[i].age + ": " + students[i].marks);
        }

    }
}
