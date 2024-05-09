package e14;

import java.awt.*;

public class Client {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        run();
    }
    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
    /**
     * All the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void run() {
        dialog.renderWindow();
    }
}