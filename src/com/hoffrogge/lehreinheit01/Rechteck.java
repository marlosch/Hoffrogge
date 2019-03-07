package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class Rechteck {

	private int xKoordinate;
	private int yKoordinate;

	public Rechteck(int xKoordinate, int yKoordinate) {
		super();
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
	}

	public void zeichnen(Graphics graphics) {
		/*
		 * Draws a line, using the current color, between the points (x1, y1) and (x2,
		 * y2) in this graphics context's coordinate system.
		 */

		/*
		 * int x1 = 350; int y1 = 350; int x2 = 450; int y2 = 450; graphics.drawLine(x1,
		 * y1, x2, y2); int x3 = 450; int y3 = 450; int x4 = 50; int y4 = 500;
		 * graphics.drawLine(x3, y3, x4, y4); int x5 = 50; int y5 = 50; int x6 = 500;
		 * int y6 = 500; graphics.drawLine(x5, y5, x6, y6); int x7 = 50; int y7 = 50;
		 * int x8 = 500; int y8 = 500; graphics.drawLine(x7, y7, x8, y8);
		 */

		graphics.drawLine(xKoordinate, yKoordinate, xKoordinate, yKoordinate + 100);
		graphics.drawLine(xKoordinate, yKoordinate, xKoordinate + 100, yKoordinate);
		graphics.drawLine(xKoordinate, yKoordinate + 100, xKoordinate + 100, yKoordinate + 100);
		graphics.drawLine(xKoordinate + 100, yKoordinate + 100, xKoordinate + 100, yKoordinate);
	}
}
