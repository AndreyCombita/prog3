
import java.util.Queue;
import java.util.LinkedList;


public class Lab0301 {
    
   static Queue<Registro> regis=new LinkedList<>();

    public static void main(String[] args) {
        registro_estudiante();
        registro_asignatura();
        reporte_registro_final();
    }
    public static void registro_estudiante(){
    int codigo=Entrada.readInt("Codigo estudiante: ");
    String nombre=Entrada.readText("Nombre Estudiante: ");
    String correo= Entrada.readText("Correo Estudiante: ");
    int semestre = Entrada.readInt("Semestre: ");
    Estudiante estud=new Estudiante (codigo, nombre, correo, semestre);
    
    regis.add(new Registro(estud));
    }
    public static void registro_asignatura() {}
    public static void reporte_registro_final() {}
}
