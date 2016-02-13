package daniel.quiz.activities.Feedback;

import daniel.quiz.data.Challenge1of3;

public class ApplicationLogic {

    private Data mData;
    private Gui mGui;


    public ApplicationLogic(Data data, Gui gui) {
        mData = data;
        mGui = gui;
        initialUpdateGui();
    }

    void initialUpdateGui(){
        if ( mData.getIsAnswerCorrect() ) {
            mGui.setFeedbackText("Ihre Antwort ist korrekt!");
        }
        else
        {
            mGui.setFeedbackText("Ihre Antwort ist falsch!");
        }
    }

    private void updateGui(){

    }

    public void onButtonAbortClicked() {

    }

    public void onButtonNextClicked() {

    }
}

