package ofedorova;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloService {

    private ConfigClientAppConfiguration properties;
    private String instance;

    @Autowired
    public HelloService(ConfigClientAppConfiguration properties, @Value("${service.instance.name}") String instance) {
        this.properties = properties;
        this.instance = instance;
    }

    @GetMapping(path = "${services.resources.execute}/{name}")
    public String message(@PathVariable(value = "name") String name) {
        StringBuilder result = new StringBuilder("Hello ").append(name).append("!").append("<br>");
        result.append("spesific property service.instance.name=").append(instance).append("<br>");
        result.append("global property global.propOne=").append(properties.getPropOne()).append("<br>");
        result.append("global property global.propTwo=").append(properties.getPropTwo()).append("<br>");
        return result.toString();
    }
}
