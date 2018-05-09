package ofedorova;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloLongService {

    @GetMapping(path = "${services.resources.execute}/{name}")
    public String message(@PathVariable(value = "name") String name) throws InterruptedException {
        StringBuilder result = new StringBuilder("Hello ").append(name).append("!").append("<br>");
        result.append("This is long operation...").append("<br>");
        Thread.sleep(2000);
        return result.toString();
    }
}
