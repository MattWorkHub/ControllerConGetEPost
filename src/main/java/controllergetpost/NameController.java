package controllergetpost;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class NameController {

    @GetMapping("/name")
    public String name(@RequestParam String name){
        return name;
    }

    @PostMapping("/reversename")
    public String reversname(@RequestParam String name){
        StringBuilder reverse = new StringBuilder();
        reverse.append(name);
        return reverse.reverse().toString();
    }
}