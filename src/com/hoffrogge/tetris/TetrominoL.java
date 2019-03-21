package com.hoffrogge.tetris;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit01.Rechteck;

public class TetrominoL extends AllgemeinerTetromino {

	public void zeichnen(Graphics graphics) {

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