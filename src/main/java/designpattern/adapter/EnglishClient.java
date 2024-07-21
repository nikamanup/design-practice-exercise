package designpattern.adapter;
public class EnglishClient{
    /**
     * @param args
     */
    public static void main(String[] args) {
        GermanSpeaker germanSpeaker=new GermanSpeaker();
        Translater translate=new Translater(germanSpeaker);
        translate.speakEnglish("Thank you"); 
    }
    
}