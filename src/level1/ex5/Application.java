package level1.ex5;

import java.io.*;

public class Application {
    public void play() {
        boolean exit = false;
        while (!exit){
            switch (Menus.mainMenu()){
                case 1:
                    convertJava();
                    break;
                case 2:
                    printSer();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
            }
        }
    }

    public void convertJava(){
        Person person = new Person(24, "David");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person);
            System.out.println("Objecte serialitzat a person.ser");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void printSer(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person p = (Person) ois.readObject();
            System.out.println("Objecte desserialitzat: " + p);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
