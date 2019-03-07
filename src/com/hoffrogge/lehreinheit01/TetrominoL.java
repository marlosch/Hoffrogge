package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit04.Quadrat;

public class TetrominoL extends Quadrat {

	public void zeichnen(Graphics graphics) {
		super.zeichnen(graphics);

		Rechteck erstesRechteck = new Rechteck(250, 50);
		erstesRechteck.zeichnen(graphics);

		Rechteck zweitesRechteck = new Rechteck(250, 100);
		zweitesRechteck.zeichnen(graphics);

		Rechteck drittesRechteck = new Rechteck(250, 150);
		drittesRechteck.zeichnen(graphics);

		Rechteck viertesRechteck = new Rechteck(300, 150);
		viertesRechteck.zeichnen(graphics);
	}

}
