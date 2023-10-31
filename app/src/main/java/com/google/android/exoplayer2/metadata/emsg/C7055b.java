package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.exoplayer2.metadata.AbstractC7062g;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.metadata.C7048d;
import com.google.android.exoplayer2.util.C7436v;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.emsg.b */
/* loaded from: classes.dex */
public final class C7055b extends AbstractC7062g {
    @Override // com.google.android.exoplayer2.metadata.AbstractC7062g
    /* renamed from: b */
    public final C7042a mo5507b(C7048d c7048d, ByteBuffer byteBuffer) {
        C7436v c7436v = new C7436v(byteBuffer.array(), byteBuffer.limit());
        String m5007k = c7436v.m5007k();
        m5007k.getClass();
        String m5007k2 = c7436v.m5007k();
        m5007k2.getClass();
        return new C7042a(new C7053a(m5007k, m5007k2, c7436v.m5008j(), c7436v.m5008j(), Arrays.copyOfRange(c7436v.f13978a, c7436v.f13979b, c7436v.f13980c)));
    }
}
