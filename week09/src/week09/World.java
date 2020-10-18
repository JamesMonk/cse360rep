package week09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class World extends JFrame implements ActionListener {
	@SuppressWarnings("deprecation")

	private Source source;
	private SimplePlot simplePlot;
	private PlotPanel panel, panelTwo, panelThree;
	private MarkedPlot markedPlot;
	private BarPlot barPlot;

	private JButton run;
	private JPanel p;

	public World() {

		simplePlot = new SimplePlot();
		markedPlot = new MarkedPlot();
		barPlot = new BarPlot();
		markedPlot.add(simplePlot);
		barPlot.add(markedPlot);

		run = new JButton("Run");

		panel = new PlotPanel(simplePlot);
		panelTwo = new PlotPanel(markedPlot);
		panelThree = new PlotPanel(barPlot);

		p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(run, BorderLayout.SOUTH);

		source = new Source();
		source.addObserver(panel);
		source.addObserver(panelTwo);
		source.addObserver(panelThree);

		setLayout(new GridLayout(4, 1));

		add(panelThree);
		add(panelTwo);
		add(panel);

		add(p);

		setPreferredSize(new Dimension(500, 500));

		run.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		repaint();
		source.create();

	}

	public static void main(String[] args) {

		World w = new World();

		w.setLocationRelativeTo(null);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		w.pack();
		w.setVisible(true);
	}

}