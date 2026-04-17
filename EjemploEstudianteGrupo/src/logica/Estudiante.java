package logica;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String carnet;
    private String nombre;
    private String email;
    private String telefono;
    private List<Grupo> gruposMatriculados;
    
    public Estudiante(String carnet, String nombre, String email, String telefono) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        gruposMatriculados = new ArrayList<>();
    }
    
    public String getCarnet() {
        return carnet;
    }
    
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void agregarAGrupo(Grupo grupo) {
        gruposMatriculados.add(grupo);
        grupo.agregarEstudiante(this);
    }

    public void eliminarDeGrupo(Grupo grupo) {
        gruposMatriculados.remove(grupo);
        grupo.eliminarEstudiante(this);
    }
    
    public List<Grupo> getGruposMatriculados() {
        return gruposMatriculados;
    }
}
