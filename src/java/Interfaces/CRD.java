package Interfaces;

import Modelo.Tarea;
import java.util.List;

public interface CRD {
    public List listar();
    public Tarea list(int id);
    public boolean add(Tarea tar);
    public boolean edit();
    public boolean eliminar(int id);
}
