import java.util.Scanner;

public class Partidos {
    Scanner s = new Scanner(System.in);
    Equipos equipo1 = new Equipos();
    Equipos equipo2 = new Equipos();
    int golesEquipo1;
    int golesEquipo2;

    public void Partido(){
        Bienvenida();
        System.out.println("FINALIZO EL PARTIDO!");
        System.out.println("Resultado:");
        golesEquipo1 = s.nextInt();
        golesEquipo2 = s.nextInt();
        Marcador(golesEquipo1, golesEquipo2);
    }

    private void Bienvenida() {
        System.out.println("Ingresar nombre de equipo 1: ");
        String nombreEquipo1 = s.next();
        equipo1.setNombreEquipo(nombreEquipo1);

        System.out.println("Ingresar nombre de equipo 2: ");
        String nombreEquipo2 = s.next();
        equipo2.setNombreEquipo(nombreEquipo2);
    }

    private void Marcador(int golesEquipo1, int golesEquipo2) {
        if (golesEquipo1 == golesEquipo2){
            System.out.println("EL PARTIDO FINALIZO EN EMPATE");
        } else {
            if (golesEquipo1 > golesEquipo2) {
                System.out.println("GANO " + equipo1.getNombreEquipo());
            }
            else {
                System.out.println("GANO " + equipo2.getNombreEquipo());
            }
        }
    }
    
}
