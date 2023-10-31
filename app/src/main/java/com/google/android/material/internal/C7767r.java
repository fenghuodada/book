package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;
import androidx.annotation.RestrictTo;

@SuppressLint({"AppCompatCustomView"})
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.r */
/* loaded from: classes3.dex */
public class C7767r extends ImageButton {

    /* renamed from: a */
    public int f15129a;

    /* renamed from: b */
    public final void m4503b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f15129a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f15129a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        m4503b(i, true);
    }
}
