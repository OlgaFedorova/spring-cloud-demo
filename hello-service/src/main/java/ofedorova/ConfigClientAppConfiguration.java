package ofedorova;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "global")
public class ConfigClientAppConfiguration {

    private String propOne;
    private String propTwo;

    public String getPropOne() {
        return propOne;
    }

    public void setPropOne(String propOne) {
        this.propOne = propOne;
    }

    public String getPropTwo() {
        return propTwo;
    }

    public void setPropTwo(String propTwo) {
        this.propTwo = propTwo;
    }
}
