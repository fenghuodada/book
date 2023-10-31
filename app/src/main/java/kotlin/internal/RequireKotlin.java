package kotlin.internal;

import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.EnumC10735a;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.EnumC10736a;
import kotlin.annotation.EnumC10737b;
import kotlin.annotation.Repeatable;
import kotlin.jvm.internal.RepeatableContainer;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@SinceKotlin(version = "1.2")
@kotlin.annotation.Target(allowedTargets = {EnumC10737b.CLASS, EnumC10737b.FUNCTION, EnumC10737b.PROPERTY, EnumC10737b.CONSTRUCTOR, EnumC10737b.TYPEALIAS})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(EnumC10736a.SOURCE)
@Metadata(m509d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\t8\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\f8\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m508d2 = {"Lkotlin/internal/RequireKotlin;", "", "", MediationMetaData.KEY_VERSION, "()Ljava/lang/String;", "message", "Lkotlin/a;", "level", "()Lkotlin/a;", "Lkotlin/internal/c;", "versionKind", "()Lkotlin/internal/c;", "", "errorCode", "()I", "kotlin-stdlib"}, m507k = 1, m506mv = {1, 8, 0})
@Repeatable
@java.lang.annotation.Repeatable(Container.class)
/* loaded from: classes3.dex */
public @interface RequireKotlin {

    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Metadata(m507k = 3, m506mv = {1, 8, 0}, m504xi = 48)
    @kotlin.annotation.Target(allowedTargets = {EnumC10737b.CLASS, EnumC10737b.FUNCTION, EnumC10737b.PROPERTY, EnumC10737b.CONSTRUCTOR, EnumC10737b.TYPEALIAS})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(EnumC10736a.SOURCE)
    @RepeatableContainer
    /* loaded from: classes3.dex */
    public @interface Container {
        RequireKotlin[] value();
    }

    int errorCode() default -1;

    EnumC10735a level() default EnumC10735a.ERROR;

    String message() default "";

    String version();

    EnumC10800c versionKind() default EnumC10800c.LANGUAGE_VERSION;
}
