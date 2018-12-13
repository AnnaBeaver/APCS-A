

public class GibberishRunner extends Gibberish
{
    public static void main(){
        //use the given class of wordlist5000
        String wordlist5000;
        //make a new instance of the wordlist5000 class
        WordList5000 wordList5000 = new WordList5000();
        //make a new instance of the Gibberish class
        Gibberish gibberish = new Gibberish();
        //print out the return from the Gibberish class
        System.out.println(gibberish.makeGibberish(wordList5000));
    }
}
