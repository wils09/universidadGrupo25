/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo25.Entidades;

/**
 *
 * @author Ramirez
 */
public class Inscripcion {
    int idInscripcion;
    Alumno idAlumno;
    Materia idMateria;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, Alumno idAlumno, Materia idMateria) {
        this.idInscripcion = idInscripcion;
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
    }

    public Inscripcion(Alumno idAlumno, Materia idMateria) {
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Materia getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Materia idMateria) {
        this.idMateria = idMateria;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idInscripcion=" + idInscripcion + ", idAlumno=" + idAlumno + ", idMateria=" + idMateria + '}';
    }
    
    
}
