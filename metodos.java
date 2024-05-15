package PracticaFinalEstructuras;

import java.util.InputMismatchException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class metodos {
    public static void menu() {
        int decision = 0;
        int opcion = 0;
        LinkedList<Tableta_grafica> listaTableta = new LinkedList<>();
        LinkedList<Ingeniero> listaIngenieros = new LinkedList<>();
        LinkedList<EstDiseño> listaEstudiantes = new LinkedList<>();
        LinkedList<portatil> listaPortatil = new LinkedList<>();
        do {
            decision = Integer.parseInt(JOptionPane.showInputDialog(
                    "\n---MENÚ DE PRESTAMOS ESTUDIANTES DE INGENIERIA Y DISEÑO---\n\n1.ESTUDIANTES DE INGENIERIA\n2.ESTUDIANTES DE DISEÑO\n3.IMPRIMIR INVENTARIO TOTAL\n0.SALIR"));
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

    public static LinkedList<Ingeniero> DeclararIngeniero() {
        String decision = "";
        LinkedList<Ingeniero> listaIng = new LinkedList<>();
        Ingeniero Ing = new Ingeniero(null, null, null, null, 0, 0, null);
        do {

            try {
                Ing.setCedula(JOptionPane.showInputDialog("\nIngrese la cedula de el ingeniero: "));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }

            try {
                Ing.setNombre(JOptionPane.showInputDialog("\nIngrese el nombre de el ingeniero: "));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }

            try {
                Ing.setApellido(JOptionPane.showInputDialog("\nIngrese el apellido de el ingeniero: "));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }

            try {
                Ing.setTelefono(JOptionPane.showInputDialog("\nIngrese el telefono de el ingeniero: "));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }
            try {
                Ing.setSemestre(Integer.parseInt(JOptionPane.showInputDialog("\nIngrese el semestre actualmente cursado: ")));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }
            try {
                Ing.setPromedio(Float.parseFloat(JOptionPane.showInputDialog("\nIngrese el promedio acumulado de el estudiante: ")));   
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }
            try {
                Ing.setSerial(JOptionPane.showInputDialog("\nIngrese el serial de el estudiante: "));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }
            listaIng.add(Ing);
            decision = JOptionPane.showInputDialog("\n¿Desea ingresar otro estudiante de ingenieria?(S/N): ").toLowerCase();

        } while (decision.equals("s"));
        return listaIng;
    }
}
