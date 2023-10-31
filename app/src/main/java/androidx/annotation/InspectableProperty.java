package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.annotation.EnumC10736a;
import kotlin.annotation.EnumC10737b;

@Target({ElementType.METHOD})
@Metadata(m509d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017BH\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\b8\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e8\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m508d2 = {"Landroidx/annotation/InspectableProperty;", "", "", "name", "()Ljava/lang/String;", "", "attributeId", "()I", "", "hasAttributeId", "()Z", "Landroidx/annotation/InspectableProperty$a;", "valueType", "()Landroidx/annotation/InspectableProperty$a;", "", "Landroidx/annotation/InspectableProperty$EnumEntry;", "enumMapping", "()[Landroidx/annotation/InspectableProperty$EnumEntry;", "Landroidx/annotation/InspectableProperty$FlagEntry;", "flagMapping", "()[Landroidx/annotation/InspectableProperty$FlagEntry;", "EnumEntry", "FlagEntry", "a", "annotation"}, m507k = 1, m506mv = {1, 7, 1})
@Deprecated(message = "Replaced by the {@code androidx.resourceinpsection} package.")
@kotlin.annotation.Target(allowedTargets = {EnumC10737b.f21340i, EnumC10737b.f21341j, EnumC10737b.f21342k})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(EnumC10736a.f21328a)
/* loaded from: classes.dex */
public @interface InspectableProperty {

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(m509d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006R\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, m508d2 = {"Landroidx/annotation/InspectableProperty$EnumEntry;", "", "name", "", "value", "", "()Ljava/lang/String;", "()I", "annotation"}, m507k = 1, m506mv = {1, 7, 1}, m504xi = 48)
    @kotlin.annotation.Target(allowedTargets = {EnumC10737b.f21333b, EnumC10737b.f21332a})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(EnumC10736a.f21328a)
    /* loaded from: classes.dex */
    public @interface EnumEntry {
        String name();

        int value();
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(m509d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005R\u000f\u0010\u0006\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\bR\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\t"}, m508d2 = {"Landroidx/annotation/InspectableProperty$FlagEntry;", "", "name", "", "target", "", "mask", "()I", "()Ljava/lang/String;", "annotation"}, m507k = 1, m506mv = {1, 7, 1}, m504xi = 48)
    @kotlin.annotation.Target(allowedTargets = {EnumC10737b.f21333b, EnumC10737b.f21332a})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(EnumC10736a.f21328a)
    /* loaded from: classes.dex */
    public @interface FlagEntry {
        int mask() default 0;

        String name();

        int target();
    }

    /* renamed from: androidx.annotation.InspectableProperty$a */
    /* loaded from: classes.dex */
    public enum EnumC0073a {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        INFERRED,
        /* JADX INFO: Fake field, exist only in values array */
        INT_ENUM,
        /* JADX INFO: Fake field, exist only in values array */
        INT_FLAG,
        /* JADX INFO: Fake field, exist only in values array */
        COLOR,
        /* JADX INFO: Fake field, exist only in values array */
        GRAVITY,
        /* JADX INFO: Fake field, exist only in values array */
        RESOURCE_ID
    }

    int attributeId() default 0;

    EnumEntry[] enumMapping() default {};

    FlagEntry[] flagMapping() default {};

    boolean hasAttributeId() default true;

    String name() default "";

    EnumC0073a valueType() default EnumC0073a.INFERRED;
}
