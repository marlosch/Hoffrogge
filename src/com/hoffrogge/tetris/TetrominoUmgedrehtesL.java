package com.hoffrogge.tetris;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit01.Rechteck;

public class TetrominoUmgedrehtesL extends AllgemeinerTetromino {

	public void zeichnen(Graphics graphics) {

		Rechteck erstesRechteck = new Rechteck(300, 300);
		erstesRechteck.zeichnen(graphics);

		Rechteck zweitesRechteck = new Rechteck(300, 350);
		zweitesRechteck.zeichnen(graphics);

		Rechteck drittesRechteck = new Rechteck(300, 400);
		drittesRechteck.zeichnen(graphics);

		Rechteck viertesRechteck = new Rechteck(250, 400);
		viertesRechteck.zeichnen(graphics);
	}
}