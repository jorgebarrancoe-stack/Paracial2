public class Direccion {
    private String ciudad;
    private String Calle;

    public Direccion(String ciudad, String Calle) {
        this.ciudad = ciudad;
        this.Calle = Calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCalle() {
        return Calle;
    }
    @Override
    public String toString () {
        return Calle + " , " + ciudad;
    }
}
