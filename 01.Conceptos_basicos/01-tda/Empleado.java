public class Empleado {
    //Variables de instancia
    private String numeroNomina;
    private String nombre;
    private String sexo;
    private double sueldo;
    private boolean activo;
    //Validable de clase
    private static int contarObjetos;


    //Sobre carga de constructores
    public Empleado (){
        contarObjetos++;
    }

    public Empleado(String numeroNomina,
                    String nombre,
                    String sexo,
                    double sueldo,
                    boolean activo) {
        this.numeroNomina = numeroNomina;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.activo = activo;
        this.nombre=nombre;
        contarObjetos++;
    }

    public String getNumeroNomina() {
        return numeroNomina;
    }

    public String getSexo() {
        return sexo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setActivo (boolean activo) {
        this.activo=activo;
    }

    public boolean isActivo() {
        return activo;
    }

    public static int getContarObjetos(){
        return Empleado.contarObjetos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numeroNomina='" + numeroNomina + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", sueldo=" + sueldo +
                ", activo=" + (activo ? "Activo":"Inactivo") +
                '}';
    }
}