package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;
import com.hoffrogge.lehreinheit04.GeometrischeFigur;
import com.hoffrogge.lehreinheit04.Punkt;
import com.hoffrogge.lehreinheit04.Quadrat;

public class TetrominoQ extends Quadrat implements GeometrischeFigur {

	private Punkt mittelpunkt;

	public void zeichnen(Graphics graphics) {
		super.zeichnen(graphics);

		Rechteck erstesRechteck = new Rechteck(500, 50);
		erstesRechteck.zeichnen(graphics);

		Rechteck zweitesRechteck = new Rechteck(500, 100);
		zweitesRechteck.zeichnen(graphics);

		Rechteck drittesRechteck = new Rechteck(550, 50);
		drittesRechteck.zeichnen(graphics);

		Rechteck viertesRechteck = new Rechteck(550, 100);
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
