package week09;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

@SuppressWarnings("deprecation")
public class PlotPanel extends JPanel implements Observer {

	Drawable d;

	@Override
	public void update(Observable o, Object arg) {
		d.setValue(((Source) o).getValue());
	}

	public PlotPanel(Drawable drawable) {
		d = drawable;

	}

	public void paintComponent(Graphics g) {
		d.draw(g);

	}

}
