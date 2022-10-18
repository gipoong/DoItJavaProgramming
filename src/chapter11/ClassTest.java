package chapter11;

import java.lang.reflect.Constructor;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class pClass1 = person.getClass();
        System.out.println(pClass1.getName());

        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("chapter11.Person");
        System.out.println(pClass3.getName());
        Constructor[] cons = pClass3.getConstructors();

        for(Constructor c : cons){
            System.out.println(c);
        }
    }
}
