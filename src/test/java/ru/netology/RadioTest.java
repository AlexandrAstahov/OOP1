package ru.netology;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    public void shouldSetNumberStation(){
        Radio radio = new Radio(50);
        radio.setNumberStation(45);
        assertEquals(45, radio.getNumberStation());
    }

    @Test
    public void shouldSetNumberStationAboveRange(){
        Radio radio = new Radio(50);
        radio.setNumberStation(51);
        assertEquals(49, radio.getNumberStation());

    }

    @Test
    public void shouldSetNumberStationBelowRange(){
        Radio radio = new Radio(50);
        radio.setNumberStation(-1);
        assertEquals(0, radio.getNumberStation());

    }

    @Test
    public void shouldUpNumberStation(){
        Radio radio = new Radio(50);
        radio.setNumberStation(45);
        radio.upNumberStation();
        assertEquals(46, radio.getNumberStation());
    }

    @Test
    public void  shouldUpNumberStationIfMax (){
        Radio radio = new Radio(50);
        radio.setNumberStation(50);
        radio.upNumberStation();
        assertEquals(0, radio.getNumberStation());
    }

    @Test
    public void shouldDownNumberStation(){
        Radio radio = new Radio(65);
        radio.setNumberStation(45);
        radio.downNumberStation();
        assertEquals(44, radio.getNumberStation());
    }

    @Test
    public void shouldDownNumberStationIfMin(){
        Radio radio = new Radio(65);
        radio.setNumberStation(0);
        radio.downNumberStation();
        assertEquals(64, radio.getNumberStation());
    }


    @Test
    public void  shouldUpVolume (){
        radio.setVolume(54);
        radio.upVolume();
        assertEquals(55, radio.getVolume());
    }

    @Test
    public void  shouldUpVolumeAboveRange (){
        radio.setVolume(101);
        radio.upVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void  shouldUpVolumeBelowRange () {
        radio.setVolume(-1);
        radio.upVolume();
        assertEquals(1, radio.getVolume());
    }

    @Test
    public void  shouldDownVolume (){
        radio.setVolume(67);
        radio.downVolume();
        assertEquals(66, radio.getVolume());
    }

    @Test
    public void  shouldDownVolumeAboveRange (){
        radio.setVolume(101);
        radio.downVolume();
        assertEquals(99, radio.getVolume());
    }

    @Test
    public void  shouldDownVolumeBelowRange (){
        radio.setVolume(-1);
        radio.downVolume();
        assertEquals(0, radio.getVolume());
    }
}