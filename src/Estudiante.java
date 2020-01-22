public class Estudiante {

    String nombre, apellido, cedula;

    public Estudiante(){

        nombre ="Pedro";
        apellido ="Olivas";
        cedula ="414-160699-0000V";

    }
    public Estudiante(String nombre){
        this.nombre=nombre;

    }

    public String getInformacion() {
        return nombre;
    }
}
