public class Estudiante extends Persona {

    String nokbre;
    String codigo;
    private Direccion direccion

    public Estudiante (String codigo, String nombre, Direccion direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    @Override
    public String getCodigo () {
        return codigo;
    }
    public String getNombre () {
        return nombre;
    }
    public String Direccion () {
        return direccion;
    }
     @Override
    public String describir () {
        return "Estudiantes" + nombre + "codigo " + codigo + "Vive en " + direccion;
     }
     @Override
    public  String toString () {
        return "Estudiante" + codigo + "noimbre" + nombre + "direccion" + direccion;
     }




    }

