import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ProductFrame extends JFrame{
	
	private JButton reStock = new JButton("Re-Stock");
	private JButton sell = new JButton("Sell");
	private JButton rePrice = new JButton("Re-Price");
	
	public ProductFrame(){
		setTitle("U1629596");
		setLayout(new FlowLayout());
		add(reStock);
		add(sell);
		add(rePrice);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,220);
		setLocation(300,300);
		getContentPane().setBackground(Color.GRAY);
		setVisible(true);
	}
}
