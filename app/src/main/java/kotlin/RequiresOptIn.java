package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.EnumC10736a;
import kotlin.annotation.EnumC10737b;

@Target({ElementType.ANNOTATION_TYPE})
@SinceKotlin(version = "1.3")
@Metadata(m509d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0014\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m508d2 = {"Lkotlin/RequiresOptIn;", "", "", "message", "()Ljava/lang/String;", "Lkotlin/RequiresOptIn$a;", "level", "()Lkotlin/RequiresOptIn$a;", "a", "kotlin-stdlib"}, m507k = 1, m506mv = {1, 8, 0})
@kotlin.annotation.Target(allowedTargets = {EnumC10737b.f21333b})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(EnumC10736a.f21329b)
/* loaded from: classes3.dex */
public @interface RequiresOptIn {

    /* renamed from: kotlin.RequiresOptIn$a */
    /* loaded from: classes3.dex */
    public enum EnumC10734a {
        WARNING,
        ERROR
    }

    EnumC10734a level() default EnumC10734a.ERROR;

    String message() default "";
}
