package com.facebook.ads.redexgen.p036X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.Qm */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC5511Qm implements View.OnTouchListener {
    public final /* synthetic */ TextureView$SurfaceTextureListenerC4984I7 A00;

    public View$OnTouchListenerC5511Qm(TextureView$SurfaceTextureListenerC4984I7 textureView$SurfaceTextureListenerC4984I7) {
        this.A00 = textureView$SurfaceTextureListenerC4984I7;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MediaController mediaController;
        MediaController mediaController2;
        MediaController mediaController3;
        MediaController mediaController4;
        mediaController = this.A00.A09;
        if (mediaController != null && motionEvent.getAction() == 1) {
            mediaController2 = this.A00.A09;
            if (mediaController2.isShowing()) {
                mediaController4 = this.A00.A09;
                mediaController4.hide();
            } else {
                mediaController3 = this.A00.A09;
                mediaController3.show();
            }
        }
        return true;
    }
}
