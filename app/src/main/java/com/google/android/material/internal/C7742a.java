package com.google.android.material.internal;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.core.view.C0851a;
import androidx.core.view.accessibility.C0874o;

/* renamed from: com.google.android.material.internal.a */
/* loaded from: classes3.dex */
public final class C7742a extends C0851a {

    /* renamed from: d */
    public final /* synthetic */ CheckableImageButton f15025d;

    public C7742a(CheckableImageButton checkableImageButton) {
        this.f15025d = checkableImageButton;
    }

    @Override // androidx.core.view.C0851a
    /* renamed from: c */
    public final void mo4531c(View view, @NonNull AccessibilityEvent accessibilityEvent) {
        super.mo4531c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f15025d.isChecked());
    }

    @Override // androidx.core.view.C0851a
    /* renamed from: d */
    public final void mo4308d(View view, @NonNull C0874o c0874o) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2597a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0874o.f2606a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CheckableImageButton checkableImageButton = this.f15025d;
        accessibilityNodeInfo.setCheckable(checkableImageButton.f15009e);
        accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
    }
}
