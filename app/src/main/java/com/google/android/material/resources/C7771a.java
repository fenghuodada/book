package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;
import com.google.android.material.internal.C7743b;
import com.google.android.material.internal.C7744c;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.resources.a */
/* loaded from: classes3.dex */
public final class C7771a extends AbstractC7778f {

    /* renamed from: a */
    public final Typeface f15134a;

    /* renamed from: b */
    public final InterfaceC7772a f15135b;

    /* renamed from: c */
    public boolean f15136c;

    /* renamed from: com.google.android.material.resources.a$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC7772a {
    }

    public C7771a(C7743b c7743b, Typeface typeface) {
        this.f15134a = typeface;
        this.f15135b = c7743b;
    }

    @Override // com.google.android.material.resources.AbstractC7778f
    /* renamed from: a */
    public final void mo4484a(int i) {
        if (!this.f15136c) {
            C7744c c7744c = ((C7743b) this.f15135b).f15026a;
            if (c7744c.m4521j(this.f15134a)) {
                c7744c.m4523h(false);
            }
        }
    }

    @Override // com.google.android.material.resources.AbstractC7778f
    /* renamed from: b */
    public final void mo4483b(Typeface typeface, boolean z) {
        if (!this.f15136c) {
            C7744c c7744c = ((C7743b) this.f15135b).f15026a;
            if (c7744c.m4521j(typeface)) {
                c7744c.m4523h(false);
            }
        }
    }
}
