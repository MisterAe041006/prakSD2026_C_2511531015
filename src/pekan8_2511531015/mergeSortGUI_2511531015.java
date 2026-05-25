package pekan8_2511531015;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mergeSortGUI_2511531015 extends JFrame {

    private JTextField inputField;
    private JButton setButton;
    private JButton stepButton;
    private JButton resetButton;
    private JTextArea stepArea;
    private JPanel panelArray;

    private int[] array;
    private JLabel[] labelArray;

    private int i = 0;
    private int j = 0;
    private int stepCount = 1;
    private boolean sorting = false;

    public mergeSortGUI_2511531015() {
        setTitle("Visualisasi Bubble Sort");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Panel input bagian atas
        JPanel inputPanel = new JPanel(new FlowLayout());

        JLabel inputLabel = new JLabel("Masukkan angka (pisahkan dengan koma):");
        inputField = new JTextField(30);

        setButton = new JButton("Set Array");
        stepButton = new JButton("Step");
        resetButton = new JButton("Reset");

        stepButton.setEnabled(false);

        inputPanel.add(inputLabel);
        inputPanel.add(inputField);
        inputPanel.add(setButton);
        inputPanel.add(stepButton);
        inputPanel.add(resetButton);

        add(inputPanel, BorderLayout.NORTH);

        // Panel untuk menampilkan array
        panelArray = new JPanel(new FlowLayout());
        panelArray.setPreferredSize(new Dimension(750, 120));
        add(panelArray, BorderLayout.CENTER);

        // Text area untuk menampilkan langkah sorting
        stepArea = new JTextArea();
        stepArea.setEditable(false);
        stepArea.setFont(new Font("Monospaced", Font.PLAIN, 14));

        JScrollPane scrollPane = new JScrollPane(stepArea);
        scrollPane.setPreferredSize(new Dimension(750, 250));

        add(scrollPane, BorderLayout.SOUTH);

        // Event tombol
        setButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setArrayFromInput();
            }
        });

        stepButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performStep();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });
    }

    private void setArrayFromInput() {
        String text = inputField.getText().trim();

        if (text.isEmpty()) {
            return;
        }

        String[] parts = text.split(",");
        array = new int[parts.length];

        try {
            for (int k = 0; k < parts.length; k++) {
                array[k] = Integer.parseInt(parts[k].trim());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Masukkan hanya angka yang dipisahkan koma!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        i = 0;
        j = 0;
        stepCount = 1;
        sorting = true;

        stepButton.setEnabled(true);
        stepArea.setText("");
        panelArray.removeAll();

        labelArray = new JLabel[array.length];

        for (int k = 0; k < array.length; k++) {
            labelArray[k] = new JLabel(String.valueOf(array[k]));
            labelArray[k].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray[k].setOpaque(true);
            labelArray[k].setBackground(Color.WHITE);
            labelArray[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray[k].setPreferredSize(new Dimension(50, 50));
            labelArray[k].setHorizontalAlignment(SwingConstants.CENTER);

            panelArray.add(labelArray[k]);
        }

        panelArray.revalidate();
        panelArray.repaint();
    }

    private void performStep() {
        if (!sorting || i >= array.length - 1) {
            sorting = false;
            stepButton.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
            return;
        }

        resetHighlights();

        StringBuilder stepLog = new StringBuilder();

        labelArray[j].setBackground(Color.CYAN);
        labelArray[j + 1].setBackground(Color.CYAN);

        if (array[j] > array[j + 1]) {
            // Swap
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;

            labelArray[j].setBackground(Color.RED);
            labelArray[j + 1].setBackground(Color.RED);

            stepLog.append("Langkah ").append(stepCount).append(": ")
                    .append("Menukar elemen ke-").append(j)
                    .append(" (").append(array[j + 1]).append(")")
                    .append(" dengan ke-").append(j + 1)
                    .append(" (").append(array[j]).append(")\n");

        } else {
            stepLog.append("Langkah ").append(stepCount).append(": ")
                    .append("Tidak ada pertukaran antara ke-")
                    .append(j).append(" dan ke-")
                    .append(j + 1).append("\n");
        }

        stepLog.append("Hasil: ").append(arrayToString(array)).append("\n\n");
        stepArea.append(stepLog.toString());

        updateLabels();

        j++;

        if (j >= array.length - 1 - i) {
            j = 0;
            i++;
        }

        stepCount++;

        if (i >= array.length - 1) {
            sorting = false;
            stepButton.setEnabled(false);
            resetHighlights();

            for (JLabel label : labelArray) {
                label.setBackground(Color.GREEN);
            }

            JOptionPane.showMessageDialog(this, "Sorting selesai!");
        }
    }

    private void updateLabels() {
        for (int k = 0; k < array.length; k++) {
            labelArray[k].setText(String.valueOf(array[k]));
        }
    }

    private void resetHighlights() {
        for (JLabel label : labelArray) {
            label.setBackground(Color.WHITE);
        }
    }

    private void reset() {
        inputField.setText("");
        panelArray.removeAll();
        panelArray.revalidate();
        panelArray.repaint();

        stepArea.setText("");
        stepButton.setEnabled(false);

        sorting = false;
        i = 0;
        j = 0;
        stepCount = 1;
    }

    private String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < arr.length; k++) {
            sb.append(arr[k]);

            if (k < arr.length - 1) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new mergeSortGUI_2511531015().setVisible(true);
            }
        });
    }
}