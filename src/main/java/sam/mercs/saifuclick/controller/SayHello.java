package sam.mercs.saifuclick.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {

    @GetMapping("/")
    public String sayHello(){
        return "Sam Says Hello to all!";
    }
}
