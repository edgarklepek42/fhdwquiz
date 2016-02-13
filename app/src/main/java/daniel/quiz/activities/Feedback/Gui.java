package daniel.quiz.activities.Feedback;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

import daniel.quiz.R;

public class Gui {

    private TextView mTextViewFeedback;
    private Button mButtonNext;
    private Button mButtonAbort;



    public Gui(Activity activity) {
        activity.setContentView(R.layout.layout_feedback);
        mTextViewFeedback = (TextView) activity.findViewById(R.id.textview_feedback);
        mButtonAbort = (Button) activity.findViewById(R.id.button_abort);
        mButtonNext = (Button) activity.findViewById(R.id.button_next);
    }

    public TextView getTextViewFeedback() {
        return mTextViewFeedback;
    }


    public Button getButtonNext() {
        return mButtonNext;
    }

    public Button getButtonAbort() {
        return mButtonAbort;
    }

    public void setFeedbackText (String text){
        mTextViewFeedback.setText(text);
    }


}
