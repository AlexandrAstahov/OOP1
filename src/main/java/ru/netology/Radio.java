package ru.netology;

public class Radio {
    private int amountStation = 10;
    private int numberStation;
    private int maxNumberStation = amountStation - 1;
    private int minNumberStation = 0;
    private int volume;
    private int maxVolume = 100;
    private int minVolume;

    public Radio (){}

    public Radio(int amountStation) {
        this.amountStation = amountStation;
        this.maxNumberStation = amountStation - 1;

    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation > maxNumberStation) {
            numberStation = maxNumberStation;
        }
        if (numberStation < minNumberStation) {
            numberStation = minNumberStation;
        }
        this.numberStation = numberStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > maxVolume) {
            volume = maxVolume;

        }
        if (volume < minVolume) {
            volume = minVolume;

        }
        this.volume = volume;
    }

    public void upNumberStation() {
        if (numberStation == maxNumberStation) {
            numberStation = 0;
            return;
        }
            numberStation = numberStation + 1;
    }

    public void downNumberStation() {
        if (numberStation == minNumberStation) {
            numberStation = maxNumberStation;
            return;
        }
            numberStation = numberStation - 1;
    }

    public void upVolume() {
        if (volume < maxVolume) {
            volume = volume + 1;
        }
    }

    public void downVolume() {
        if (volume > minVolume) {
            volume = volume - 1;
        }
    }
}