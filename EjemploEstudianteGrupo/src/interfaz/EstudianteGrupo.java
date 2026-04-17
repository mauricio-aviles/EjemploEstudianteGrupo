package interfaz;

import logica.Estudiante;
import logica.Grupo;

public class EstudianteGrupo {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("202458965", 
                                       "Estebastián Varado Salillo", 
                                       "evarado@estudiantec.cr", 
                                       "74185263");
        Estudiante e2 = new Estudiante("202479461", 
                                       "Jocel Guerce Varves", 
                                       "jguerce@estudiantec.cr", 
                                       "88654322");
        Estudiante e3 = new Estudiante("202477552",
                                       "Kialana Pogura Barzalez",
                                       "kpogura@estudiantec.cr", 
                                       "98765417");
        Estudiante e4 = new Estudiante("202352418", 
                                       "Jomael Pendo Ortarez", 
                                       "jpendo@estudiantec.cr", 
                                       "88552264");
        Grupo g1 = new Grupo(40, "SJ", "K-J 9:30 11:20", "Programación 1");
        Grupo g2 = new Grupo(41, "SC", "M-V 13:00 14:50", "Programación 2");
        Grupo g3 = new Grupo(42, "AL", "L-S 7:30 9:20", "Programación 3");
        e1.agregarAGrupo(g1);
        e2.agregarAGrupo(g1);
        e2.agregarAGrupo(g2);
        e3.agregarAGrupo(g2);
        e3.agregarAGrupo(g3);
        e4.agregarAGrupo(g3);        
    }

}
