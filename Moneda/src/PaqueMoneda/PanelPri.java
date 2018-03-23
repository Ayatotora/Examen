package PaqueMoneda;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.UIManager;

public class PanelPri extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PanelPri() {
		setBackground(Color.BLUE);
		setBorder(new TitledBorder(null, "Que cantidd tiene?", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		textField.setBackground(Color.GRAY);
		add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.GRAY);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pesos", "Dolares", "Euros"}));
		add(comboBox);

	}

}
