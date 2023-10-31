package com.google.errorprone.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@IncompatibleModifiers(modifier = {EnumC8350a.PUBLIC, EnumC8350a.PRIVATE, EnumC8350a.STATIC, EnumC8350a.FINAL})
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface ForOverride {
}
