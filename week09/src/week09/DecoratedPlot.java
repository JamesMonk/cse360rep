package week09;

import java.awt.Graphics;

public class DecoratedPlot extends Drawable {

	protected Drawable drawable;

	public void add(Drawable d) {
		drawable = d;

	}

	@Override
	public void setValue(int value) {
		super.setValue(value);
	}

	@Override
	public void draw(Graphics g) {
		int x = 1;

		if (values.size() == 0) {
			g.drawString("SimplePlot", 10, 10);
		}

		else {
			for (int i = values.size() - 1; i > 0; i--) {
				g.drawLine(x, values.get(i), x + 20, values.get(i - 1));
				x += 20;
			}
		}
	}
}
