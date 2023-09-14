
 import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Carro extends JFrame implements ActionListener {
    private JButton botonModelo, botonKilometraje;
    private JTable tabla;
    private DefaultTableModel modeloTabla;

    private Carro[] carros;

    public Carro(int cantidadCarros) {
        // Crear arreglo de carros aleatorios
        carros = new Carro[cantidadCarros];
        for (int i = 0; i < cantidadCarros; i++) {
            String marca = "Marca " + (i + 1);
            String modelo = "Modelo " + (int) (Math.random() * 10 + 1);
            String color = "Color " + (int) (Math.random() * 5 + 1);
            int kilometraje = (int) (Math.random() * 100000);
            carros[i] = new Carro(marca, modelo, color, kilometraje);
        }

        // Configurar ventana y botones
        this.setTitle("Carros Usados");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        botonModelo = new JButton("Ordenar por modelo");
        botonKilometraje = new JButton("Ordenar por kilometraje");
        botonModelo.addActionListener(this);
        botonKilometraje.addActionListener(this);

        JPanel panelBotones = new JPanel();
        panelBotones.add(botonModelo);
        panelBotones.add(botonKilometraje);

        // Configurar tabla
        modeloTabla = new DefaultTableModel(new Object[]{"Marca", "Modelo", "Color", "Kilometraje"}, 0
    );
    tabla = new JTable(modeloTabla);

    JScrollPane scrollTabla = new JScrollPane(tabla);
    scrollTabla.setPreferredSize(new Dimension(400, 300));

    // Añadir componentes a la ventana
    this.add(panelBotones, BorderLayout.NORTH);
    this.add(scrollTabla, BorderLayout.CENTER);

    this.pack();
    this.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == botonModelo) {
        Arrays.sort(carros);
    } else if (e.getSource() == botonKilometraje) {
        Arrays.sort(carros, (c1, c2) -> Integer.compare(c1.getKilometraje(), c2.getKilometraje()));
    }

    // Limpiar tabla
    while (modeloTabla.getRowCount() > 0) {
        modeloTabla.removeRow(0);
    }

    // Llenar tabla con carros ordenados
    for (Carro carro : carros) {
        modeloTabla.addRow(new Object[]{carro.getMarca(), carro.getModelo(), carro.getColor(), carro.getKilometraje()});
    }
}

public static void main(String[] args) {
    int cantidadCarros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de carros:"));
    Carro interfaz = new Carro(cantidadCarro);
    }
}



/*
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        /* Set the Nimbus look and feel */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

