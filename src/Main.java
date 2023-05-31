import tournament_pk.Player;
import tournament_pk.Team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*Team teamA = new Team("Equipo A");
        System.out.println(teamA.getName());*/

        Player teacher = new Player("Teacher");
        Player student1 = new Player("student1");
        ArrayList<Player> playersA = new ArrayList<>();

        playersA.add(teacher);
        playersA.add(student1);

        Team teamA= new Team("Equipo A", playersA);
        System.out.println(teamA.getName());

        teamA.getPlayers().forEach(player -> {
            System.out.println(player.getName());
        }); // foreach permite recorrer el array */

        }
    }
