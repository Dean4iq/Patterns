package behavioral.chainOfResponsibility.var2;

public class NoteModule100 extends NoteModule {
    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt() / Note.H100;
        int remind = money.getAmt() % Note.H100;

        if (countNote > 0) {
            System.out.println("Видано " + countNote + " купюр номіналом " + Note.H100);
        }
        if (remind > 0 && nextNoteModule != null) {
            nextNoteModule.takeMoney(new Money(remind));
        }
    }
}
