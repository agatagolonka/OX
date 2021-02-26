package com.github.agatagolonka.OX;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OXMoveTest {

    @Test
    public void testGetSign() {
        char test ='x';
        OXMove tested= new OXMove();
        tested.setSign('x');
        Assert.assertEquals('x', tested.getSign());
    }

    @Test
    public void testChangePlayer() {
        OXMove tested= new OXMove();
        char test ='x';
        tested.setSign('x');
        tested.changePlayer();
        Assert.assertEquals('o', tested.getSign());
    }
}