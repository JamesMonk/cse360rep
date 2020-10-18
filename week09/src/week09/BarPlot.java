package week09;

import java.awt.Color;
import java.awt.Graphics;

public class BarPlot extends DecoratedPlot {
	@Override
	public void draw(Graphics g) {
		if (values.size() == 0) {
		} else {
			int x = 1;
			if (values.size() == 0) {
				g.drawString("Marked Plot", 10, 10);
			} else {
				super.draw(g);
				for (int i = values.size() - 1; i >= 0; i--) {
					g.setColor(Color.BLACK);
					g.fillRect(x - 5, values.get(i) - 5, 10, 10);

					g.setColor(Color.GRAY);
					g.fillRect(x - 5, values.get(i) + 5, 10, 300);
					x += 20;
				}
			}

		}

	}
}
