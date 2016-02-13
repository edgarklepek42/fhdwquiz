package daniel.quiz.activities.Feedback;


import android.view.View;

import daniel.quiz.R;

public class EventToListenerMapping implements View.OnClickListener{
    private ApplicationLogic mApplicationLogic;

    public EventToListenerMapping(Gui gui, ApplicationLogic applicationLogic) {
        mApplicationLogic = applicationLogic;
        gui.getButtonAbort().setOnClickListener(this);
        gui.getButtonNext().setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button_abort:
                mApplicationLogic.onButtonAbortClicked();
                break;
            case R.id.button_next:
                mApplicationLogic.onButtonNextClicked();
                break;
        }

    }
}
