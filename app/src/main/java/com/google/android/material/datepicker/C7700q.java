package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.core.view.C0851a;
import androidx.core.view.accessibility.C0874o;

/* renamed from: com.google.android.material.datepicker.q */
/* loaded from: classes3.dex */
public final class C7700q extends C0851a {
    @Override // androidx.core.view.C0851a
    /* renamed from: d */
    public final void mo4308d(View view, @NonNull C0874o c0874o) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2597a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0874o.f2606a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(null);
    }
}
