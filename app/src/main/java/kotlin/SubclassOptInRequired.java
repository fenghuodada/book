package kotlin;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.EnumC10736a;
import kotlin.annotation.EnumC10737b;

@Target({ElementType.TYPE})
@SinceKotlin(version = "1.8")
@kotlin.annotation.Target(allowedTargets = {EnumC10737b.f21332a})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(EnumC10736a.f21329b)
@Metadata(m509d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m508d2 = {"Lkotlin/SubclassOptInRequired;", "", "Lkotlin/reflect/c;", "markerClass", "()Ljava/lang/Class;", "kotlin-stdlib"}, m507k = 1, m506mv = {1, 8, 0})
@ExperimentalSubclassOptIn
/* loaded from: classes3.dex */
public @interface SubclassOptInRequired {
    Class<? extends Annotation> markerClass();
}
