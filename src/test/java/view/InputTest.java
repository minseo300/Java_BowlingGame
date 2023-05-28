package view;

import exception.PlayerCntException;
import exception.PlayerNameException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {

    @Test
    @DisplayName("플레이어 인원 입력 예외 테스트")
    void inputInvalidPlayerCntTest(){
        // given; 어떠한 데이터가 준비되었을 때
        int playerCnt=7;
        Input input=new Input();
        // when; 어떠한 함수를 실행하면
        // then; 어떠한 결과가 나와야 한다.
        Assertions.assertThrows(PlayerCntException.class,()->{
            input.validatePlayerCnt(playerCnt);
        });
    }

    @Test
    @DisplayName("플레이어 이름 입력 예외 테스트")
    void inputInvalidPlayerNameTest(){
        // given
        String name="abcde";
        Input input=new Input();
        // when
        // then
        Assertions.assertThrows(PlayerNameException.class,()->{
            input.validatePlayerName(name);
        });
    }

}