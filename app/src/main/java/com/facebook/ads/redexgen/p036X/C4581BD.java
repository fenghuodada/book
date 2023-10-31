package com.facebook.ads.redexgen.p036X;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.BD */
/* loaded from: assets/audience_network.dex */
public final class C4581BD {
    public static final C4581BD A04 = new C4580BC().A00();
    public AudioAttributes A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C4581BD(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    @TargetApi(21)
    public final AudioAttributes A00() {
        if (this.A00 == null) {
            this.A00 = new AudioAttributes.Builder().setContentType(this.A01).setFlags(this.A02).setUsage(this.A03).build();
        }
        return this.A00;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4581BD c4581bd = (C4581BD) obj;
        return this.A01 == c4581bd.A01 && this.A02 == c4581bd.A02 && this.A03 == c4581bd.A03;
    }

    public final int hashCode() {
        int result = this.A02;
        return (((((17 * 31) + this.A01) * 31) + result) * 31) + this.A03;
    }
}
