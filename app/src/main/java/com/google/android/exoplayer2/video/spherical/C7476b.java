package com.google.android.exoplayer2.video.spherical;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC6974h;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.C7121n0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7436v;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.video.spherical.b */
/* loaded from: classes.dex */
public final class C7476b extends AbstractC6974h {

    /* renamed from: l */
    public final DecoderInputBuffer f14131l;

    /* renamed from: m */
    public final C7436v f14132m;

    /* renamed from: n */
    public long f14133n;
    @Nullable

    /* renamed from: o */
    public InterfaceC7475a f14134o;

    /* renamed from: p */
    public long f14135p;

    public C7476b() {
        super(6);
        this.f14131l = new DecoderInputBuffer(1);
        this.f14132m = new C7436v();
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: A */
    public final void mo4923A(long j, boolean z) {
        this.f14135p = Long.MIN_VALUE;
        InterfaceC7475a interfaceC7475a = this.f14134o;
        if (interfaceC7475a != null) {
            interfaceC7475a.mo4910c();
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: E */
    public final void mo4922E(C7003m0[] c7003m0Arr, long j, long j2) {
        this.f14133n = j2;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    /* renamed from: a */
    public final int mo4921a(C7003m0 c7003m0) {
        return "application/x-camera-motion".equals(c7003m0.f12287l) ? 4 : 0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: b */
    public final boolean mo4920b() {
        return mo5708g();
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: d */
    public final boolean mo4919d() {
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: o */
    public final void mo4918o(long j, long j2) {
        float[] fArr;
        while (!mo5708g() && this.f14135p < 100000 + j) {
            DecoderInputBuffer decoderInputBuffer = this.f14131l;
            decoderInputBuffer.mo5603h();
            C7121n0 c7121n0 = this.f12127b;
            c7121n0.m5503a();
            if (m5710F(c7121n0, decoderInputBuffer, 0) == -4 && !decoderInputBuffer.m6018f(4)) {
                this.f14135p = decoderInputBuffer.f10906e;
                if (this.f14134o != null && !decoderInputBuffer.m6017g()) {
                    decoderInputBuffer.m6019k();
                    ByteBuffer byteBuffer = decoderInputBuffer.f10904c;
                    int i = C7408g0.f13905a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        C7436v c7436v = this.f14132m;
                        c7436v.m4994x(limit, array);
                        c7436v.m4992z(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i2 = 0; i2 < 3; i2++) {
                            fArr2[i2] = Float.intBitsToFloat(c7436v.m5013e());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.f14134o.mo4912a(this.f14135p - this.f14133n, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h, com.google.android.exoplayer2.C6733b1.InterfaceC6735b
    /* renamed from: p */
    public final void mo4917p(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (i == 7) {
            this.f14134o = (InterfaceC7475a) obj;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: y */
    public final void mo4916y() {
        InterfaceC7475a interfaceC7475a = this.f14134o;
        if (interfaceC7475a != null) {
            interfaceC7475a.mo4910c();
        }
    }
}
