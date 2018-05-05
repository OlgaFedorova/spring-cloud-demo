package ofedorova;

import ofedorova.dto.AccountDto;
import ofedorova.feignclients.HelloClient;
import ofedorova.responsehandlers.components.ResponseWrapper;
import ofedorova.responsehandlers.domain.ModelResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountService {

    private ResponseWrapper responseWrapper;
    private HelloClient helloClient;

    @Autowired
    public AccountService(ResponseWrapper responseWrapper, HelloClient helloClient) {
        this.responseWrapper = responseWrapper;
        this.helloClient = helloClient;
    }

    @PostMapping("${services.resources.execute}")
    public ResponseEntity<ModelResponse> execute(AccountDto accountDto) {
        helloClient.message("Ivan");
        return responseWrapper.success();
    }
}
