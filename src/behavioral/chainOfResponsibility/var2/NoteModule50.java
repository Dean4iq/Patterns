package behavioral.chainOfResponsibility.var2;

public class NoteModule50 extends NoteModule {
    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt() / Note.H50;
        int remind = money.getAmt() % Note.H50;

        if (countNote > 0) {
            System.out.println("Видано " + countNote + " купюр номіналом " + Note.H50);
        }
        if (remind > 0 && nextNoteModule != null) {
            nextNoteModule.takeMoney(new Money(remind));
        }
    }
}
