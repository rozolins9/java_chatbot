import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Sveiks!");
        String sveciens = s.nextLine();
        System.out.println("Pajautā man kaut ko...");
        boolean aaa = true;
        do {
            String jautajums = s.nextLine();
            if (jautajums.equalsIgnoreCase("Kāds ir šodienas datums?")) {
                System.out.println("27.maijs, 2022.gads. Uzminēju?");
                String datumsAtbilde = s.nextLine();
                String minejums = (datumsAtbilde.equalsIgnoreCase("jā")) ? "Super!" : "Žēl...";
                System.out.println(minejums);
                System.out.println("Pajautā ko citu...");
                aaa = true;
            }
            else if (jautajums.equalsIgnoreCase("Kā tevi sauc?")) {
                System.out.println("Esmu ChatBot! Un kā tevi sauc?");
                String vardsAtbilde = s.nextLine();
                System.out.println("Prieks iepazīties, " + vardsAtbilde + "!");
                System.out.println("Pajautā ko citu...");
                aaa = true;
            }
            else if (jautajums.equalsIgnoreCase("No kurienes tu esi?")) {
                System.out.println("No Latvijas");
                System.out.println("Pajautā ko citu...");
                aaa = true;
            }
            else {
                System.out.println("Pajautā ko vienkāršāku. Piemēram, 'Kāds ir šodienas datums?' vai 'Kā tevi sauc?', vai 'No kurienes tu esi?'");
                aaa = true;
            }
        } while (aaa);
    }
}