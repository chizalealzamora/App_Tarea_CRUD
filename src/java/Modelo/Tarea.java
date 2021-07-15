package Modelo;

public class Tarea {
    int id_tarea;
    String nombre_tarea;
    boolean tarea_realizado;
    String fecha_hora;
    boolean eliminar_tarea;

    public Tarea(){

    }
    
    public Tarea(int id_tarea, String nombre_tarea, boolean tarea_realizado, String fecha_hora, boolean eliminar_tarea) {
        this.id_tarea = id_tarea;
        this.nombre_tarea = nombre_tarea;
        this.tarea_realizado = tarea_realizado;
        this.fecha_hora = fecha_hora;
        this.eliminar_tarea = eliminar_tarea;
    }

    public int getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    public String getNombre_tarea() {
        return nombre_tarea;
    }

    public void setNombre_tarea(String nombre_tarea) {
        this.nombre_tarea = nombre_tarea;
    }

    public boolean isTarea_realizado() {
        return tarea_realizado;
    }

    public void setTarea_realizado(boolean tarea_realizado) {
        this.tarea_realizado = tarea_realizado;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public boolean isEliminar_tarea() {
        return eliminar_tarea;
    }

    public void setEliminar_tarea(boolean eliminar_tarea) {
        this.eliminar_tarea = eliminar_tarea;
    }
}
