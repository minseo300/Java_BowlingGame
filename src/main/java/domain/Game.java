package domain;

import exception.PlayerNameException;
import view.Input;
import view.Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Game {

    List<Player> playerList=new ArrayList<>();
    Output out=Output.getInstance();
    Input in=Input.getInstance();
    Board board=Board.getInstance();
    // 게임 초기화 - player 인원수, 이름을 입력 받음.
    public void initialization() throws IOException {
        out.print("볼링 게임을 시작합니다.\n 게임 참여 인원수를 입력해주세요.");
        int playerCnt=in.playerCnt();
        for(int i=0;i<playerCnt;i++){
            out.playerName(i);
            Player player=new Player(in.playerName());
            playerList.add(player);
        }
        board.setPlayers(playerList);
    }
    // 게임 시작
    public void start() throws IOException {
        // player 투구 시작
        for(int i=1;i<=10;i++){
            for(Player p:playerList) {
                p.throwBall(i);
                board.showBoard();
            }
        }

    }

    public List<Player> getPlayerList(){
        return this.playerList;
    }

}
