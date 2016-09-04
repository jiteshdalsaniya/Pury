package com.nikitakozlov.pury.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD })
public @interface StopProfiling {
    String profilerName() default "";
    String stageName() default "";
    int runsCounter() default 1;
    boolean enabled() default true;
}