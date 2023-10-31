package com.qmuiteam.qmui.arch.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface ActivityScheme {
    Class<?> customFactory() default void.class;

    Class<?> customMatcher() default void.class;

    String[] keysWithBoolValue() default {};

    String[] keysWithDoubleValue() default {};

    String[] keysWithFloatValue() default {};

    String[] keysWithIntValue() default {};

    String[] keysWithLongValue() default {};

    String name();

    String[] required() default {};

    boolean useRefreshIfCurrentMatched() default false;

    Class<?> valueConverter() default void.class;
}
