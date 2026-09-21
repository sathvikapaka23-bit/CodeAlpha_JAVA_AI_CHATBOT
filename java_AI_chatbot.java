import java.util.Scanner;

public class AIChatbot {

    static String getResponse(String input) {

        input = input.toLowerCase();

        if (input.contains("hello") ||
            input.contains("hi") ||
            input.contains("hey")) {

            return "Hello! How can I help you?";
        }

        if (input.contains("name")) {

            return "My name is JavaBot.";
        }

        if (input.contains("java")) {

            return "Java is a popular object-oriented programming language.";
        }

        if (input.contains("python")) {

            return "Python is a popular programming language used in AI, ML and web development.";
        }

        if (input.contains("ai") ||
            input.contains("artificial intelligence")) {

            return "AI allows computers to perform tasks that normally require human intelligence.";
        }

        if (input.contains("machine learning") ||
            input.contains("ml")) {

            return "Machine Learning allows computers to learn patterns from data.";
        }

        if (input.contains("college")) {

            return "College is a great place to learn, build projects and develop skills.";
        }

        if (input.contains("help")) {

            return "You can ask me about Java, AI, ML, Python or programming.";
        }

        if (input.contains("thank")) {

            return "You're welcome!";
        }

        return "Sorry, I don't understand that question.";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("        JAVA AI CHATBOT");
        System.out.println("================================");
        System.out.println("Type 'bye' to exit.");

        while (true) {

            System.out.print("\nYou: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("bye") ||
                input.equalsIgnoreCase("exit")) {

                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            }

            String response = getResponse(input);

            System.out.println("Bot: " + response);
        }

        sc.close();
    }
}