package com.facebook.ads.redexgen.p036X;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.os.Handler;
import androidx.annotation.NonNull;

@TargetApi(23)
/* renamed from: com.facebook.ads.redexgen.X.JA */
/* loaded from: assets/audience_network.dex */
public final class C5047JA implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ C40011Y A00;

    public C5047JA(C40011Y c40011y, MediaCodec mediaCodec) {
        this.A00 = c40011y;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(@NonNull MediaCodec mediaCodec, long j, long j2) {
        if (this != this.A00.A00) {
            return;
        }
        this.A00.A1R();
    }
}
