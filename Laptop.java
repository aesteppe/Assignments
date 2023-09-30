public class Laptop {
    private String serialNumber;
    private String modelNumber; //must take spaces and special characters
    private int ramSize;
    private double mainDriveSize; //one decimal place
    private double mainDriveUsedSize; //one decimal place

    //Constructor to call when new Laptop object created
    public Laptop(String serialNumber, String modelNumber, int ram, double hdTB, double uHDTB) {
        this.serialNumber = serialNumber;
        this.modelNumber = modelNumber;
        this.ramSize = ram;
        this.mainDriveSize = hdTB;
        this.mainDriveUsedSize = uHDTB;
    }

    //Call functions - assumed values have been initialized
    public String getSerialNumber() {
        return serialNumber;
    }
    public String getModelNumber() {
        return modelNumber;
    }
    public int getRamSize() {
        return ramSize;
    }
    public double getMainDriveSize() {
        return mainDriveSize;
    }
    public double getMainDriveUsedSize() {
        return mainDriveUsedSize;
    }
    public double getMainDriveRemainingSize() {
        return (mainDriveSize - mainDriveUsedSize);
    }

}
