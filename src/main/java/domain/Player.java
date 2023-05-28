package domain;

import view.Input;
import view.Output;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    List<Frame> frameList=new ArrayList<>();
    Input in=Input.getInstance();
    Output out=Output.getInstance();
    public Player(String name){
        this.name=name;
        for(int i=0;i<9;i++) frameList.add(new NormalFrame());
        frameList.add(new FinalFrame());
    }
    public String getName(){
        return this.name;
    }
    // 투구
    public void throwBall(int frameNum) throws IOException {
        Frame frame=frameList.get(frameNum-1);
        Status frameStatus=frame.getFrameStatus();
        while(frameStatus==Status.OPEN){
            out.playerThrowingBall(this.name,frameNum);
            frame.fallingDown(in.pinCnt());
            frameStatus=frame.getFrameStatus();
        }
        frame.getFrameScore();
    }
}
