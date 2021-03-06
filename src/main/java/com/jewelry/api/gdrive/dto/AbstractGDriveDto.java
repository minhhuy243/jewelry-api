package com.jewelry.api.gdrive.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AbstractGDriveDto implements Serializable {
    private String id;
    private String name;
    private String link;
}
