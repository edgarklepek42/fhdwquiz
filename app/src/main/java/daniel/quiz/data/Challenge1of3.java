package daniel.quiz.data;


public class Challenge1of3 extends Challenge {

    private Answer mAnswer1;
    private Answer mAnswer2;
    private Answer mAnswer3;
    private Answer mCorrectAnswer;

    public Challenge1of3(Question question, Answer answer1, Answer answer2, Answer answer3, Answer correctAnswer){
        super(question); //Konstruktoraufruf von vererbender Klasse
        mAnswer1 = answer1;
        mAnswer2 = answer2;
        mAnswer3 = answer3;
        mCorrectAnswer = correctAnswer;
    }

    public Answer getAnswer1() {
        return mAnswer1;
    }

    public Answer getAnswer2() {
        return mAnswer2;
    }

    public Answer getAnswer3() {
        return mAnswer3;
    }

    public Answer getCorrectAnswer() {
        return mCorrectAnswer;
    }
}
