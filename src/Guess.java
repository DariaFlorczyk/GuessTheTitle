import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("movies.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        String filmTitle = "the shawshank";
        String guesses = " "; //the user's guesses
        Scanner keyboard = new Scanner(System.in);
        boolean notDone = true;
        while (true) {
            notDone = false;
            for (char secretTitle : filmTitle.toCharArray()) {
                if (guesses.indexOf(secretTitle) == -1) {
                    System.out.print('*');
                    notDone = true;
                } else {
                    System.out.print(secretTitle);
                }
            }
            if (! notDone) {break;}
            System.out.print("\nEnter your letter: ");
            String letter = keyboard.next();
            guesses += letter;
            }
        System.out.println("\nCongratulations!");
        }
    }
