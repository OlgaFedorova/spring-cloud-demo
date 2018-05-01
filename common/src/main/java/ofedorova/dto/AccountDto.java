package ofedorova.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AccountDto {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("owner")
    private String owner;

    @JsonProperty("balance")
    private long balance;
}
