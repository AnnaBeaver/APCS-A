

public class SentenceBuilder extends SentenceRunner
{
    //all possible words
    public static String[] preps ={" over", " near", " on top of", " behind", " next to", " inside of", " under"};
    public static String[] advs ={" quickly", " happily", " smoothly", " often", " very", " never"};
    public static String[] dets ={" the", " my", " your", " his", " hers", " our", " their", " Fred's"};
    public static String[] adjs ={" little", " silly", " funny", " stuffy", " shady", " hopeful", " graceful"};
    public static String[] verbs ={" jumps", " runs", " flies", " hops", " makes", " wants", " sings", " skips"};
    public static String[] nouns ={" puppy", " pizza", " snake", " doorbell", " girl", " building"};
    
    //make sentence from noun phrase, verb phrase, and prepositional phrase
    public SentenceBuilder()
    {
        System.out.println(NOUNP() + VERBP() + PREPP());
    }
    
    //noun phrase is determiner + adjective + noun
    public static String NOUNP(){
        return (DETS() + ADJS() + NOUNS());
    }
    //verb phrase is adverb + verb
    public static String VERBP(){
        return (ADVS() + VERBS());
    }
    //prepositional phrase is prepositional + determinate + 
    public static String PREPP(){
        return (PREPS() + DETS() + ADJS() + NOUNS());
    }
    
    //puicks a random noun
    public static String NOUNS(){
        String[] a = nouns;
        int index = (int)(Math.random()*a.length);
        return a[index];
    }
    //picks a random verb
    public static String VERBS(){
        String[] a = verbs;
        int index = (int)(Math.random()*a.length);
        return a[index];
    }
    //picks a random adjective
        public static String ADJS(){
        String[] a = adjs;
        int index = (int)(Math.random()*a.length);
        return a[index];
    }
    //picks a random determinate
        public static String DETS(){
        String[] a = dets;
        int index = (int)(Math.random()*a.length);
        return a[index];
    }
    //picks a random adverb
        public static String ADVS(){
        String[] a = advs;
        int index = (int)(Math.random()*a.length);
        return a[index];
    }
    //picks a random preposition
        public static String PREPS(){
        String[] a = preps;
        int index = (int)(Math.random()*a.length);
        return a[index];
    }
}
