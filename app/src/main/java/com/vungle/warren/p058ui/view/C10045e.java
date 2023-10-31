package com.vungle.warren.p058ui.view;

import android.media.MediaPlayer;

/* renamed from: com.vungle.warren.ui.view.e */
/* loaded from: classes3.dex */
public final class C10045e implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ FullAdWidget f20227a;

    public C10045e(FullAdWidget fullAdWidget) {
        this.f20227a = fullAdWidget;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        MediaPlayer.OnErrorListener onErrorListener = this.f20227a.f20201n;
        if (onErrorListener != null) {
            return onErrorListener.onError(mediaPlayer, i, i2);
        }
        return false;
    }
}
