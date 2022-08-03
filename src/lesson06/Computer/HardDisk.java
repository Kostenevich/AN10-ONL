package lesson06.Computer;

public class HardDisk {
    String hardDiskName;
    int hardDiskVolume;
    String hardDiskType;

    HardDisk() {
    }

    public HardDisk(String hardDiskName, int hardDiskVolume, String hardDiskType) {
        this.hardDiskName = hardDiskName;
        this.hardDiskVolume = hardDiskVolume;
        this.hardDiskType = hardDiskType;
    }

    public String getHardDiskInfo() {
        return hardDiskType +
                " накопитель: " + hardDiskName +
                " Объём " + hardDiskVolume + "ГБ";
    }
}


