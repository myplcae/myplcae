package src.com.Designpattern.behavior.memorandum;

public class Testmemo {

    public static void main(String[] args) {

        NoteBook noteBook = new NoteBook();

        SouceCode souceCode = new SouceCode();

        souceCode.setRemark("2023-4-27");
        souceCode.setLines(200);
        souceCode.setVersion("Version1");
        Memento memento = souceCode.creatMemento();
        noteBook.addMemento(memento);

        souceCode.setRemark("2023-4-17");
        souceCode.setLines(150);
        souceCode.setVersion("Version2");
        Memento memento2 = souceCode.creatMemento();
        noteBook.addMemento(memento2);

        souceCode.setRemark("2023-3-27");
        souceCode.setLines(2000);
        souceCode.setVersion("Version3");
        Memento memento3 = souceCode.creatMemento();
        noteBook.addMemento(memento3);

        souceCode.reset(noteBook.getMemento("v3"));
        System.out.println(souceCode.getVersion() + "," +souceCode.getLines() + ","+souceCode.getRemark());

        souceCode.reset(noteBook.getMemento("v2"));
        System.out.println(souceCode.getVersion() + "," +souceCode.getLines() + ","+souceCode.getRemark());

        souceCode.reset(noteBook.getMemento("v1"));
        System.out.println(souceCode.getVersion() + "," +souceCode.getLines() + ","+souceCode.getRemark());

        souceCode.reset(noteBook.getMemento("v3"));
        System.out.println(souceCode.getVersion() + "," +souceCode.getLines() + ","+souceCode.getRemark());

    }
}
