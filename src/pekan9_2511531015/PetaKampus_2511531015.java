package pekan9_2511531015;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class PetaKampus_2511531015 extends JFrame {

    private Map<String, java.util.List<String>> graph_1015 = new LinkedHashMap<>();
    private Map<String, Point> posisi_1015 = new HashMap<>();
    private Set<String> visited_1015 = new HashSet<>();
    private java.util.List<String> path_1015 = new ArrayList<>();

    private JComboBox<String> startBox_1015;
    private JComboBox<String> goalBox_1015;
    private JTextArea hasilArea_1015;
    private GraphPanel_1015 panelGraph_1015;

    public PetaKampus_2511531015() {
        setTitle("Pencarian Jalur BFS dan DFS - 2511531015");
        setSize(950, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        buatGraph_1015();

        JPanel topPanel_1015 = new JPanel();
        topPanel_1015.add(new JLabel("Lokasi Awal:"));
        startBox_1015 = new JComboBox<>(graph_1015.keySet().toArray(new String[0]));
        topPanel_1015.add(startBox_1015);

        topPanel_1015.add(new JLabel("Lokasi Tujuan:"));
        goalBox_1015 = new JComboBox<>(graph_1015.keySet().toArray(new String[0]));
        topPanel_1015.add(goalBox_1015);

        JButton bfsButton_1015 = new JButton("BFS");
        JButton dfsButton_1015 = new JButton("DFS");
        JButton resetButton_1015 = new JButton("RESET");

        topPanel_1015.add(bfsButton_1015);
        topPanel_1015.add(dfsButton_1015);
        topPanel_1015.add(resetButton_1015);

        panelGraph_1015 = new GraphPanel_1015();

        hasilArea_1015 = new JTextArea(7, 30);
        hasilArea_1015.setEditable(false);
        hasilArea_1015.setFont(new Font("Monospaced", Font.PLAIN, 14));

        add(topPanel_1015, BorderLayout.NORTH);
        add(panelGraph_1015, BorderLayout.CENTER);
        add(new JScrollPane(hasilArea_1015), BorderLayout.SOUTH);

        bfsButton_1015.addActionListener(e -> BFS_1015());
        dfsButton_1015.addActionListener(e -> DFS_1015());
        resetButton_1015.addActionListener(e -> resetGraph_1015());
    }

    private void buatGraph_1015() {
        String[] lokasi_1015 = {
                "Gerbang Utama", "Rektorat", "Perpustakaan", "Fakultas Teknik",
                "Fakultas Ekonomi", "Masjid Kampus", "Kantin", "Labor Komputer",
                "Aula", "Parkiran", "Gedung Kuliah", "Lapangan"
        };

        for (String lokasi : lokasi_1015) {
            graph_1015.put(lokasi, new ArrayList<>());
        }

        tambahEdge_1015("Gerbang Utama", "Rektorat");
        tambahEdge_1015("Gerbang Utama", "Parkiran");
        tambahEdge_1015("Rektorat", "Perpustakaan");
        tambahEdge_1015("Rektorat", "Fakultas Ekonomi");
        tambahEdge_1015("Perpustakaan", "Fakultas Teknik");
        tambahEdge_1015("Perpustakaan", "Gedung Kuliah");
        tambahEdge_1015("Fakultas Teknik", "Labor Komputer");
        tambahEdge_1015("Fakultas Teknik", "Aula");
        tambahEdge_1015("Fakultas Ekonomi", "Kantin");
        tambahEdge_1015("Fakultas Ekonomi", "Masjid Kampus");
        tambahEdge_1015("Masjid Kampus", "Kantin");
        tambahEdge_1015("Kantin", "Lapangan");
        tambahEdge_1015("Labor Komputer", "Gedung Kuliah");
        tambahEdge_1015("Aula", "Lapangan");
        tambahEdge_1015("Parkiran", "Masjid Kampus");
        tambahEdge_1015("Parkiran", "Lapangan");

        posisi_1015.put("Gerbang Utama", new Point(80, 250));
        posisi_1015.put("Rektorat", new Point(220, 150));
        posisi_1015.put("Perpustakaan", new Point(400, 90));
        posisi_1015.put("Fakultas Teknik", new Point(620, 90));
        posisi_1015.put("Fakultas Ekonomi", new Point(360, 250));
        posisi_1015.put("Masjid Kampus", new Point(250, 390));
        posisi_1015.put("Kantin", new Point(480, 370));
        posisi_1015.put("Labor Komputer", new Point(750, 170));
        posisi_1015.put("Aula", new Point(730, 300));
        posisi_1015.put("Parkiran", new Point(120, 430));
        posisi_1015.put("Gedung Kuliah", new Point(570, 220));
        posisi_1015.put("Lapangan", new Point(650, 430));
    }

    private void tambahEdge_1015(String a_1015, String b_1015) {
        graph_1015.get(a_1015).add(b_1015);
        graph_1015.get(b_1015).add(a_1015);
    }

    public void BFS_1015() {
        resetData_1015();

        String start_1015 = (String) startBox_1015.getSelectedItem();
        String goal_1015 = (String) goalBox_1015.getSelectedItem();

        Queue<String> queue_1015 = new LinkedList<>();
        Map<String, String> parent_1015 = new HashMap<>();

        queue_1015.add(start_1015);
        visited_1015.add(start_1015);
        parent_1015.put(start_1015, null);

        while (!queue_1015.isEmpty()) {
            String current_1015 = queue_1015.poll();

            if (current_1015.equals(goal_1015)) {
                break;
            }

            for (String neighbor_1015 : graph_1015.get(current_1015)) {
                if (!visited_1015.contains(neighbor_1015)) {
                    visited_1015.add(neighbor_1015);
                    parent_1015.put(neighbor_1015, current_1015);
                    queue_1015.add(neighbor_1015);
                }
            }
        }

        buatPath_1015(parent_1015, start_1015, goal_1015);
        displayPath_1015("BFS");
    }

    public void DFS_1015() {
        resetData_1015();

        String start_1015 = (String) startBox_1015.getSelectedItem();
        String goal_1015 = (String) goalBox_1015.getSelectedItem();

        Stack<String> stack_1015 = new Stack<>();
        Map<String, String> parent_1015 = new HashMap<>();

        stack_1015.push(start_1015);
        parent_1015.put(start_1015, null);

        while (!stack_1015.isEmpty()) {
            String current_1015 = stack_1015.pop();

            if (!visited_1015.contains(current_1015)) {
                visited_1015.add(current_1015);

                if (current_1015.equals(goal_1015)) {
                    break;
                }

                for (String neighbor_1015 : graph_1015.get(current_1015)) {
                    if (!visited_1015.contains(neighbor_1015)) {
                        stack_1015.push(neighbor_1015);
                        if (!parent_1015.containsKey(neighbor_1015)) {
                            parent_1015.put(neighbor_1015, current_1015);
                        }
                    }
                }
            }
        }

        buatPath_1015(parent_1015, start_1015, goal_1015);
        displayPath_1015("DFS");
    }

    private void buatPath_1015(Map<String, String> parent_1015, String start_1015, String goal_1015) {
        path_1015.clear();

        if (!parent_1015.containsKey(goal_1015)) {
            return;
        }

        String current_1015 = goal_1015;
        while (current_1015 != null) {
            path_1015.add(current_1015);
            current_1015 = parent_1015.get(current_1015);
        }

        Collections.reverse(path_1015);
    }

    public void displayPath_1015(String metode_1015) {
        hasilArea_1015.setText("");
        hasilArea_1015.append("Hasil Pencarian Menggunakan " + metode_1015 + "\n");

        if (path_1015.isEmpty()) {
            hasilArea_1015.append("Jalur: Tidak ditemukan\n");
        } else {
            hasilArea_1015.append("Jalur: " + String.join(" -> ", path_1015) + "\n");
        }

        hasilArea_1015.append("Node Dikunjungi: " + visited_1015 + "\n");
        hasilArea_1015.append("Jumlah Node Dieksplorasi: " + visited_1015.size() + "\n");

        displayGraph_1015();
    }

    public void displayGraph_1015() {
        panelGraph_1015.repaint();
    }

    public void resetGraph_1015() {
        resetData_1015();
        hasilArea_1015.setText("Graph dikembalikan ke kondisi awal.\n");
        displayGraph_1015();
    }

    private void resetData_1015() {
        visited_1015.clear();
        path_1015.clear();
    }

    class GraphPanel_1015 extends JPanel {
        protected void paintComponent(Graphics g_1015) {
            super.paintComponent(g_1015);
            setBackground(Color.WHITE);

            Graphics2D g2_1015 = (Graphics2D) g_1015;
            g2_1015.setStroke(new BasicStroke(2));

            for (String node_1015 : graph_1015.keySet()) {
                Point p1_1015 = posisi_1015.get(node_1015);

                for (String tetangga_1015 : graph_1015.get(node_1015)) {
                    Point p2_1015 = posisi_1015.get(tetangga_1015);
                    g2_1015.setColor(Color.GRAY);
                    g2_1015.drawLine(p1_1015.x, p1_1015.y, p2_1015.x, p2_1015.y);
                }
            }

            for (String node_1015 : graph_1015.keySet()) {
                Point p_1015 = posisi_1015.get(node_1015);

                if (path_1015.contains(node_1015)) {
                    g2_1015.setColor(Color.ORANGE);
                } else if (visited_1015.contains(node_1015)) {
                    g2_1015.setColor(Color.GREEN);
                } else {
                    g2_1015.setColor(Color.CYAN);
                }

                g2_1015.fillOval(p_1015.x - 25, p_1015.y - 25, 50, 50);
                g2_1015.setColor(Color.BLACK);
                g2_1015.drawOval(p_1015.x - 25, p_1015.y - 25, 50, 50);
                g2_1015.drawString(node_1015, p_1015.x - 45, p_1015.y + 45);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PetaKampus_2511531015().setVisible(true);
        });
    }
}