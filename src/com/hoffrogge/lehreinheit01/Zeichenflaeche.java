package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit04.Quadrat;
import com.hoffrogge.tetris.TetrominoBlock;
import com.hoffrogge.tetris.TetrominoL;
import com.hoffrogge.tetris.TetrominoLanger;
import com.hoffrogge.tetris.TetrominoSpielstein;
import com.hoffrogge.tetris.TetrominoT;
import com.hoffrogge.tetris.TetrominoUmgedrehtesL;
import com.hoffrogge.tetris.TetrominoUmgedrehtesZ;
import com.hoffrogge.tetris.TetrominoZ;

public class Zeichenflaeche extends Quadrat {

	@Override
	public void zeichnen(Graphics graphics) {
		super.zeichnen(graphics);

		TetrominoSpielstein tetrominoT = new TetrominoBlock();
		tetrominoT.zeichnen(graphics);

		TetrominoSpielstein tetrominoL = new TetrominoL();
		tetrominoL.zeichnen(graphics);

		TetrominoSpielstein tetrominoI = new TetrominoLanger();
		tetrominoI.zeichnen(graphics);

		TetrominoSpielstein tetrominoQ = new TetrominoT();
		tetrominoQ.zeichnen(graphics);

		TetrominoSpielstein tetrominoZ = new TetrominoZ();
		tetrominoZ.zeichnen(graphics);

		TetrominoSpielstein tetrominoLL = new TetrominoUmgedrehtesL();
		tetrominoLL.zeichnen(graphics);

		TetrominoSpielstein tetrominoZZ = new TetrominoUmgedrehtesZ();
		tetrominoZZ.zeichnen(graphics);
	}
}