public class Main {
    public static void main(String[] args) {
        WordMatch w = new WordMatch("mississippi");
        System.out.println(w.scoreGuess("i"));
        System.out.println(w.scoreGuess("iss"));
        System.out.println(w.scoreGuess("issipp"));
        System.out.println(w.scoreGuess("mississippi"));

        WordMatch x = new WordMatch("aaaabb");
        System.out.println(x.scoreGuess("a"));
        System.out.println(x.scoreGuess("aa"));
        System.out.println(x.scoreGuess("aaa"));
        System.out.println(x.scoreGuess("aabb"));
        System.out.println(x.scoreGuess("c"));

        WordMatch c = new WordMatch("concatenation");
        System.out.println(c.scoreGuess("ten"));
        System.out.println(c.scoreGuess("nation"));
        System.out.println(c.findBetterGuess("ten", "nation"));
        System.out.println(c.scoreGuess("con"));
        System.out.println(c.scoreGuess("cat"));
        System.out.println(c.findBetterGuess("con", "cat"));
    }
}
