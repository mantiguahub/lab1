//name:Michael Antigua
//cmsc 203
//description: movie driver task two

// MovieDriver_Task2.java
import java.util.Scanner;

public class MovieDriver_Task2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String repeat;

        do {
            Movie movie = new Movie();

            System.out.println("Enter the name of a movie:");
            String title = keyboard.nextLine();
            movie.setTitle(title);

            System.out.println("Enter the rating of the movie:");
            String rating = keyboard.nextLine();
            movie.setRating(rating);

            System.out.println("Enter the number of tickets sold for this movie:");
            int soldTickets = keyboard.nextInt();
            movie.setSoldTickets(soldTickets);

            System.out.println("\n" + movie.toString());

            keyboard.nextLine(); // consume leftover newline

            System.out.println("Do you want to enter another? (y or n):");
            repeat = keyboard.nextLine();

        } while (repeat.equalsIgnoreCase("y"));

        keyboard.close();
    }
}
