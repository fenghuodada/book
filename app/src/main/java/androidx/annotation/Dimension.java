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
import org.jetbrains.annotations.NotNull;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@kotlin.annotation.Target(allowedTargets = {EnumC10737b.f21340i, EnumC10737b.f21341j, EnumC10737b.f21342k, EnumC10737b.f21338g, EnumC10737b.f21336e, EnumC10737b.f21337f, EnumC10737b.f21333b})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(EnumC10736a.f21329b)
@MustBeDocumented
@Metadata(m509d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m508d2 = {"Landroidx/annotation/Dimension;", "", "", "unit", "()I", "Companion", "a", "annotation"}, m507k = 1, m506mv = {1, 7, 1})
@Documented
/* loaded from: classes.dex */
public @interface Dimension {
    @NotNull
    public static final C0072a Companion = C0072a.f134a;

    /* renamed from: DP */
    public static final int f131DP = 0;

    /* renamed from: PX */
    public static final int f132PX = 1;

    /* renamed from: SP */
    public static final int f133SP = 2;

    /* renamed from: androidx.annotation.Dimension$a */
    /* loaded from: classes.dex */
    public static final class C0072a {

        /* renamed from: a */
        public static final /* synthetic */ C0072a f134a = new C0072a();
    }

    int unit() default 1;
}
