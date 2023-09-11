public class Tester {
    public static void main(String[] args) {
        SmartphonePrice producerPrice1 = new SmartphonePrice("Producer", 500);
        SmartphonePrice retailPrice1 = new SmartphonePrice("Retail", 1300);
        SmartphonePrice producerPrice2 = new SmartphonePrice("Producer", 600);
        SmartphonePrice retailPrice2 = new SmartphonePrice("Retail", 1100);

        Smartphone smartphone1 = new Smartphone("Apple", "iPhone 14", 3150, producerPrice1, retailPrice1);
        Smartphone smartphone2 = new Smartphone("Samsung", "S23+", 4550, producerPrice2, retailPrice2);

        System.out.println("Specs of first Smartphone are:\n" + smartphone1 + "\n");
        System.out.println("Specs of second Smartphone are:\n" + smartphone2 + "\n");

        System.out.println("Are the two smartphones equals? " + smartphone1.equals(smartphone2));

        try {
            Smartphone clonedSmartphone = smartphone2.clone();
            System.out.println("Specs of cloned Smartphone are:\n" + clonedSmartphone);
            System.out.println("Is the second smartphone equal to the cloned smartphone? " + smartphone2.equals(clonedSmartphone));
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Error occurred while cloning the smartphone.");
        }
    }
}
