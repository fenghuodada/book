package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.core.view.C0851a;
import androidx.core.view.accessibility.C0874o;
import com.ambrose.overwall.R;

/* renamed from: com.google.android.material.timepicker.c */
/* loaded from: classes3.dex */
public final class C7905c extends C0851a {

    /* renamed from: d */
    public final /* synthetic */ ClockFaceView f15651d;

    public C7905c(ClockFaceView clockFaceView) {
        this.f15651d = clockFaceView;
    }

    @Override // androidx.core.view.C0851a
    /* renamed from: d */
    public final void mo4308d(View view, @NonNull C0874o c0874o) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2597a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0874o.f2606a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter(this.f15651d.f15631x.get(intValue - 1));
        }
        c0874o.m11550h(C0874o.C0876b.m11544a(0, 1, intValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        c0874o.m11556b(C0874o.C0875a.f2609e);
    }

    @Override // androidx.core.view.C0851a
    /* renamed from: g */
    public final boolean mo4307g(View view, int i, Bundle bundle) {
        if (i == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = this.f15651d;
            view.getHitRect(clockFaceView.f15628u);
            float centerX = clockFaceView.f15628u.centerX();
            float centerY = clockFaceView.f15628u.centerY();
            clockFaceView.f15627t.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.f15627t.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.mo4307g(view, i, bundle);
    }
}
