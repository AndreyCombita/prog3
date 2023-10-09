
import javax.swing.ImageIcon;


public class Imagenes {
    String rutarojo = "/imagenes/rojo.JPG";
    String rutaamarillo = "/imagenes/amarillo.JPG";
    String rutaverde = "/imagenes/verde.JPG";
    
    ImageIcon[] semaforo = new ImageIcon[3];
    ImageIcon[] persona = new ImageIcon[3];

    public Imagenes() {
        semaforo[0] = new ImageIcon(Imagenes.class.getResource(rutarojo));
        semaforo[1] = new ImageIcon(Imagenes.class.getResource(rutaamarillo));
        semaforo[2] = new ImageIcon(Imagenes.class.getResource(rutaverde));
    }
}

    

