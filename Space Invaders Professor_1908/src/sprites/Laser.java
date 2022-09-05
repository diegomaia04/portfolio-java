package sprites;

import java.awt.Color;
import java.awt.Graphics;

public class Laser {
	// variaveis
	int posXL;
	int poxYL = 540;

	// construtor que recebe como parametro a posi��o da nave
	public Laser(int posXLInicial) {
		posXL = posXLInicial;
	}

	// meteodo responsavel pela constru��o do laser
	public void exibirLaser(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(posXL, poxYL, 5, 20); // x, y, widght, height
	}

	// meteodo responsavel por pelo movimento do Laser
	public void moverLaser() {
		poxYL -= 5; // ajuste da velocidade do tiro de laser
		// apio ao entendimento do tiro
		 System.out.println(poxYL);
	}

	// meteodo responavel pela remo��o do laser
	public boolean removerLaser() {
		if (poxYL < 0) {
			return true;
        } else {
			return false;
		}
	}

}
