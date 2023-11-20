package OOP;

class Student1 {
    int id;
    String name;

    public Student1(int i, String s) {
        id = i;
        name = s;
    }

    public void display() {
        System.out.println("ID " + id + " Name " + name);
    }

}

class Teacher {
    int id;
    String name;
    double salary;
    String address;

    public Teacher(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    Teacher(int id, String name, double salary, String address) {
        this(id, name, salary);
        this.address = address;
    }

    public void display() {
        System.out.println("ID " + id + " Name " + name + " Salary " + salary + " Address " + address);
        ;
    }
}

public class UsageOfThisKeyword {

    public static void main(String[] args) {
        Teacher t = new Teacher(1, "Darshan", 2654556);
        t.display();
        Student1 s = new Student1(2, "Kumar");
        s.display();

        Teacher t1 = new Teacher(3, "jasu", 264556, "Sukkur");
        t1.display();

    }
}
