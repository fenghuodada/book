package kotlin.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

@java.lang.annotation.Target({ElementType.ANNOTATION_TYPE})
@Metadata(m509d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m508d2 = {"Lkotlin/annotation/Retention;", "", "Lkotlin/annotation/a;", "value", "()Lkotlin/annotation/a;", "kotlin-stdlib"}, m507k = 1, m506mv = {1, 8, 0})
@Target(allowedTargets = {EnumC10737b.ANNOTATION_CLASS})
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface Retention {
    EnumC10736a value() default EnumC10736a.RUNTIME;
}
