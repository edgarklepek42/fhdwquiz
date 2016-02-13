package daniel.quiz.daniel.quiz.utilities;


import android.app.Activity;
import android.content.Intent;

import daniel.quiz.data.Constants;

public class Navigation {

    public static void startActivityChallenge1of3(Activity callingActivity, int currentChallengeId, int numberCorrectChallenges, int numberAnsweredChallenges){
        Intent intent;
        intent = new Intent(callingActivity,daniel.quiz.activities.Challenge1of3.Init.class);
        intent.putExtra(Constants.KEY_PARAM_CURRENT_CHALLENGE_ID, currentChallengeId);
        intent.putExtra(Constants.KEY_PARAM_NUMBER_ANSWERED_CHALLENGES, numberAnsweredChallenges);
        intent.putExtra(Constants.KEY_PARAM_NUMBER_CORRECT_CHALLENGES, numberCorrectChallenges);
        callingActivity.startActivity(intent);
        callingActivity.finish();
    }

    public static void startActivityFeedback(Activity callingActivity, int currentChallengeId, int numberCorrectChallenges, int numberAnsweredChallenges, boolean isAnswerCorrect){
        Intent intent;
        intent = new Intent(callingActivity,daniel.quiz.activities.Feedback.Init.class);
        intent.putExtra(Constants.KEY_PARAM_CURRENT_CHALLENGE_ID, currentChallengeId);
        intent.putExtra(Constants.KEY_PARAM_NUMBER_ANSWERED_CHALLENGES, numberAnsweredChallenges);
        intent.putExtra(Constants.KEY_PARAM_NUMBER_CORRECT_CHALLENGES, numberCorrectChallenges);
        intent.putExtra(Constants.KEY_PARAM_IS_ANSWER_CORRECT, isAnswerCorrect);
        callingActivity.startActivity(intent);
        callingActivity.finish();
    }
}
