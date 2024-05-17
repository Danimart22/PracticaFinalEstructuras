package PracticaFinalEstructuras;

import java.util.InputMismatchException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class metodos {
    public static void menu() {
        int decision = 0;
        int opcion = 0;
        LinkedList<Tableta_grafica> listaTableta = new LinkedList<>();
        LinkedList<Ingeniero> listaIngenieros = DeclararIngeniero();
        LinkedList<EstDiseño> listaEstudiantes = DeclararDiseño();
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
    public static LinkedList<EstDiseño> DeclararDiseño(){
        String decision = "";
        LinkedList<EstDiseño> listaDiseño = new LinkedList<>();
        EstDiseño diseño = new EstDiseño(null, null, null, null, null, 0 , 0);
        do {

            try {
                diseño.setCedula(JOptionPane.showInputDialog("\nIngrese la cedula de el estudiante de diseño: "));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }

            try {
                diseño.setNombre(JOptionPane.showInputDialog("\nIngrese el nombre de el estudiante de diseño: "));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }

            try {
                diseño.setApellido(JOptionPane.showInputDialog("\nIngrese el apellido de el estudiante de diseño: "));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }

            try {
                diseño.setTelefono(JOptionPane.showInputDialog("\nIngrese el telefono de el estudiante de diseño: "));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }
            try {
                diseño.setM_estudio(JOptionPane.showInputDialog("\nIngrese la modalidad de estudio: "));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }
            try {
                diseño.setC_materias(Integer.parseInt(JOptionPane.showInputDialog("\nIngrese la cantidad de materias: ")));   
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }
           listaDiseño.add(diseño);
            decision = JOptionPane.showInputDialog("\n¿Desea ingresar otro estudiante de diseño?(S/N): ").toLowerCase();

        } while (decision.equals("s"));
        return listaDiseño;
    }
    public static portatil DeclararPortatil(){
        
        
        portatil pc = new portatil(null, null, 0, 0, null, null);
        

            try {
                pc.setSerial(JOptionPane.showInputDialog("\nDigite el serial de el portatil: "));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }

            try {
                pc.setMarca(JOptionPane.showInputDialog("\nDigite la marca de el portatil"));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }

            try {
                pc.setTamaño(Float.parseFloat(JOptionPane.showInputDialog("\nDigite el tamaño de el portatil: ")));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }

            try {
                pc.setPrecio(Float.parseFloat(JOptionPane.showInputDialog("\nIngrese el precio de el portatil: ")));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }
            try {
                int Os = 0;
                Os = Integer.parseInt(JOptionPane.showInputDialog("\n***MENÚ DE SELECCIÓN DE SISTEMA OPERATIVO***\n1.Windows 7\n2.Windows 10\n3.Windows 11\nElija una opción: "));
                switch (Os) {
                    case 1:
                        pc.setOS("Windows 7");
                        break;
                    case 2:
                    pc.setOS("Windows 10");
                    break;
                    case 3:
                    pc.setOS("Windows 11");
                    break;
                
                    default:
                        break;
                }
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }
            try {
                int CPU = 0;
                CPU = Integer.parseInt(JOptionPane.showInputDialog("\n***MENÚ DE SELECCIÓN DE PROCESADOR***\n1.AMD Ryzen\n2.Intel Core i5\nElija una opción: "));
                switch (CPU) {
                    case 1:
                        pc.setCPU("AMD Ryzen");
                        break;
                    case 2:
                    pc.setCPU("Intel Core i5");
                    break;
                    
                    default:
                        break;
                }
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }
            
            

        
        return pc;
    }
    public static LinkedList<Tableta_grafica> DeclararTablet(){
        String decision = "";
        LinkedList<Tableta_grafica> listaTablet = new LinkedList<>();
        do {
            Tableta_grafica tablet = new Tableta_grafica(null, null, 0, 0, null, 0);
            try {
                tablet.setSerial(JOptionPane.showInputDialog("\nDigite el serial de la tableta: "));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }

            try {
                tablet.setMarca(JOptionPane.showInputDialog("\nDigite la marca de la tableta: "));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }

            try {
                tablet.setTamaño(Float.parseFloat(JOptionPane.showInputDialog("\nDigite el tamaño de la tableta: ")));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }

            try {
                tablet.setPrecio(Float.parseFloat(JOptionPane.showInputDialog("\nIngrese el precio de la tableta: ")));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }
            try {
                int espacio = 0;
                espacio = Integer.parseInt(JOptionPane.showInputDialog("\n***MENÚ DE SELECCIÓN DE CANTIDAD DE ESPACIO***\n1. 256 GB 7\n2. 500 GB 10\n3. 1 TB\nElija una opción: "));
                switch (espacio) {
                    case 1:
                        tablet.setAlmacenamiento("256 GB");
                        break;
                    case 2:
                    tablet.setAlmacenamiento("500 GB");
                    break;
                    case 3:
                    tablet.setAlmacenamiento("1 TB");
                    break;
                
                    default:
                        break;
                }
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }
            listaTablet.add(tablet);
            decision = JOptionPane.showInputDialog("\n¿Desea ingresar otro portatil?(S/N): ").toLowerCase();

        }while(decision.equals("s"));
        return listaTablet;
    }
    public static String registrarPrestamoIng(){

    }

}
