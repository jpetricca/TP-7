package tp7;


import tp7.Materia;
import java.util.HashSet;

public class Alumno {

    private int legajo;
    private String nombre;
    private String apellido;
    private HashSet<Materia> materiaAlumno = new HashSet<>();

    public Alumno() {
    }
    
    
    public Alumno(int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public boolean agregarMateria(Materia materia) {     
        return materiaAlumno.add(materia);  
    }

    public int cantidadMaterias() {
        return materiaAlumno.size();
    }

    @Override
    public String toString() {
        return  nombre + " " + apellido;
    }
    
}
        /*escritorio.removeAll();
        escritorio.repaint();
        AltaAlumnos a1 = new AltaAlumnos(alum);
        a1.setVisible(true);
        escritorio.add(a1);
        escritorio.moveToFront(a1);
*/