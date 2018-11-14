package behavioral.chainOfResponsibility.var2;

public class NoteModule200 extends NoteModule {
    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt() / Note.H200;
        int remind = money.getAmt() % Note.H200;

        if (countNote > 0) {
            System.out.println("Видано " + countNote + " купюр номіналом " + Note.H200);
        }
        if (remind > 0 && nextNoteModule != null) {
            nextNoteModule.takeMoney(new Money(remind));
        }
    }
}
