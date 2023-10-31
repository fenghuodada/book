package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ogg.C6889b;
import com.google.android.exoplayer2.util.C7436v;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.google.android.exoplayer2.extractor.ogg.h */
/* loaded from: classes.dex */
public abstract class AbstractC6896h {

    /* renamed from: b */
    public TrackOutput f11587b;

    /* renamed from: c */
    public InterfaceC6833i f11588c;

    /* renamed from: d */
    public InterfaceC6894f f11589d;

    /* renamed from: e */
    public long f11590e;

    /* renamed from: f */
    public long f11591f;

    /* renamed from: g */
    public long f11592g;

    /* renamed from: h */
    public int f11593h;

    /* renamed from: i */
    public int f11594i;

    /* renamed from: k */
    public long f11596k;

    /* renamed from: l */
    public boolean f11597l;

    /* renamed from: m */
    public boolean f11598m;

    /* renamed from: a */
    public final C6892d f11586a = new C6892d();

    /* renamed from: j */
    public C6897a f11595j = new C6897a();

    /* renamed from: com.google.android.exoplayer2.extractor.ogg.h$a */
    /* loaded from: classes.dex */
    public static class C6897a {

        /* renamed from: a */
        public C7003m0 f11599a;

        /* renamed from: b */
        public C6889b.C6890a f11600b;
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ogg.h$b */
    /* loaded from: classes.dex */
    public static final class C6898b implements InterfaceC6894f {
        @Override // com.google.android.exoplayer2.extractor.ogg.InterfaceC6894f
        /* renamed from: a */
        public final long mo5858a(C6820e c6820e) {
            return -1L;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.InterfaceC6894f
        /* renamed from: b */
        public final InterfaceC6905t mo5857b() {
            return new InterfaceC6905t.C6907b(-9223372036854775807L);
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.InterfaceC6894f
        /* renamed from: c */
        public final void mo5856c(long j) {
        }
    }

    /* renamed from: a */
    public void mo5855a(long j) {
        this.f11592g = j;
    }

    /* renamed from: b */
    public abstract long mo5854b(C7436v c7436v);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    public abstract boolean mo5853c(C7436v c7436v, long j, C6897a c6897a) throws IOException;

    /* renamed from: d */
    public void mo5852d(boolean z) {
        int i;
        if (z) {
            this.f11595j = new C6897a();
            this.f11591f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.f11593h = i;
        this.f11590e = -1L;
        this.f11592g = 0L;
    }
}
