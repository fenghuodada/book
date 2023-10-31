package com.applovin.impl.adview.activity.p010b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.support.p000v4.media.session.C0017a;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.activity.result.C0063d;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.C0539e;
import com.applovin.adview.AppLovinAdView;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.adview.C2671a;
import com.applovin.impl.adview.C2776j;
import com.applovin.impl.adview.C2789m;
import com.applovin.impl.adview.C2802s;
import com.applovin.impl.adview.C2803t;
import com.applovin.impl.adview.C2804u;
import com.applovin.impl.adview.activity.p009a.C2682c;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p029ad.C3075a;
import com.applovin.impl.sdk.p029ad.InterfaceC3087g;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.p033e.C3189z;
import com.applovin.impl.sdk.utils.C3294g;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.impl.sdk.utils.C3340q;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C3393R;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.f */
/* loaded from: classes.dex */
public class C2724f extends AbstractC2688a implements AppLovinCommunicatorSubscriber {

    /* renamed from: A */
    protected long f6498A;

    /* renamed from: B */
    protected boolean f6499B;

    /* renamed from: C */
    private final C2682c f6500C;

    /* renamed from: D */
    private MediaPlayer f6501D;

    /* renamed from: E */
    private final C2737b f6502E;

    /* renamed from: F */
    private final C2736a f6503F;

    /* renamed from: G */
    private final Handler f6504G;

    /* renamed from: H */
    private final boolean f6505H;

    /* renamed from: I */
    private int f6506I;

    /* renamed from: J */
    private int f6507J;

    /* renamed from: K */
    private boolean f6508K;

    /* renamed from: L */
    private final AtomicBoolean f6509L;

    /* renamed from: M */
    private final AtomicBoolean f6510M;

    /* renamed from: N */
    private long f6511N;

    /* renamed from: O */
    private long f6512O;

    /* renamed from: s */
    protected final AppLovinVideoView f6513s;

    /* renamed from: t */
    protected final C2671a f6514t;
    @Nullable

    /* renamed from: u */
    protected final C2789m f6515u;
    @Nullable

    /* renamed from: v */
    protected final ImageView f6516v;
    @Nullable

    /* renamed from: w */
    protected final C2803t f6517w;
    @Nullable

    /* renamed from: x */
    protected final ProgressBar f6518x;

    /* renamed from: y */
    protected final C2776j f6519y;

    /* renamed from: z */
    protected boolean f6520z;

    /* renamed from: com.applovin.impl.adview.activity.b.f$a */
    /* loaded from: classes.dex */
    public class C2736a implements C2804u.InterfaceC2805a {
        private C2736a() {
        }

        @Override // com.applovin.impl.adview.C2804u.InterfaceC2805a
        /* renamed from: a */
        public void mo8872a(C2803t c2803t) {
            if (C3349v.m6862a()) {
                C2724f.this.f6407c.m6855b("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            C2724f.this.mo9085a(c2803t.getAndClearLastClickLocation());
        }

        @Override // com.applovin.impl.adview.C2804u.InterfaceC2805a
        /* renamed from: b */
        public void mo8871b(C2803t c2803t) {
            if (C3349v.m6862a()) {
                C2724f.this.f6407c.m6855b("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            C2724f.this.mo9052h();
        }

        @Override // com.applovin.impl.adview.C2804u.InterfaceC2805a
        /* renamed from: c */
        public void mo8870c(C2803t c2803t) {
            if (C3349v.m6862a()) {
                C2724f.this.f6407c.m6855b("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            C2724f.this.mo9077c();
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.f$b */
    /* loaded from: classes.dex */
    public class C2737b implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, AppLovinTouchToClickListener.OnClickListener {
        private C2737b() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, PointF pointF) {
            C2724f.this.mo9085a(pointF);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (C3349v.m6862a()) {
                C2724f.this.f6407c.m6855b("AppLovinFullscreenActivity", "Video completed");
            }
            C2724f.this.f6508K = true;
            C2724f.this.mo9065y();
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C2724f c2724f = C2724f.this;
            c2724f.mo9074c("Video view error (" + i + "," + i2 + ")");
            C2724f.this.f6513s.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2724f.this.f6407c;
                c3349v.m6855b("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i + ", " + i2 + ")");
            }
            if (i == 701) {
                C2724f.this.mo9068v();
                C2724f.this.f6408d.m7737g();
                return false;
            } else if (i != 3) {
                if (i == 702) {
                    C2724f.this.mo9067w();
                    return false;
                }
                return false;
            } else {
                C2724f.this.f6519y.m8946a();
                C2724f c2724f = C2724f.this;
                if (c2724f.f6515u != null) {
                    c2724f.m9088A();
                }
                C2724f.this.mo9067w();
                if (C2724f.this.f6421q.m7829c()) {
                    C2724f.this.mo9053e();
                    return false;
                }
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            C2724f.this.f6501D = mediaPlayer;
            mediaPlayer.setOnInfoListener(C2724f.this.f6502E);
            mediaPlayer.setOnErrorListener(C2724f.this.f6502E);
            float f = !C2724f.this.f6520z ? 1 : 0;
            mediaPlayer.setVolume(f, f);
            C2724f.this.mo9076c(mediaPlayer.getDuration());
            C2724f.this.mo9048u();
            if (C3349v.m6862a()) {
                C2724f.this.f6407c.m6855b("AppLovinFullscreenActivity", "MediaPlayer prepared: " + C2724f.this.f6501D);
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.f$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2738c implements View.OnClickListener {
        private View$OnClickListenerC2738c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2724f c2724f = C2724f.this;
            if (view == c2724f.f6515u) {
                if (!c2724f.mo9049s()) {
                    C2724f.this.mo9077c();
                    return;
                }
                C2724f.this.mo9053e();
                C2724f.this.m9133p();
                C2724f.this.f6421q.m7831b();
            } else if (view == c2724f.f6516v) {
                c2724f.mo9066x();
            } else if (C3349v.m6862a()) {
                C3349v c3349v = C2724f.this.f6407c;
                c3349v.m6850e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public C2724f(AbstractC3080e abstractC3080e, Activity activity, C3214m c3214m, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(abstractC3080e, activity, c3214m, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f6500C = new C2682c(this.f6405a, this.f6409e, this.f6406b);
        C2737b c2737b = new C2737b();
        this.f6502E = c2737b;
        C2736a c2736a = new C2736a();
        this.f6503F = c2736a;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f6504G = handler;
        C2776j c2776j = new C2776j(handler, this.f6406b);
        this.f6519y = c2776j;
        boolean mo7890f = this.f6405a.mo7890f();
        this.f6505H = mo7890f;
        this.f6520z = Utils.isVideoMutedInitially(this.f6406b);
        this.f6507J = -1;
        this.f6509L = new AtomicBoolean();
        this.f6510M = new AtomicBoolean();
        this.f6511N = -2L;
        this.f6512O = 0L;
        if (!abstractC3080e.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
        this.f6513s = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(c2737b);
        appLovinVideoView.setOnCompletionListener(c2737b);
        appLovinVideoView.setOnErrorListener(c2737b);
        appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(c3214m, C3109b.f7808aM, activity, c2737b));
        View$OnClickListenerC2738c view$OnClickListenerC2738c = new View$OnClickListenerC2738c();
        if (abstractC3080e.m7882q() >= 0) {
            C2789m c2789m = new C2789m(abstractC3080e.m7876w(), activity);
            this.f6515u = c2789m;
            c2789m.setVisibility(8);
            c2789m.setOnClickListener(view$OnClickListenerC2738c);
        } else {
            this.f6515u = null;
        }
        if (m9080a(this.f6520z, c3214m)) {
            ImageView imageView = new ImageView(activity);
            this.f6516v = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(view$OnClickListenerC2738c);
            m9070e(this.f6520z);
        } else {
            this.f6516v = null;
        }
        String m7973B = abstractC3080e.m7973B();
        if (StringUtils.isValidString(m7973B)) {
            C2804u c2804u = new C2804u(c3214m);
            c2804u.m8873a(new WeakReference<>(c2736a));
            C2803t c2803t = new C2803t(c2804u, activity);
            this.f6517w = c2803t;
            c2803t.m8875a(m7973B);
        } else {
            this.f6517w = null;
        }
        if (mo7890f) {
            C2671a c2671a = new C2671a(activity, ((Integer) c3214m.m7456a(C3109b.f7902cB)).intValue(), 16842874);
            this.f6514t = c2671a;
            c2671a.setColor(Color.parseColor("#75FFFFFF"));
            c2671a.setBackgroundColor(Color.parseColor("#00000000"));
            c2671a.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.f6514t = null;
        }
        if (!abstractC3080e.m7960O()) {
            this.f6518x = null;
            return;
        }
        ProgressBar progressBar = new ProgressBar(activity, null, 16842872);
        this.f6518x = progressBar;
        progressBar.setMax(10000);
        progressBar.setPadding(0, 0, 0, 0);
        if (C3294g.m7023d()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(abstractC3080e.m7959P()));
        }
        c2776j.m8942a("PROGRESS_BAR", ((Long) c3214m.m7456a(C3109b.f7951cy)).longValue(), new C2776j.InterfaceC2778a() { // from class: com.applovin.impl.adview.activity.b.f.1
            @Override // com.applovin.impl.adview.C2776j.InterfaceC2778a
            /* renamed from: a */
            public void mo8938a() {
                C2724f c2724f = C2724f.this;
                if (c2724f.f6499B) {
                    c2724f.f6518x.setVisibility(8);
                    return;
                }
                C2724f c2724f2 = C2724f.this;
                c2724f2.f6518x.setProgress((int) ((c2724f.f6513s.getCurrentPosition() / ((float) c2724f2.f6498A)) * 10000.0f));
            }

            @Override // com.applovin.impl.adview.C2776j.InterfaceC2778a
            /* renamed from: b */
            public boolean mo8937b() {
                return !C2724f.this.f6499B;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public void m9088A() {
        if (this.f6510M.compareAndSet(false, true)) {
            m9153a(this.f6515u, this.f6405a.m7882q(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.5
                @Override // java.lang.Runnable
                public void run() {
                    C2724f.this.f6511N = -1L;
                    C2724f.this.f6512O = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    /* renamed from: B */
    private void m9087B() {
        C2803t c2803t;
        C2802s m7972C = this.f6405a.m7972C();
        if (m7972C == null || !m7972C.m8881e() || this.f6499B || (c2803t = this.f6517w) == null) {
            return;
        }
        final boolean z = c2803t.getVisibility() == 4;
        final long m8880f = m7972C.m8880f();
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.6
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    C3340q.m6887a(C2724f.this.f6517w, m8880f, (Runnable) null);
                } else {
                    C3340q.m6885b(C2724f.this.f6517w, m8880f, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m9086C() {
        if (this.f6499B) {
            if (C3349v.m6862a()) {
                this.f6407c.m6851d("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
            }
        } else if (this.f6406b.m7436ad().m6836a()) {
            if (C3349v.m6862a()) {
                this.f6407c.m6851d("AppLovinFullscreenActivity", "Skip video resume - app paused");
            }
        } else if (this.f6507J < 0) {
            if (C3349v.m6862a()) {
                this.f6407c.m6855b("AppLovinFullscreenActivity", "Invalid last video position");
            }
        } else {
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f6407c;
                c3349v.m6855b("AppLovinFullscreenActivity", "Resuming video at position " + this.f6507J + "ms for MediaPlayer: " + this.f6501D);
            }
            this.f6513s.seekTo(this.f6507J);
            this.f6513s.start();
            this.f6519y.m8946a();
            this.f6507J = -1;
            m9151a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.8
                @Override // java.lang.Runnable
                public void run() {
                    C2671a c2671a = C2724f.this.f6514t;
                    if (c2671a != null) {
                        c2671a.m9180a();
                        C2724f.this.m9151a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.8.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C2724f.this.f6514t.m9179b();
                            }
                        }, 2000L);
                    }
                }
            }, 250L);
        }
    }

    /* renamed from: a */
    private static boolean m9080a(boolean z, C3214m c3214m) {
        if (((Boolean) c3214m.m7456a(C3109b.f7943cq)).booleanValue()) {
            if (!((Boolean) c3214m.m7456a(C3109b.f7944cr)).booleanValue() || z) {
                return true;
            }
            return ((Boolean) c3214m.m7456a(C3109b.f7946ct)).booleanValue();
        }
        return false;
    }

    /* renamed from: d */
    private void m9071d(boolean z) {
        this.f6506I = m9064z();
        if (z) {
            this.f6513s.pause();
        } else {
            this.f6513s.stopPlayback();
        }
    }

    /* renamed from: e */
    private void m9070e(boolean z) {
        if (C3294g.m7023d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f6409e.getDrawable(z ? C3393R.C3395drawable.unmute_to_mute : C3393R.C3395drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f6516v.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f6516v.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri m7939aC = z ? this.f6405a.m7939aC() : this.f6405a.m7938aD();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f6516v.setImageURI(m7939aC);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    @Override // com.applovin.impl.sdk.p030b.C3097b.InterfaceC3104a
    /* renamed from: a */
    public void mo7826a() {
        if (C3349v.m6862a()) {
            this.f6407c.m6855b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: a */
    public void mo9063a(long j) {
        m9151a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.7
            @Override // java.lang.Runnable
            public void run() {
                C2724f.this.m9086C();
            }
        }, j);
    }

    /* renamed from: a */
    public void mo9085a(PointF pointF) {
        if (!this.f6405a.mo7971D()) {
            m9087B();
            return;
        }
        if (C3349v.m6862a()) {
            this.f6407c.m6855b("AppLovinFullscreenActivity", "Clicking through video");
        }
        Uri mo7885k = this.f6405a.mo7885k();
        if (mo7885k != null) {
            AppLovinAdView appLovinAdView = this.f6410f;
            this.f6406b.m7391u().trackAndLaunchVideoClick(this.f6405a, mo7885k, pointF, this, appLovinAdView != null ? appLovinAdView.getContext() : this.f6406b.m7476L());
            C3298j.m6968a(this.f6418n, this.f6405a);
            this.f6408d.m7745b();
            this.f6415k++;
        }
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: a */
    public void mo9062a(@Nullable ViewGroup viewGroup) {
        String str;
        this.f6500C.m9165a(this.f6516v, this.f6515u, this.f6517w, this.f6514t, this.f6518x, this.f6513s, this.f6410f, viewGroup);
        if (C3294g.m7020g() && (str = this.f6406b.m7396p().getExtraParameters().get("audio_focus_request")) != null) {
            this.f6513s.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        m9148a(!this.f6505H);
        this.f6513s.setVideoURI(this.f6405a.mo7887h());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (this.f6405a.m7917am()) {
            this.f6421q.m7835a(this.f6405a, new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.3
                @Override // java.lang.Runnable
                public void run() {
                    C2724f.this.mo9063a(250L);
                }
            });
        }
        this.f6513s.start();
        if (this.f6505H) {
            mo9068v();
        }
        this.f6410f.renderAd(this.f6405a);
        this.f6408d.m7744b(this.f6505H ? 1L : 0L);
        if (this.f6515u != null) {
            this.f6406b.m7469S().m7618a(new C3189z(this.f6406b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.4
                @Override // java.lang.Runnable
                public void run() {
                    C2724f.this.m9088A();
                }
            }), C3163o.EnumC3165a.MAIN, this.f6405a.m7881r(), true);
        }
        super.m9143b(this.f6520z);
    }

    @Override // com.applovin.impl.sdk.p030b.C3097b.InterfaceC3104a
    /* renamed from: b */
    public void mo7825b() {
        if (C3349v.m6862a()) {
            this.f6407c.m6855b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        mo9077c();
    }

    /* renamed from: c */
    public void mo9077c() {
        this.f6511N = SystemClock.elapsedRealtime() - this.f6512O;
        if (C3349v.m6862a()) {
            this.f6407c.m6855b("AppLovinFullscreenActivity", C0017a.m13071a(new StringBuilder("Skipping video with skip time: "), this.f6511N, "ms"));
        }
        this.f6408d.m7738f();
        this.f6414j++;
        if (this.f6405a.m7875x()) {
            mo9052h();
        } else {
            mo9065y();
        }
    }

    /* renamed from: c */
    public void mo9076c(long j) {
        this.f6498A = j;
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: c */
    public void mo9073c(boolean z) {
        super.mo9073c(z);
        if (z) {
            mo9063a(0L);
        } else if (this.f6499B) {
        } else {
            mo9053e();
        }
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: d */
    public void mo9055d() {
        mo9062a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: e */
    public void mo9053e() {
        if (C3349v.m6862a()) {
            this.f6407c.m6855b("AppLovinFullscreenActivity", "Pausing video");
        }
        this.f6507J = this.f6513s.getCurrentPosition();
        this.f6513s.pause();
        this.f6519y.m8939c();
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6407c;
            c3349v.m6855b("AppLovinFullscreenActivity", "Paused video at position " + this.f6507J + "ms");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: h */
    public void mo9052h() {
        this.f6519y.m8941b();
        this.f6504G.removeCallbacksAndMessages(null);
        mo9051m();
        super.mo9052h();
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    @SuppressLint({"LongLogTag"})
    /* renamed from: k */
    public void mo9069k() {
        if (C3349v.m6862a()) {
            this.f6407c.m6853c("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (this.f6505H) {
                AppLovinCommunicator.getInstance(this.f6409e).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.f6513s;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.f6513s.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.f6501D;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            Log.e("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.mo9069k();
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: m */
    public void mo9051m() {
        super.m9156a(m9064z(), this.f6505H, mo9050r(), this.f6511N);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j = messageData.getLong("ad_id");
            if (((Boolean) this.f6406b.m7456a(C3109b.f8017eM)).booleanValue() && j == this.f6405a.getAdIdNumber() && this.f6505H) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i >= 200 && i < 300) || this.f6508K || this.f6513s.isPlaying()) {
                    return;
                }
                mo9074c("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: r */
    public boolean mo9050r() {
        return m9064z() >= this.f6405a.m7958Q();
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: s */
    public boolean mo9049s() {
        return m9131t() && !mo9050r();
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: u */
    public void mo9048u() {
        long m7925ae;
        long millis;
        if (this.f6405a.m7926ad() >= 0 || this.f6405a.m7925ae() >= 0) {
            if (this.f6405a.m7926ad() >= 0) {
                m7925ae = this.f6405a.m7926ad();
            } else {
                C3075a c3075a = (C3075a) this.f6405a;
                long j = this.f6498A;
                long j2 = j > 0 ? 0 + j : 0L;
                if (c3075a.m7924af()) {
                    int m8001l = (int) ((C3075a) this.f6405a).m8001l();
                    if (m8001l > 0) {
                        millis = TimeUnit.SECONDS.toMillis(m8001l);
                    } else {
                        int m7880s = (int) c3075a.m7880s();
                        if (m7880s > 0) {
                            millis = TimeUnit.SECONDS.toMillis(m7880s);
                        }
                    }
                    j2 += millis;
                }
                m7925ae = (long) ((this.f6405a.m7925ae() / 100.0d) * j2);
            }
            m9146b(m7925ae);
        }
    }

    /* renamed from: v */
    public void mo9068v() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.9
            @Override // java.lang.Runnable
            public void run() {
                C2671a c2671a = C2724f.this.f6514t;
                if (c2671a != null) {
                    c2671a.m9180a();
                }
            }
        });
    }

    /* renamed from: w */
    public void mo9067w() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.10
            @Override // java.lang.Runnable
            public void run() {
                C2671a c2671a = C2724f.this.f6514t;
                if (c2671a != null) {
                    c2671a.m9179b();
                }
            }
        });
    }

    /* renamed from: x */
    public void mo9066x() {
        MediaPlayer mediaPlayer = this.f6501D;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f = !this.f6520z ? 0 : 1;
            mediaPlayer.setVolume(f, f);
            boolean z = this.f6520z ? false : true;
            this.f6520z = z;
            m9070e(z);
            m9147a(this.f6520z, 0L);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: y */
    public void mo9065y() {
        if (C3349v.m6862a()) {
            this.f6407c.m6855b("AppLovinFullscreenActivity", "Showing postitial...");
        }
        m9071d(this.f6405a.m7932aJ());
        this.f6500C.m9164a(this.f6411g, this.f6410f);
        StringBuilder sb = new StringBuilder("javascript:al_onPoststitialShow(");
        sb.append(this.f6414j);
        sb.append(",");
        m9149a(C0539e.m12264b(sb, this.f6415k, ");"), this.f6405a.m7956S());
        if (this.f6411g != null) {
            if (this.f6405a.m7880s() >= 0) {
                m9153a(this.f6411g, this.f6405a.m7880s(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.2
                    @Override // java.lang.Runnable
                    public void run() {
                        C2724f.this.f6413i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.f6411g.setVisibility(0);
            }
        }
        this.f6499B = true;
    }

    /* renamed from: z */
    public int m9064z() {
        long currentPosition = this.f6513s.getCurrentPosition();
        if (this.f6508K) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((((float) currentPosition) / ((float) this.f6498A)) * 100.0f) : this.f6506I;
    }

    /* renamed from: c */
    public void mo9074c(String str) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6407c;
            StringBuilder m13052b = C0063d.m13052b("Encountered media error: ", str, " for ad: ");
            m13052b.append(this.f6405a);
            c3349v.m6850e("AppLovinFullscreenActivity", m13052b.toString());
        }
        if (this.f6509L.compareAndSet(false, true)) {
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.f6419o;
            if (appLovinAdDisplayListener instanceof InterfaceC3087g) {
                ((InterfaceC3087g) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            mo9052h();
        }
    }
}
