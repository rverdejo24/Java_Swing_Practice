import javax.swing.*;

public class Main {
    static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame("Hello World");
            }
        });
    }
}
