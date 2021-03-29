package com.github.agatagolonka.ox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OXBoardTest {


    @Test
    public void testName() {
        OXBoard board = new OXBoard(3);
        String boardMod = """
              1|2|3 
              4|x|6
              7|8|9
            """;

        board.setBoard(15, 'x');
        Assert.assertEquals(boardMod, board.getBoard());
    }
}