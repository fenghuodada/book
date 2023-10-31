package androidx.core.util;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Objects;

@RequiresApi(19)
/* renamed from: androidx.core.util.c */
/* loaded from: classes.dex */
public final class C0799c {
    @DoNotInline
    /* renamed from: a */
    public static boolean m11795a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    @DoNotInline
    /* renamed from: b */
    public static int m11794b(Object... objArr) {
        return Objects.hash(objArr);
    }
}
