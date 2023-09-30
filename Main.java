// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop (
                "32FaxF2", "XPS 15 9560", 32, 2.0, 0.8);

        System.out.println("Laptop Serial Number: " + laptop1.getSerialNumber());
        System.out.println("Laptop Model Number: " + laptop1.getModelNumber());
        System.out.println("Laptop RAM Size: " + laptop1.getRamSize() + " GB");
        System.out.println("Laptop Main Drive Size: " + laptop1.getMainDriveSize() + " TB");
        System.out.println("Laptop Main Drive Used Size: " + laptop1.getMainDriveUsedSize() + " TB");
        System.out.println("Laptop Main Drive Remaining Size: " + laptop1.getMainDriveRemainingSize() + " TB");
        System.out.println();

        Laptop laptop2 = new Laptop(
                "NP200850", "NP200858-AU10A", 16, 2.5, 1.1);

        System.out.println("Laptop Serial Number: " + laptop2.getSerialNumber());
        System.out.println("Laptop Model Number: " + laptop2.getModelNumber());
        System.out.println("Laptop RAM Size: " + laptop2.getRamSize() + " GB");
        System.out.println("Laptop Main Drive Size: " + laptop2.getMainDriveSize() + " TB");
        System.out.println("Laptop Main Drive Used Size: " + laptop2.getMainDriveUsedSize() + " TB");
        System.out.println("Laptop Main Drive Remaining Size: " + laptop2.getMainDriveRemainingSize() + " TB");

        }
    }