import java.util.Scanner;

public class SuperGreeter {

    public void start() {
        System.out.println("Det virker!");

    }

    public void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast dit navn: ");
        String navn = scanner.nextLine();

        System.out.println("Hej " + navn);


    }

    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();
        sg.greet();


    }

}
