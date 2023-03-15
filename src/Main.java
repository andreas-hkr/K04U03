import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bestäm om ett postnummer ligger i...
        //   Götaland = 20-62 eller 65-66
        //   Norrland = 80 eller större
        //   Svealand = allt annat

        Scanner input = new Scanner(System.in);
        System.out.print("Ange ett postnummer (5 siffror): ");
        int areaCode = input.nextInt();

        int twoFirst = areaCode / 1000;

        if ((twoFirst >= 20 && twoFirst <= 62) || (twoFirst >= 65 && twoFirst <= 66)) {
            System.out.println("Götaland");
        } else if(twoFirst >= 80) {
            System.out.println("Norrland");
        } else {
            System.out.println("Svealand");
        }
    }
}