import Tournament_pk.Player;
import Tournament_pk.Team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*Team teamA = new Team("Equipo A");
        System.out.println(teamA.getName());*/

        Player teacher = new Player();
        ArrayList<Player> playersA = new ArrayList<>();

        Team teamA= new Team("Equipo A", playersA);
        System.out.println(teamA.getName())

        teamA.getPlayers().forEach(player -> {
            System.out.println(player.getName());
        }); // foreach permite recorrer el array */

        }
    }
