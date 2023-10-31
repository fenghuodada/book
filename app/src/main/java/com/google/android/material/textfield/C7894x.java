package com.google.android.material.textfield;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: com.google.android.material.textfield.x */
/* loaded from: classes3.dex */
public final class C7894x extends View.AccessibilityDelegate {

    /* renamed from: a */
    public final /* synthetic */ C7892w f15602a;

    public C7894x(C7892w c7892w) {
        this.f15602a = c7892w;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f15602a.f15578h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
