package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
/* renamed from: androidx.core.view.accessibility.r */
/* loaded from: classes.dex */
public final class C0882r {
    @DoNotInline
    /* renamed from: a */
    public static void m11539a(AccessibilityRecord accessibilityRecord, View view, int i) {
        accessibilityRecord.setSource(view, i);
    }
}
