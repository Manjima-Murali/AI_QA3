import java.util.Scanner;

/*
 Rule-Based Library Chatbot
 AI – Unit 3
 Qualitative Assessment – 3
*/

public class LibraryChatbot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Library Chatbot");
        System.out.println("Type 'exit' to quit");

        while (true) {
            System.out.print("User: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.contains("hours")) {
                System.out.println("Bot: The library is open from 9 AM to 5 PM.");

            } else if (input.contains("borrow")) {
                System.out.println("Bot: You can borrow up to 3 books.");

            } else if (input.contains("fine")) {
                System.out.println("Bot: Late return fine is Rs.2 per day.");

            } else if (input.contains("membership")) {
                System.out.println("Bot: Membership is free for students.");

            } else if (input.contains("contact")) {
                System.out.println("Bot: Contact the library at library@gcu.edu.");

            } else if (input.contains("exit")) {
                System.out.println("Bot: Thank you for using the Library Chatbot!");
                break;

            } else {
                System.out.println("Bot: Sorry, I don't understand your query.");
            }
        }
        scanner.close();
    }
}
