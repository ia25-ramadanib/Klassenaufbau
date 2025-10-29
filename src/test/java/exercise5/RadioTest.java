package exercise5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    private Radio radio;

    @BeforeEach
    void setUp() {
        radio = new Radio(false, 40, 100);
    }



    @Test
    void testConstructorInitialValues() {
        assertFalse(radio.isOn);
        assertEquals(40, radio.getVolume());
        assertEquals(100.0, radio.getFrequenzy());

    }

    @Test
    void testIncreaseVolumeWhenOn() {
        radio.isOn = true;
        int oldVolume = radio.getVolume();
        radio.increaseVolume();
        assertEquals(oldVolume + 1, radio.getVolume());
    }

    @Test
    void testIncreaseVolumeWhenOff() {
        radio.isOn = false;
        int oldVolume = radio.getVolume();
        radio.increaseVolume();
        // Laut Code: Wenn Radio aus ist, bleibt Lautstärke gleich
        assertEquals(oldVolume, radio.getVolume(), "Volume should not change when radio is off");
    }

    @Test
    void testDecreaseVolumeWhenOn() {
        radio.isOn = true;
        radio.volume = 10;
        radio.decreaseVolume();
        assertEquals(9, radio.getVolume());
    }

    @Test
    void testSelectValidChannel() {
        radio.isOn = true;
        radio.selectChannel(100.5);
        assertEquals(100.5, radio.getFrequenzy());
    }

    @Test
    void testSelectInvalidChannel() {
        radio.isOn = true;
        double oldFreq = radio.getFrequenzy();
        radio.selectChannel(120.0); // außerhalb 80–110 MHz
        assertEquals(oldFreq, radio.getFrequenzy(), "Frequency should not change for invalid input");
    }

    @Test
    void testToStringContainsState() {
        String str = radio.toString();
        assertTrue(str.contains("isOn="));
        assertTrue(str.contains("volume="));
        assertTrue(str.contains("frequenzy="));
    }

}
