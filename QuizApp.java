import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      List<Question> questions = new ArrayList<>();

        questions.add(new Question("Which keyword is used to inherit a class in Java?",
        new String[]{"this", "super", "extends", "implements"}, 2));

        questions.add(new Question("Which method is the entry point of a Java program?",
        new String[]{"start()", "main()", "run()", "init()"}, 1));

        questions.add(new Question("Which of the following is not a Java primitive type?",
        new String[]{"int", "String", "char", "boolean"}, 1));

        questions.add(new Question("What is the size of an int in Java?",
        new String[]{"4 bytes", "2 bytes", "8 bytes", "Depends on OS"}, 0));

        questions.add(new Question("Which package contains the Scanner class?",
        new String[]{"java.util", "java.io", "java.lang", "java.text"}, 0));

        int score = 0;

        System.out.println("Welcome to the Java Console Quiz!\n");

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("Question " + (i + 1) + ":");
            q.display();

            int answer = 0;
            boolean valid = false;

            // Input loop with validation
            while (!valid) {
                System.out.print("Your answer (1-4): ");
                try {
                    answer = sc.nextInt();
                    if (answer >= 1 && answer <= 4) {
                        valid = true;
                    } else {
                        System.out.println("Please enter a number between 1 and 4.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number (1-4).");
                    sc.next(); // clear invalid input
                }
            }

            // Check answer
            if (q.isCorrect(answer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect.\n");
            }
        }

        // Final result
        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + "/" + questions.size());

        sc.close();
    }
}
