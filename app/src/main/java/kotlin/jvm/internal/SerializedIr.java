package kotlin.jvm.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.EnumC10736a;
import kotlin.annotation.EnumC10737b;
import kotlin.jvm.JvmName;

@Target({ElementType.TYPE})
@SinceKotlin(version = "1.6")
@Metadata(m509d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m508d2 = {"Lkotlin/jvm/internal/SerializedIr;", "", "bytes", "", "", "b", "()[Ljava/lang/String;", "kotlin-stdlib"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
@kotlin.annotation.Target(allowedTargets = {EnumC10737b.CLASS})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(EnumC10736a.BINARY)
/* loaded from: classes3.dex */
public @interface SerializedIr {
    @JvmName(name = "b")
    /* renamed from: b */
    String[] m441b() default {};
}
