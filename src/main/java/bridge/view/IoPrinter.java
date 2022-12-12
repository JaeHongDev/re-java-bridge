package bridge.view;

public class IoPrinter {
    protected void println(final Object message) {
        System.out.println(message);
    }

    protected void println() {
        this.println("");
    }

    protected void printlnAndAfterNewLine(final Object message) {
        this.println(message);
        this.println();
    }

    protected void printlnByFormat(final String format, final Object... args) {
        System.out.printf(format, args);
    }

}
