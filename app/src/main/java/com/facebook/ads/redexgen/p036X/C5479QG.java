package com.facebook.ads.redexgen.p036X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.QG */
/* loaded from: assets/audience_network.dex */
public class C5479QG implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C43867v A00;

    public C5479QG(C43867v c43867v) {
        this.A00 = c43867v;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new C5129KW(this, i));
    }
}
