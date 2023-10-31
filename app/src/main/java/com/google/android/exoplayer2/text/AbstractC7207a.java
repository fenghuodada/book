package com.google.android.exoplayer2.text;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.AbstractC6749g;
import com.google.android.exoplayer2.decoder.AbstractC6751h;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.C7394a;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.text.a */
/* loaded from: classes.dex */
public abstract class AbstractC7207a extends AbstractC6751h<C7237g, AbstractC7238h, C7234e> implements InterfaceC7222d {
    public AbstractC7207a() {
        super(new C7237g[2], new AbstractC7238h[2]);
        boolean z;
        int i = this.f10936g;
        DecoderInputBuffer[] decoderInputBufferArr = this.f10934e;
        if (i == decoderInputBufferArr.length) {
            z = true;
        } else {
            z = false;
        }
        C7394a.m5131d(z);
        for (DecoderInputBuffer decoderInputBuffer : decoderInputBufferArr) {
            decoderInputBuffer.m6020j(1024);
        }
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7222d
    /* renamed from: a */
    public final void mo5344a(long j) {
    }

    @Override // com.google.android.exoplayer2.decoder.AbstractC6751h
    /* renamed from: e */
    public final C7234e mo5371e(Throwable th) {
        return new C7234e("Unexpected decode error", th);
    }

    @Override // com.google.android.exoplayer2.decoder.AbstractC6751h
    @Nullable
    /* renamed from: f */
    public final C7234e mo5370f(DecoderInputBuffer decoderInputBuffer, AbstractC6749g abstractC6749g, boolean z) {
        C7237g c7237g = (C7237g) decoderInputBuffer;
        AbstractC7238h abstractC7238h = (AbstractC7238h) abstractC6749g;
        try {
            ByteBuffer byteBuffer = c7237g.f10904c;
            byteBuffer.getClass();
            abstractC7238h.m5337i(c7237g.f10906e, mo5287h(byteBuffer.array(), byteBuffer.limit(), z), c7237g.f13152i);
            abstractC7238h.f10915a &= Integer.MAX_VALUE;
            return null;
        } catch (C7234e e) {
            return e;
        }
    }

    /* renamed from: h */
    public abstract InterfaceC7209c mo5287h(byte[] bArr, int i, boolean z) throws C7234e;
}
