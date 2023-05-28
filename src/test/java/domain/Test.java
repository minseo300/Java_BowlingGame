package domain;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class GameTest {

    @Test
    @DisplayName("게임 세팅 테스트")
    void test() throws IOException {
        // given; 어떠한 데이터가 준비되었을 때
        Game game=new Game();
        int playerCnt=2;
        // when; 어떠한 함수를 실행하면
        game.initialization();
        //then; 어떠한 결과가 나와야 한다.
        assertThat(game.getPlayerList()).isEqualTo(2);
    }


}