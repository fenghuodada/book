package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.InterfaceC7361g;
import com.google.android.exoplayer2.util.C7436v;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.g */
/* loaded from: classes.dex */
public final class C6831g implements TrackOutput {

    /* renamed from: a */
    public final byte[] f11180a = new byte[4096];

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: a */
    public final int mo5455a(InterfaceC7361g interfaceC7361g, int i, boolean z) {
        return m5935f(interfaceC7361g, i, z);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: b */
    public final void mo5454b(int i, C7436v c7436v) {
        c7436v.m5018A(i);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: c */
    public final void mo5453c(C7436v c7436v, int i) {
        c7436v.m5018A(i);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: d */
    public final void mo5452d(long j, int i, int i2, int i3, @Nullable TrackOutput.C6809a c6809a) {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: e */
    public final void mo5451e(C7003m0 c7003m0) {
    }

    /* renamed from: f */
    public final int m5935f(InterfaceC7361g interfaceC7361g, int i, boolean z) throws IOException {
        byte[] bArr = this.f11180a;
        int read = interfaceC7361g.read(bArr, 0, Math.min(bArr.length, i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }
}
