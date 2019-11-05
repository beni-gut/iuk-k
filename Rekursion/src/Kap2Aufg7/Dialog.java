package Kap2Aufg7;


import javax.swing.*;

public class Dialog extends JPanel {

    private static final long serialVersionUID = 1L;

    JDialog dialog;
    Panel panel;

    public Dialog() {
        this.dialog = new JDialog();
        this.panel = new Panel();
        this.dialog.getContentPane().add(this.panel);
        this.dialog.setModal(false);
        this.dialog.pack();
        this.dialog.setSize(400, 400);
        this.dialog.setVisible(true);
    }

    public void markiere(final int x, final int y) {
        this.panel.markiere(x, y);
    }
}
