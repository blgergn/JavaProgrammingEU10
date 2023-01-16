package day31_Constructors;

public class PersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("Bilge", 'F', 31);
        Person person2= new Person("Julide",'F', 32);

        person2.age=34;

        System.out.println(person1);
        System.out.println(person2);


    }
}
