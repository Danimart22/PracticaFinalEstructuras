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
            decision = Integer.parseInt(JOptionPane.showInputDialog("\n---MENÚ DE PRESTAMOS ESTUDIANTES DE INGENIERIA Y DISEÑO---\n\n1.ESTUDIANTES DE INGENIERIA\n2.ESTUDIANTES DE DISEÑO\n3.IMPRIMIR INVENTARIO TOTAL\n0.SALIR"));
            switch (decision) {
                case 1:
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("\n---MENÚ DE PRESTAMOS ESTUDIANTES DE INGENIERIA---\n\n1.Registrar prestamo de portatil\n2.Modificar prestamo de equipo\n3.Devolución del equipo\n4.Buscar equipo\n5.Volver al menú principal"));
                    switch (opcion) {
                        case 1:
                            listaPortatil.add(DeclararPortatil(listaIngenieros));
                            MostrarPortatil(listaPortatil);
                            break;
                        case 2:
                            listaPortatil = ModificarPort(listaPortatil);

                            break;
                        case 3:
                            listaPortatil = DevolverPort(listaPortatil);
                            break;
                        case 4:
                            BuscarPort(listaPortatil);
                            break;
                        case 5:
                        JOptionPane.showMessageDialog(null,"Regresando al menú principal...");
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
        } while (decision != 5);
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
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }
            try {
                Ing.setPromedio(Float
                        .parseFloat(JOptionPane.showInputDialog("\nIngrese el promedio acumulado de el estudiante: ")));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }
            try {

                listaIng.add(Ing);
                decision = JOptionPane.showInputDialog("\n¿Desea ingresar otro estudiante de ingenieria?(S/N): ").toLowerCase();

            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }
        } while (decision.equals("s"));
        return listaIng;
    }

    public static LinkedList<EstDiseño> DeclararDiseño() {
        String decision = "";
        LinkedList<EstDiseño> listaDiseño = new LinkedList<>();
        EstDiseño diseño = new EstDiseño(null, null, null, null, null, 0, 0);
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
                diseño.setC_materias(
                        Integer.parseInt(JOptionPane.showInputDialog("\nIngrese la cantidad de materias: ")));
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
            }
            listaDiseño.add(diseño);
            decision = JOptionPane.showInputDialog("\n¿Desea ingresar otro estudiante de diseño?(S/N): ").toLowerCase();

        } while (decision.equals("s"));
        return listaDiseño;
    }

    public static portatil DeclararPortatil(LinkedList<Ingeniero> listIng) {
        portatil pc = new portatil(null, null, 0, 0, null, null);
        String opcion = "";
        Ingeniero elegido = new Ingeniero(null, null, null, null, 0, 0, null);
        for (Ingeniero Ing : listIng) {
            opcion = JOptionPane.showInputDialog("\nEl que hace el prestamo es(S/N): " + Ing.getNombre() + "\nCon cedula: " + Ing.getCedula()).toLowerCase();
            if (opcion.equals("s")) {
                elegido = Ing;
            }
        }
        try {
            String serial = (JOptionPane.showInputDialog("\nDigite el serial de el portatil: "));
            pc.setSerial(serial);
            elegido.setSerial(serial);
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
        } catch (NumberFormatException j) {
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
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
        }

        return pc;
    }

    public static Tableta_grafica DeclararTablet() {

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
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
        }

        try {
            tablet.setPrecio(Float.parseFloat(JOptionPane.showInputDialog("\nIngrese el precio de la tableta: ")));
        } catch (NumberFormatException e) {
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
        } catch (NumberFormatException j) {
            JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
        }

        return tablet;
    }

    public static LinkedList<portatil> ModificarPort(LinkedList<portatil> listaPort) {
        portatil pc = new portatil(null, null, 0, 0, null, null);
        String serial = JOptionPane.showInputDialog("Ingrese el serial del portatil que desea modificar: ");
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
            pc.setTamaño(Float.parseFloat(JOptionPane.showInputDialog("\nDigite el tamaño (En pulgadas) de el portatil: ")));
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
        for (portatil p : listaPort) {
            if (p.getSerial().equals(serial)) {
                listaPort.set(listaPort.indexOf(p), pc);
            }
        }
        MostrarPortatil(listaPort);
        return listaPort;
    }

    public static void MostrarPortatil(LinkedList<portatil> listaPort) {
        for (portatil p : listaPort) {
            JOptionPane.showMessageDialog(null,"\nSerial: " + p.getSerial() + "\nMarca: " + p.getMarca() + "\nTamaño: " + p.getTamaño() + "\nPrecio: " + p.getPrecio() + "\nSO: " + p.getOS() + "\nProcesador: " + p.getCPU());
        }
    }

    public static LinkedList<portatil> DevolverPort(LinkedList<portatil> listaPort) {
        String serial = JOptionPane.showInputDialog("Ingrese el serial del portatil que desea modificar: ");
        for (portatil p : listaPort) {
            if (p.getSerial().equals(serial)) {
                listaPort.remove(p);
            }
        }
        MostrarPortatil(listaPort);
        return listaPort;
    }

    public static void BuscarPort(LinkedList<portatil> listaPort) {
        String serial = JOptionPane.showInputDialog("\nIngrese el serial del portatil que desea consultar: ");
        for (portatil p : listaPort) {
            if (p.getSerial().equals(serial)) {
                JOptionPane.showMessageDialog(null,"Serial: " + p.getSerial() + "\nMarca: " + p.getMarca() + "\nTamaño: " + p.getTamaño() + "\nPrecio: " + p.getPrecio() + "\nSO: " + p.getCPU() + "\nProcesador: " + p.getCPU());
            }
        }

    }
    
}
