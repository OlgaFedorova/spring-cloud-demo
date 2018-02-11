package ofedorova;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloService {

    @Autowired
    private ConfigClientAppConfiguration properties;

    @Value("${service.instance.name}")
    private String instance;

    @RequestMapping("/")
    public String message() {
        StringBuilder result = new StringBuilder("Hello!").append("<br>");
        result.append("spesific property service.instance.name=").append(instance).append("<br>");
        result.append("global property global.propOne=").append(properties.getPropOne()).append("<br>");
        result.append("global property global.propTwo=").append(properties.getPropTwo()).append("<br>");
        return result.toString();
    }
}
