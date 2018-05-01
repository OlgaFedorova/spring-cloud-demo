package ofedorova.responsehandlers.domain;

import lombok.Getter;

/**
 * Уровень ошибок в сервисах
 */
@Getter
public enum LevelErrorEnum {

    SUCCESS("SUCCESS"),
    WARNING("WARNING"),
    ERROR("ERROR");

    private String typeValue;

    LevelErrorEnum(String type) {
        typeValue = type;
    }
}