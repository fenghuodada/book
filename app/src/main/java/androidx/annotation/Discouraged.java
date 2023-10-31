package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.EnumC10736a;
import kotlin.annotation.EnumC10737b;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@Metadata(m509d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, m508d2 = {"Landroidx/annotation/Discouraged;", "", "message", "", "()Ljava/lang/String;", "annotation"}, m507k = 1, m506mv = {1, 7, 1}, m504xi = 48)
@kotlin.annotation.Target(allowedTargets = {EnumC10737b.f21339h, EnumC10737b.f21336e, EnumC10737b.f21340i, EnumC10737b.f21341j, EnumC10737b.f21342k, EnumC10737b.f21338g, EnumC10737b.f21333b, EnumC10737b.f21332a})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(EnumC10736a.f21328a)
/* loaded from: classes.dex */
public @interface Discouraged {
    String message();
}
