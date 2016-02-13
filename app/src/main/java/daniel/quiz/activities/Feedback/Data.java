package daniel.quiz.activities.Feedback;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import daniel.quiz.data.ChallengeCollection;
import daniel.quiz.data.ChallengeDatabase;
import daniel.quiz.data.Constants;

public class Data {
    private static final int DEFAULT_CURRENT_CHALLENGE_ID = 2;
    private static final int DEFAULT_NUMBER_CORRECT_CHALLENGES = 0;
    private static final int DEFAULT_NUMBER_ANSWERED_CHALLENGES = 0;
    private static final boolean DEFAULT_IS_ANSWER_CORRECT = true;
    private static final String KEY_CURRENT_CHALLENGE_ID = "K1";
    private static final String KEY_NUMBER_OF_CORRECT_CHALLENGES = "K2";
    private static final String KEY_NUMBER_OF_ANSWERED_CHALLENGES = "K3";
    private static final String KEY_IS_ANSWER_CORRECT = "TRUE";

    public Activity getActivity() {
        return mActivity;
    }

    private Activity mActivity;
    private ChallengeCollection mChallengeCollection;

    private int mCurrentChallengeId;
    private int mNumberCorrectChallenges;
    private int mNumberAnsweredChallenges;
    private boolean mIsAnswerCorrect;



    public Data(Activity activity, Bundle bundle) { //Bundle = gesicherte Daten bei Neuaufruf der Activity
        Intent intent; //Fehlerspeicher Android
        mActivity = activity;
        mChallengeCollection = ChallengeDatabase.getAllChallenges();

        if ( bundle == null ){
            intent  = mActivity.getIntent();

            mCurrentChallengeId = intent.getIntExtra(Constants.KEY_PARAM_CURRENT_CHALLENGE_ID, DEFAULT_CURRENT_CHALLENGE_ID);
            mNumberCorrectChallenges = intent.getIntExtra(Constants.KEY_PARAM_NUMBER_CORRECT_CHALLENGES, DEFAULT_NUMBER_CORRECT_CHALLENGES);
            mNumberAnsweredChallenges = intent.getIntExtra(Constants.KEY_PARAM_NUMBER_ANSWERED_CHALLENGES, DEFAULT_NUMBER_ANSWERED_CHALLENGES);
            mIsAnswerCorrect = intent.getBooleanExtra(Constants.KEY_PARAM_IS_ANSWER_CORRECT, DEFAULT_IS_ANSWER_CORRECT);
        }
        else
        {
            restoreDataFromBundle(bundle);
        }

    }

    public void saveDataFromBundle(Bundle bundle) {
        bundle.putInt(KEY_CURRENT_CHALLENGE_ID, mCurrentChallengeId);
        bundle.putInt(KEY_NUMBER_OF_CORRECT_CHALLENGES, mNumberCorrectChallenges);
        bundle.putInt(KEY_NUMBER_OF_ANSWERED_CHALLENGES, mNumberAnsweredChallenges);
        bundle.putBoolean(KEY_IS_ANSWER_CORRECT, mIsAnswerCorrect);
    }

    public void restoreDataFromBundle(Bundle bundle) {
        mCurrentChallengeId = bundle.getInt(KEY_CURRENT_CHALLENGE_ID);
        mNumberCorrectChallenges = bundle.getInt(KEY_NUMBER_OF_CORRECT_CHALLENGES);
        mNumberAnsweredChallenges = bundle.getInt(KEY_NUMBER_OF_ANSWERED_CHALLENGES);
        mIsAnswerCorrect = bundle.getBoolean(KEY_IS_ANSWER_CORRECT);
    }

    public int getCurrentChallengeId() {
        return mCurrentChallengeId;
    }

    public void setCurrentChallengeId(int CurrentChallengeId) {
        this.mCurrentChallengeId = CurrentChallengeId;
    }

    public int getNumberCorrectChallenges() {
        return mNumberCorrectChallenges;
    }

    public ChallengeCollection getChallengeCollection() {
        return mChallengeCollection;
    }

    public void setNumberCorrectChallenges(int NumberCorrectChallenges) {
        this.mNumberCorrectChallenges = NumberCorrectChallenges;
    }

    public int getNumberAnsweredChallenges() {
        return mNumberAnsweredChallenges;
    }

    public boolean getIsAnswerCorrect() { return mIsAnswerCorrect;}

    public void setNumberAnsweredChallenges(int NumberAnsweredChallenges) {
        this.mNumberAnsweredChallenges = NumberAnsweredChallenges;
    }
}


