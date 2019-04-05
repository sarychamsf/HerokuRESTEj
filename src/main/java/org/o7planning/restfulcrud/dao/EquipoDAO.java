package org.o7planning.restfulcrud.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.o7planning.restfulcrud.model.Equipo;

public class EquipoDAO {

    private static final Map<String, Equipo> empMap = new HashMap<String, Equipo>();

    static {
        initEmps();
    }

    private static void initEmps() {

        Equipo eq1 = new Equipo("E01", "Equipo 1");
        Equipo eq2 = new Equipo("E02", "Equipo 2");
        Equipo eq3 = new Equipo("E03", "Equipo 3");

        empMap.put(eq1.getIdEquipo(), eq1);
        empMap.put(eq2.getIdEquipo(), eq2);
        empMap.put(eq3.getIdEquipo(), eq3);

    }

    public static Equipo getEquipo(String idEquipo) {
        return empMap.get(idEquipo);
    }

    public static Equipo addEquipo(Equipo equipo) {
        empMap.put(equipo.getIdEquipo(), equipo);
        return equipo;
    }

    public static Equipo updateEquipo(Equipo equipo) {
        empMap.put(equipo.getIdEquipo(), equipo);
        return equipo;
    }

    public static void deleteEquipo(String idEquipo) {
        empMap.remove(idEquipo);
    }

    public static List<Equipo> getAllEquipos() {
        Collection<Equipo> c = empMap.values();
        List<Equipo> list = new ArrayList<Equipo>();
        list.addAll(c);
        return list;
    }

    List<Equipo> list;

}
