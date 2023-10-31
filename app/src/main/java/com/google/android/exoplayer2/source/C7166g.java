package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C7121n0;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* renamed from: com.google.android.exoplayer2.source.g */
/* loaded from: classes.dex */
public final class C7166g implements SampleStream {
    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: a */
    public final int mo5436a(C7121n0 c7121n0, DecoderInputBuffer decoderInputBuffer, int i) {
        decoderInputBuffer.f10915a = 4;
        return -4;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: b */
    public final void mo5435b() {
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: c */
    public final int mo5434c(long j) {
        return 0;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: d */
    public final boolean mo5433d() {
        return true;
    }
}
