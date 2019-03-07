package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit04.Quadrat;

public class TetrominoI extends Quadrat {

	public void zeichnen(Graphics graphics) {
		super.zeichnen(graphics);

		Rechteck erstesRechteck = new Rechteck(400, 50);
		erstesRechteck.zeichnen(graphics);

		Rechteck zweitesRechteck = new Rechteck(400, 100);
		zweitesRechteck.zeichnen(graphics);

		Rechteck drittesRechteck = new Rechteck(400, 150);
		drittesRechteck.zeichnen(graphics);

		Rechteck viertesRechteck = new Rechteck(400, 200);
		viertesRechteck.zeichnen(graphics);
	}

}
