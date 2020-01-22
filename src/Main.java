import javax.swing.*;

public class Main {
    public static void main (String [] args) {
        Universidad uni = new Universidad();
        System.out.println(uni.nombre +"/"+ uni.telfono);

        Universidad otra = new Universidad();
         System.out.println(otra.nombre);

        Estudiante est = new Estudiante();
        System.out.println (est.cedula);

        Estudiante est2 = new Estudiante ("Pedro");
        System.out.println(est2.nombre);

        Carrera c = new Carrera();
        System.out.println(c.codigo +"/"+ c.nombre);

        Profesor Prof = new Profesor();
        System.out.println(Prof.nombre +"/"+ Prof.edad +"/"+  Prof.titulo +"/"+  Prof.telefono);

        //create a Jframe
        JFrame frame = new JFrame ();
        JOptionPane.showMessageDialog(frame, est.getInformacion(), "Hola", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
