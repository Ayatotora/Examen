package PaqueMoneda;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class PanelSecon extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PanelSecon() {
		setBackground(Color.BLUE);
		setForeground(Color.BLACK);
		setBorder(new TitledBorder(null, "Convertir en ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(Color.GRAY);
		add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.GRAY);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pesos", "Dolares", "Euros"}));
		add(comboBox);

	}

}
