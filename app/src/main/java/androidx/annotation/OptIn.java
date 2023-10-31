package androidx.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.EnumC10736a;
import kotlin.annotation.EnumC10737b;

@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE})
@Metadata(m509d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B$\u0012\"\u0010\u0004\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\u0002\"\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003R!\u0010\u0004\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m508d2 = {"Landroidx/annotation/OptIn;", "", "", "Lkotlin/reflect/c;", "markerClass", "()[Ljava/lang/Class;", "annotation-experimental_release"}, m507k = 1, m506mv = {1, 7, 1})
@kotlin.annotation.Target(allowedTargets = {EnumC10737b.f21332a, EnumC10737b.f21335d, EnumC10737b.f21337f, EnumC10737b.f21338g, EnumC10737b.f21339h, EnumC10737b.f21340i, EnumC10737b.f21341j, EnumC10737b.f21342k, EnumC10737b.f21345n, EnumC10737b.f21346o})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(EnumC10736a.f21329b)
/* loaded from: classes.dex */
public @interface OptIn {
    Class<? extends Annotation>[] markerClass();
}
