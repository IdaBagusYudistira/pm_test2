import java.util.Scanner;

public class Hello {
    private String name;
    
    public Hello(String name) {
        this.name = name;
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hey! Insert your name here: ");
        Hello hello = new Hello(sc.nextLine());
        
        System.out.printf("Hello, %s!", hello.name);
    }
}
