public class Equipos {

    String nombreEquipo;
    int puntos;
    int cantidadPartidosGanados;
    int cantidadPartidosEmpatados;
    int cantidadPartidosPerdidos;
    int cantidadGolesRealizados;
    int getCantidadGolesRecibidos;
    int posicion;

    public Equipos(){

    }
    public Equipos(String nombreEquipo, int puntos, int cantidadPartidosGanados, int cantidadPartidosEmpatados, int cantidadPartidosPerdidos, int cantidadGolesRealizados, int getCantidadGolesRecibidos, int posicion) {
        this.nombreEquipo = nombreEquipo;
        this.puntos = puntos;
        this.cantidadPartidosGanados = cantidadPartidosGanados;
        this.cantidadPartidosEmpatados = cantidadPartidosEmpatados;
        this.cantidadPartidosPerdidos = cantidadPartidosPerdidos;
        this.cantidadGolesRealizados = cantidadGolesRealizados;
        this.getCantidadGolesRecibidos = getCantidadGolesRecibidos;
        this.posicion = posicion;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getCantidadPartidosGanados() {
        return cantidadPartidosGanados;
    }

    public void setCantidadPartidosGanados(int cantidadPartidosGanados) {
        this.cantidadPartidosGanados = cantidadPartidosGanados;
    }

    public int getCantidadPartidosEmpatados() {
        return cantidadPartidosEmpatados;
    }

    public void setCantidadPartidosEmpatados(int cantidadPartidosEmpatados) {
        this.cantidadPartidosEmpatados = cantidadPartidosEmpatados;
    }

    public int getCantidadPartidosPerdidos() {
        return cantidadPartidosPerdidos;
    }

    public void setCantidadPartidosPerdidos(int cantidadPartidosPerdidos) {
        this.cantidadPartidosPerdidos = cantidadPartidosPerdidos;
    }

    public int getCantidadGolesRealizados() {
        return cantidadGolesRealizados;
    }

    public void setCantidadGolesRealizados(int cantidadGolesRealizados) {
        this.cantidadGolesRealizados = cantidadGolesRealizados;
    }

    public int getGetCantidadGolesRecibidos() {
        return getCantidadGolesRecibidos;
    }

    public void setGetCantidadGolesRecibidos(int getCantidadGolesRecibidos) {
        this.getCantidadGolesRecibidos = getCantidadGolesRecibidos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
