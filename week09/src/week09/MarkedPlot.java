package week09;

import java.awt.Graphics;

public class MarkedPlot extends DecoratedPlot {
	@Override
	public void draw(Graphics g) {
		int x = 1;

		if (values.size() == 0) {
		} else {
			super.draw(g);
			for (int i = values.size() - 1; i >= 0; i--) {
				g.fillRect(x - 5, values.get(i) - 5, 10, 10);
				x += 20;
			}
		}

	}

}
