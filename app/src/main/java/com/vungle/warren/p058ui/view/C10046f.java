package com.vungle.warren.p058ui.view;

import android.media.MediaPlayer;

/* renamed from: com.vungle.warren.ui.view.f */
/* loaded from: classes3.dex */
public final class C10046f implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ FullAdWidget f20228a;

    public C10046f(FullAdWidget fullAdWidget) {
        this.f20228a = fullAdWidget;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        FullAdWidget fullAdWidget = this.f20228a;
        MediaPlayer.OnCompletionListener onCompletionListener = fullAdWidget.f20202o;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(mediaPlayer);
        }
        fullAdWidget.f20194g.setEnabled(false);
    }
}
