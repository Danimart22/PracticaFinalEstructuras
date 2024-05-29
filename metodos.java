package PracticaFinalEstructuras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class metodos {
    public static void menu() {
        int decision = 0;
        int opcion = 0;
        String condicion = "";
        LinkedList<Tableta_grafica> listaTableta = new LinkedList<>();
        LinkedList<Ingeniero> listaIngenieros = new LinkedList<>();
        LinkedList<EstDiseño> listaDiseño = new LinkedList<>();
        do {
            listaIngenieros.add(DeclararIngeniero());
            condicion = JOptionPane.showInputDialog("\n¿Desea ingresar otro ingeniero?(S/N): ").toUpperCase();

        } while (condicion.equals("S"));
        do {
            listaDiseño.add(DeclararDiseño());
            condicion = JOptionPane.showInputDialog("\n¿Desea ingresar otro estudiante de diseño?(S/N): ")
                    .toUpperCase();
        } while (condicion.equals("S"));
        LinkedList<portatil> listaPortatil = new LinkedList<>();
        do {
            decision = Integer.parseInt(JOptionPane.showInputDialog(
                    "\n---MENÚ DE PRESTAMOS ESTUDIANTES DE INGENIERIA Y DISEÑO---\n\n1.ESTUDIANTES DE INGENIERIA\n2.ESTUDIANTES DE DISEÑO\n3.IMPRIMIR INVENTARIO TOTAL\n4.INSERTAR DATOS MEDIANTE LA IMPORTACIÓN\n0.SALIR"));
            switch (decision) {
                case 1:
                    do {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                                "\n---MENÚ DE PRESTAMOS ESTUDIANTES DE INGENIERIA---\n\n1.Registrar prestamo de portatil\n2.Modificar prestamo de equipo\n3.Devolución del equipo\n4.Buscar equipo\n5.Volver al menú principal"));
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
                                JOptionPane.showMessageDialog(null, "Regresando al menú principal...");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "\nIngrese una de las opciones validas");
                                break;
                        }
                    } while (opcion != 5);
                    break;
                case 2:
                    do {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                                "\n---MENÚ DE PRESTAMOS DE ESTUDIANTES DE DISEÑO---\n\n1.Registrar prestamo de Tableta grafica\n2.Modificar registro\n3.Devolución del equipo\n4.Buscar el equipo\n5.Volver al menú principal "));
                        switch (opcion) {
                            case 1:
                                listaTableta.add(DeclararTablet(listaDiseño));
                                MostrarTablet(listaTableta);
                                break;
                            case 2:
                                listaTableta = ModificarTablet(listaTableta);
                                MostrarTablet(listaTableta);
                                break;
                            case 3:
                                listaTableta = DevolverTablet(listaTableta);
                                MostrarTablet(listaTableta);
                                break;
                            case 4:
                                BuscarTablet(listaTableta);
                                break;
                            default:
                                break;
                        }
                    } while (opcion != 5);

                    break;
                case 3:
                    String exportar = "";
                    MostrarIngenieros(listaIngenieros);
                    MostrarDiseño(listaDiseño);
                    MostrarTablet(listaTableta);
                    MostrarPortatil(listaPortatil);
                    exportar = JOptionPane
                            .showInputDialog("¿Desea que se exporten los datos del inventario a un archivo txt? (S/N)")
                            .toLowerCase();
                    if (exportar.equals("s")) {
                        exportarDatos(listaIngenieros, listaDiseño, listaPortatil, listaTableta);
                    }
                    break;
                case 4:
                    importarDatos(listaIngenieros, listaDiseño, listaPortatil, listaTableta);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Cerrando programa de resgistro...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "\nIngrese una de las opciones validas");
                    break;
            }
        } while (decision != 0);
    }

    public static Ingeniero DeclararIngeniero() {

        Ingeniero Ing = new Ingeniero(null, null, null, null, 0, 0, null);

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
            Ing.setSemestre(
                    Integer.parseInt(JOptionPane.showInputDialog("\nIngrese el semestre actualmente cursado: ")));
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

        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
        }

        return Ing;
    }

    public static EstDiseño DeclararDiseño() {

        EstDiseño diseño = new EstDiseño(null, null, null, null, null, 0, null);

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

        return diseño;
    }

    public static portatil DeclararPortatil(LinkedList<Ingeniero> listIng) {
        portatil pc = new portatil(null, null, 0, 0, null, null);
        String numero = "";
        String opcion = "";
        Ingeniero elegido = new Ingeniero(null, null, null, null, 0, 0, null);
        for (Ingeniero Ing : listIng) {
            opcion = JOptionPane.showInputDialog(
                    "\nEl que hace el prestamo es(S/N): " + Ing.getNombre() + "\nCon cedula: " + Ing.getCedula())
                    .toLowerCase();
            if (opcion.equals("s")) {
                elegido = Ing;
                numero = elegido.getCedula();
                break;
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
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
        }
        try {
            int Os = 0;
            Os = Integer.parseInt(JOptionPane.showInputDialog(
                    "\n***MENÚ DE SELECCIÓN DE SISTEMA OPERATIVO***\n1.Windows 7\n2.Windows 10\n3.Windows 11\nElija una opción: "));
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
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
        }
        try {
            int CPU = 0;
            CPU = Integer.parseInt(JOptionPane.showInputDialog(
                    "\n***MENÚ DE SELECCIÓN DE PROCESADOR***\n1.AMD Ryzen\n2.Intel Core i5\nElija una opción: "));
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
        for (Ingeniero p : listIng) {
            if (p.getCedula().equals(numero)) {
                listIng.set(listIng.indexOf(p), elegido);
            }
        }

        return pc;
    }

    public static Tableta_grafica DeclararTablet(LinkedList<EstDiseño> listaDiseño) {
        String opcion = "";
        String numero = "";
        EstDiseño Est = new EstDiseño(null, null, null, null, null, 0, null);
        Tableta_grafica tablet = new Tableta_grafica(null, null, 0, 0, null, 0);
        for (EstDiseño Estu : listaDiseño) {
            opcion = JOptionPane.showInputDialog(
                    "\nEl que hace el prestamo es: " + Estu.getNombre() + " con cedula: " + Estu.getCedula() + " (S/N)")
                    .toLowerCase();
            if (opcion.equals("s")) {
                Est = Estu;
                numero = Est.getCedula();
                break;
            }
        }
        try {
            String serial = JOptionPane.showInputDialog("\nDigite el serial de la tablet: ");
            tablet.setSerial(serial);
            Est.setSerial(serial);
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
            espacio = Integer.parseInt(JOptionPane.showInputDialog(
                    "\n***MENÚ DE SELECCIÓN DE CANTIDAD DE ESPACIO***\n1. 256 GB \n2. 500 GB \n3. 1 TB\nElija una opción: "));
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
        try {
            tablet.setPeso(
                    Float.parseFloat(JOptionPane.showInputDialog("\nIngrese el peso (En gramos) de la tableta: ")));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
        }

        for (EstDiseño p : listaDiseño) {
            if (p.getCedula().equals(numero)) {
                listaDiseño.set(listaDiseño.indexOf(p), Est);
            }
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
            pc.setTamaño(
                    Float.parseFloat(JOptionPane.showInputDialog("\nDigite el tamaño (En pulgadas) de el portatil: ")));
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
            Os = Integer.parseInt(JOptionPane.showInputDialog(
                    "\n***MENÚ DE SELECCIÓN DE SISTEMA OPERATIVO***\n1.Windows 7\n2.Windows 10\n3.Windows 11\nElija una opción: "));
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
            CPU = Integer.parseInt(JOptionPane.showInputDialog(
                    "\n***MENÚ DE SELECCIÓN DE PROCESADOR***\n1.AMD Ryzen\n2.Intel Core i5\nElija una opción: "));
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
            JOptionPane.showMessageDialog(null,
                    "\nSerial: " + p.getSerial() + "\nMarca: " + p.getMarca() + "\nTamaño: " + p.getTamaño()
                            + "\nPrecio: " + p.getPrecio() + "\nSO: " + p.getOS() + "\nProcesador: " + p.getCPU());
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
                JOptionPane.showMessageDialog(null,
                        "Serial: " + p.getSerial() + "\nMarca: " + p.getMarca() + "\nTamaño: " + p.getTamaño()
                                + "\nPrecio: " + p.getPrecio() + "\nSO: " + p.getOS() + "\nProcesador: " + p.getCPU());
            }
        }

    }

    public static void MostrarTablet(LinkedList<Tableta_grafica> listaTablet) {
        for (Tableta_grafica Tab : listaTablet) {
            JOptionPane.showMessageDialog(null,
                    "Serial: " + Tab.getSerial() + "\nMarca: " + Tab.getMarca() + "\nTamaño: " + Tab.getTamaño()
                            + "\nPrecio: " + Tab.getPrecio() + "\nAlmacenamiento: " + Tab.getAlmacenamiento()
                            + "\nPeso: " + Tab.getPeso());
        }

    }

    public static LinkedList<Tableta_grafica> ModificarTablet(LinkedList<Tableta_grafica> listtatblet) {
        Tableta_grafica tablet = new Tableta_grafica(null, null, 0, 0, null, 0);
        String serial = JOptionPane.showInputDialog("\nIngrese el serial de la tablet: ");
        try {
            tablet.setSerial(JOptionPane.showInputDialog("\nDigite el serial de la tablet: "));
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
        }
        try {
            tablet.setMarca(JOptionPane.showInputDialog("\nDigite la marca de la tablet"));
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
        }
        try {
            tablet.setTamaño(
                    Float.parseFloat(JOptionPane.showInputDialog("\nDigite el tamaño (En pulgadas) de la tablet: ")));
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
        }
        try {
            tablet.setPrecio(Float.parseFloat(JOptionPane.showInputDialog("\nIngrese el precio de la tablet: ")));
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
        }
        try {
            int espacio = 0;
            espacio = Integer.parseInt(JOptionPane.showInputDialog(
                    "\n***MENÚ DE SELECCIÓN DE CANTIDAD DE ESPACIO***\n1. 256 GB 7\n2. 500 GB 10\n3. 1 TB\nElija una opción: "));
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
        try {
            tablet.setPeso(
                    Float.parseFloat(JOptionPane.showInputDialog("\nIngrese el peso (En gramos) de la tableta: ")));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "\nIngreso un tipo de dato no valido");
        }
        for (Tableta_grafica Tab : listtatblet) {
            if (Tab.getSerial().equals(serial)) {
                listtatblet.set(listtatblet.indexOf(Tab), tablet);
            }

        }
        return listtatblet;
    }

    public static LinkedList<Tableta_grafica> DevolverTablet(LinkedList<Tableta_grafica> listaTablet) {
        String serial = JOptionPane.showInputDialog("Ingrese el serial de el portatil que desea devolver: ");
        for (Tableta_grafica tab : listaTablet) {
            if (tab.getSerial().equals(serial)) {
                listaTablet.remove(tab);
            }
        }
        return listaTablet;
    }

    public static void BuscarTablet(LinkedList<Tableta_grafica> listaTablet) {
        String serial = JOptionPane.showInputDialog("Ingrese el serial de la tablet que desea buscar: ");
        for (Tableta_grafica Tab : listaTablet) {
            if (Tab.getSerial().equals(serial)) {
                JOptionPane.showMessageDialog(null,
                        "Serial: " + Tab.getSerial() + "\nMarca: " + Tab.getMarca() + "\nTamaño: " + Tab.getTamaño()
                                + "\nPrecio: " + Tab.getPrecio() + "\nAlmacenamiento: " + Tab.getAlmacenamiento()
                                + "\nPeso: " + Tab.getPeso());
            }
        }
    }

    public static void MostrarIngenieros(LinkedList<Ingeniero> listIng) {
        for (Ingeniero p : listIng) {
            JOptionPane.showMessageDialog(null,
                    "Cedula: " + p.getCedula() + "\nNombre: " + p.getNombre() + "\nApellido: " + p.getApellido()
                            + "\nTelefono: " + p.getTelefono() + "\nSemestre: " + p.getSemestre() + "\nPromedio: "
                            + p.getPromedio() + "\nSerial: " + p.getSerial());
        }
    }

    public static void MostrarDiseño(LinkedList<EstDiseño> listDiseño) {
        for (EstDiseño p : listDiseño) {
            JOptionPane.showMessageDialog(null,
                    "Cedula: " + p.getCedula() + "\nNombre: " + p.getNombre() + "\nApellido: " + p.getApellido()
                            + "\nTelefono: " + p.getTelefono() + "\nModalidad de estudio: " + p.getM_estudio()
                            + "\nCantidad de asignaturas: " + p.getC_materias() + "\nSerial: " + p.getSerial());
        }
    }

    public static void exportarDatos(LinkedList<Ingeniero> listaIngenieros, LinkedList<EstDiseño> listaDiseño,
            LinkedList<portatil> listaPortatil, LinkedList<Tableta_grafica> listaTableta) {
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                switch (fields[0]) {
                    case "Ingeniero":
                        Ingeniero ingeniero = new Ingeniero(fields[1], fields[2], fields[3], fields[4],
                                Integer.parseInt(fields[5]), Float.parseFloat(fields[6]), fields[7]);
                        listaIngenieros.add(ingeniero);
                        break;
                    case "Diseño":
                        EstDiseño diseño = new EstDiseño(fields[1], fields[2], fields[3], fields[4], fields[5],
                                Integer.parseInt(fields[6]), fields[7]);
                        listaDiseño.add(diseño);
                        break;
                    case "Portatil":
                        portatil pc = new portatil(fields[1], fields[2], Float.parseFloat(fields[3]),
                                Float.parseFloat(fields[4]), fields[5], fields[6]);
                        listaPortatil.add(pc);
                        break;
                    case "Tableta":
                        Tableta_grafica tablet = new Tableta_grafica(fields[1], fields[2], Float.parseFloat(fields[3]),
                                Float.parseFloat(fields[4]), fields[5], Float.parseFloat(fields[6]));
                        listaTableta.add(tablet);
                        break;
                }
            }
            JOptionPane.showMessageDialog(null, "Datos importados exitosamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al importar datos: " + e.getMessage());
        }
    }

    public static void importarDatos(LinkedList<Ingeniero> listaIngenieros, LinkedList<EstDiseño> listaDiseño,
            LinkedList<portatil> listaPortatil, LinkedList<Tableta_grafica> listaTableta) {
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] fields = linea.split(",");
                switch (fields[0]) {
                    case "Ingeniero":
                        Ingeniero ingeniero = new Ingeniero(fields[1], fields[2], fields[3], fields[4],
                                Integer.parseInt(fields[5]), Float.parseFloat(fields[6]), fields[7]);
                        listaIngenieros.add(ingeniero);
                        break;
                    case "Diseño":
                        EstDiseño diseño = new EstDiseño(fields[1], fields[2], fields[3], fields[4], fields[5],
                                Integer.parseInt(fields[6]), fields[7]);
                        listaDiseño.add(diseño);
                        break;
                    case "Portatil":
                        portatil pc = new portatil(fields[1], fields[2], Float.parseFloat(fields[3]),
                                Float.parseFloat(fields[4]), fields[5], fields[6]);
                        listaPortatil.add(pc);
                        break;
                    case "Tableta":
                        Tableta_grafica tablet = new Tableta_grafica(fields[1], fields[2], Float.parseFloat(fields[3]),
                                Float.parseFloat(fields[4]), fields[5], Float.parseFloat(fields[6]));
                        listaTableta.add(tablet);
                        break;
                }
            }
            JOptionPane.showMessageDialog(null, "Datos importados exitosamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al importar datos: " + e.getMessage());
        }
    }
}
