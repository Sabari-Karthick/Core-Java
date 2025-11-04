package com.batman.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class B extends Base{
    private String name;
    private String value;
    private boolean flag;

}
