/* This is a stub for the Library class */

import java.util.Hashtable;
/**
 * Library class for a building that manages a collection of books.
 */
public class Library extends Building implements LibraryRequirements{
  private Hashtable<String, Boolean> collection; //String is key
    
/**
 * Constructor for a Library object
 * @param name the name of the library
 * @param address the address of the library
 * @param nFloors the number of floors in the library
 */
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library");
    }
/**
 * Adds a title to the library's collection
 * @param title the title of the book to add
 */
    public void addTitle(String title){
      collection.put(title, true);
    }

/**
 * Removes a title from the library's collection
 * @param title the title of the book to remove
 */
    public String removeTitle(String title){
      collection.remove(title);
      return(title);
    }

/**
 * Checks out a book from the library
 * @param title the title of the book to check out
 */
    public void checkOut(String title){
      if (!collection.containsKey(title)){
        System.out.println("We do not have that book in our collection");
      }else if(collection.get(title) == false){
        System.out.println("This book has already been checked out!");
      }else{
        collection.put(title, false);
        System.out.println("You've successfully checked out this book!");
      }
    }

    /**
     * Returns a book to the library
     * @param title the title of the book to return
     */
    public void returnBook(String title){
      collection.replace(title, true);
    }

    /**
     * Checks if the library contains a title
     * @param title the title of the book to check
     * @return true if the library contains the title, false otherwise
     */
    public boolean containsTitle(String title){ //key, value
      if(collection.containsKey(title)){
        return true;
      }else{
        return false;
      }
    }

    /**
     * Checks if a title is available for checkout
     * @param title the title of the book to check
     * @return true if the book is available, false otherwise
     */
    public boolean isAvailable(String title){
      if(collection.containsKey(title)){
        System.out.println("Yes it's avaliable!");
        return true;
      }else{
        System.out.println("No this book is not available");
        return false;
      }
    }
/**
 * Prints the entire collection of the library
 */
    public void printCollection(){
     for (int i=0; i< collection.size(); i++){
            System.out.println(collection.toString());
        }
    }
  
    public static void main(String[] args) {
      Library lamont = new Library("Lamont Library", "154 Elm St, Northampton, MA 01063", 3);
      lamont.addTitle("Moby Dick");
      lamont.isAvailable("Moby Dick");
      lamont.printCollection();
  
  }
}