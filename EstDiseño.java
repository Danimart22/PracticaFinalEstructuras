package PracticaFinalEstructuras;

public class EstDiseño {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String M_estudio;
    private int c_materias;
    private String serial;
    public EstDiseño(String cedula, String nombre, String apellido, String telefono, String m_estudio, int c_materias,
            String serial) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        M_estudio = m_estudio;
        this.c_materias = c_materias;
        this.serial = serial;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getM_estudio() {
        return M_estudio;
    }
    public void setM_estudio(String m_estudio) {
        M_estudio = m_estudio;
    }
    public int getC_materias() {
        return c_materias;
    }
    public void setC_materias(int c_materias) {
        this.c_materias = c_materias;
    }
    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    
}
