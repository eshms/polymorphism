class Person {
    public static void hello() {
        System.out.println("Hi, I am a Person");
    }
}

class Student extends Person {
    public static void hello() {
        System.out.println("Hi, I am a Student");
    }
}

public class Undergrad extends Student {
    public static void hello() {
        System.out.println("Hi, I am a Undergrad Student");
    }

    public static void main(String[] args) {
        Person someone = new Undergrad();
        someone.hello(); // Çıktı: Hi, I am a Undergrad Student (static olduğu için nesnenin türü etkili)

        Student anotherOne = new Undergrad();
        anotherOne.hello(); // Çıktı: Hi, I am a Undergrad Student

        Undergrad lastOne = new Undergrad();
        lastOne.hello(); // Çıktı: Hi, I am a Undergrad Student

        Person.hello(); // Çıktı: Hi, I am a Person
        Student.hello(); // Çıktı: Hi, I am a Student
        Undergrad.hello(); // Çıktı: Hi, I am a Undergrad Student
    }
}