public class Printer {
    private static Printer printer = null;
    private static int pages = 50;

    private Printer() {
        System.out.println("Making Printer");
    }

    public static Printer getPrinter() {
        if (printer == null) synchronized (Printer.class) {
            if (printer == null) printer = new Printer();
        }

        return printer;
    }

    public void print(int pages) {
        if (pages < Printer.pages) {
            Printer.pages -= pages;
        } else Printer.pages = 0;
    }

    public int getPagesCount() {
        return Printer.pages;
    }

    public void refillPages() {
        Printer.pages = 50;
    }
}