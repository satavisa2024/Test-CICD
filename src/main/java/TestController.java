import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/demo")

@RestController

public class TestController {
    @GetMapping("/data")
    public String getData() {
        return "First message from AWS ECS";
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Second message from AWS ECS";
    }



}
