/* This is a stub for the Cafe class */
/**
 * Cafe class for a building that serves coffee.
 */
public class Cafe extends Building implements CafeRequirements{
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;
/**
 * Constructor for a Cafe object
 * @param name the name of the cafe
 * @param address the address of the cafe
 * @param nFloors the number of floors in the cafe
 */
    public Cafe(String name, String address, int nFloors) {
        nCoffeeOunces = 10;
        nSugarPackets = 10;
        nCreams = 10;
        nCups = 10;
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
    }

/**
 * Sells a coffee with the specified size, number of sugar packets, and number of creams
 * @param size the size of the coffee in ounces
 * @param nSugarPackets the number of sugar packets to use
 * @param nCreams the number of creams to use
 */
    public void sellCoffee(int size, int SugarPackets, int Creams){
        if (nCoffeeOunces >= size){
            if(nSugarPackets >= SugarPackets){
                if(nCreams >= Creams){
                    if(nCups >= 1){
                        nCoffeeOunces -= size;
                        nSugarPackets -= SugarPackets;
                        nCreams -= Creams;
                        nCups -= 1;
                        System.out.println("Here's your coffee!");
                        System.out.println("Remaining coffee ounces: " + nCoffeeOunces + ", sugar packets: " + nSugarPackets + ", creams: " + nCreams + ", cups: " + nCups);
                    }else{
                        System.out.println("Sorry, we're out of cups!");
                        restock(nCoffeeOunces,nSugarPackets,nCreams,5);
                    }
                }else{
                    System.out.println("Sorry, we're out of cream!");
                    restock(nCoffeeOunces,nSugarPackets,5,nCups);
                }
            }else{
                System.out.println("Sorry, we're out of sugar!");
                restock(nCoffeeOunces,5,nCreams,nCups);
            }
        }else{
                System.out.println("Sorry, we're out of coffee!");
                restock(5,nSugarPackets,nCreams,nCups);
            }
    }
/**
 * Restocks the cafe's supplies
 * @param nCoffeeOunces the number of coffee ounces to add
 * @param nSugarPackets the number of sugar packets to add
 * @param nCreams the number of creams to add
 * @param nCups the number of cups to add
 */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        System.out.println("Restocking...");
        System.out.println("Current coffee ounces: " + nCoffeeOunces);
        System.out.println("Current sugar packets: " + nSugarPackets);
        System.out.println("Current creams: " + nCreams);
        System.out.println("Current cups: " + nCups);
    }
    
    public static void main(String[] args) {
        new Cafe("Cafe Name", "Cafe Address", 1);
        Cafe myCafe = new Cafe("Sam", "Peekaboo", 1);
        myCafe.sellCoffee(3, 300, 1);
    }
    
}

