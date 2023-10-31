package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.audio.C6702h0;
import com.google.android.exoplayer2.extractor.ogg.AbstractC6896h;
import com.google.android.exoplayer2.util.C7436v;
import java.util.ArrayList;
import java.util.Arrays;
import okio.Utf8;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.google.android.exoplayer2.extractor.ogg.g */
/* loaded from: classes.dex */
public final class C6895g extends AbstractC6896h {

    /* renamed from: o */
    public static final byte[] f11584o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    public boolean f11585n;

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC6896h
    /* renamed from: b */
    public final long mo5854b(C7436v c7436v) {
        int i;
        int i2;
        byte[] bArr = c7436v.f13978a;
        int i3 = bArr[0] & 255;
        int i4 = i3 & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = bArr[1] & Utf8.REPLACEMENT_BYTE;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i6 & 1);
        } else if (i6 == 3) {
            i2 = 60000;
        } else {
            i2 = 10000 << i6;
        }
        return (this.f11594i * (i * i2)) / 1000000;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC6896h
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    public final boolean mo5853c(C7436v c7436v, long j, AbstractC6896h.C6897a c6897a) {
        boolean z = true;
        if (!this.f11585n) {
            byte[] copyOf = Arrays.copyOf(c7436v.f13978a, c7436v.f13980c);
            ArrayList m6061b = C6702h0.m6061b(copyOf);
            C7003m0.C7005b c7005b = new C7003m0.C7005b();
            c7005b.f12316k = "audio/opus";
            c7005b.f12329x = copyOf[9] & 255;
            c7005b.f12330y = 48000;
            c7005b.f12318m = m6061b;
            c6897a.f11599a = new C7003m0(c7005b);
            this.f11585n = true;
            return true;
        }
        c6897a.f11599a.getClass();
        if (c7436v.m5015c() != 1332770163) {
            z = false;
        }
        c7436v.m4992z(0);
        return z;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC6896h
    /* renamed from: d */
    public final void mo5852d(boolean z) {
        super.mo5852d(z);
        if (z) {
            this.f11585n = false;
        }
    }
}
