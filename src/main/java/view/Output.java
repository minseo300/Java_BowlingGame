package view;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Output {
    private static Output out=new Output();
//    public static List<Player> playerList=new ArrayList<>();

    // 생성자
    private Output(){}
    public static Output getInstance(){
        return out;
    }
    static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

    public static void playerName(int num) throws IOException {
        bw.write(num+1+"번째 플레이어 이름을 입력하세요. ");
        bw.flush();
    }
    public static void playerThrowingBall(String playerName,int frameNum) throws IOException {
        bw.write(playerName+"'s "+frameNum+"번째 프레임: ");
        bw.flush();
    }

    public void printError(String errorMessage) throws IOException {
        bw.write("[ERROR] "+errorMessage+"\n");
        bw.flush();
    }
    public void print(String msg) throws IOException {
        bw.write(msg);
        bw.flush();
    }
}
