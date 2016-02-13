package daniel.quiz.data;


import java.util.ArrayList;

public class ChallengeCollection {

    private ArrayList<Challenge> mChallengeList;


    public ChallengeCollection() {
        mChallengeList = new ArrayList<Challenge>();
    }

    public int getAmountOfChallenges(){
        return mChallengeList.size();
    }

    public Challenge getChallenge (int challengeId){
        return mChallengeList.get(challengeId);

    }

    public void addChallenge(Challenge challenge){
        mChallengeList.add(challenge);
    }
}
