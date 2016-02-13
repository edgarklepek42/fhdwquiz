package daniel.quiz.activities.Welcome;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

import daniel.quiz.R;

public class Gui {

    private TextView mTextViewWelcome;
    private Button mButtonStart;




    public Gui(Activity activity) {
        activity.setContentView(R.layout.layout_welcome);
        mTextViewWelcome = (TextView) activity.findViewById(R.id.textview_welcome);
        mButtonStart = (Button) activity.findViewById(R.id.button_start);
    }

    public TextView getTextViewWelcome() {
        return mTextViewWelcome;
    }

    public Button getButtonStart() {
        return mButtonStart;
    }

}
