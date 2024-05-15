package PracticaFinalEstructuras;
public class portatil{
    private String serial;
    private String marca;
    private float tamaño;
    private float precio;
    private String OS;
    private String CPU;
    public portatil(String serial, String marca, float tamaño, float precio, String oS, String cPU) {
        this.serial = serial;
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
        OS = oS;
        CPU = cPU;
    }
    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public float getTamaño() {
        return tamaño;
    }
    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getOS() {
        return OS;
    }
    public void setOS(String oS) {
        OS = oS;
    }
    public String getCPU() {
        return CPU;
    }
    public void setCPU(String cPU) {
        CPU = cPU;
    }
    
}