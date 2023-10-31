package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(15)
/* renamed from: androidx.core.view.accessibility.q */
/* loaded from: classes.dex */
public final class C0881q {
    @DoNotInline
    /* renamed from: a */
    public static int m11543a(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    @DoNotInline
    /* renamed from: b */
    public static int m11542b(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    @DoNotInline
    /* renamed from: c */
    public static void m11541c(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    @DoNotInline
    /* renamed from: d */
    public static void m11540d(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }
}
