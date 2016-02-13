package daniel.quiz.activities.Challenge1of3;


import android.view.View;

import daniel.quiz.R;

public class EventToListenerMapping implements View.OnClickListener{
    private ApplicationLogic mApplicationLogic;

    public EventToListenerMapping(Gui gui, ApplicationLogic applicationLogic) {
        mApplicationLogic = applicationLogic;
        gui.getButtonAnswerOne().setOnClickListener(this);
        gui.getButtonAnswerTwo().setOnClickListener(this);
        gui.getButtonAnswerThree().setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button_answer1:
                mApplicationLogic.onButtonAnswer3Clicked();
                break;
            case R.id.button_answer2:
                mApplicationLogic.onButtonAnswer1Clicked();
                break;
            case R.id.button_answer3:
                mApplicationLogic.onButtonAnswer2Clicked();
                break;
        }

    }
}
