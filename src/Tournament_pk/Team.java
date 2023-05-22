package Tournament_pk;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player>players;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    Team(){
        setPlayers(new ArrayList<>());
        setName("");
    }

    private Team(String name) {
        setPlayers(ArrayList<Player>players);
        setName("");
    }

    private Team(String name, ArrayList<Player>players){
        setName(name);
        setPlayers(players);
    }
}
