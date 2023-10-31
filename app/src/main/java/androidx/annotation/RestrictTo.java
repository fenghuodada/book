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

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@kotlin.annotation.Target(allowedTargets = {EnumC10737b.f21333b, EnumC10737b.f21332a, EnumC10737b.f21340i, EnumC10737b.f21341j, EnumC10737b.f21342k, EnumC10737b.f21339h, EnumC10737b.f21336e, EnumC10737b.f21345n})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(EnumC10736a.f21329b)
@MustBeDocumented
@Metadata(m509d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u0014\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003R\u0019\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m508d2 = {"Landroidx/annotation/RestrictTo;", "", "", "Landroidx/annotation/RestrictTo$a;", "value", "()[Landroidx/annotation/RestrictTo$a;", "a", "annotation"}, m507k = 1, m506mv = {1, 7, 1})
@Documented
/* loaded from: classes.dex */
public @interface RestrictTo {

    /* renamed from: androidx.annotation.RestrictTo$a */
    /* loaded from: classes.dex */
    public enum EnumC0076a {
        LIBRARY,
        LIBRARY_GROUP,
        LIBRARY_GROUP_PREFIX,
        /* JADX INFO: Fake field, exist only in values array */
        GROUP_ID,
        TESTS,
        /* JADX INFO: Fake field, exist only in values array */
        SUBCLASSES
    }

    EnumC0076a[] value();
}
