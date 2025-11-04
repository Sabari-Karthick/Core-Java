package com.batman.template;

import com.batman.model.Base;

public interface Template {

    default <S extends Base,V extends Base> TemplateCreator<S,V> getCreator(){
        return null;
    }
}
