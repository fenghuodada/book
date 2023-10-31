package com.google.android.material.resources;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;

/* renamed from: com.google.android.material.resources.e */
/* loaded from: classes3.dex */
public final class C7777e extends AbstractC7778f {

    /* renamed from: a */
    public final /* synthetic */ Context f15153a;

    /* renamed from: b */
    public final /* synthetic */ TextPaint f15154b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC7778f f15155c;

    /* renamed from: d */
    public final /* synthetic */ C7775d f15156d;

    public C7777e(C7775d c7775d, Context context, TextPaint textPaint, AbstractC7778f abstractC7778f) {
        this.f15156d = c7775d;
        this.f15153a = context;
        this.f15154b = textPaint;
        this.f15155c = abstractC7778f;
    }

    @Override // com.google.android.material.resources.AbstractC7778f
    /* renamed from: a */
    public final void mo4484a(int i) {
        this.f15155c.mo4484a(i);
    }

    @Override // com.google.android.material.resources.AbstractC7778f
    /* renamed from: b */
    public final void mo4483b(@NonNull Typeface typeface, boolean z) {
        this.f15156d.m4485g(this.f15153a, this.f15154b, typeface);
        this.f15155c.mo4483b(typeface, z);
    }
}
