package daniel.quiz.activities.Welcome;

import daniel.quiz.daniel.quiz.utilities.Navigation;
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

    }

    private void updateGui(){

    }

    public void onButtonStartClicked() {
        Navigation.startActivityChallenge1of3(mData.getActivity(), mData.getCurrentChallengeId(), mData.getNumberCorrectChallenges(), mData.getNumberAnsweredChallenges());
    }

}

