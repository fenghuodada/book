package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.i */
/* loaded from: classes3.dex */
public final class C7752i {

    /* renamed from: a */
    public CharSequence f15101a;

    /* renamed from: b */
    public final TextPaint f15102b;

    /* renamed from: c */
    public final int f15103c;

    /* renamed from: d */
    public int f15104d;

    /* renamed from: k */
    public boolean f15111k;

    /* renamed from: e */
    public Layout.Alignment f15105e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f */
    public int f15106f = Integer.MAX_VALUE;

    /* renamed from: g */
    public float f15107g = 0.0f;

    /* renamed from: h */
    public float f15108h = 1.0f;

    /* renamed from: i */
    public int f15109i = 1;

    /* renamed from: j */
    public boolean f15110j = true;
    @Nullable

    /* renamed from: l */
    public TextUtils.TruncateAt f15112l = null;

    /* renamed from: com.google.android.material.internal.i$a */
    /* loaded from: classes3.dex */
    public static class C7753a extends Exception {
    }

    public C7752i(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f15101a = charSequence;
        this.f15102b = textPaint;
        this.f15103c = i;
        this.f15104d = charSequence.length();
    }

    /* renamed from: a */
    public final StaticLayout m4513a() throws C7753a {
        if (this.f15101a == null) {
            this.f15101a = "";
        }
        int max = Math.max(0, this.f15103c);
        CharSequence charSequence = this.f15101a;
        int i = this.f15106f;
        TextPaint textPaint = this.f15102b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f15112l);
        }
        int min = Math.min(charSequence.length(), this.f15104d);
        this.f15104d = min;
        if (this.f15111k && this.f15106f == 1) {
            this.f15105e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f15105e);
        obtain.setIncludePad(this.f15110j);
        obtain.setTextDirection(this.f15111k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f15112l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f15106f);
        float f = this.f15107g;
        if (f != 0.0f || this.f15108h != 1.0f) {
            obtain.setLineSpacing(f, this.f15108h);
        }
        if (this.f15106f > 1) {
            obtain.setHyphenationFrequency(this.f15109i);
        }
        return obtain.build();
    }
}
