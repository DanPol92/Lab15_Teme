package Tema3;

public class Princ {

    public static void main(String[] args) {
        Agenda agenda=new Agenda();
        agenda.addToAgenda();
        agenda.showAgenda();
        System.out.print("\n");
       // agenda.searchInAgenda();
       // agenda.deleteFromAgenda();
       // agenda.showAgenda();
      //  agenda.replaceInAgenda();
       // agenda.showAgenda();
        agenda.checkifEqualsOrAdd("dan","9684596894969");
        agenda.checkifEqualsOrAdd("mihai","0712345678");
        agenda.showAgenda();


    }
}
