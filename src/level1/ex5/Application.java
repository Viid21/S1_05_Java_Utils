package level1.ex4;

import java.io.*;

public class Application {
    public void play() {
        while (true){
            switch (Menus.mainMenu()){
                case 1:
                    Person person = new Person(24, "David");

                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
                        oos.writeObject(person);
                        System.out.println("Objecte serialitzat a person.ser");
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 2:
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
                        Person p = (Person) ois.readObject();
                        System.out.println("Objecte desserialitzat: " + p);
                    } catch (IOException | ClassNotFoundException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                default:
                    return;
            }
        }
    }
}
