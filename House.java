/* This is a stub for the House class */
import java.util.ArrayList;
import java.util.List;

public class House extends Building implements HouseRequirements{
  private int nResidents;
  private boolean hasDiningRoom;
  private ArrayList<Student> residents;

  public House(String name, String address, int nFloors, int nResidents, boolean hasDiningRoom) {
    this.nResidents = nResidents;
    this.hasDiningRoom = hasDiningRoom;
    super(name, address, nFloors);
    this.residents = new ArrayList<>();
    System.out.println("You have built a house");
  }

  public int nResidents(){
    return nResidents;
  }

  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }

  public void moveIn(Student s){
    if (residents.contains(s)){
      System.out.println("Resident already moved in!");
    }else{
      residents.add(s);
    }
  }

  public Student moveOut(Student s){
    if(residents.contains(s)){
      residents.remove(s);
      return(s);
    }else{
      System.out.println("Student does not live here");
      return(s);
    }
  }

  public boolean isResident(Student s){
    if(residents.contains(s)){
      return(true);
    }else{
      return(false);
    }
  }
  
  public static void main(String[] args) {
    new House("Haven", "1 Chapin Way", 3, 75, false);
  }
}