package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.audio.C6697g0;
import com.google.android.exoplayer2.extractor.C6819d;

/* renamed from: com.google.android.exoplayer2.extractor.mp3.a */
/* loaded from: classes.dex */
public final class C6855a extends C6819d implements InterfaceC6858d {
    public C6855a(long j, long j2, C6697g0.C6698a c6698a) {
        super(c6698a.f10729f, c6698a.f10726c, j, j2);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.InterfaceC6858d
    /* renamed from: a */
    public final long mo5898a() {
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.InterfaceC6858d
    /* renamed from: d */
    public final long mo5897d(long j) {
        return ((Math.max(0L, j - this.f11118b) * 8) * 1000000) / this.f11121e;
    }
}
