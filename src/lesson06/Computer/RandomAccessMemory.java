package lesson06.Computer;

public class RandomAccessMemory {
    String randomAccessMemoryName;
    int randomAccessMemoryVolume;

    RandomAccessMemory() {
    }

    public RandomAccessMemory(String randomAccessMemoryName, int randomAccessMemoryVolume) {
        this.randomAccessMemoryName = randomAccessMemoryName;
        this.randomAccessMemoryVolume = randomAccessMemoryVolume;
    }

    public String getRandomAccessMemoryInfo() {
        return "Оперативная память: " + randomAccessMemoryName +
                " Объём " + randomAccessMemoryVolume + "ГБ";
    }
}

