package domain;

import java.util.ArrayList;
import java.util.List;

public class NormalFrame implements Frame{
    List<Integer> pinList=new ArrayList<>();
    ScoreStatus scoreStatus;
    @Override
    public void fallingDown(int pinCnt) {
        pinList.add(pinCnt);
    }

    @Override
    public Status getFrameStatus() {
        int totalPin=0;
        for(Integer pin:pinList){
            totalPin+=pin;
        }
        if(pinList.size()==2&&totalPin==10) return Status.SPARE;
        if(pinList.size()==1&&totalPin==10) return Status.STRIKE;
        if(pinList.size()==2&&totalPin<10) return Status.MISS;
        return Status.OPEN;
    }

    @Override
    public int getFrameScore() {
        return 0;
    }

}
