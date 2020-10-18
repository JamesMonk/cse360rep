package week09;

import java.awt.Graphics;
import java.util.LinkedList;

public class Drawable {
	protected LinkedList<Integer> values = new LinkedList<Integer>();

	public void setValue(int v) {
		if (values.size() >= 20) {
			values.removeFirst();
		}
		values.add(v);
	}

	public void draw(Graphics g) {

	}

}
