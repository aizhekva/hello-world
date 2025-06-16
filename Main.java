import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> notes = new ArrayList<>();

        while (true) {
            System.out.print("Введите заметку: ");
            String note = scan.nextLine();


            notes.add(note);

            if (note.contains("0")) {
                System.out.println("Заметки:");
                for (int i = 0; i < notes.size(); i++) {
                    System.out.println(notes.get(i));
                }
                break;
            }
        }
    }
}
