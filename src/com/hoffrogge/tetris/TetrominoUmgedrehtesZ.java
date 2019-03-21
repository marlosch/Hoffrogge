package com.hoffrogge.tetris;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit01.Rechteck;

public class TetrominoUmgedrehtesZ extends AllgemeinerTetromino {

	public void zeichnen(Graphics graphics) {

		Rechteck erstesRechteck = new Rechteck(700, 300);
		erstesRechteck.zeichnen(graphics);

		Rechteck zweitesRechteck = new Rechteck(650, 350);
		zweitesRechteck.zeichnen(graphics);

		Rechteck drittesRechteck = new Rechteck(700, 350);
		drittesRechteck.zeichnen(graphics);

		Rechteck viertesRechteck = new Rechteck(650, 400);
		viertesRechteck.zeichnen(graphics);
	}
}