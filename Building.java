/**
 * This is a stub for the Building class
 */
public class Building implements BuildingRequirements {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;

    /**
     * Constructor for a Building, basis for other buildings
     * @param name the name of the building
     * @param address the address of the building
     * @param nFloors the number of floors in the building
     */ 
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * Getter for the name of the building
     * @return the name of the building
     */
    public String getName() {
        return this.name;
    }
/**
 * Getter for the address of the building
 * @return the address of the building
 */
    public String getAddress() {
        return this.address;
    }
/**
 * Getter for the number of floors in the building
 * @return the number of floors in the building
 */
    public int getFloors() {
        return this.nFloors;
    }
/**
 * String representation of the building
 * @return a string describing the building
 */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}
