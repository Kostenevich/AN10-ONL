package lesson06.Computer;

public class Computer {
    public String model;
    public int price;
    public RandomAccessMemory randomAccessMemory;
    public HardDisk hardDisk;

    public Computer(String model, int price) {
        this.model = model;
        this.price = price;
        this.randomAccessMemory = new RandomAccessMemory();
        this.hardDisk = new HardDisk();
    }

    public Computer(String model, int price, RandomAccessMemory randomAccessMemory, HardDisk hardDisk) {
        this.model = model;
        this.price = price;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDisk = hardDisk;
    }

    public String getComputerInfo() {
        return "Модель: " + this.model + "\n" +
                "Цена: " + this.price + "\n" +
                this.randomAccessMemory.getRandomAccessMemoryInfo() + "\n" +
                this.hardDisk.getHardDiskInfo();
    }
}
