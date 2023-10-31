package kotlin.jvm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.EnumC10737b;

@Target({ElementType.METHOD})
@SinceKotlin(version = "1.2")
@Metadata(m509d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m508d2 = {"Lkotlin/jvm/JvmDefault;", "", "kotlin-stdlib"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
@Deprecated(message = "Switch to new -Xjvm-default modes: `all` or `all-compatibility`")
@kotlin.annotation.Target(allowedTargets = {EnumC10737b.FUNCTION, EnumC10737b.PROPERTY})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface JvmDefault {
}
