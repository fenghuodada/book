package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* renamed from: androidx.core.view.accessibility.c */
/* loaded from: classes.dex */
public final class C0862c {
    @DoNotInline
    /* renamed from: a */
    public static boolean m11574a(AccessibilityManager accessibilityManager, InterfaceC0863d interfaceC0863d) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0864e(interfaceC0863d));
    }

    @DoNotInline
    /* renamed from: b */
    public static boolean m11573b(AccessibilityManager accessibilityManager, InterfaceC0863d interfaceC0863d) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0864e(interfaceC0863d));
    }
}
