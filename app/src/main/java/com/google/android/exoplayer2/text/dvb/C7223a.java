package com.google.android.exoplayer2.text.dvb;

import com.google.android.exoplayer2.text.AbstractC7207a;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.dvb.a */
/* loaded from: classes.dex */
public final class C7223a extends AbstractC7207a {

    /* renamed from: m */
    public final C7224b f13099m;

    public C7223a(List<byte[]> list) {
        byte[] bArr = list.get(0);
        int length = bArr.length;
        this.f13099m = new C7224b(((bArr[0] & 255) << 8) | (bArr[1] & 255), (bArr[3] & 255) | ((bArr[2] & 255) << 8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x023d, code lost:
        if ((r4.f13115b + 1) == r2.f13109g.getHeight()) goto L93;
     */
    @Override // com.google.android.exoplayer2.text.AbstractC7207a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.text.InterfaceC7209c mo5287h(byte[] r31, int r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.dvb.C7223a.mo5287h(byte[], int, boolean):com.google.android.exoplayer2.text.c");
    }
}
