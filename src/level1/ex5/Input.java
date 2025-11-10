package level1.ex5;

import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    public static int askInt(String message){
        System.out.println(message);
        return sc.nextInt();
    }
}
