public class Computer {

    private double storage;
    private String printerModel;

    public Computer(double inputStorage, String inputPrinterModel){
        this.storage = inputStorage;
        this.printerModel = inputPrinterModel;
    }

    public double getStorage() {
        return storage;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }

    public String getPrinterModel() {
        return printerModel;
    }

    public void setPrinterModel(String printerModel) {
        this.printerModel = printerModel;
    }
}
