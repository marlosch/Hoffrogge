package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class Rechteck {

	private int xKoordinate;
	private int yKoordinate;

	private static int kantenlänge = 50;

	public static int getKantenlaenge() {
		return kantenlänge;
	}

	public Rechteck(int xKoordinate, int yKoordinate) {
		super();
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
	}

	public void zeichnen(Graphics graphics) {

		graphics.drawLine(xKoordinate, yKoordinate, xKoordinate, yKoordinate + 50);
		graphics.drawLine(xKoordinate, yKoordinate, xKoordinate + 50, yKoordinate);
		graphics.drawLine(xKoordinate, yKoordinate + 50, xKoordinate + 50, yKoordinate + 50);
		graphics.drawLine(xKoordinate + 50, yKoordinate + 50, xKoordinate + 50, yKoordinate);
	}
}
