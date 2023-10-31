package com.vungle.warren.p058ui.view;

import android.media.MediaPlayer;
import android.os.Build;

/* renamed from: com.vungle.warren.ui.view.d */
/* loaded from: classes3.dex */
public final class C10044d implements MediaPlayer.OnPreparedListener {

    /* renamed from: a */
    public final /* synthetic */ FullAdWidget f20226a;

    public C10044d(FullAdWidget fullAdWidget) {
        this.f20226a = fullAdWidget;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        int i = Build.VERSION.SDK_INT;
        FullAdWidget fullAdWidget = this.f20226a;
        if (i >= 26) {
            mediaPlayer.seekTo(fullAdWidget.f20203p, 3);
        }
        MediaPlayer.OnPreparedListener onPreparedListener = fullAdWidget.f20200m;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(mediaPlayer);
        }
        fullAdWidget.f20194g.setVisibility(0);
    }
}
