package projeto.com.springboot.projeto2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class indexController {

@GetMapping("/")
    public String principal(){
        return "";
    }
}
