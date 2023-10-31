package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.upstream.InterfaceC7361g;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.h */
/* loaded from: classes.dex */
public interface InterfaceC6832h extends InterfaceC7361g {
    /* renamed from: a */
    boolean mo5930a(byte[] bArr, int i, int i2, boolean z) throws IOException;

    /* renamed from: b */
    void mo5929b(int i, byte[] bArr, int i2) throws IOException;

    /* renamed from: d */
    boolean mo5928d(byte[] bArr, int i, int i2, boolean z) throws IOException;

    /* renamed from: e */
    long mo5927e();

    /* renamed from: f */
    void mo5926f(int i) throws IOException;

    long getLength();

    long getPosition();

    /* renamed from: i */
    void mo5925i();

    /* renamed from: j */
    void mo5924j(int i) throws IOException;

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7361g
    int read(byte[] bArr, int i, int i2) throws IOException;

    void readFully(byte[] bArr, int i, int i2) throws IOException;
}
