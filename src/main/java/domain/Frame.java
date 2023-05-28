package domain;

public interface Frame {
    void fallingDown(int pinCnt);
    Status getFrameStatus();
    int getFrameScore();
}
