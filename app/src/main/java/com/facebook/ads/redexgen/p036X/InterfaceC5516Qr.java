package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Qr */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC5516Qr {
    void A7u();

    boolean A85();

    boolean A86();

    boolean A8b();

    void AD5(boolean z, int i);

    void AEr(int i);

    void AEw(EnumC5469Q6 enumC5469Q6, int i);

    void AF3(int i);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC5469Q6 getStartReason();

    EnumC5518Qt getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i);

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f);

    void setVideoMPD(@Nullable String str);

    void setVideoStateChangeListener(@Nullable InterfaceC5519Qu interfaceC5519Qu);

    void setup(Uri uri);
}
