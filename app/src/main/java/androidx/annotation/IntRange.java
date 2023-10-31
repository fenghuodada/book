package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.EnumC10736a;
import kotlin.annotation.EnumC10737b;
import kotlin.annotation.MustBeDocumented;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@kotlin.annotation.Target(allowedTargets = {EnumC10737b.f21340i, EnumC10737b.f21341j, EnumC10737b.f21342k, EnumC10737b.f21338g, EnumC10737b.f21336e, EnumC10737b.f21337f, EnumC10737b.f21333b})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(EnumC10736a.f21329b)
@MustBeDocumented
@Metadata(m509d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005R\u000f\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m508d2 = {"Landroidx/annotation/IntRange;", "", "from", "", "to", "()J", "annotation"}, m507k = 1, m506mv = {1, 7, 1}, m504xi = 48)
@Documented
/* loaded from: classes.dex */
public @interface IntRange {
    long from() default Long.MIN_VALUE;

    /* renamed from: to */
    long m13044to() default Long.MAX_VALUE;
}
