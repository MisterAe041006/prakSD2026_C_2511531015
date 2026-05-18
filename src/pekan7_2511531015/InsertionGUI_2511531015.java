package pekan7_2511531015;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.lang.reflect.Array;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class InsertionGUI_2511531015 extends JFrame {
	private static final long serialVersionUID = 1L;
	private int[] array_1015;
	private JLabel[] labelArray_1015;
	private JButton stepButton_1015, resetButton_1015, setButton_1015;
	private JTextField inputField_1015;
	private JPanel panelArray_1015;
	private JTextArea stepArea_1015;
	private int i_1015 = 1, j_1015;
	private boolean sorting_1015 = false;
	private int stepCount_1015 = 1;
	
	
	private JPanel contentPane;
	private Component controlPanel;
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public InsertionGUI_2511531015() {
		setTitle("Insertion Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		//Panel Input
		JPanel inputPanel = new JPanel(new FlowLayout());
		inputField_1015 = new JTextField(30);
		setButton_1015 = new JButton("Set Array");
		inputPanel.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
		inputPanel.add(inputField_1015);
		inputPanel.add(setButton_1015);
		
		//Panel Array Visual
		panelArray_1015 = new JPanel();
		panelArray_1015.setLayout(new FlowLayout());
		
		//panel kontrol 
		JPanel controlPanel = new JPanel(new FlowLayout());
		stepButton_1015 = new JButton("Langkah Selanjutnya");
		resetButton_1015 = new JButton("Reset");

		stepButton_1015.setEnabled(false);

		controlPanel.add(stepButton_1015);
		controlPanel.add(resetButton_1015);
		
		// area teks untuk log langkah-langkah
		stepArea_1015 = new JTextArea(8, 60);
		stepArea_1015.setEditable(false);
		stepArea_1015.setFont(new Font("Monospaced", Font.PLAIN, 14)); 
		JScrollPane scrollPane = new JScrollPane(stepArea_1015);
		
		//tambahkan panel ke frame
		add(inputPanel, BorderLayout.NORTH);
		add(panelArray_1015, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.EAST);
		add(scrollPane, BorderLayout.EAST);
		
		//event set array
		setButton_1015.addActionListener(e -> setArrayFromInput_2511531015());
		
		//event langkah selanjutnya 
		stepButton_1015.addActionListener(e -> performStep_2511531015());
		
		//event reset
		resetButton_1015.addActionListener(e -> reset_2511531015());
		
	}

	private void setArrayFromInput_2511531015() {
		String text = inputField_1015.getText().trim();
		if (text.isEmpty()) return;
		String[] parts = text.split(",");
		array_1015 = new int [parts.length];
		try {
			for (int k = 0; k < parts.length; k++) {
				array_1015[k] = Integer.parseInt(parts[k].trim());  }
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "masukkan hanya angka yang dipisahkan" + "dengan koma!",  "eror", JOptionPane.ERROR_MESSAGE);
				
			return; }
		i_1015 = 1;
		stepCount_1015 = 1;
		sorting_1015 = true;
		stepButton_1015.setEnabled(true);
		stepArea_1015.setText("");
		panelArray_1015.removeAll();
		labelArray_1015 = new JLabel[array_1015.length];
		for (int k = 0; k < array_1015.length; k++) {
			labelArray_1015[k] = new JLabel(String.valueOf(array_1015[k]));
			labelArray_1015[k].setFont(new Font ("Arial", Font.BOLD, 24));
			labelArray_1015[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_1015[k].setPreferredSize(new Dimension(50, 50));
			labelArray_1015[k].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_1015.add(labelArray_1015[k]);
		}
		panelArray_1015.revalidate();
		panelArray_1015.repaint();
		}
		
		private void performStep_2511531015() {
			if  (i_1015 < array_1015.length && sorting_1015) {
				int key_1015 = array_1015[i_1015];
				j_1015 = i_1015 - 1;
				
				StringBuilder stepLog = new StringBuilder();
				stepLog.append("Langkah ").append(stepCount_1015).
				append(": Memasukkan ").append(key_1015).append("\n");
				
				while (j_1015 >= 0 && array_1015[j_1015] > key_1015) {
					array_1015[j_1015 + 1] = array_1015[j_1015];
					j_1015--;
			}
				array_1015[j_1015 + 1] = key_1015;
				
				updateLabels();
				stepLog.append("Hasil: ").append(arrayToString1(array_1015)).append("\n\n");
				stepArea_1015.append(stepLog.toString());
				
				i_1015++;
				stepCount_1015++;
				
				if (i_1015 == array_1015.length) {
					sorting_1015 = false;
					stepButton_1015.setEnabled(false);
					JOptionPane.showMessageDialog(this, "Sorting selesai!");
					
				}
			}
		}
		private void updateLabel_2511531015() {
			for (int k = 0; k < array_1015.length; k++) {
			}
		}
		
		private void reset_2511531015() {
			inputField_1015.setText("");
			panelArray_1015.removeAll();
			panelArray_1015.revalidate();
			panelArray_1015.repaint();
			stepArea_1015.setText("");
			stepButton_1015.setEnabled(false);
			sorting_1015 = false;
			i_1015 = 1;
			stepCount_1015 = 1;
		}
		private String arrayToString1(int[] arr) {
			StringBuilder sb = new StringBuilder();
			for (int k = 0; k < arr.length; k++) {
				sb.append(arr[k]);
				if (k < arr.length - 1) sb.append(", ");
			}
			return sb.toString();
				
			 
		
		
		
		
	}
		{
}


		private Object arrayToString(int[] array_10152) {
			// TODO Auto-generated method stub
			return null;
		}

		private void updateLabels() {
			// TODO Auto-generated method stub
			
		}
}