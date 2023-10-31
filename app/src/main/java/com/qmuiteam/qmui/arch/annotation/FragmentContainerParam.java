package com.qmuiteam.qmui.arch.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface FragmentContainerParam {
    String[] optional() default {};

    String[] required() default {};
}
