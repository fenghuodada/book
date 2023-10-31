package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.EnumC10736a;
import kotlin.annotation.EnumC10737b;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Metadata(m509d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0014\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004R\u0017\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, m508d2 = {"Lkotlin/Suppress;", "", "names", "", "", "()[Ljava/lang/String;", "kotlin-stdlib"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
@kotlin.annotation.Target(allowedTargets = {EnumC10737b.f21332a, EnumC10737b.f21333b, EnumC10737b.f21334c, EnumC10737b.f21335d, EnumC10737b.f21336e, EnumC10737b.f21337f, EnumC10737b.f21338g, EnumC10737b.f21339h, EnumC10737b.f21340i, EnumC10737b.f21341j, EnumC10737b.f21342k, EnumC10737b.f21343l, EnumC10737b.f21344m, EnumC10737b.f21345n, EnumC10737b.f21346o})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(EnumC10736a.f21328a)
/* loaded from: classes3.dex */
public @interface Suppress {
    String[] names();
}
