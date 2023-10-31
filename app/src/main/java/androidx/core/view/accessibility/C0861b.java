package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* renamed from: androidx.core.view.accessibility.b */
/* loaded from: classes.dex */
public final class C0861b {
    @DoNotInline
    /* renamed from: a */
    public static int m11576a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @DoNotInline
    /* renamed from: b */
    public static void m11575b(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
