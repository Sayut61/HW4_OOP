package Task2;

public class Main {
    public static void main(String[] args) {
        AbstractHandler doc = new DOCHandler();
        doc.save();
        doc.change();
        doc.create();
        doc.open();
        System.out.println("-------------------");
        AbstractHandler txt = new TXTHandler();
        txt.save();
        txt.change();
        txt.create();
        txt.open();
        System.out.println("-------------------");
        AbstractHandler xml = new XMLHandler();
        xml.save();
        xml.change();
        xml.create();
        xml.open();
    }
}
