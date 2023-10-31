package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5L */
/* loaded from: assets/audience_network.dex */
public final class C42335L implements MediaViewVideoRendererApi {
    public static byte[] A0G;
    public static String[] A0H = {"Ds1OlE9QLNwB", "aoTFD1mdY9qS2iG1b6xBMIzf9BXXSrYm", "osndMvDCAJCV1YpU", "nBivoQhUG9UhcV9idWewaYAmGQw5UcJS", "JB025Vwse6xgHKaH4PdlPsgjNbTaZijW", "Rr8Hg5ZtJOltbAd8rryGswWrdJNm13cq", "EfdUYpEvlCzoAxPYZB8PQhxNy", "DXUiKhR"};
    public static final String A0I;
    public MediaViewVideoRenderer A00;
    public VideoAutoplayBehavior A01;
    public C5953Xy A03;
    @Nullable
    public InterfaceC5099K0 A04;
    public C4553Al A05;
    public boolean A06;
    public boolean A07;
    @Nullable
    public NativeAd A08;
    public final AbstractC5161L4 A0D = new C4798F3(this);
    public final AbstractC5200Lj A0C = new C4797F2(this);
    public final AbstractC5216Lz A0B = new C4796F1(this);
    public final AbstractC5155Kx A0E = new C4793Ey(this);
    public final AbstractC5285N6 A09 = new C4791Ew(this);
    public final AbstractC5135Kc A0F = new C4783Eo(this);
    public final AbstractC5283N4 A0A = new C4782En(this);
    public C42265E A02 = new C42265E();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0G = new byte[]{-30, 7, 15, -6, 5, 2, -3, -71, -17, 2, -2, 16, -71, -4, 8, 7, 12, 13, 11, 14, -4, 13, 8, 11, -71, 9, -6, 11, -6, 6, 12, -71, 13, 18, 9, -2, -57, -34, -16, -16, -10, -12, -7, -14, -85, -8, 0, -2, -1, -85, -19, -16, -85, -5, -3, -16, -18, -16, -17, -16, -17, -85, -19, 4, -85, -20, -85, -18, -20, -9, -9, -85, -1, -6, -85, -16, -7, -14, -20, -14, -16, -34, -16, -16, -10, -73, -85, -20, -7, -17, -85, -15, -6, -9, -9, -6, 2, -16, -17, -85, -19, 4, -85, -20, -85, -18, -20, -9, -9, -85, -1, -6, -85, -17, -12, -2, -16, -7, -14, -20, -14, -16, -34, -16, -16, -10, -71, -27, -22, -12, -26, -17, -24, -30, -24, -26, -44, -26, -26, -20, -95, -28, -30, -19, -19, -26, -27, -95, -8, -22, -11, -23, -16, -10, -11, -95, -26, -17, -24, -30, -24, -26, -44, -26, -26, -20, -81, 74, 83, 76, 70, 76, 74, 56, 74, 74, 80, 5, 72, 70, 81, 81, 74, 73, 5, 92, 78, 89, 77, 84, 90, 89, 5, 73, 78, 88, 74, 83, 76, 70, 76, 74, 56, 74, 74, 80, 19};
    }

    static {
        A02();
        A0I = MediaViewVideoRenderer.class.getSimpleName();
    }

    public final void A03() {
        this.A00.pause(false);
        this.A05.setClientToken(null);
        this.A05.setVideoMPD(null);
        this.A05.setVideoURI((Uri) null);
        this.A05.setVideoCTA(null);
        this.A05.setNativeAd(null);
        this.A01 = VideoAutoplayBehavior.DEFAULT;
        NativeAd nativeAd = this.A08;
        if (nativeAd != null) {
            C5721UB.A0L(nativeAd.getInternalNativeAd()).A1c(false, false);
        }
        this.A08 = null;
        InterfaceC5099K0 interfaceC5099K0 = this.A04;
        if (interfaceC5099K0 != null) {
            interfaceC5099K0.AFI();
        }
    }

    public final void A04(NativeAd nativeAd) {
        this.A08 = nativeAd;
        this.A03.A0F(((C5721UB) nativeAd.getInternalNativeAd()).A11());
        C42345M c42345m = (C42345M) nativeAd.getNativeAdApi();
        this.A05.setClientToken(C5721UB.A0L(nativeAd.getInternalNativeAd()).A1B());
        this.A05.setVideoMPD(c42345m.A01());
        this.A05.setVideoURI(c42345m.A02());
        C6298da adapter = C5721UB.A0L(nativeAd.getInternalNativeAd()).A0y();
        if (adapter != null) {
            this.A05.setVideoProgressReportIntervalMs(adapter.A0B());
        }
        this.A05.setVideoCTA(nativeAd.getAdCallToAction());
        this.A05.setNativeAd(nativeAd);
        this.A01 = c42345m.getVideoAutoplayBehavior();
        InterfaceC5099K0 interfaceC5099K0 = this.A04;
        if (interfaceC5099K0 != null) {
            interfaceC5099K0.AEd(nativeAd);
        }
    }

    public final void A05(InterfaceC5080Jh interfaceC5080Jh) {
        this.A05.setAdEventManager(interfaceC5080Jh);
    }

    public final void A06(@Nullable InterfaceC5099K0 interfaceC5099K0) {
        this.A04 = interfaceC5099K0;
    }

    public final void A07(@Nullable InterfaceC5277My interfaceC5277My) {
        this.A05.setListener(interfaceC5277My);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void destroy() {
        this.A05.A0V();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void disengageSeek(VideoStartReason videoStartReason) {
        if (!this.A06) {
            boolean isDebugBuild = AdInternalSettings.isDebugBuild();
            if (A0H[6].length() != 25) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[0] = "WtsbSHtQErqq";
            strArr[2] = "XLMSbaKAMNULMDv3";
            if (isDebugBuild) {
                Log.w(A0I, A01(127, 40, 5));
                return;
            }
            return;
        }
        this.A06 = false;
        if (this.A07) {
            this.A05.A0b(C5241MO.A00(videoStartReason), 3);
        }
        this.A00.onSeekDisengaged();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void engageSeek() {
        if (this.A06) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.w(A0I, A01(167, 40, 105));
                return;
            }
            return;
        }
        this.A06 = true;
        this.A07 = EnumC5518Qt.A0A.equals(this.A05.getState());
        this.A05.A0e(false, 1);
        this.A00.onSeekEngaged();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    @IntRange(from = 0)
    public final int getCurrentTimeMs() {
        return this.A05.getCurrentPositionInMillis();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    @IntRange(from = 0)
    public final int getDuration() {
        return this.A05.getDuration();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final View getVideoView() {
        return this.A05.getVideoView();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    @FloatRange(from = 0.0d, m13045to = 1.0d)
    public final float getVolume() {
        return this.A05.getVolume();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaViewVideoRenderer mediaViewVideoRenderer) {
        C5953Xy A02;
        this.A00 = mediaViewVideoRenderer;
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C5953Xy) {
            A02 = (C5953Xy) context;
        } else {
            A02 = C42285G.A02(context);
        }
        this.A03 = A02;
        int initializationType = adViewConstructorParams.getInitializationType();
        if (initializationType == 0) {
            this.A05 = new C4553Al(A02);
        } else if (initializationType == 1) {
            this.A05 = new C4553Al(A02, adViewConstructorParams.getAttributeSet());
        } else if (initializationType == 2) {
            this.A05 = new C4553Al(A02, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr());
        } else if (initializationType == 3) {
            this.A05 = new C4553Al(A02, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleRes());
        } else {
            throw new IllegalArgumentException(A01(0, 37, 29));
        }
        this.A05.setEnableBackgroundVideo(mediaViewVideoRenderer.shouldAllowBackgroundPlayback());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.A05.setLayoutParams(layoutParams);
        this.A02.addView(this.A05, -1, layoutParams);
        EnumC5213Lw.A04(this.A05, EnumC5213Lw.A0A);
        this.A05.getEventBus().A03(this.A0D, this.A0C, this.A0B, this.A0E, this.A09, this.A0F, this.A0A);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void pause(boolean z) {
        this.A05.A0e(z, 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void play(VideoStartReason videoStartReason) {
        this.A05.A0b(C5241MO.A00(videoStartReason), 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void seekTo(@IntRange(from = 0) int i) {
        if (!this.A06) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.w(A0I, A01(37, 90, 15));
                return;
            }
            return;
        }
        this.A05.A0Y(i);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void setVolume(@FloatRange(from = 0.0d, m13045to = 1.0d) float f) {
        this.A05.setVolume(f);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final boolean shouldAutoplay() {
        C4553Al c4553Al = this.A05;
        if (c4553Al == null || c4553Al.getState() == EnumC5518Qt.A06) {
            return false;
        }
        return this.A01 == VideoAutoplayBehavior.ON || this.A01 == VideoAutoplayBehavior.DEFAULT;
    }
}
