package daniel.quiz.activities.Welcome;


import android.view.View;

import daniel.quiz.R;

public class EventToListenerMapping implements View.OnClickListener{
    private ApplicationLogic mApplicationLogic;

    public EventToListenerMapping(Gui gui, ApplicationLogic applicationLogic) {
        mApplicationLogic = applicationLogic;
        gui.getButtonStart().setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    mApplicationLogic.onButtonStartClicked();
    }

}
