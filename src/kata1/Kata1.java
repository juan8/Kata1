package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Juan", new Date(92,03,28));
        System.out.println(person.getName() + " tiene " + 
                person.getAge() + " años");
    }
}
