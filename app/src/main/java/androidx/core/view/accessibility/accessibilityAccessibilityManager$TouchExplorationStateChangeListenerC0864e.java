package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.C7134r;
import com.google.android.material.textfield.C7884s;
import java.util.WeakHashMap;

@RequiresApi(19)
/* renamed from: androidx.core.view.accessibility.e  reason: invalid class name */
/* loaded from: classes.dex */
public final class accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0864e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final InterfaceC0863d f2604a;

    public accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0864e(@NonNull InterfaceC0863d interfaceC0863d) {
        this.f2604a = interfaceC0863d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0864e) {
            return this.f2604a.equals(((accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0864e) obj).f2604a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2604a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        boolean z2;
        C7884s c7884s = (C7884s) ((C7134r) this.f2604a).f12673b;
        AutoCompleteTextView autoCompleteTextView = c7884s.f15525h;
        if (autoCompleteTextView != null) {
            int i = 1;
            if (autoCompleteTextView.getInputType() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (z) {
                    i = 2;
                }
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0814d.m11746s(c7884s.f15568d, i);
            }
        }
    }
}
