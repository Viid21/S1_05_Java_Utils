package level1.ex4;

public class Menus {
    public static int mainMenu() {
        return Input.askInt("""
                What do you want to do?
                1) Convert .java to .ser
                2) Print .ser
                0) Exit the program
                """);
    }
}
