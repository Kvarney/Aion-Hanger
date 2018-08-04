/*
https://www.tutorialspoint.com/swing/swing_jlabel
compilation: javac JLabelDemo.java
execution: java JLabelDemo
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JLabelDemo{
	private JFrame mainFrame;
	private JLabel headerLabel1;
	private JLabel statusLabel;
	private JPanel controlPanel;

	public JLabelDemo(){
		prepareGUI();
	}

	public static void main(String[] args){
		JLabelDemo jLabelDemo = new JLabelDemo();
		jLabelDemo.showLabelDemo();
	}

	public void prepareGUI(){
		mainFrame = new JFrame("Java Swing JLabel Example");
		mainFrame.setSize(400,400);
		mainFrame.setLayout(new GridLayout(3, 1));

		mainFrame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
		});
		headerLabel1 = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		statusLabel.setSize(350, 100);
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(headerLabel1);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);		
	}

	private void showLabelDemo(){
		headerLabel1.setText("Control in action: JLabel");
		JLabel label = new JLabel("", JLabel.CENTER);
		label.setText("Welcome to TutorialsPoint Swing Tutorial.");
		label.setOpaque(true);
		label.setBackground(Color.GRAY);
		label.setForeground(Color.WHITE);
		controlPanel.add(label);

		mainFrame.setVisible(true);
	}
}