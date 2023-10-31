package kotlin.jvm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.EnumC10736a;
import kotlin.annotation.EnumC10737b;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Metadata(m509d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B$\u0012\"\u0010\u0005\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0002\"\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003R!\u0010\u0005\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m508d2 = {"Lkotlin/jvm/Throws;", "", "", "Lkotlin/reflect/c;", "", "exceptionClasses", "()[Ljava/lang/Class;", "kotlin-stdlib"}, m507k = 1, m506mv = {1, 8, 0})
@kotlin.annotation.Target(allowedTargets = {EnumC10737b.FUNCTION, EnumC10737b.PROPERTY_GETTER, EnumC10737b.PROPERTY_SETTER, EnumC10737b.CONSTRUCTOR})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(EnumC10736a.SOURCE)
/* loaded from: classes3.dex */
public @interface Throws {
    Class<? extends Throwable>[] exceptionClasses();
}
