package logica;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private int numero;
    private String sede;
    private String horario;
    private String materia;
    private List<Estudiante> estudiantes;
    
    public Grupo(int numero, String sede, String horario, String materia) {
        this.numero = numero;
        this.sede = sede;
        this.horario = horario;
        this.materia = materia;
        estudiantes = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    
    public void eliminarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }
    
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    //test test test
}
