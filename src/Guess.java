import java.io.File;
import java.io.FileNotFoundException;
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
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
        String filmTitle =
        String guesses = " "; //the user's guesses
        Scanner keyboard = new Scanner(System.in);
        boolean notDone = true;
        while (true) {
            notDone = false;
            for (char filmTitle : filmTitle.toCharArray()) {
                if (guesses.indexOf(filmTitle) == -1 {
                    System.out.println('*');
                    notDone = true;
                }else{
                    System.out.println(filmTitle);
                }
            }
            System.out.println("\nEnter your letter: ");
            String letter = keyboard.next();
            guesses += letter;
                }
            }
        }
}
}
