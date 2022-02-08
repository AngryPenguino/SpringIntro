package oslomet.webprog.springintro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String hei(String navn){
        int antallBokstaver = navn.length();

        return "yoyo gamer " + navn + "! Navn ditt er " + antallBokstaver;
    }
}
