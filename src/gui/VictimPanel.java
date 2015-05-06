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
import java.awt.geom.Rectangle2D;
import java.util.Vector;

import javax.swing.JPanel;

import components.Board;
import components.Square;
import components.pieces.Piece;
import components.Player;

public class VictimPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Vector<Piece> vP;
	Player p;


	public VictimPanel(){
		vP = new Vector<Piece>();
		setPreferredSize(getPreferredSize());
		setBounds(getVisibleRect());
		setBackground(Color.GRAY);
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
		vP.add(p);

	}

	public void redraw(){

		Graphics g = this.getGraphics();
		Graphics2D g2 = (Graphics2D) g;

		int counter = 0;
		for(Piece piece : vP){
			Component c=this.getParent();
			Image i = Toolkit.getDefaultToolkit().getImage(piece.getImagePath());
			if(counter<c.getHeight()){
			g2.drawImage(i,0, counter, null);
			}
			else
			{g2.drawImage(i, i.getWidth(null), counter, null);}	
			counter += i.getHeight(null);	
			System.out.println("OK");
		}


	}


}