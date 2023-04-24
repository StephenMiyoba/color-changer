package color;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ChangeColor extends JFrame {
	
	JPanel northPanel;
	JPanel centerPanel;
	JPanel southPanel;
	JComboBox northPanelComboBox;
	JComboBox centerPanelComboBox;
	JComboBox southPanelComboBox;
	
	public ChangeColor() {
		
		this.setLayout(null);
		
		northPanel = new JPanel();
		northPanel.setBounds(0, 0, 400, 100);
		this.add(northPanel);
		
		centerPanel = new JPanel();
		centerPanel.setBounds(0, 100, 400, 100);
		this.add(centerPanel);
		
		southPanel = new JPanel();
		southPanel.setBounds(0, 200, 400, 100);
		this.add(southPanel);
		
		String [] colorSelection1 = {"North Panel", "Red", "Green", "Blue"};
		northPanelComboBox = new JComboBox(colorSelection1);
		northPanelComboBox.setBounds(10, 310, 110, 20);
		northPanelComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				
				if(actionEvent.getSource() == northPanelComboBox) {
					
					Object selected = northPanelComboBox.getSelectedItem();
	                if(selected.toString().equals("Red")) {
	                	northPanel.setBackground(Color.red);
	                }
	                if(selected.toString().equals("Green")) {
	                	northPanel.setBackground(Color.green);
	                }
	                if(selected.toString().equals("Blue")) {
	                	northPanel.setBackground(Color.blue);
	                }
	                if(selected.toString().equals("North Panel")) {
	                	northPanel.setBackground(null);
	                }
				}
			}
		});
		this.add(northPanelComboBox);
			
		String [] colorSelection2 = {"Center Panel", "Cyan", "Pink", "Yellow"};
		centerPanelComboBox = new JComboBox(colorSelection2);
		centerPanelComboBox.setBounds(135, 310, 110, 20);
		centerPanelComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				
				if(actionEvent.getSource() == centerPanelComboBox) {
					
					Object selected = centerPanelComboBox.getSelectedItem();
	                if(selected.toString().equals("Cyan")) {
	                	centerPanel.setBackground(Color.CYAN);
	                }
	                if(selected.toString().equals("Pink")) {
	                	centerPanel.setBackground(Color.pink);
	                }
	                if(selected.toString().equals("Yellow")) {
	                	centerPanel.setBackground(Color.YELLOW);
	                }
	                if(selected.toString().equals("Center Panel")) {
	                	centerPanel.setBackground(null);
	                }
				}
			}
		});
		this.add(centerPanelComboBox);
		
		String [] colorSelection3 = {"South Panel", "Magenta", "Orange", "Light Gray"};
		southPanelComboBox = new JComboBox(colorSelection3);
		southPanelComboBox.setBounds(265, 310, 110, 20);
		southPanelComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				
				if(actionEvent.getSource() == southPanelComboBox) {
					
					Object selected = southPanelComboBox.getSelectedItem();
	                if(selected.toString().equals("Magenta")) {
	                	southPanel.setBackground(Color.magenta);
	                }
	                if(selected.toString().equals("Orange")) {
	                	southPanel.setBackground(Color.ORANGE);
	                }
	                if(selected.toString().equals("Light Gray")) {
	                	southPanel.setBackground(Color.LIGHT_GRAY);
	                }
	                if(selected.toString().equals("South Panel")) {
	                	southPanel.setBackground(null);
	                }
				}
			}
		});
		this.add(southPanelComboBox);
	}

	public static void main(String[] args) {
		
		ChangeColor changeColor = new ChangeColor();
		changeColor.setResizable(false);
		changeColor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		changeColor.setSize(400, 380);
		changeColor.setVisible(true);
		changeColor.setLocationRelativeTo(null);

	}

}
