package androidx.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.EnumC10736a;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m508d2 = {"Landroidx/annotation/VisibleForTesting;", "", "", "otherwise", "()I", "Companion", "a", "annotation"}, m507k = 1, m506mv = {1, 7, 1})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(EnumC10736a.f21329b)
/* loaded from: classes.dex */
public @interface VisibleForTesting {
    @NotNull
    public static final C0077a Companion = C0077a.f144a;
    public static final int NONE = 5;
    public static final int PACKAGE_PRIVATE = 3;
    public static final int PRIVATE = 2;
    public static final int PROTECTED = 4;

    /* renamed from: androidx.annotation.VisibleForTesting$a */
    /* loaded from: classes.dex */
    public static final class C0077a {

        /* renamed from: a */
        public static final /* synthetic */ C0077a f144a = new C0077a();
    }

    int otherwise() default 2;
}
