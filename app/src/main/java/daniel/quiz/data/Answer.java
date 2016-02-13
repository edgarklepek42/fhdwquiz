package daniel.quiz.data;


public class Answer {
    private String mAnswerText;

    public Answer(String answerText) {
        this.mAnswerText = answerText;
    }

    public String getAnswerText() {
        return mAnswerText;
    }

    @Override
    public boolean equals(Object o) {
        String answer1Text, answer2Text;
        answer1Text = ((Answer) o).getAnswerText();
        answer2Text = this.getAnswerText();
        return answer1Text.equals(answer2Text);
    }
}
