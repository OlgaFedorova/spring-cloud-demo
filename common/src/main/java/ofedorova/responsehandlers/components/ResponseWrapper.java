package ofedorova.responsehandlers.components;

import ofedorova.responsehandlers.domain.LevelErrorEnum;
import ofedorova.responsehandlers.domain.ModelResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ResponseWrapper {

    public ResponseEntity<ModelResponse> success() {
        return ResponseEntity.status(HttpStatus.OK).body(getSuccessfulModelResponse());
    }

    private ModelResponse getSuccessfulModelResponse() {
        ModelResponse modelResponse = new ModelResponse();
        modelResponse.setResultCode(LevelErrorEnum.SUCCESS.getTypeValue());
        modelResponse.setResultDetails("Successful service processing");
        return modelResponse;
    }
}
