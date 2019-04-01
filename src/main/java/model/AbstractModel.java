package model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
abstract class AbstractModel {

    private String uuid = UUID.randomUUID().toString();

    private String name;

}
