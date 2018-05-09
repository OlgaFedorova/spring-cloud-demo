package ofedorova.feignclients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("${services.name.hellolong}")
public interface HelloLongClient {

    @GetMapping(value = "${services.resources.execute}/{name}")
    String message(@RequestParam(value = "name") String name);
}
