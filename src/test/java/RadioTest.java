import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void setUp(){
        radio = new Radio("Radio 1");
    }
    @Test
    public void canGetRadioStation(){
        assertEquals("Radio 1", radio.getTune());
    }
}
