public class Question {
    private String questionText;
    private String[] options;
    private int correctOptionIndex; // 0-based

    public Question(String questionText, String[] options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public void display() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean isCorrect(int userAnswer) {
        return userAnswer - 1 == correctOptionIndex;
    }
}
        