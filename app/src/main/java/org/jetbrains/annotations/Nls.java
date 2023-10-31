package org.jetbrains.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE, ElementType.TYPE, ElementType.PACKAGE})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface Nls {

    /* renamed from: org.jetbrains.annotations.Nls$a */
    /* loaded from: classes3.dex */
    public enum EnumC11194a {
        NotSpecified,
        /* JADX INFO: Fake field, exist only in values array */
        Title,
        /* JADX INFO: Fake field, exist only in values array */
        Sentence
    }

    EnumC11194a capitalization() default EnumC11194a.NotSpecified;
}
