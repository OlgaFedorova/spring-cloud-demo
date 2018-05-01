package ofedorova;

import ofedorova.dto.AccountDto;
import ofedorova.responsehandlers.components.ResponseWrapper;
import ofedorova.responsehandlers.domain.ModelResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountService {

    private ResponseWrapper responseWrapper;

    @Autowired
    public AccountService(ResponseWrapper responseWrapper) {
        this.responseWrapper = responseWrapper;
    }

    @PostMapping("${services.resources.execute}")
    public ResponseEntity<ModelResponse> execute(AccountDto accountDto) {
        return responseWrapper.success();
    }
}
