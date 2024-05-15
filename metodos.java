package PracticaFinalEstructuras;
import java.util.LinkedList;
import javax.swing.JOptionPane;
public class metodos {
    public static void menu(){
        int decision = 0;
        int opcion = 0;
        LinkedList<Tableta_grafica> listaTableta = new LinkedList<>();
        LinkedList<Ingeniero> listaIngenieros = new LinkedList<>();
        LinkedList<EstDiseño> listaEstudiantes = new LinkedList<>();
        LinkedList<portatil> listaPortatil = new LinkedList<>();
        do {
            decision = Integer.parseInt(JOptionPane.showInputDialog("\n---MENÚ DE PRESTAMOS ESTUDIANTES DE INGENIERIA Y DISEÑO---\n\n1.ESTUDIANTES DE INGENIERIA\n2.ESTUDIANTES DE DISEÑO\n3.IMPRIMIR INVENTARIO TOTAL\n0.SALIR"));
            switch (decision) {
                case 1:
                    switch (opcion) {
                        case 1:
                        

                            break;
                    
                        default:
                        JOptionPane.showMessageDialog(null, "\nIngrese una de las opciones validas");
                            break;
                    }
                    break;
            
                default:
                JOptionPane.showMessageDialog(null, "\nIngrese una de las opciones validas");
                    break;
            }
        } while (decision != 0); 
    }
}
