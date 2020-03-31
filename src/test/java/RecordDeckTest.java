import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void setUp(){
        recordDeck = new RecordDeck("Technics", 8,16, "The Birdie Song", false);
    }

    @Test
    public void canGetName(){
        assertEquals("Technics", recordDeck.getName());
    }

    @Test
    public void canGetVolume(){
        assertEquals(8, recordDeck.getVolume(),0.01);
    }
    @Test
    public void canPlayRecord(){
        recordDeck.Play("The Birdie Song");
        assertEquals(true, recordDeck.getIsPlaying());
    }


}
