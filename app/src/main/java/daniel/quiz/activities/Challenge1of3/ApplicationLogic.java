package daniel.quiz.activities.Challenge1of3;

import android.util.Log;
import android.widget.Toast;

import daniel.quiz.daniel.quiz.utilities.Navigation;
import daniel.quiz.data.Answer;
import daniel.quiz.data.Challenge;
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
        int currentChallengeId;
        Challenge1of3 challenge;

        currentChallengeId = mData.getCurrentChallengeId();
        challenge = (Challenge1of3) mData.getChallengeCollection().getChallenge(currentChallengeId);

        mGui.setQuestionText(challenge.getQuestion().getQuestionText());
        mGui.setAnswerTexts(
                challenge.getAnswer1().getAnswerText(),
                challenge.getAnswer2().getAnswerText(),
                challenge.getAnswer3().getAnswerText());
    }

    private void updateGui(){

    }

    private void processAnswer(Answer givenAnswer){
        int challengeId;
        Challenge1of3 challenge;
        boolean isAnswerCorrect;

        challengeId = mData.getCurrentChallengeId();
        challenge = (Challenge1of3) mData.getChallengeCollection().getChallenge(challengeId);

        if ( givenAnswer.equals(challenge.getCorrectAnswer()) ){
            isAnswerCorrect = true;
        }
        else
        {
            isAnswerCorrect = false;
        }
        Log.d("QUIZ-LOG", "processAnswer(): isAnswerCorrect = " + isAnswerCorrect);
        Navigation.startActivityFeedback(
                mData.getActivity(),
                challengeId,
                mData.getNumberCorrectChallenges(),
                mData.getNumberAnsweredChallenges(),
                isAnswerCorrect);
    }

    public void onButtonAnswer1Clicked() {
        int challengeId = mData.getCurrentChallengeId();
        Challenge1of3 challenge;

        challenge = (Challenge1of3) mData.getChallengeCollection().getChallenge(challengeId);
        processAnswer(challenge.getAnswer1());
    }

    public void onButtonAnswer2Clicked() {
        int challengeId = mData.getCurrentChallengeId();
        Challenge1of3 challenge;

        challenge = (Challenge1of3) mData.getChallengeCollection().getChallenge(challengeId);
        processAnswer(challenge.getAnswer2());
    }

    public void onButtonAnswer3Clicked() {
        int challengeId = mData.getCurrentChallengeId();
        Challenge1of3 challenge;

        challenge = (Challenge1of3) mData.getChallengeCollection().getChallenge(challengeId);
        processAnswer(challenge.getAnswer3());

    }
}

