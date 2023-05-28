package view;

import exception.PlayerCntException;
import exception.PlayerNameException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    private static Input in=new Input();

    // 생성자
    Input(){}
    public static Input getInstance(){
        return in;
    }
    static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    public static int playerCnt() throws IOException {
        return Integer.parseInt(br.readLine());
    }
    public static String playerName() throws IOException {
        String name=br.readLine();
        return name;
    }
    public static int pinCnt() throws IOException {
        return Integer.parseInt(br.readLine());
    }
    public void validatePlayerCnt(int playerCnt) throws PlayerCntException {
        if(playerCnt<=0||playerCnt>6){
            throw new PlayerCntException("잘못된 인원 수를 입력하였습니다.");
        }
    }
    public void validatePlayerName(String name) throws PlayerNameException{
        if(name.length() <= 0 ||name.length()>3){
            throw new PlayerNameException("잘못된 플레이어 이름을 입력하였습니다.");
        }
    }
}
