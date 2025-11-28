package app;

import service.StudentService;
import java.util.Scanner;
import util.DatabaseConnection;

public class Main {
    public static void main(String[] args) {

        DatabaseConnection.initializeDatabase();

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        System.out.print("Введіть номер місяця (1–12): ");
        int month = sc.nextInt();

        service.printStudentsByMonth(month);
    }
}
