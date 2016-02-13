package daniel.quiz.activities.Challenge1of3;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

import daniel.quiz.R;

public class Gui {

    private TextView mTextViewQuestion;
    private Button mButtonAnswerTwo;
    private Button mButtonAnswerOne;
    private Button mButtonAnswerThree;



    public Gui(Activity activity) {
        activity.setContentView(R.layout.layout_challenge1of3);
        mTextViewQuestion = (TextView) activity.findViewById(R.id.textview_question_text);
        mButtonAnswerOne = (Button) activity.findViewById(R.id.button_answer1);
        mButtonAnswerTwo = (Button) activity.findViewById(R.id.button_answer2);
        mButtonAnswerThree = (Button) activity.findViewById(R.id.button_answer3);
    }

    public TextView getTextViewQuestion() {
        return mTextViewQuestion;
    }

    public Button getButtonAnswerTwo() {
        return mButtonAnswerTwo;
    }

    public Button getButtonAnswerOne() {
        return mButtonAnswerOne;
    }

    public Button getButtonAnswerThree() {
        return mButtonAnswerThree;
    }

    public void setQuestionText (String text){
        mTextViewQuestion.setText(text);
    }

    public void setAnswerTexts (String answer1text, String answer2text,String answer3text)
    {
        mButtonAnswerOne.setText(answer1text);
        mButtonAnswerTwo.setText(answer2text);
        mButtonAnswerThree.setText(answer3text);
    }
}
