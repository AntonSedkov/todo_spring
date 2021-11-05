import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WebApp{
    @GetMapping("/")
    String welcome(){
        "<h1><font face='verdana'> Spring Boot Rocks!</font></h1>"
    }
}