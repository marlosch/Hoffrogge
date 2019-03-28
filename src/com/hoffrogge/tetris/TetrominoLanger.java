package com.hoffrogge.tetris;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit01.Rechteck;

public class TetrominoLanger extends AllgemeinerTetromino {

	private int koordinateY;
	private int koordinateX;

	public TetrominoLanger(int x, int y) {
		koordinateX = x;
		koordinateY = y;
	}

	public void zeichnen(Graphics graphics) {

		Rechteck erstesRechteck = new Rechteck(koordinateX, koordinateY);
		erstesRechteck.zeichnen(graphics);

		Rechteck zweitesRechteck = new Rechteck(koordinateX, koordinateY + 50);
		zweitesRechteck.zeichnen(graphics);

		Rechteck drittesRechteck = new Rechteck(koordinateX, koordinateY + 100);
		drittesRechteck.zeichnen(graphics);

		Rechteck viertesRechteck = new Rechteck(koordinateX, koordinateY + 150);
		viertesRechteck.zeichnen(graphics);
	}
}