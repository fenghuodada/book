package com.google.android.exoplayer2.extractor.ogg;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.C6844l;
import com.google.android.exoplayer2.extractor.C6846m;
import com.google.android.exoplayer2.extractor.C6884n;
import com.google.android.exoplayer2.extractor.C6885o;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.extractor.ogg.AbstractC6896h;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7436v;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.google.android.exoplayer2.extractor.ogg.b */
/* loaded from: classes.dex */
public final class C6889b extends AbstractC6896h {
    @Nullable

    /* renamed from: n */
    public C6885o f11563n;
    @Nullable

    /* renamed from: o */
    public C6890a f11564o;

    /* renamed from: com.google.android.exoplayer2.extractor.ogg.b$a */
    /* loaded from: classes.dex */
    public static final class C6890a implements InterfaceC6894f {

        /* renamed from: a */
        public final C6885o f11565a;

        /* renamed from: b */
        public final C6885o.C6886a f11566b;

        /* renamed from: c */
        public long f11567c = -1;

        /* renamed from: d */
        public long f11568d = -1;

        public C6890a(C6885o c6885o, C6885o.C6886a c6886a) {
            this.f11565a = c6885o;
            this.f11566b = c6886a;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.InterfaceC6894f
        /* renamed from: a */
        public final long mo5858a(C6820e c6820e) {
            long j = this.f11568d;
            if (j >= 0) {
                long j2 = -(j + 2);
                this.f11568d = -1L;
                return j2;
            }
            return -1L;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.InterfaceC6894f
        /* renamed from: b */
        public final InterfaceC6905t mo5857b() {
            C7394a.m5131d(this.f11567c != -1);
            return new C6884n(this.f11565a, this.f11567c);
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.InterfaceC6894f
        /* renamed from: c */
        public final void mo5856c(long j) {
            long[] jArr = this.f11566b.f11548a;
            this.f11568d = jArr[C7408g0.m5101e(jArr, j, true)];
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC6896h
    /* renamed from: b */
    public final long mo5854b(C7436v c7436v) {
        boolean z;
        byte[] bArr = c7436v.f13978a;
        if (bArr[0] == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            c7436v.m5018A(4);
            c7436v.m4996v();
        }
        int m5920b = C6844l.m5920b(i, c7436v);
        c7436v.m4992z(0);
        return m5920b;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC6896h
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    public final boolean mo5853c(C7436v c7436v, long j, AbstractC6896h.C6897a c6897a) {
        boolean z;
        byte[] bArr = c7436v.f13978a;
        C6885o c6885o = this.f11563n;
        if (c6885o == null) {
            C6885o c6885o2 = new C6885o(bArr, 17);
            this.f11563n = c6885o2;
            c6897a.f11599a = c6885o2.m5864d(Arrays.copyOfRange(bArr, 9, c7436v.f13980c), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) == 3) {
            C6885o.C6886a m5919a = C6846m.m5919a(c7436v);
            C6885o c6885o3 = new C6885o(c6885o.f11536a, c6885o.f11537b, c6885o.f11538c, c6885o.f11539d, c6885o.f11540e, c6885o.f11542g, c6885o.f11543h, c6885o.f11545j, m5919a, c6885o.f11547l);
            this.f11563n = c6885o3;
            this.f11564o = new C6890a(c6885o3, m5919a);
            return true;
        }
        if (b == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        C6890a c6890a = this.f11564o;
        if (c6890a != null) {
            c6890a.f11567c = j;
            c6897a.f11600b = c6890a;
        }
        c6897a.f11599a.getClass();
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC6896h
    /* renamed from: d */
    public final void mo5852d(boolean z) {
        super.mo5852d(z);
        if (z) {
            this.f11563n = null;
            this.f11564o = null;
        }
    }
}
