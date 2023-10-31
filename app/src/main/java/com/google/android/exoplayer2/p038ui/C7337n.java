package com.google.android.exoplayer2.p038ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import com.google.android.exoplayer2.text.Cue;

/* renamed from: com.google.android.exoplayer2.ui.n */
/* loaded from: classes.dex */
public final class C7337n {
    /* renamed from: a */
    public static void m5188a(Cue.C7206a c7206a) {
        Object[] spans;
        boolean z;
        c7206a.f12996k = -3.4028235E38f;
        c7206a.f12995j = Integer.MIN_VALUE;
        CharSequence charSequence = c7206a.f12986a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                c7206a.f12986a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = c7206a.f12986a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if (!(obj instanceof AbsoluteSizeSpan) && !(obj instanceof RelativeSizeSpan)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    /* renamed from: b */
    public static float m5187b(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else if (i != 1) {
            if (i != 2) {
                return -3.4028235E38f;
            }
            return f;
        } else {
            f2 = i2;
        }
        return f * f2;
    }
}
