package week09;

import java.awt.Graphics;

public class SimplePlot extends Drawable {

	@Override
	public void draw(Graphics g) {
		int x = 1;

		if (values.size() == 0) {
		} else {
			for (int i = values.size() - 1; i > 0; i--) {
				g.drawLine(x, values.get(i), x + 20, values.get(i - 1));
				x += 20;
			}
		}
	}
}
