public class WordMatch {

    private String secret;

    public WordMatch(String word) {
        secret = word;
    }

    public int scoreGuess(String guess) {
        int score = 0;
        for (int i = 0; i <= secret.length() - guess.length(); i++)
            if (secret.substring(i, i + guess.length()).equals(guess))
                score++;
        return score * guess.length() * guess.length();
    }

    public String findBetterGuess(String guess1, String guess2) {
        int score1 = 0;
        int score2 = 0;

        for (int i = 0; i <= secret.length() - guess1.length(); i++)
            if (secret.substring(i, i + guess1.length()).equals(guess1))
                score1++;
        score1 = score1 * guess1.length() * guess1.length();

        for (int i = 0; i <= secret.length() - guess2.length(); i++)
            if (secret.substring(i, i + guess2.length()).equals(guess2))
                score2++;
        score2 = score2 * guess2.length() * guess2.length();

        if (score1 > score2) {
            return guess1;
        }
        if (score2 > score1) {
            return guess2;
        }
        else {
            return
        }

}
