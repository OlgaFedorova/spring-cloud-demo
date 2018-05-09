package ofedorova;

import ofedorova.dto.AccountDto;
import ofedorova.feignclients.AccountClient;
import ofedorova.feignclients.HelloClient;
import ofedorova.feignclients.HelloLongClient;
import ofedorova.responsehandlers.domain.ModelResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignService {

    private HelloClient helloClient;
    private HelloLongClient helloLongClient;
    private AccountClient accountClient;

    @Autowired
    public FeignService(HelloClient helloClient, AccountClient accountClient, HelloLongClient helloLongClient) {
        this.helloClient = helloClient;
        this.accountClient = accountClient;
        this.helloLongClient = helloLongClient;
    }

    @GetMapping("/hello")
    public String hello() {
        return helloClient.message("Olga");
    }

    @GetMapping("/hellolong")
    public String hellolong() {
        return helloLongClient.message("Olga");
    }

    @GetMapping("/account")
    public ResponseEntity<ModelResponse> account(){
        AccountDto accountDto = new AccountDto();
        accountDto.setId(1);
        accountDto.setOwner("Ivanov");
        accountDto.setBalance(123456);
        return accountClient.execute(accountDto);
    }
}
