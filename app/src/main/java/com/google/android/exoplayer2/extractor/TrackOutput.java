package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.upstream.InterfaceC7361g;
import com.google.android.exoplayer2.util.C7436v;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes.dex */
public interface TrackOutput {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface SampleDataPart {
    }

    /* renamed from: com.google.android.exoplayer2.extractor.TrackOutput$a */
    /* loaded from: classes.dex */
    public static final class C6809a {

        /* renamed from: a */
        public final int f11067a;

        /* renamed from: b */
        public final byte[] f11068b;

        /* renamed from: c */
        public final int f11069c;

        /* renamed from: d */
        public final int f11070d;

        public C6809a(int i, byte[] bArr, int i2, int i3) {
            this.f11067a = i;
            this.f11068b = bArr;
            this.f11069c = i2;
            this.f11070d = i3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C6809a.class != obj.getClass()) {
                return false;
            }
            C6809a c6809a = (C6809a) obj;
            return this.f11067a == c6809a.f11067a && this.f11069c == c6809a.f11069c && this.f11070d == c6809a.f11070d && Arrays.equals(this.f11068b, c6809a.f11068b);
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f11068b) + (this.f11067a * 31)) * 31) + this.f11069c) * 31) + this.f11070d;
        }
    }

    /* renamed from: a */
    int mo5455a(InterfaceC7361g interfaceC7361g, int i, boolean z) throws IOException;

    /* renamed from: b */
    void mo5454b(int i, C7436v c7436v);

    /* renamed from: c */
    void mo5453c(C7436v c7436v, int i);

    /* renamed from: d */
    void mo5452d(long j, int i, int i2, int i3, @Nullable C6809a c6809a);

    /* renamed from: e */
    void mo5451e(C7003m0 c7003m0);
}
