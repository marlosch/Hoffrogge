package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit04.Quadrat;

public class Zeichenflaeche extends Quadrat {

	@Override
	public void zeichnen(Graphics graphics) {
		super.zeichnen(graphics);
		/*
		 * Rechteck erstesRechteck = new Rechteck(0, 0);
		 * erstesRechteck.zeichnen(graphics);
		 * 
		 * Rechteck zweitesRechteck = new Rechteck(100, 0);
		 * zweitesRechteck.zeichnen(graphics);
		 * 
		 * Rechteck drittesRechteck = new Rechteck(100, 100);
		 * drittesRechteck.zeichnen(graphics);
		 * 
		 * Rechteck viertesRechteck = new Rechteck(200, 0);
		 * viertesRechteck.zeichnen(graphics);
		 */
		TetrominoT tetrominoT = new TetrominoT();
		tetrominoT.zeichnen(graphics);

		TetrominoL tetrominoL = new TetrominoL();
		tetrominoL.zeichnen(graphics);

		TetrominoI tetrominoI = new TetrominoI();
		tetrominoI.zeichnen(graphics);

	}
}