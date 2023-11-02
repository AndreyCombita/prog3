import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedWriter;
import java.io.*;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.*;


public class csv{
    
    public static void main(String[] args) {
    }
    
    public void GuardarArchivos (JTable tablita){
        StringBuilder sb = new StringBuilder();
    DefaultTableModel model = (DefaultTableModel) tablita.getModel();
    int columnCount = model.getColumnCount();
    for (int i = 0; i < columnCount; i++) {
        sb.append(model.getColumnName(i));
        if (i < columnCount - 1) {
            sb.append(",");
        }
    }
    sb.append("\n");
    for (int i = 0; i < model.getRowCount(); i++) {
        for (int j = 0; j < columnCount; j++) {
            sb.append(model.getValueAt(i, j).toString());
            if (j < columnCount - 1) {
                sb.append(",");
            }
        }
        sb.append("\n");
    }
    StringSelection stringSelection = new StringSelection(sb.toString());
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, null);
    }
    
    /**
     *
     */
    public void Descargar (Component parentComponent){
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

    try {

     // Read from the clipboard
        String content = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        // Display a save dialog
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar como");
        int userSelection = fileChooser.showSaveDialog(parentComponent);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // Get the selected file
            File fileToSave = fileChooser.getSelectedFile();
            // Save the content to the file
            try (FileWriter fileWriter = new FileWriter(fileToSave)) {
                fileWriter.write(content);
                JOptionPane.showMessageDialog(parentComponent, "Archivo guardado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    } catch (UnsupportedFlavorException | IOException ex) {
        JOptionPane.showMessageDialog(parentComponent, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    
}

