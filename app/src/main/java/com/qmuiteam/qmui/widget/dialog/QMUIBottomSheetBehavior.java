package com.qmuiteam.qmui.widget.dialog;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes3.dex */
public class QMUIBottomSheetBehavior<V extends ViewGroup> extends BottomSheetBehavior<V> {

    /* renamed from: e0 */
    public boolean f17676e0 = true;

    /* renamed from: f0 */
    public boolean f17677f0 = true;

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: g */
    public final boolean mo2599g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        ViewGroup viewGroup = (ViewGroup) view;
        if (this.f17676e0) {
            if (motionEvent.getAction() == 0) {
                this.f17677f0 = true;
            }
            if (this.f17677f0) {
                return super.mo2599g(coordinatorLayout, viewGroup, motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: q */
    public final boolean mo2598q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i, int i2) {
        ViewGroup viewGroup = (ViewGroup) view;
        if (!this.f17676e0) {
            return false;
        }
        return super.mo2598q(coordinatorLayout, viewGroup, view2, view3, i, i2);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: s */
    public final boolean mo2597s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        ViewGroup viewGroup = (ViewGroup) view;
        if (!this.f17676e0) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.f17677f0 = true;
        }
        if (!this.f17677f0) {
            return false;
        }
        return super.mo2597s(coordinatorLayout, viewGroup, motionEvent);
    }
}
