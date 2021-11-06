package edu.nwmissouri.zoo10group;

/**
 *
 * @author Alex Dieringer
 */
public abstract class Animal {

    /**
     * Every animal has a name. Class variable name is not private, but
     * protected - only subclasses can use it.
     */
    protected String name = "no name";

    /**
     * Animals have an associated gender which may be unknown.
     *
     * We limit the choices for selection by using an enum
     */
    protected AnimalGender gender;

    /**
     * Animal constructor
     *
     * @param name - the name of this instance of an animal
     */
    public Animal(String name) {
        this.name = name;
        this.gender = AnimalGender.OTHER;

    }

    /**
     * speak() - general method for animal utterance
     * 
     * @return Returns what the animal speaks as a String
     */
    public String speak() {
        return "Generic animal sound";
    }

    /**
     * move() - general method for animal movement
     * 
     * @return  Returns the animal's movement described as a String
     */
    public String move() {
        return "Generic animal movement";
    }

    /**
     * Get animal's name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the animal gender.
     *
     * @see edu.nwmissouri.zoo10group.AnimalGender
     * @return the gender
     */
    public AnimalGender getGender() {
        return gender;
    }

    /**
     * Set the animal gender using an enum
     *
     * @see edu.nwmissouri.zoo10group.AnimalGender
     * @param gender the gender to set
     */
    public void setGender(AnimalGender gender) {
        this.gender = gender;
    }

    /**
     * Returns a list of the animals within the project as Strings
     * 
     * @return  The array of animal name Strings
     */
    public static String[] getAnimalList() {
        String[] animalList = {
            "Black Panther", "Brachiosaurus", "Elephant Bird", "Glyptodon", "Griffin"
        };
        return animalList;
    }

    /**
     * Returns an animal from getAnimalList() by Index
     * 
     * @param index The index to pull from within the getAnimalList() array
     * @return  Returns the name of animal as a String
     */
    public String getAnimalFromList(int index) {
        String myList[] = getAnimalList();
        int length = myList.length;
        if (index >= 0 && index < length) {
            return myList[index];
        } else if (index < 0) {
            return myList[0];
        } else {
            return myList[length - 1];
        }
    }
}
