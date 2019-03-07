package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit04.Quadrat;

/* Zeichenfläche mit einer Größe von 800 x 800 Pixeln
 * 
 */

public class Zeichenflaeche extends Quadrat {

	@Override
	public void zeichnen(Graphics graphics) {
		super.zeichnen(graphics);

		Rechteck erstesRechteck = new Rechteck(0, 0);
		erstesRechteck.zeichnen(graphics);

		Rechteck zweitesRechteck = new Rechteck(100, 0);
		zweitesRechteck.zeichnen(graphics);
	}

}