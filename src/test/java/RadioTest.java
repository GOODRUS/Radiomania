import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    /* Установка максимального значения при запуске метода "Next" */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationMax() {

        Radio switcher = new Radio();
        switcher.setRadioStation(9);

        switcher.next();

        int actual = 0;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка минимального значения при запуске метода "Next" */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationMin() {

        Radio switcher = new Radio();
        switcher.setRadioStation(0);

        switcher.next();

        int actual = 1;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значения за пределами максимального при запуске метода "Next" */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationInRange() {

        Radio switcher = new Radio();
        switcher.setRadioStation(6);

        switcher.next();

        int actual = 7;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значения за пределами максимального при запуске метода "Next" */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationInRangeWithoutMethodMax() {

        Radio switcher = new Radio(15);
        switcher.setRadioStation(14);


        int actual = 14;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationInRangeWithoutMethodMin() {

        Radio switcher = new Radio(15);
        switcher.setRadioStation(0);


        int actual = 0;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationInRangeWithoutMethodInRange() {

        Radio switcher = new Radio(15);
        switcher.setRadioStation(8);


        int actual = 8;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка максимального значения при запуске метода "Next" c указанием размера */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationMaxSize() {

        Radio switcher = new Radio(15);
        switcher.setRadioStation(14);

        switcher.next();

        int actual = 0;
        int expected = switcher.getCurrentRadioStation();


        assertEquals(expected, actual);
    }

    /* Установка минимального значения при запуске метода "Next" c указанием размера */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationMinSize() {

        Radio switcher = new Radio(15);
        switcher.setRadioStation(0);

        switcher.next();

        int actual = 1;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationInRangeSize() {

        Radio switcher = new Radio(15);
        switcher.setRadioStation(11);

        switcher.next();

        int actual = 12;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка максимального значения при запуске метода "Prev" */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationMax() {

        Radio switcher = new Radio();
        switcher.setRadioStation(9);

        switcher.prev();

        int actual = 8;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка минимального значения при запуске метода "Prev" */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationMin() {

        Radio switcher = new Radio();
        switcher.setRadioStation(0);

        switcher.prev();

        int actual = 9;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значений в пределах диапазона при запуске метода "Prev" */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationOverInRange() {

        Radio switcher = new Radio();
        switcher.setRadioStation(6);

        switcher.prev();

        int actual = 5;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка максимального значения при запуске метода "Prev" c указанием размера */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationMaxSize() {

        Radio switcher = new Radio(15);
        switcher.setRadioStation(14);

        switcher.prev();

        int actual = 13;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка минимального значения при запуске метода "Prev" c указанием размера */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationMinSize() {

        Radio switcher = new Radio(15);
        switcher.setRadioStation(0);

        switcher.prev();

        int actual = 14;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значений в пределах диапазона при запуске метода "Prev" c указанием размера */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationOverInRangeSize() {

        Radio switcher = new Radio(15);
        switcher.setRadioStation(12);

        switcher.prev();

        int actual = 11;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка максимального значения звука при переключении на один */

    @Test
    public void shouldIncreaseVolumeOnOneMax() {

        Radio switcher = new Radio();
        switcher.setCurrentVolume(100);

        switcher.increaseVolume();

        int actual = 100;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка минимального значения звука при переключении на один */

    @Test
    public void shouldIncreaseVolumeOnOneMin() {

        Radio switcher = new Radio();
        switcher.setCurrentVolume(0);

        switcher.increaseVolume();

        int actual = 1;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка значения звука в пределах диапазона при переключении на один */

    @Test
    public void shouldIncreaseVolumeOnOneInRange() {

        Radio switcher = new Radio();
        switcher.setCurrentVolume(5);

        switcher.increaseVolume();

        int actual = 6;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка максимального значения звука при возврате на один */

    @Test
    public void shouldDecreaseVolumeOnOneMax() {

        Radio switcher = new Radio();
        switcher.setCurrentVolume(100);

        switcher.decreaseVolume();

        int actual = 99;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка минимального значения звука при возврате на один */

    @Test
    public void shouldDecreaseVolumeOnOneMin() {

        Radio switcher = new Radio();
        switcher.setCurrentVolume(0);

        switcher.decreaseVolume();

        int actual = 0;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка значения звука в пределах диапазона при возврате на один */

    @Test
    public void shouldDecreaseVolumeOnOneInRange() {

        Radio switcher = new Radio();
        switcher.setCurrentVolume(5);

        switcher.decreaseVolume();

        int actual = 4;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Для покрытия 100% по бранчам */

    /* Установка значения за пределами максимального при запуске метода "Next" */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationOverMax() {

        Radio switcher = new Radio();
        switcher.setRadioStation(10);

        switcher.next();

        int actual = 1;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationOverMaxMax() {

        Radio switcher = new Radio();
        switcher.setRadioStation(11);

        switcher.next();

        int actual = 1;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значения за пределами минимального при запуске метода "Next" */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationOverMin() {

        Radio switcher = new Radio();
        switcher.setRadioStation(-1);

        switcher.next();

        int actual = 1;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationOverMax() {

        Radio switcher = new Radio();
        switcher.setRadioStation(10);

        switcher.prev();

        int actual = 9;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значения за пределами минимального при запуске метода "Prev" */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationOverMin() {

        Radio switcher = new Radio();
        switcher.setRadioStation(-1);

        switcher.prev();

        int actual = 9;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значения звука за пределом максимума при переключении на один */

    @Test
    public void shouldIncreaseVolumeOnOneOverMax() {

        Radio switcher = new Radio();
        switcher.setCurrentVolume(11);

        switcher.increaseVolume();

        int actual = 12;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка значения звука за пределом минимума при переключении на один */

    @Test
    public void shouldIncreaseVolumeOnOneOverMin() {

        Radio switcher = new Radio();
        switcher.setCurrentVolume(-1);

        switcher.increaseVolume();

        int actual = 1;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка значения звука за пределом максимума при возврате на один */

    @Test
    public void shouldDecreaseVolumeOnOneOverMax() {

        Radio switcher = new Radio();
        switcher.setCurrentVolume(101);

        switcher.decreaseVolume();

        int actual = 0;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка значения звука за пределом минимума при возврате на один */

    @Test
    public void shouldDecreaseVolumeOnOneOverMin() {

        Radio switcher = new Radio();
        switcher.setCurrentVolume(-1);

        switcher.decreaseVolume();

        int actual = 0;
        int expected = switcher.getCurrentVolume();

        assertEquals(expected, actual);
    }

    /* Установка значения за пределами максимального при запуске метода "Next" c указанием размера */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationOverMaxSize() {

        Radio switcher = new Radio(15);
        switcher.setRadioStation(15);

        switcher.next();

        int actual = 1;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationOverMaxMaxSize() {

        Radio switcher = new Radio(15);
        switcher.setRadioStation(16);

        switcher.next();

        int actual = 1;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значения за пределами минимального при запуске метода "Next" c указанием размера */

    @Test
    public void shouldSetNextNumberOfCurrentRadioStationOverMinSize() {

        Radio switcher = new Radio(15);
        switcher.setRadioStation(-1);

        switcher.next();

        int actual = 1;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значения за пределами максимального при запуске метода "Prev" c указанием размера */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationOverMaxSize() {

        Radio switcher = new Radio(15);
        switcher.setRadioStation(15);

        switcher.prev();

        int actual = 14;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    /* Установка значения за пределами минимального при запуске метода "Prev" c указанием размера */

    @Test
    public void shouldSetPrevNumberOfCurrentRadioStationOverMinSize() {

        Radio switcher = new Radio(15);
        switcher.setRadioStation(-1);

        switcher.prev();

        int actual = 14;
        int expected = switcher.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
}

