package week09;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Source extends Observable {
	private int value;

	public void create() {
		value = (int) (Math.random() * 100) + 1;
		setChanged();
		notifyObservers(value);

	}

	public int getValue() {
		return value;
	}
}
