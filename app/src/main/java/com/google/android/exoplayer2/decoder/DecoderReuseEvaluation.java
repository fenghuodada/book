package com.google.android.exoplayer2.decoder;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C0406q1;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.util.C7394a;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class DecoderReuseEvaluation {

    /* renamed from: a */
    public final String f10910a;

    /* renamed from: b */
    public final C7003m0 f10911b;

    /* renamed from: c */
    public final C7003m0 f10912c;

    /* renamed from: d */
    public final int f10913d;

    /* renamed from: e */
    public final int f10914e;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface DecoderDiscardReasons {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface DecoderReuseResult {
    }

    public DecoderReuseEvaluation(String str, C7003m0 c7003m0, C7003m0 c7003m02, int i, int i2) {
        boolean z;
        if (i != 0 && i2 != 0) {
            z = false;
        } else {
            z = true;
        }
        C7394a.m5134a(z);
        if (!TextUtils.isEmpty(str)) {
            this.f10910a = str;
            c7003m0.getClass();
            this.f10911b = c7003m0;
            c7003m02.getClass();
            this.f10912c = c7003m02;
            this.f10913d = i;
            this.f10914e = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DecoderReuseEvaluation.class != obj.getClass()) {
            return false;
        }
        DecoderReuseEvaluation decoderReuseEvaluation = (DecoderReuseEvaluation) obj;
        return this.f10913d == decoderReuseEvaluation.f10913d && this.f10914e == decoderReuseEvaluation.f10914e && this.f10910a.equals(decoderReuseEvaluation.f10910a) && this.f10911b.equals(decoderReuseEvaluation.f10911b) && this.f10912c.equals(decoderReuseEvaluation.f10912c);
    }

    public final int hashCode() {
        int m12537a = C0406q1.m12537a(this.f10910a, (((this.f10913d + 527) * 31) + this.f10914e) * 31, 31);
        return this.f10912c.hashCode() + ((this.f10911b.hashCode() + m12537a) * 31);
    }
}
