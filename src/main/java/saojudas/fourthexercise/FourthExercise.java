package saojudas.fourthexercise;

import java.util.Scanner;

/**
 *
 * @author Gabriel Jerônimo dos Santos
 * RA: 818125147
 *
 */
public class FourthExercise {
    public static void main(String[] args) {
        double firstNote;
        double secondNote;
        double thirdNote;
        double fourthNote;
        double average;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        firstNote = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        secondNote = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        thirdNote = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        fourthNote = scanner.nextDouble();

        average = (firstNote + secondNote + thirdNote + fourthNote) / 4;

        System.out.print("A média das notas é: " + average);
    }
}
