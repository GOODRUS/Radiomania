public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxStation;

    public Radio(int size) {
        maxStation = size - 1;
    }

    public Radio() {
        maxStation = 9;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void next() {
        if (currentRadioStation < maxStation) {
            currentRadioStation++;
            return;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxStation;
        }
    }

    public void setRadioStation(int newCurrentRadioStation) {

        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > maxStation) {
            return;
        }
        this.currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }
}
