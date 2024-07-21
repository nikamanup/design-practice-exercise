package designpattern.adapter;

public class Translater implements EnglishSpeaker {
   GermanSpeaker germanSpeaker;
   public Translater(GermanSpeaker germanSpeaker){
    this.germanSpeaker=germanSpeaker;
   }
@Override
public void speakEnglish(String message) {
   String message1=translate(message);
   germanSpeaker.speakGerman(message1);
}
private String translate(String message) {
   return message.replace("Thank you","Danke");
} 

}
