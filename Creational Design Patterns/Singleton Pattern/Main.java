public class Main {
    public static void main(String[] args) {
        Printer printer = Printer.getPrinter();

        System.out.println(printer.getPagesCount());
        printer.print(10);
        
        System.out.println(printer.getPagesCount());
        printer.print(20);

        System.out.println(printer.getPagesCount());
    }
}