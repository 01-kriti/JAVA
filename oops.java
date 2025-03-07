
import java.util.Scanner;

class Question {
    String questionText;
    String[] options;
    char correctAnswer;

    Question(String qText, String[] opts, char correctAns) {
        questionText = qText;
        options = opts;
        correctAnswer = Character.toUpperCase(correctAns); // Store in uppercase
    }

    void displayQuestion() {
        System.out.println(questionText);
        char optionLetter = 'A'; // Start from 'A'
        for (String opt : options) {
            System.out.println(optionLetter + ". " + opt);
            optionLetter++;
        }
    }

    boolean checkAnswer(char userAnswer) {
        return Character.toUpperCase(userAnswer) == correctAnswer;
    }
}

public class oops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Question[] questions = {
            new Question("What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 'C'),
            new Question("Which planet is known as the Red Planet?", new String[]{"Earth", "Mars", "Jupiter", "Venus"}, 'B'),
            new Question("What is the largest ocean on Earth?", new String[]{"Atlantic Ocean", "Indian Ocean", "Pacific Ocean", "Arctic Ocean"}, 'C'),
            new Question("Who wrote 'Romeo and Juliet'?", new String[]{"Charles Dickens", "William Shakespeare", "Mark Twain", "Jane Austen"}, 'B'),
            new Question("What is the square root of 64?", new String[]{"6", "7", "8", "9"}, 'C')
        };

        int score = 0; 

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            questions[i].displayQuestion();

            System.out.print("Enter your answer (A, B, C, D): ");
            char userAnswer = scanner.next().charAt(0);

            if (questions[i].checkAnswer(userAnswer)) {
                System.out.println("Correct! 🎉");
                score++;
            } else {
                System.out.println("Incorrect! ❌ The correct answer is: " + questions[i].correctAnswer);
            }
        }

        System.out.println("\nQuiz completed! Your final score: " + score + " / " + questions.length);

        scanner.close();
    }
}