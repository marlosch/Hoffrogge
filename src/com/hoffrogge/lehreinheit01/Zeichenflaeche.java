package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit04.Quadrat;

public class Zeichenflaeche extends Quadrat {

	@Override
	public void zeichnen(Graphics graphics) {
		super.zeichnen(graphics);

		TetrominoT tetrominoT = new TetrominoT();
		tetrominoT.zeichnen(graphics);

		TetrominoL tetrominoL = new TetrominoL();
		tetrominoL.zeichnen(graphics);

		TetrominoI tetrominoI = new TetrominoI();
		tetrominoI.zeichnen(graphics);

		TetrominoQ tetrominoQ = new TetrominoQ();
		tetrominoQ.zeichnen(graphics);

		TetrominoZ tetrominoZ = new TetrominoZ();
		tetrominoZ.zeichnen(graphics);

		TetrominoLL tetrominoLL = new TetrominoLL();
		tetrominoLL.zeichnen(graphics);

		TetrominoZZ tetrominoZZ = new TetrominoZZ();
		tetrominoZZ.zeichnen(graphics);
	}
}