
public class Gibberish
{
    public Gibberish(){
    }
    //public String Sentence;
    public String makeGibberish(WordList5000 wordlist5000){
        //create the sentence
        String Sentence = "";
        //make the sentence match the tempelate (that was given to us)
        Sentence = new Template().getSourceString();
        //rubnloop is true until the sentence is complete, ending the while loop
        boolean runloop = true;
        while(runloop == true){
             //look for < (the beginning of a spot that needs to be filled)
             int currentSourceIndex = Sentence.indexOf("<");
             //find the  </> at the end of the word in the tempelate
             int finalIndex = Sentence.indexOf("</>")+3;
             
             String placeholderString = String.valueOf(Sentence.charAt(currentSourceIndex + 1));
             //gives it a random word to fill the sppot in the tempelate
             String randomWord = wordlist5000.getRandomWordString(placeholderString);
             //as long as there is a < left...
             if(currentSourceIndex > -1){
                 //sentence is from 0 to the beginnin of the tag, then a random word, then from the end of the tage tpo the end of the sentence
                 Sentence = Sentence.substring(0,currentSourceIndex) + randomWord +Sentence.substring(finalIndex);
             }
             //if there is no < left...
             else{
                 //break out of the while loop
                 runloop = false;
             }
        }
        //return the value of sentence, which now has all tage replaced with random words
        return Sentence;
    }  
}

