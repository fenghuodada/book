package com.facebook.ads.redexgen.p036X;

import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.Ql */
/* loaded from: assets/audience_network.dex */
public class C5510Ql implements MediaController.MediaPlayerControl {
    public static String[] A01 = {"T46fCpiGc88W2sm67KitVw29EyPc3", "CnzVRlVQiaWVzZBS", "ndpW2a6BPo0GfPTTlqn3VUL3zbZB353", "6dBvfVqLyh6nhF4N5m", "imXeYKfRY50epxOYIoCDJpdee5DGPOn9", "a2YCts1Ck8i", "mjIxnllGj7l0AybsaVU42LegCoMqgA9", "OPSSIwvLFtyh4B3JmayX8W92hCUnvGiN"};
    public final /* synthetic */ TextureView$SurfaceTextureListenerC4984I7 A00;

    public C5510Ql(TextureView$SurfaceTextureListenerC4984I7 textureView$SurfaceTextureListenerC4984I7) {
        this.A00 = textureView$SurfaceTextureListenerC4984I7;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        C5505Qg c5505Qg;
        C5505Qg c5505Qg2;
        c5505Qg = this.A00.A0C;
        if (c5505Qg != null) {
            c5505Qg2 = this.A00.A0C;
            return c5505Qg2.A04();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        C5505Qg c5505Qg;
        C5505Qg c5505Qg2;
        c5505Qg = this.A00.A0C;
        if (c5505Qg != null) {
            c5505Qg2 = this.A00.A0C;
            return c5505Qg2.A05();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        C5505Qg c5505Qg;
        C5505Qg c5505Qg2;
        c5505Qg = this.A00.A0C;
        if (c5505Qg != null) {
            c5505Qg2 = this.A00.A0C;
            if (c5505Qg2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC5519Qu interfaceC5519Qu;
        InterfaceC5519Qu interfaceC5519Qu2;
        interfaceC5519Qu = this.A00.A0F;
        if (interfaceC5519Qu != null) {
            interfaceC5519Qu2 = this.A00.A0F;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[3] = "BHfWGVDMvGTMo8ZI3A6S5KtrLH6Ee";
            interfaceC5519Qu2.ABR();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        InterfaceC5519Qu interfaceC5519Qu;
        InterfaceC5519Qu interfaceC5519Qu2;
        interfaceC5519Qu = this.A00.A0F;
        if (interfaceC5519Qu != null) {
            interfaceC5519Qu2 = this.A00.A0F;
            interfaceC5519Qu2.ABS();
        }
    }
}
