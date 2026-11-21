package pe.edu.pucp.iweb;

public class Dto {
    private String sedeNombre;
    private int totalEquipos;
    private Estado operativos;
    private Estado caidos;

    public Dto() {}

    public Dto(String sedeNombre, int totalEquipos, Estado operativos, Estado caidos) {
        this.sedeNombre = sedeNombre;
        this.totalEquipos = totalEquipos;
        this.operativos = operativos;
        this.caidos = caidos;
    }

    public String getSedeNombre() {
        return sedeNombre;
    }

    public void setSedeNombre(String sedeNombre) {
        this.sedeNombre = sedeNombre;
    }

    public int getTotalEquipos() {
        return totalEquipos;
    }

    public void setTotalEquipos(int totalEquipos) {
        this.totalEquipos = totalEquipos;
    }

    public Estado getOperativos() {
        return operativos;
    }

    public void setOperativos(Estado operativos) {
        this.operativos = operativos;
    }

    public Estado getCaidos() {
        return caidos;
    }

    public void setCaidos(Estado caidos) {
        this.caidos = caidos;
    }
}