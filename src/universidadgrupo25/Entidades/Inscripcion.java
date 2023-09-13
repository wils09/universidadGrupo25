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
    double nota;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, Alumno idAlumno, Materia idMateria, double nota) {
        this.idInscripcion = idInscripcion;
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
        this.nota = nota;
    }

    public Inscripcion(Alumno idAlumno, Materia idMateria, double nota) {
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
        this.nota = nota;
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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idInscripcion=" + idInscripcion + ", idAlumno=" + idAlumno + ", idMateria=" + idMateria + ", nota=" + nota + '}';
    }
    
    
    
}