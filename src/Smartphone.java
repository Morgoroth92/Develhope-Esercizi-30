import java.util.Objects;

public class Smartphone implements Cloneable {
    private String brandName;
    private String modelName;
    private int batteryMAh;
    private SmartphonePrice producerPrice;
    private SmartphonePrice retailPrice;

    public Smartphone(String brandName, String modelName, int batteryMAh, SmartphonePrice producerPrice, SmartphonePrice retailPrice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batteryMAh = batteryMAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public String toString() {
        return "Brand is: " + brandName + "\nModel is: " + modelName + "\nBattery capacity is: " + batteryMAh +
                "\nProducer Price is:\n" + producerPrice + "\nRetail Price is:\n" + retailPrice + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Smartphone that)) return false;
        return batteryMAh == that.batteryMAh && Objects.equals(brandName, that.brandName)
                && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice)
                && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batteryMAh, producerPrice, retailPrice);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = this.producerPrice.clone();
        clonedSmartphone.retailPrice = this.retailPrice.clone();
        return clonedSmartphone;
    }
}
