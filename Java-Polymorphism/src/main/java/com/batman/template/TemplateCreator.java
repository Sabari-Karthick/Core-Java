package com.batman.template;

import com.batman.model.Base;
import org.springframework.beans.BeanUtils;

import java.util.Objects;
import java.util.function.Supplier;


public interface TemplateCreator<S extends Base, V extends Base> {

    default V create(S source, Supplier<V> targetSupplier) {
        if (Objects.isNull(source) || Objects.isNull(targetSupplier)) {
            throw new IllegalArgumentException("Source or target supplier is null");
        }
        V target = targetSupplier.get();
        if (Objects.isNull(target)) {
            throw new IllegalArgumentException("Target object supplied is null");
        }
        BeanUtils.copyProperties(source, target);
        return target;
    }
}
