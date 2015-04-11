package gui;


import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

import components.Board;
import components.Square;
import components.pieces.Piece;

public class VictimPanel extends JPanel {

	private int counter=0;


	public VictimPanel(){
		setPreferredSize(getPreferredSize());
		setBounds(getVisibleRect());
		setBackground(Color.GREEN);
		setVisible(true);

	}

	public Dimension getPreferredSize(){


		Component c= this.getParent();
		if(c == null)
			return new Dimension(
					(int)getWidth(), (int)getHeight()
					);

		else{
			int w= c.getWidth();
			int h= c.getHeight();
			return new Dimension((int)(w*0.1), h);
		}
	}

	public void addVictim(Piece p){

		Graphics g = this.getGraphics();
		Graphics2D g2 = (Graphics2D) g;

		if(p != null && p.getImagePath() != ""){
			Image i = Toolkit.getDefaultToolkit().getImage(p.getImagePath());
			counter=Square.SQUARE_SIZE+counter;	
			g2.drawImage(i,10, counter, null);



		}


	}
	//	public Dimension getPreferredSize(){
	//
	//
	//
	//		
	//		return null;
	//	}


}