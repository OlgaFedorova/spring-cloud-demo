package ofedorova.feignclients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("${services.name.hello}")
public interface HelloClient {

    @GetMapping("${services.resources.execute}")
    String message();
}
