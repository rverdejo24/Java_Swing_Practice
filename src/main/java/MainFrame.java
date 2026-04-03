import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private TextPanel textPanel;
    private Toolbar toolbar;

    public MainFrame(String title) {
        super(title);

        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
        getContentPane().setBackground(Color.decode("#6d29d3"));


        toolbar = new Toolbar();
        textPanel = new TextPanel();

        toolbar.setTextPanel(textPanel);

        add(toolbar, BorderLayout.PAGE_START);
        add(textPanel, BorderLayout.CENTER);

    }
}
