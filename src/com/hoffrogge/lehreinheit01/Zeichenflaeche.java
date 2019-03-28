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

		TetrominoSpielstein tetrominoT = new TetrominoBlock(500, 50);
		tetrominoT.zeichnen(graphics);

		TetrominoSpielstein tetrominoL = new TetrominoL(250, 50);
		tetrominoL.zeichnen(graphics);

		TetrominoSpielstein tetrominoI = new TetrominoLanger(400, 50);
		tetrominoI.zeichnen(graphics);

		TetrominoSpielstein tetrominoQ = new TetrominoT(50, 50);
		tetrominoQ.zeichnen(graphics);

		TetrominoSpielstein tetrominoZ = new TetrominoZ(650, 50);
		tetrominoZ.zeichnen(graphics);

		TetrominoSpielstein tetrominoLL = new TetrominoUmgedrehtesL(250, 300);
		tetrominoLL.zeichnen(graphics);

		TetrominoSpielstein tetrominoZZ = new TetrominoUmgedrehtesZ(650, 300);
		tetrominoZZ.zeichnen(graphics);
	}
}