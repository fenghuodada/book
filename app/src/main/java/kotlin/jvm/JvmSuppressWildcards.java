package kotlin.jvm;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.EnumC10736a;
import kotlin.annotation.EnumC10737b;
import kotlin.annotation.MustBeDocumented;

@Target({ElementType.TYPE, ElementType.METHOD})
@kotlin.annotation.Target(allowedTargets = {EnumC10737b.f21332a, EnumC10737b.f21340i, EnumC10737b.f21335d, EnumC10737b.f21343l})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(EnumC10736a.BINARY)
@MustBeDocumented
@Metadata(m509d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\n\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, m508d2 = {"Lkotlin/jvm/JvmSuppressWildcards;", "", "suppress", "", "()Z", "kotlin-stdlib"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
@Documented
/* loaded from: classes3.dex */
public @interface JvmSuppressWildcards {
    boolean suppress() default true;
}
