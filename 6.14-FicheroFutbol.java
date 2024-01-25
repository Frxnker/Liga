import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class FicheroFutbol {
    public int guardar(String nombreEq, int partJug, int partGan, int partEmp, int partPer, int puntos) {
        int resultado;
        try {
            FileWriter f = new FileWriter("Liga.txt", true);
            f.write(nombreEq + ";" + partJug + ";" + partGan + ";" + partEmp + ";" + partPer + ";" + puntos + "\n");
            f.close();
            resultado = 0;
        }
        catch (Exception e) {
            resultado = -1;
            e.printStackTrace();
        }
        return resultado;

        
    }

    public int mostrar(String nombreEq, int partJug, int partGan, int partEmp, int partPer, int puntos) {
        int resultado;
        try {
            // Leemos el fichero
            File f = new File("Liga.txt");
            Scanner s = new Scanner(f);
            
            
        }
        return puntos;
    }
    

    public void setNombre(String nombreEq, int partJug, int partGan, int partEmp, int partPer, int puntos) {

    }

    public int ordenar(String nombreEq) {
        return 0;
    }

    public void borrar(String nombreEq) {

    }

    public void modificar(String nombreEq) {

    }
}
