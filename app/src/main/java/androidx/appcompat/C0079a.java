package androidx.appcompat;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* renamed from: androidx.appcompat.a */
/* loaded from: classes.dex */
public final class C0079a {

    /* renamed from: a */
    public static Context f147a;

    /* renamed from: a */
    public static void m13043a(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        Object[] spans;
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }
}
