package androidx.annotation.experimental;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.annotation.EnumC10736a;
import kotlin.annotation.EnumC10737b;

@Target({ElementType.ANNOTATION_TYPE})
@Metadata(m509d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m508d2 = {"Landroidx/annotation/experimental/Experimental;", "", "Landroidx/annotation/experimental/Experimental$a;", "level", "()Landroidx/annotation/experimental/Experimental$a;", "a", "annotation-experimental_release"}, m507k = 1, m506mv = {1, 7, 1})
@Deprecated(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @ReplaceWith(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
@kotlin.annotation.Target(allowedTargets = {EnumC10737b.f21333b})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(EnumC10736a.f21329b)
/* loaded from: classes.dex */
public @interface Experimental {

    /* renamed from: androidx.annotation.experimental.Experimental$a */
    /* loaded from: classes.dex */
    public enum EnumC0078a {
        /* JADX INFO: Fake field, exist only in values array */
        WARNING,
        ERROR
    }

    EnumC0078a level() default EnumC0078a.ERROR;
}
