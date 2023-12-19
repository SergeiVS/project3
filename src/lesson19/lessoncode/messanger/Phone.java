package lessoncode.messanger;

public class Phone {

   private Messanger[] messangers;

   public Phone(Messanger[] messangers) {
      this.messangers = messangers;
   }

   public Messanger[] getMessangers() {
      return messangers;
   }
}
