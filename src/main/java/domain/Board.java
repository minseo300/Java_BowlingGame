package domain;

import java.util.List;

public class Board {
    private static Board board=new Board();
    private Board(){}
    public static Board getInstance(){return board;}
    List<Player> playerList;
    private String header="| NAME | 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 | 10 |";
    public void setPlayers(List<Player> playerList){
        this.playerList=playerList;
    }
    public void showBoard(){

    }
}
