package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppGraphic extends JFrame {
    private JPanel painelMatriz;

    public AppGraphic (int [][] arr){
            setTitle("Conway's Game of Life");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(500,500);
            setLocationRelativeTo(null);
            painelMatriz = new JPanel(new GridLayout(0,arr.length));
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    JPanel celula = new JPanel();
                    celula.setPreferredSize(new Dimension(1, 1));
                    celula.setBackground(arr[i][j] == 1 ? Color.WHITE : Color.BLACK);
                    if (j < arr[0].length - 1) {
                        celula.setBorder(new EmptyBorder(0, 0, 0, 1)); // Borda à direita
                    }
                    painelMatriz.add(celula);
                }
            }
            add(painelMatriz);
            setVisible(true);
        }
    public void refresh(int [][] matriz) {
        painelMatriz.removeAll();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                JPanel celula = new JPanel();
                celula.setPreferredSize(new Dimension(1, 1)); // Ajuste conforme necessário
                celula.setBackground(matriz[i][j] == 1 ? Color.GREEN : Color.BLACK);

                // Adiciona uma borda à direita entre as células
                if (j < matriz[0].length - 1) {
                    celula.setBorder(new EmptyBorder(0, 0, 0, 1)); // Borda à direita
                }

                painelMatriz.add(celula);
            }
        }
        revalidate();
        repaint();
    }




}
