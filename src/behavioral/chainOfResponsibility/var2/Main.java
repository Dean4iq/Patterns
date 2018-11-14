package behavioral.chainOfResponsibility.var2;

public class Main {
    public static void main(String[] args) {
        NoteModule noteModule20 = new NoteModule20();
        NoteModule noteModule50 = new NoteModule50();
        NoteModule noteModule100 = new NoteModule100();
        NoteModule noteModule200 = new NoteModule200();
        NoteModule noteModule500 = new NoteModule500();

        noteModule500.setNextNoteModule(noteModule200);
        noteModule200.setNextNoteModule(noteModule100);
        noteModule100.setNextNoteModule(noteModule50);
        noteModule50.setNextNoteModule(noteModule20);

        noteModule500.takeMoney(new Money(25700));
    }
}
