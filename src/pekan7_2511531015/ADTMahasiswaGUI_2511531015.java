package pekan7_2511531015;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ADTMahasiswaGUI_2511531015 {
    private ArrayList<ADTMahasiswa_2511531015> dataList_1015 = new ArrayList<>();
    private JTextField namaField_1015, nimField_1015, prodiField_1015;
    private JComboBox<String> algorithmBox_1015;
    private JButton addButton_1015, clearButton_1015, sortButton_1015;
    private JTextArea outputArea_1015;

    public ADTMahasiswaGUI_2511531015() {
        JFrame frame_1015 = new JFrame("Praktikum Sorting Nama Mahasiswa - GUI");
        frame_1015.setSize(600, 500);
        frame_1015.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_1015.setLayout(new BorderLayout());

        // Panel Input
        JPanel inputPanel_1015 = new JPanel(new GridLayout(4, 2, 5, 5));
        inputPanel_1015.setBorder(BorderFactory.createTitledBorder("Input Data Mahasiswa"));

        namaField_1015 = new JTextField();
        nimField_1015 = new JTextField();
        prodiField_1015 = new JTextField();

        inputPanel_1015.add(new JLabel("Nama:"));
        inputPanel_1015.add(namaField_1015);
        inputPanel_1015.add(new JLabel("NIM:"));
        inputPanel_1015.add(nimField_1015);
        inputPanel_1015.add(new JLabel("Prodi:"));
        inputPanel_1015.add(prodiField_1015);

        addButton_1015 = new JButton("Tambah Data");
        clearButton_1015 = new JButton("Hapus Semua");
        inputPanel_1015.add(addButton_1015);
        inputPanel_1015.add(clearButton_1015);

        frame_1015.add(inputPanel_1015, BorderLayout.NORTH);

        // Panel Sorting
        JPanel sortPanel_1015 = new JPanel();
        algorithmBox_1015 = new JComboBox<>(new String[]{"Insertion Sort", "Selection Sort", "Bubble Sort"});
        sortButton_1015 = new JButton("Mulai Sorting");
        sortPanel_1015.add(new JLabel("Pilih Algoritma:"));
        sortPanel_1015.add(algorithmBox_1015);
        sortPanel_1015.add(sortButton_1015);
        frame_1015.add(sortPanel_1015, BorderLayout.CENTER);

        // Output Area
        outputArea_1015 = new JTextArea();
        outputArea_1015.setEditable(false);
        outputArea_1015.setBorder(BorderFactory.createTitledBorder("Output Sorting"));
        frame_1015.add(new JScrollPane(outputArea_1015), BorderLayout.SOUTH);

        // Action Listeners
        addButton_1015.addActionListener(e -> addData_1015());
        clearButton_1015.addActionListener(e -> clearData_1015());
        sortButton_1015.addActionListener(e -> startSorting_1015());

        frame_1015.setVisible(true);
    }

    private void addData_1015() {
        String nama_1015 = namaField_1015.getText().trim();
        String nim_1015 = nimField_1015.getText().trim();
        String prodi_1015 = prodiField_1015.getText().trim();

        if (!nama_1015.isEmpty() && !nim_1015.isEmpty() && !prodi_1015.isEmpty()) {
            dataList_1015.add(new ADTMahasiswa_2511531015(nama_1015, nim_1015, prodi_1015));
            outputArea_1015.append("Data ditambahkan: " + nama_1015 + "\n");
            namaField_1015.setText(""); nimField_1015.setText(""); prodiField_1015.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Semua field harus diisi!");
        }
    }

    private void clearData_1015() {
        dataList_1015.clear();
        outputArea_1015.setText("");
    }

    private void startSorting_1015() {
        if (dataList_1015.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data mahasiswa kosong!");
            return;
        }

        String algorithm_1015 = (String) algorithmBox_1015.getSelectedItem();
        ArrayList<ADTMahasiswa_2511531015> tempList_1015 = new ArrayList<>(dataList_1015);
        outputArea_1015.append("\n=== " + algorithm_1015.toUpperCase() + " ===\n");

        switch (algorithm_1015) {
            case "Insertion Sort": insertionSort_1015(tempList_1015); break;
            case "Selection Sort": selectionSort_1015(tempList_1015); break;
            case "Bubble Sort": bubbleSort_1015(tempList_1015); break;
        }
    }

    private void insertionSort_1015(ArrayList<ADTMahasiswa_2511531015> list_1015) {
        for (int i = 1; i < list_1015.size(); i++) {
            ADTMahasiswa_2511531015 key_1015 = list_1015.get(i);
            int j = i - 1;
            while (j >= 0 && list_1015.get(j).getNamaMahasiswa_1015()
                    .compareToIgnoreCase(key_1015.getNamaMahasiswa_1015()) > 0) {
                list_1015.set(j + 1, list_1015.get(j));
                j--;
            }
            list_1015.set(j + 1, key_1015);
            printStep_1015(i, list_1015);
        }
    }

    private void selectionSort_1015(ArrayList<ADTMahasiswa_2511531015> list_1015) {
        for (int i = 0; i < list_1015.size() - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < list_1015.size(); j++) {
                if (list_1015.get(j).getNamaMahasiswa_1015()
                        .compareToIgnoreCase(list_1015.get(minIdx).getNamaMahasiswa_1015()) < 0) {
                    minIdx = j;
                }
            }
            ADTMahasiswa_2511531015 temp_1015 = list_1015.get(minIdx);
            list_1015.set(minIdx, list_1015.get(i));
            list_1015.set(i, temp_1015);
            printStep_1015(i + 1, list_1015);
        }
    }

    private void bubbleSort_1015(ArrayList<ADTMahasiswa_2511531015> list_1015) {
        int n = list_1015.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list_1015.get(j).getNamaMahasiswa_1015()
                        .compareToIgnoreCase(list_1015.get(j + 1).getNamaMahasiswa_1015()) > 0) {
                    ADTMahasiswa_2511531015 temp_1015 = list_1015.get(j);
                    list_1015.set(j, list_1015.get(j + 1));
                    list_1015.set(j + 1, temp_1015);
                }
            }
            printStep_1015(i + 1, list_1015);
        }
    }

    private void printStep_1015(int step_1015, ArrayList<ADTMahasiswa_2511531015> list_1015) {
        outputArea_1015.append("Langkah " + step_1015 + ": ");
        for (ADTMahasiswa_2511531015 mhs_1015 : list_1015) {
            outputArea_1015.append(mhs_1015.toString_1015() + " | ");
        }
        outputArea_1015.append("\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ADTMahasiswaGUI_2511531015::new);
    }
}