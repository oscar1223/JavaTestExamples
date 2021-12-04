package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    private BowlingGame bowlingGame;

    @Before
    public void setUp() throws Exception{
        bowlingGame = new BowlingGame();
    }

    @Test
    public void testOneStrike() throws Exception{
        bowlingGame.roll(20);
        bowlingGame.roll(4);
        rollMany(16, 0);
        assertEquals(24, bowlingGame.score());
    }

    @Test
    public void testGutterGame() throws Exception{
        rollMany(20,0);
        assertEquals(0, bowlingGame.score());
    }

    @Test
    public void testAllOnes() throws Exception{
        rollMany(20, 1);
        assertEquals(20, bowlingGame.score());
    }

    @Test
    public void testOneSpare() throws Exception {
        bowlingGame.roll(20);
        bowlingGame.roll(4);
        rollMany(16, 0);
        assertEquals(24, bowlingGame.score());
    }

    @Test
    public void testPerfectGame() throws Exception {
        rollMany(12, 10);
        assertEquals(120, bowlingGame.score());

    }


    private void rollMany(int n, int pins){
        for(int i = 0; i<n ; i++ ){
            bowlingGame.roll(pins);
        }
    }

    private void rollSpare() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);
    }

    private void rollStrike() {
        bowlingGame.roll(10);

    }


}
