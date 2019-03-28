package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;
import com.hoffrogge.lehreinheit04.GeometrischeFigur;
import com.hoffrogge.lehreinheit04.Punkt;
import com.hoffrogge.lehreinheit04.Quadrat;

public class TetrominoIMarlo extends Quadrat implements GeometrischeFigur {

	private Object mittelpunkt;
	private int d;
	private Farbe farbe;

	public void zeichnen(Graphics graphics) {
		super.zeichnen(graphics);

		Rechteck erstesRechteck = new Rechteck(400, 50);
		erstesRechteck.zeichnen(graphics);

		Rechteck zweitesRechteck = new Rechteck(400, 100);
		zweitesRechteck.zeichnen(graphics);

		Rechteck drittesRechteck = new Rechteck(400, 150);
		drittesRechteck.zeichnen(graphics);

		Rechteck viertesRechteck = new Rechteck(400, 200);
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
		this.d = d;

	}

	@Override
	public Farbe getLinienFarbe() {
		return farbe;
	}

	@Override
	public void setLinienFarbe(Farbe farbe) {
		this.farbe = farbe;

	}

}
