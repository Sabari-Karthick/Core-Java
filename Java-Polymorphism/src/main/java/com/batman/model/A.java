package com.batman.model;

import com.batman.template.Template;
import com.batman.template.TemplateCreator;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class A extends Base implements Template {

    private String name;
    private String value;

    @Override
    public TemplateCreator<A,B> getCreator() {
        return (source) -> new B();
    }
}
