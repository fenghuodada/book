package com.google.android.material.snackbar;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.core.view.C0851a;
import androidx.core.view.accessibility.C0874o;

/* renamed from: com.google.android.material.snackbar.i */
/* loaded from: classes3.dex */
public final class C7838i extends C0851a {

    /* renamed from: d */
    public final /* synthetic */ BaseTransientBottomBar f15383d;

    public C7838i(BaseTransientBottomBar baseTransientBottomBar) {
        this.f15383d = baseTransientBottomBar;
    }

    @Override // androidx.core.view.C0851a
    /* renamed from: d */
    public final void mo4308d(View view, @NonNull C0874o c0874o) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2597a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0874o.f2606a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        c0874o.m11557a(1048576);
        accessibilityNodeInfo.setDismissable(true);
    }

    @Override // androidx.core.view.C0851a
    /* renamed from: g */
    public final boolean mo4307g(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            this.f15383d.mo4418a();
            return true;
        }
        return super.mo4307g(view, i, bundle);
    }
}
