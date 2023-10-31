package com.vungle.warren.p058ui.view;

import android.util.Log;
import android.widget.ProgressBar;

/* renamed from: com.vungle.warren.ui.view.i */
/* loaded from: classes3.dex */
public final class RunnableC10051i implements Runnable {

    /* renamed from: a */
    public float f20238a = -2.0f;

    /* renamed from: b */
    public final /* synthetic */ C10048h f20239b;

    public RunnableC10051i(C10048h c10048h) {
        this.f20239b = c10048h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10048h c10048h = this.f20239b;
        try {
            FullAdWidget fullAdWidget = c10048h.f20216d;
            FullAdWidget fullAdWidget2 = c10048h.f20216d;
            if (fullAdWidget.f20190c.isPlaying()) {
                int currentVideoPosition = fullAdWidget2.getCurrentVideoPosition();
                int videoDuration = fullAdWidget2.getVideoDuration();
                if (videoDuration > 0) {
                    if (this.f20238a == -2.0f) {
                        this.f20238a = videoDuration;
                    }
                    c10048h.f20230g.m1345r(this.f20238a, currentVideoPosition);
                    float f = this.f20238a;
                    ProgressBar progressBar = fullAdWidget2.f20193f;
                    progressBar.setMax((int) f);
                    progressBar.setProgress(currentVideoPosition);
                }
            }
            c10048h.f20235l.postDelayed(this, 1000L);
        } catch (IllegalStateException unused) {
            Log.v(c10048h.f20215c, "IllegalStateException while reporting progress indicates activity was killed via SIGKILL.");
        }
    }
}
