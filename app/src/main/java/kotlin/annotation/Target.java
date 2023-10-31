package kotlin.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

@java.lang.annotation.Target({ElementType.ANNOTATION_TYPE})
@MustBeDocumented
@Metadata(m509d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0014\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003R\u0019\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m508d2 = {"Lkotlin/annotation/Target;", "", "", "Lkotlin/annotation/b;", "allowedTargets", "()[Lkotlin/annotation/b;", "kotlin-stdlib"}, m507k = 1, m506mv = {1, 8, 0})
@Target(allowedTargets = {EnumC10737b.ANNOTATION_CLASS})
@Documented
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface Target {
    EnumC10737b[] allowedTargets();
}
