package com.hoffrogge.tetris;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit01.Rechteck;

public class TetrominoBlock extends AllgemeinerTetromino {

	private int koordinateY;
	private int koordinateX;

	public TetrominoBlock(int x, int y) {
		koordinateX = x;
		koordinateY = y;

	}

	public void zeichnen(Graphics graphics) {

		Rechteck erstesRechteck = new Rechteck(koordinateX, koordinateY);
		erstesRechteck.zeichnen(graphics);

		Rechteck zweitesRechteck = new Rechteck(koordinateX, koordinateY + 50);
		zweitesRechteck.zeichnen(graphics);

		Rechteck drittesRechteck = new Rechteck(koordinateX + 50, koordinateY);
		drittesRechteck.zeichnen(graphics);

		Rechteck viertesRechteck = new Rechteck(koordinateX + 50, koordinateY + 50);
		viertesRechteck.zeichnen(graphics);
	}

}