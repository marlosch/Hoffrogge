package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;
import com.hoffrogge.lehreinheit04.GeometrischeFigur;
import com.hoffrogge.lehreinheit04.Punkt;
import com.hoffrogge.lehreinheit04.Quadrat;

public class TetrominoZZ extends Quadrat implements GeometrischeFigur {

	private Punkt mittelpunkt;

	public void zeichnen(Graphics graphics) {
		super.zeichnen(graphics);

		Rechteck erstesRechteck = new Rechteck(700, 300);
		erstesRechteck.zeichnen(graphics);

		Rechteck zweitesRechteck = new Rechteck(650, 350);
		zweitesRechteck.zeichnen(graphics);

		Rechteck drittesRechteck = new Rechteck(700, 350);
		drittesRechteck.zeichnen(graphics);

		Rechteck viertesRechteck = new Rechteck(650, 400);
		viertesRechteck.zeichnen(graphics);
	}

	@Override
	public void setMittelpunkt(Punkt mittelpunkt) {
		this.mittelpunkt = mittelpunkt;

	}

	@Override
	public Punkt getMittelPunkt() {
		return (Punkt) mittelpunkt;
	}

	@Override
	public void setDurchmesser(int d) {
		// TODO Auto-generated method stub

	}

	@Override
	public Farbe getLinienFarbe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLinienFarbe(Farbe farbe) {
		// TODO Auto-generated method stub

	}
}
