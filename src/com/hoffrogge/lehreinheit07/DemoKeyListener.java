package com.hoffrogge.lehreinheit07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JLabel;

public class DemoKeyListener implements KeyListener {

	private JLabel textLabel;

	public DemoKeyListener(JLabel textLabel) {
		this.textLabel = textLabel;
	}

	private int Ergebnis = 0;
	private int ziffer = 0;
	private ArrayList<Integer> ziffernListe = new ArrayList<Integer>();
	private int zwischenErgebnis = 0;

	@Override
	public void keyPressed(KeyEvent e) {

		gebeTasteAus(e, "gedrückt");

		/* Mit der Esc-Taste das Programm beenden */
		if (KeyEvent.VK_ESCAPE == e.getKeyCode())
			System.exit(0);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		gebeTasteAus(e, "losgelassen");
	}

	private void gebeTasteAus(KeyEvent e, String eventArt) {
		// textLabel.setText("Taste " + e.getKeyChar() + " " + eventArt);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() >= 48 && e.getKeyChar() <= 58) {
			ziffer = e.getKeyChar() - 48;
			ziffernListe.add(ziffer);
			Ergebnis = Ergebnis + ziffer;
			textLabel.setText("Ergebnis =" + Ergebnis);
			if (KeyEvent.VK_ENTER == e.getKeyCode()) {
				for (int i = 0; i < ziffernListe.size(); i++) {
					System.out.println(ziffernListe.get(i));
				}

			}

		}

	}
}
