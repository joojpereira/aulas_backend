

import java.util.Scanner;


public class GradeBookTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        GradeBook velho = new GradeBook();

        System.out.println("digite o nome do seu curso: ");
        String courseName = scanner.nextLine();

        velho.showMessage(courseName);
    }
}
