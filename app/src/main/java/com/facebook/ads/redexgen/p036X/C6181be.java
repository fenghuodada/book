package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;

/* renamed from: com.facebook.ads.redexgen.X.be */
/* loaded from: assets/audience_network.dex */
public class C6181be implements InterfaceC5277My {
    public final /* synthetic */ MediaViewListener A00;
    public final /* synthetic */ C6180bd A01;

    public C6181be(C6180bd c6180bd, MediaViewListener mediaViewListener) {
        this.A01 = c6180bd;
        this.A00 = mediaViewListener;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5277My
    public final void AAL() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onComplete(mediaView);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5277My
    public final void AAg() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onEnterFullscreen(mediaView);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5277My
    public final void AAm() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onExitFullscreen(mediaView);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5277My
    public final void AAs() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onFullscreenBackground(mediaView);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5277My
    public final void AAu() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onFullscreenForeground(mediaView);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5277My
    public final void ABl() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onPlay(mediaView);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5277My
    public final void ACt() {
        MediaView mediaView;
        MediaViewVideoRenderer mediaViewVideoRenderer;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewVideoRenderer = this.A01.A05;
        mediaViewListener.onVolumeChange(mediaView, mediaViewVideoRenderer.getVolume());
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5277My
    public final void onPause() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onPause(mediaView);
    }
}
