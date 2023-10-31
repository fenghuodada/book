package com.google.android.material.datepicker;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.C0851a;
import androidx.core.view.accessibility.C0874o;
import com.ambrose.overwall.R;

/* renamed from: com.google.android.material.datepicker.m */
/* loaded from: classes3.dex */
public final class C7696m extends C0851a {

    /* renamed from: d */
    public final /* synthetic */ C7688j f14880d;

    public C7696m(C7688j c7688j) {
        this.f14880d = c7688j;
    }

    @Override // androidx.core.view.C0851a
    /* renamed from: d */
    public final void mo4308d(View view, @NonNull C0874o c0874o) {
        int i;
        this.f2597a.onInitializeAccessibilityNodeInfo(view, c0874o.f2606a);
        C7688j c7688j = this.f14880d;
        if (c7688j.f14871n.getVisibility() == 0) {
            i = R.string.mtrl_picker_toggle_to_year_selection;
        } else {
            i = R.string.mtrl_picker_toggle_to_day_selection;
        }
        c0874o.m11549i(c7688j.getString(i));
    }
}
