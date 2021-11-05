package edu.nwmissouri.zoo10group;

/**
 *
 * @author Hemanth Sai Reddy Velamuri
 */
public class BlackPanther extends Animal implements Runnable {

    /**
     * String declaration.
     *
     * @param name
     */
    
    private final String Group_Name;
    private final String Eye_Color;
    private final String Nativity;
    private final int AvgSpeed;
    private final boolean IsCarnivores;
    
    /**
     *
     * @param name
     */
    public BlackPanther(String name) {
        super(name);
        
        this.Group_Name = "Cat";
        this.Eye_Color = "Green";
        this.Nativity = "Asia";
        this.AvgSpeed = 56;
        this.IsCarnivores = true;
        
              
    }
    
    /******************************
     * SUPERCLASS FUNCTION OVERRIDES
     *******/

    /**
     * BlackPanther Speak
     *
     * @return 
     */
    @Override
    public String speak() {
        String roar = "I am a BlackPanther I roar very loud, but I am" + "more aggressive!!";
        return roar;
    }

    /**
     *
     * BlackPanther move
     * @return 
     */
    @Override
    public String move() {
        String chase = "I can run faster on land" + "I can chase faster on trees!";
        return chase;
    }

    /**
     *
     */
    @Override
    public void run() {
        System.out.println("Hello, my name is : " + getName() + "!");

        System.out.println(speak());
        System.out.println(move());

        System.out.println("\nMy group is called " + getGroup_Name());;
        System.out.println("Color of my Eye is: " + getEye_Color());
        System.out.println("My nativity belongs to: " + getNativity());
        System.out.println("The average speed I can run " + getAvgSpeed());
        String isCarnovorus = (isIsCarnivores()) ? "yes" : "no";
       

        System.out.println("Can you find me out in the wild? The answer is "
                + isCarnovorus);
        System.out.println(speak());
        System.out.println(move());
   
    }

    /**
     * getGroupName() - Returns the animal's group name
     *
     * @return The name of the animal's group as a String
     */
    public String getGroup_Name() {
        return Group_Name;
    }

    /**
     * getEyecolor() - Returns the eye color of my animal
     *
     * @return The color of the animal's eye
     */
    public String getEye_Color() {
        return Eye_Color;
    }

    /**
     * getNativity() - Returns the animal's nativity
     *
     * @return The nativity of the animal as a String
     */
    public String getNativity() {
        return Nativity;
    }

    /**
     * getAvegSpeed() -Returns the animal's average speed
     *
     * @return The average speed of the animal as a int
     */
    public int getAvgSpeed() {
        return AvgSpeed;
    }

    /**
      * getIsCarnivores() - Returns whether the animal is carnivores or not
     *
     * @return Returns true or false on whether the animal is carnivores
     */
    public boolean isIsCarnivores() {
        return IsCarnivores;
    }

}
