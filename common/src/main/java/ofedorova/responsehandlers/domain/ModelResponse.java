package ofedorova.responsehandlers.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 *  Класс Ответа
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModelResponse {
    /**
     * Код результата
     */
    private String resultCode;
    /**
     * Сообщение результата
     */
    private String resultDetails;
}
