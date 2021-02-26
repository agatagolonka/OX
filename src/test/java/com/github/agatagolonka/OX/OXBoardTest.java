package com.github.agatagolonka.OX;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OXBoardTest {


    @Test
    public void testName() {
        OXBoard board = new OXBoard();
        String boardMod = """
              1|2|3 
              4|x|6
              7|8|9
            """;

        board.setBoard('5', 'x');
        Assert.assertEquals(boardMod, board.getBoard());
    }
}