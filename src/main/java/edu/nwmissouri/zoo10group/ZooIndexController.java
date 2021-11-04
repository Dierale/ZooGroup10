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
     * The @GetMapping annotation ensures that HTTP GET requests to / are mapped
     * to the index() method.Example:
     * https://spring.io/guides/gs/serving-web-content/
     *
     *
     * @param idParam - the id provided in the URL
     * @param model - the model that holds information from controller to view
     * @return
     */
    @GetMapping(path = "/")
    public String index(
            @RequestParam(name = "id", required = false, defaultValue = "0") String idParam,
            Model model) {
        model.addAttribute("id", idParam);
        model.addAttribute("name", "World");
        model.addAttribute("greeting", GREETING_MESSAGE);
        model.addAttribute("animalMap", getAllAnimalMap());
        model.addAttribute("customAnimalGroup", getCustomAnimalGroup(idParam));
        // associated with index.hmtl in src/main/resources/templates
        return "index";
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
     * Map GET request to "/employee" to user().
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/employee")
    public String employee() {
        return "employee";
    }

    /**
     * Map GET request to "/visitor" to user().
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/visitor")
    public String visitor() {
        return "visitor";
    }

    /**
     * 76 Map GET request to "/zoo" to user().
     *
     * @param empTypeParam - the type of employee provided in the URL
     * @param model - the model that holds info from controller to view
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/zoo")
    public String zoo(
            @RequestParam(name = "type", required = false, defaultValue = "visitor") String empTypeParam, Model model) {
        model.addAttribute("type", empTypeParam);
        // filename for return path
        return "zoo";
    }

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

    private String getCustomAnimalGroup(String id) {
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
        return stringOutput;
    }

    public static Map<Integer, String> getAllAnimalMap() {
        String[] animals = Animal.getAnimalList();
        int animalCount = animals.length;
        Map animalMap = Collections.synchronizedMap(new TreeMap<Integer, String>());

        for (int n = 0; n < animalCount; n++) {
            animalMap.put((n + 1), animals[n]);
        }
        return animalMap;
    }
}
