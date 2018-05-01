package ofedorova.feignclients;

import ofedorova.dto.AccountDto;
import ofedorova.responsehandlers.domain.ModelResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("${services.name.account}")
public interface AccountClient {

    @PostMapping("${services.resources.execute}")
    ResponseEntity<ModelResponse> execute(AccountDto accountDto);
}
