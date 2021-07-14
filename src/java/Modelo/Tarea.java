package Modelo;

public class Tarea {
    int id_tarea;
    String nombre_tarea;
    boolean tarea_realizado;
    String fecha_hora;
    boolean eliminar;

    public Tarea(){

    }
    
    public Tarea(int id_tarea, String nombre_tarea, boolean tarea_realizado, String fecha_hora, boolean eliminar) {
        this.id_tarea = id_tarea;
        this.nombre_tarea = nombre_tarea;
        this.tarea_realizado = tarea_realizado;
        this.fecha_hora = fecha_hora;
        this.eliminar = eliminar;
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

    public boolean isEliminar() {
        return eliminar;
    }

    public void setEliminar(boolean eliminar) {
        this.eliminar = eliminar;
    }
}
