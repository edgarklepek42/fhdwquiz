package daniel.quiz.data;


public class ChallengeDatabase {

    public static ChallengeCollection getAllChallenges() {

        ChallengeCollection allChallenges;
        allChallenges = new ChallengeCollection();

        allChallenges.addChallenge(
                new Challenge1of3(
                        new Question("Wie alt ist Angie Merkel?"),
                        new Answer("60"),
                        new Answer("61"),
                        new Answer("62"),
                        new Answer("62") //richtige Antwort
                ));

        allChallenges.addChallenge(
                new Challenge1of3(
                        new Question("Wieviele Rippen haben Schlangen maximal?"),
                        new Answer("200"),
                        new Answer("300"),
                        new Answer("400"),
                        new Answer("300") //richtige Antwort
                ));


        return allChallenges;
    }
}
