package edu.nwmissouri.zoo10group;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.lang.reflect.Method;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller that handles the default request ("/").
 *
 * Use the new Java 15 text blocks to provide our menu. Thymeleaf:
 * https://spring.io/guides/gs/serving-web-content/
 *
 * @author Alex Dieringer
 */
@Controller
public class ZooIndexController {

    private static final String GREETING_MESSAGE = "Welcome to Group 10's Zoo!";
    private static final String GOODBYE_MESSAGE = "Thank you for visiting Group 10's Zoo!";
    private static final int ANIMAL_TOTAL = 5;


    /**
     * Map GET request to "/" to index().
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/")
    public String index(
            @RequestParam(name = "id", required = false, defaultValue = "0") String idParam,
            Model model) {
        model.addAttribute("id", idParam);
        model.addAttribute("greeting", GREETING_MESSAGE);
        return "index";
    }
    
    
    /**
     * Map GET request to "/zoo" to zoo().
     *
     * @param idParam - the animal's ID
     * @param model - the model that holds info from controller to view
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/zoo")
    public String zoo(
            @RequestParam(name = "id", required = false, defaultValue = "0") String idParam,
            Model model) {
        model.addAttribute("id", idParam);
        model.addAttribute("greeting", GREETING_MESSAGE);
        model.addAttribute("animalMap", getAllAnimalMap());
        model.addAttribute("animalOutput", getAnimalOutput(idParam));
        // associated with index.hmtl in src/main/resources/templates
        return "zoo";
    }

    /**
     * Map GET request to "/about" to about().
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/about")
    public String about() {
        return "about";
    }

    /**
     * Map GET request to "/employee" to employee().
     *
     * @param typeParam - the type of person provided in the URL
     * @param model - the model that holds info from controller to view
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/employee")
    public String employee(
        @RequestParam(name = "employeeType", required = true) String typeParam, Model model) {
        model.addAttribute("type", typeParam);
        model.addAttribute("employeeName", getEmployeeName(typeParam));
        model.addAttribute("employeeDescription", getEmployeeDescription(typeParam));
        model.addAttribute("employeeDetails", getEmployeeDetails(typeParam));
        model.addAttribute("employeeAnimals", getEmployeeAnimals(typeParam));
        return "employee";
    }

    /**
     * Map GET request to "/visitor" to visitor().
     *
     * @param visitorTypeParam - the type of person provided in the URL
     * @param idParam
     * @param model - the model that holds info from controller to view
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/visitor")
    public String visitor(
        @RequestParam(name = "visitorType", required = false, defaultValue = "guest") String visitorTypeParam,
        @RequestParam(name = "id", required = false, defaultValue = "0") String idParam, Model model) {
        model.addAttribute("id", idParam);
        model.addAttribute("type", visitorTypeParam);
        model.addAttribute("payment", getVisitorPayment(visitorTypeParam));
        model.addAttribute("animalMap", getAllAnimalMap());
        model.addAttribute("animalOutput", getAnimalOutput(idParam));
        model.addAttribute("animalImage", getAnimalImageLink(idParam));
        return "visitor";
    }

    /**
     * Dynamically calls an Animal's run() function by class name
     * 
     * @param className     The name of the Animal Class we want
     * @param animalName    The animal's name required in its constructor
     */
    private static void callAnimalRun(String className, String animalName) {
        String myPackage = "edu.nwmissouri.zoo10group";
        Class[] cArg = new Class[1];
        cArg[0] = String.class;
        Class noparams[] = {};

        String fullClass = myPackage + "." + className.replace(" ", "");
        try {
            Class<?> animalClass = Class.forName(fullClass);
            Object obj = animalClass.getDeclaredConstructor(cArg).newInstance(animalName);
            Method method = animalClass.getDeclaredMethod("run", noparams);
            method.invoke(obj, null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Gets the output of the animal's run() function
     * Puts it in its own output stream to return to the view
     * 
     * @param id    The index of the animal we want
     * @return      The output of the run() function as a string from the printStream
     */
    private String getAnimalOutput(String id) {
        // Create a stream to hold the output
        var newStream = new ByteArrayOutputStream();
        var newPrintStream = new PrintStream(newStream);

        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(newPrintStream);

        var intID = Integer.parseInt(id);
        var myList = Animal.getAnimalList();

        if ((intID > 0) && (intID <= myList.length)) {
            callAnimalRun(myList[intID - 1], myList[intID - 1] + " Tester");
        }

        // Put things back
        System.out.flush();
        System.setOut(old);
        String stringOutput = newStream.toString();
        return formatLineBreaks( stringOutput);
    }

    /**
     * Returns a Map with key value pairs of our animals and their IDs
     * 
     * @return  The map of ID and animal key value pairs
     */
    public static Map<Integer, String> getAllAnimalMap() {
        String[] animals = Animal.getAnimalList();
        int animalCount = animals.length;
        Map animalMap = Collections.synchronizedMap(new TreeMap<Integer, String>());

        for (int n = 0; n < animalCount; n++) {
            animalMap.put((n + 1), animals[n]);
        }
        return animalMap;
    }
    
    public static Map<Integer, String> getEmployeeAnimals(String eType) {
        String[] animals = new String[1];
        switch( eType) {
            case "curator" -> {
                Curator cur = new Curator();
                animals = cur.getExhibits();
            }
            case "caretaker" -> {
                Caretaker caret = new Caretaker();
                animals[0] = caret.getAnimalAssignment();
            }
            default -> {
                animals[0] = "";
            }
        }
        int animalCount = animals.length;
        Map animalMap = Collections.synchronizedMap(new TreeMap<Integer, String>());

        for (int n = 0; n < animalCount; n++) {
            animalMap.put((n + 1), animals[n]);
        }
        return animalMap;
    }
    
    private String getAnimalImageLink(String id) {
        var intID = Integer.parseInt(id);
        var myList = Animal.getAnimalList();
        
        String imageName = "";
        if ((intID > 0) && (intID <= myList.length)) {
            imageName = myList[intID - 1];
        }
        imageName = imageName.replace(" ", "_") + ".jpg";
        return imageName;
    }
    
    /**
     * Returns the output of an employee's run() from the printStream as a String
     * 
     * @param empType   The type of employee we're creating
     * @return          The String value of the employee's run() functions
     */
    private String getEmployeeDetails(String empType) {
        // Create a stream to hold the output
        var newStream = new ByteArrayOutputStream();
        var newPrintStream = new PrintStream(newStream);

        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(newPrintStream);

        switch( empType) {
            case "curator" -> {
                Curator cur = new Curator();
                cur.run();
            }
            case "caretaker" -> {
                Caretaker caret = new Caretaker();
                caret.run();
            }
            default -> {
                
            }
        }

        // Put things back
        System.out.flush();
        System.setOut(old);
        String stringOutput = newStream.toString();
        return formatLineBreaks( stringOutput);
    }
    
    /**
     * Gets the employeeTitle String from an Employee subclass
     * 
     * @param type  The employee type's name
     * @return      The employee's title as a String
     */
    private String getEmployeeName(String type) {
        String myName = "";
        switch (type) {
            case "curator" -> {
                Curator cur = new Curator();
                myName = cur.getEmployeeTitle();
            }
            case "caretaker" -> {
                Caretaker caret = new Caretaker();
                myName = caret.getEmployeeTitle();
            }
            default -> {
                
            }
        }
        return myName;
    }
    
    /**
     * Gets the jobDescription String from an Employee subclass
     * 
     * @param type  The employee type's job description
     * @return      The employee's job description as a String
     */
    private String getEmployeeDescription(String type) {
        String description = "";
        switch (type) {
            case "curator" -> {
                Curator cur = new Curator();
                description = cur.getJobDescription();
            }
            case "caretaker" -> {
                Caretaker caret = new Caretaker();
                description = caret.getJobDescription();
            }
            default -> {
                
            }
        }
        return description;
    }
        
    /**
     * Gets the visitor's payment to enter the zoo from a Visitor subclass
     * 
     * @param vType     The vistitor type as a string
     * @return          The visitor's entry fee converted from double to a string
     */
    public String getVisitorPayment( String vType) {
        String payment = "You have paid an entry fee of $";
        switch (vType) {
            case "guest" -> {
                Guest gus = new Guest();
                payment += gus.getGroupCost();
            }
            case "member" -> {
                Member mem = new Member();
                payment += + mem.getGroupCost();
            }
            case "lifetimemember" -> {
                LifetimeMember lmem = new LifetimeMember();
                payment += + lmem.getGroupCost();
            }
            case "contestwinner" -> {
                ContestWinner cwin = new ContestWinner();
                payment += + cwin.getGroupCost();
            }
            default -> {
                
            }
        }
        return payment;
    }
    
    /**
     * Formats a line of printed string output and replaces line breaks with <br>
     * 
     * @param output    The text output we wish to convert
     * @return          The text with line breaks replaced as <br>
     */
    public String formatLineBreaks(String output) {
        String formattedOutput = output.replace("\n", "<br>").replace("\r", "<br>");
        return formattedOutput;
    }
}
