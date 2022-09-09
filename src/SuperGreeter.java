import java.util.Scanner;

public class SuperGreeter {
    Scanner scanner = new Scanner(System.in);
    public void start() {
        System.out.println("Det virker!");

    }

    public void greet() {

        System.out.print("Indtast dit navn: ");
        String navn = scanner.nextLine();

        System.out.println("Hej " + navn);


    }

    public void askAboutAge() {
        System.out.print("Hvad er din alder: ");
        int alder = scanner.nextInt();

        System.out.println("Din alder er: " + alder);
    }

    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();
        sg.greet();
        sg.askAboutAge();


    }

}
