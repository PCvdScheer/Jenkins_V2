import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//All test

class PetRockTest {
    private PetRock rocky = new PetRock("Rocky");


    @Test
    void getName() throws Exception {
        assertEquals("Rocky", rocky.getName());
    }


    @Test
    void testUnhappyToStart() throws Exception {
        assertFalse(rocky.isHappy());
    }

    @Test
    public void testHappyAfterPlay() throws Exception{
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }
}