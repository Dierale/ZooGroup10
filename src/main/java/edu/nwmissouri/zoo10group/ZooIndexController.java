package edu.nwmissouri.zoo10group;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
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
     * Map GET request to "/user" to user().
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/user")
    public String user() {
        return "user";
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
    
}