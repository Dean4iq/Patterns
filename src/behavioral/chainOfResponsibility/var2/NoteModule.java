package behavioral.chainOfResponsibility.var2;

public abstract class NoteModule {
    protected NoteModule nextNoteModule;

    abstract void takeMoney(Money money);

    public void setNextNoteModule(NoteModule noteModule) {
        this.nextNoteModule = noteModule;
    }
}
