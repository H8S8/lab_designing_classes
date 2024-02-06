public class Computer {

    private int storage;
    private String printerModel;

    public Computer(int inputStorage, String inputPrinterModel){
        this.storage = inputStorage;
        this.printerModel = inputPrinterModel;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getPrinterModel() {
        return printerModel;
    }

    public void setPrinterModel(String printerModel) {
        this.printerModel = printerModel;
    }

    public void addStorage(int additionalStorage){
        this.storage += additionalStorage;
    }
}
