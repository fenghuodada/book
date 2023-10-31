package com.applovin.impl.sdk.nativeAd;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.result.C0063d;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.p008a.C2649a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.AbstractC3287a;
import com.applovin.sdk.C3393R;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class AppLovinMediaView extends FrameLayout {
    private static final String TAG = "AppLovinMediaView";

    /* renamed from: ad */
    private final AppLovinNativeAdImpl f8458ad;
    private final ImageView imageView;
    private final boolean isVideoMuted;
    private final AbstractC3287a lifecycleCallbacksAdapter;
    private final C3349v logger;
    private MediaPlayer mediaPlayer;
    private final C3214m sdk;
    private final C3227a videoUiEventHandler;
    @Nullable
    private AppLovinVideoView videoView;

    /* renamed from: com.applovin.impl.sdk.nativeAd.AppLovinMediaView$a */
    /* loaded from: classes.dex */
    public class C3227a implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener {
        private C3227a() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (C3349v.m6862a()) {
                AppLovinMediaView.this.logger.m6855b(AppLovinMediaView.TAG, "Video completed");
            }
            if (AppLovinMediaView.this.videoView != null) {
                AppLovinMediaView.this.videoView.setVisibility(8);
            }
            AppLovinMediaView.this.imageView.setVisibility(0);
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (C3349v.m6862a()) {
                String str = "Video view error (" + i + "," + i2 + ")";
                C3349v c3349v = AppLovinMediaView.this.logger;
                StringBuilder m13052b = C0063d.m13052b("Encountered media error: ", str, " for ad: ");
                m13052b.append(AppLovinMediaView.this.f8458ad);
                c3349v.m6850e(AppLovinMediaView.TAG, m13052b.toString());
                return true;
            }
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (C3349v.m6862a()) {
                C3349v c3349v = AppLovinMediaView.this.logger;
                c3349v.m6855b(AppLovinMediaView.TAG, "MediaPlayer Info: (" + i + ", " + i2 + ")");
                return false;
            }
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            AppLovinMediaView.this.mediaPlayer = mediaPlayer;
            mediaPlayer.setOnInfoListener(AppLovinMediaView.this.videoUiEventHandler);
            mediaPlayer.setOnErrorListener(AppLovinMediaView.this.videoUiEventHandler);
            float f = !AppLovinMediaView.this.isVideoMuted ? 1 : 0;
            mediaPlayer.setVolume(f, f);
            if (C3349v.m6862a()) {
                AppLovinMediaView.this.logger.m6855b(AppLovinMediaView.TAG, "MediaPlayer prepared: " + AppLovinMediaView.this.mediaPlayer);
            }
        }
    }

    public AppLovinMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, C3214m c3214m, Context context) {
        super(context);
        C3227a c3227a = new C3227a();
        this.videoUiEventHandler = c3227a;
        AbstractC3287a abstractC3287a = new AbstractC3287a() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinMediaView.1
            @Override // com.applovin.impl.sdk.utils.AbstractC3287a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                if (AppLovinMediaView.this.videoView != null) {
                    AppLovinMediaView.this.videoView.pause();
                }
            }

            @Override // com.applovin.impl.sdk.utils.AbstractC3287a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                if (AppLovinMediaView.this.videoView != null) {
                    AppLovinMediaView.this.videoView.start();
                }
            }
        };
        this.lifecycleCallbacksAdapter = abstractC3287a;
        setBackgroundColor(-16777216);
        this.f8458ad = appLovinNativeAdImpl;
        this.sdk = c3214m;
        this.logger = c3214m.m7487A();
        this.isVideoMuted = true;
        LayoutInflater.from(context).inflate(C3393R.C3398layout.applovin_native_ad_media_view, (ViewGroup) this, true);
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        C2649a vastAd = appLovinNativeAdImpl.getVastAd();
        Uri mo7887h = vastAd != null ? vastAd.mo7887h() : null;
        if (mainImageUri == null && mo7887h == null) {
            throw new IllegalStateException("AppLovin native ad missing image AND video resources");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        setOnClickListener(appLovinNativeAdImpl.getClickHandler());
        ImageView imageView = (ImageView) findViewById(C3393R.C3396id.image_view);
        this.imageView = imageView;
        if (mainImageUri != null) {
            imageView.setImageURI(mainImageUri);
        }
        if (mo7887h != null) {
            c3214m.m7434af().m8069a(abstractC3287a);
            AppLovinVideoView appLovinVideoView = new AppLovinVideoView(context);
            this.videoView = appLovinVideoView;
            appLovinVideoView.setOnPreparedListener(c3227a);
            this.videoView.setOnCompletionListener(c3227a);
            this.videoView.setOnErrorListener(c3227a);
            this.videoView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            addView(this.videoView);
            this.videoView.setVideoURI(mo7887h);
            imageView.setVisibility(8);
        } else {
            this.videoView = null;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public void destroy() {
        setOnClickListener(null);
        this.sdk.m7434af().m8067b(this.lifecycleCallbacksAdapter);
        try {
            AppLovinVideoView appLovinVideoView = this.videoView;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.videoView.stopPlayback();
                this.videoView.setOnPreparedListener(null);
                this.videoView.setOnCompletionListener(null);
                this.videoView.setOnErrorListener(null);
                this.videoView = null;
            }
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                this.mediaPlayer = null;
            }
        } catch (Throwable th) {
            Log.d(TAG, "Encountered exception when destroying:" + th);
        }
        removeAllViews();
    }

    public float getAspectRatio() {
        Drawable drawable;
        ImageView imageView = this.imageView;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AppLovinVideoView appLovinVideoView = this.videoView;
        if (appLovinVideoView != null) {
            appLovinVideoView.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        AppLovinVideoView appLovinVideoView = this.videoView;
        if (appLovinVideoView != null) {
            appLovinVideoView.pause();
        }
        super.onDetachedFromWindow();
    }
}
