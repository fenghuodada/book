package com.applovin.impl.adview.activity.p010b;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.support.p000v4.media.session.C0017a;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.activity.result.C0063d;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C0406q1;
import androidx.concurrent.futures.C0486c;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.adview.AppLovinAdView;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
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
import com.google.android.datatransport.runtime.scheduling.persistence.C6605y;
import com.google.android.exoplayer2.AbstractC6984j1;
import com.google.android.exoplayer2.AudioFocusManager;
import com.google.android.exoplayer2.C6622C;
import com.google.android.exoplayer2.C6633a1;
import com.google.android.exoplayer2.C6737c1;
import com.google.android.exoplayer2.C6968g0;
import com.google.android.exoplayer2.C6970g1;
import com.google.android.exoplayer2.C6976h1;
import com.google.android.exoplayer2.C6989k0;
import com.google.android.exoplayer2.C6999l0;
import com.google.android.exoplayer2.C7123o0;
import com.google.android.exoplayer2.C7127q0;
import com.google.android.exoplayer2.C7136s;
import com.google.android.exoplayer2.C7500x0;
import com.google.android.exoplayer2.C7508z0;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.C6642d0;
import com.google.android.exoplayer2.drm.InterfaceC6792o;
import com.google.android.exoplayer2.extractor.C6821f;
import com.google.android.exoplayer2.p038ui.C7325i;
import com.google.android.exoplayer2.p038ui.PlayerView;
import com.google.android.exoplayer2.source.C7147b0;
import com.google.android.exoplayer2.source.C7152c0;
import com.google.android.exoplayer2.source.C7178k0;
import com.google.android.exoplayer2.source.InterfaceC7167g0;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.trackselection.C7303k;
import com.google.android.exoplayer2.upstream.C7372p;
import com.google.android.exoplayer2.upstream.C7375r;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7417m;
import com.google.android.exoplayer2.util.C7421n;
import com.google.android.exoplayer2.util.InterfaceC7412i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.e */
/* loaded from: classes.dex */
public class C2711e extends AbstractC2688a implements AppLovinCommunicatorSubscriber {

    /* renamed from: A */
    protected boolean f6462A;

    /* renamed from: B */
    protected long f6463B;

    /* renamed from: C */
    protected int f6464C;

    /* renamed from: D */
    protected boolean f6465D;

    /* renamed from: E */
    protected boolean f6466E;

    /* renamed from: F */
    private final C2682c f6467F;

    /* renamed from: G */
    private final C2721a f6468G;

    /* renamed from: H */
    private final Handler f6469H;

    /* renamed from: I */
    private final boolean f6470I;

    /* renamed from: J */
    private long f6471J;

    /* renamed from: K */
    private final AtomicBoolean f6472K;

    /* renamed from: L */
    private final AtomicBoolean f6473L;

    /* renamed from: M */
    private long f6474M;

    /* renamed from: N */
    private long f6475N;

    /* renamed from: s */
    protected final PlayerView f6476s;

    /* renamed from: t */
    protected final C6970g1 f6477t;

    /* renamed from: u */
    protected final C2671a f6478u;
    @Nullable

    /* renamed from: v */
    protected final C2789m f6479v;
    @Nullable

    /* renamed from: w */
    protected final ImageView f6480w;
    @Nullable

    /* renamed from: x */
    protected final C2803t f6481x;
    @Nullable

    /* renamed from: y */
    protected final ProgressBar f6482y;

    /* renamed from: z */
    protected final C2776j f6483z;

    /* renamed from: com.applovin.impl.adview.activity.b.e$a */
    /* loaded from: classes.dex */
    public class C2721a implements C2804u.InterfaceC2805a {
        private C2721a() {
        }

        @Override // com.applovin.impl.adview.C2804u.InterfaceC2805a
        /* renamed from: a */
        public void mo8872a(C2803t c2803t) {
            if (C3349v.m6862a()) {
                C2711e.this.f6407c.m6855b("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            C2711e.this.mo9101a(c2803t.getAndClearLastClickLocation());
        }

        @Override // com.applovin.impl.adview.C2804u.InterfaceC2805a
        /* renamed from: b */
        public void mo8871b(C2803t c2803t) {
            if (C3349v.m6862a()) {
                C2711e.this.f6407c.m6855b("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            C2711e.this.mo9052h();
        }

        @Override // com.applovin.impl.adview.C2804u.InterfaceC2805a
        /* renamed from: c */
        public void mo8870c(C2803t c2803t) {
            if (C3349v.m6862a()) {
                C2711e.this.f6407c.m6855b("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            C2711e.this.mo9097c();
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.e$b */
    /* loaded from: classes.dex */
    public class C2722b implements AppLovinTouchToClickListener.OnClickListener, Player.InterfaceC6626b, C7325i.InterfaceC7329d {
        private C2722b() {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(Player.C6624a c6624a) {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, PointF pointF) {
            C2711e.this.mo9101a(pointF);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public /* bridge */ /* synthetic */ void onEvents(Player player, Player.C6627c c6627c) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
        }

        public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public /* bridge */ /* synthetic */ void onMediaItemTransition(@Nullable C7127q0 c7127q0, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public /* bridge */ /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(C6633a1 c6633a1) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public void onPlaybackStateChanged(int i) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2711e.this.f6407c;
                StringBuilder m12536b = C0406q1.m12536b("Player state changed to state ", i, " and will play when ready: ");
                m12536b.append(C2711e.this.f6477t.mo5740g());
                c3349v.m6855b("AppLovinFullscreenActivity", m12536b.toString());
            }
            if (i == 2) {
                C2711e.this.mo9093v();
                C2711e.this.f6408d.m7737g();
            } else if (i == 3) {
                C2711e c2711e = C2711e.this;
                c2711e.f6477t.m5743e0(!c2711e.f6462A ? 1 : 0);
                C2711e c2711e2 = C2711e.this;
                c2711e2.mo9096c(c2711e2.f6477t.getDuration());
                C2711e.this.mo9048u();
                if (C3349v.m6862a()) {
                    C3349v c3349v2 = C2711e.this.f6407c;
                    c3349v2.m6855b("AppLovinFullscreenActivity", "MediaPlayer prepared: " + C2711e.this.f6477t);
                }
                C2711e.this.f6483z.m8946a();
                C2711e c2711e3 = C2711e.this;
                if (c2711e3.f6479v != null) {
                    c2711e3.m9106A();
                }
                C2711e.this.mo9092w();
                if (C2711e.this.f6421q.m7829c()) {
                    C2711e.this.mo9053e();
                }
            } else if (i == 4) {
                if (C3349v.m6862a()) {
                    C2711e.this.f6407c.m6855b("AppLovinFullscreenActivity", "Video completed");
                }
                C2711e c2711e4 = C2711e.this;
                c2711e4.f6466E = true;
                c2711e4.mo9090y();
            }
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public void onPlayerError(PlaybackException playbackException) {
            C2711e c2711e = C2711e.this;
            c2711e.mo9095c("Video view error (" + playbackException + ")");
            C2711e.this.mo9052h();
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public /* bridge */ /* synthetic */ void onPlayerErrorChanged(@Nullable PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        }

        public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(Player.C6629e c6629e, Player.C6629e c6629e2, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
        }

        public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
        }

        public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        @Deprecated
        public /* bridge */ /* synthetic */ void onSeekProcessed() {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        @Deprecated
        public /* bridge */ /* synthetic */ void onStaticMetadataChanged(List list) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public /* bridge */ /* synthetic */ void onTimelineChanged(AbstractC6984j1 abstractC6984j1, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public /* bridge */ /* synthetic */ void onTracksChanged(C7178k0 c7178k0, C7303k c7303k) {
        }

        @Override // com.google.android.exoplayer2.p038ui.C7325i.InterfaceC7329d
        public void onVisibilityChange(int i) {
            if (i == 0) {
                C2711e.this.f6476s.m5236b();
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.e$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2723c implements View.OnClickListener {
        private View$OnClickListenerC2723c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2711e c2711e = C2711e.this;
            if (view == c2711e.f6479v) {
                if (!c2711e.mo9049s()) {
                    C2711e.this.mo9097c();
                    return;
                }
                C2711e.this.mo9053e();
                C2711e.this.m9133p();
                C2711e.this.f6421q.m7831b();
            } else if (view == c2711e.f6480w) {
                c2711e.mo9091x();
            } else if (C3349v.m6862a()) {
                C3349v c3349v = C2711e.this.f6407c;
                c3349v.m6850e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public C2711e(AbstractC3080e abstractC3080e, Activity activity, C3214m c3214m, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(abstractC3080e, activity, c3214m, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f6467F = new C2682c(this.f6405a, this.f6409e, this.f6406b);
        C2721a c2721a = new C2721a();
        this.f6468G = c2721a;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f6469H = handler;
        C2776j c2776j = new C2776j(handler, this.f6406b);
        this.f6483z = c2776j;
        boolean mo7890f = this.f6405a.mo7890f();
        this.f6470I = mo7890f;
        this.f6462A = Utils.isVideoMutedInitially(this.f6406b);
        this.f6471J = -1L;
        this.f6472K = new AtomicBoolean();
        this.f6473L = new AtomicBoolean();
        this.f6474M = -2L;
        this.f6475N = 0L;
        if (abstractC3080e.hasVideoUrl()) {
            View$OnClickListenerC2723c view$OnClickListenerC2723c = new View$OnClickListenerC2723c();
            if (abstractC3080e.m7882q() >= 0) {
                C2789m c2789m = new C2789m(abstractC3080e.m7876w(), activity);
                this.f6479v = c2789m;
                c2789m.setVisibility(8);
                c2789m.setOnClickListener(view$OnClickListenerC2723c);
            } else {
                this.f6479v = null;
            }
            if (m9099a(this.f6462A, c3214m)) {
                ImageView imageView = new ImageView(activity);
                this.f6480w = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setClickable(true);
                imageView.setOnClickListener(view$OnClickListenerC2723c);
                m9094d(this.f6462A);
            } else {
                this.f6480w = null;
            }
            String m7973B = abstractC3080e.m7973B();
            if (StringUtils.isValidString(m7973B)) {
                C2804u c2804u = new C2804u(c3214m);
                c2804u.m8873a(new WeakReference<>(c2721a));
                C2803t c2803t = new C2803t(c2804u, activity);
                this.f6481x = c2803t;
                c2803t.m8875a(m7973B);
            } else {
                this.f6481x = null;
            }
            if (mo7890f) {
                C2671a c2671a = new C2671a(activity, ((Integer) c3214m.m7456a(C3109b.f7902cB)).intValue(), 16842874);
                this.f6478u = c2671a;
                c2671a.setColor(Color.parseColor("#75FFFFFF"));
                c2671a.setBackgroundColor(Color.parseColor("#00000000"));
                c2671a.setVisibility(8);
                AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
            } else {
                this.f6478u = null;
            }
            if (abstractC3080e.m7960O()) {
                ProgressBar progressBar = new ProgressBar(activity, null, 16842872);
                this.f6482y = progressBar;
                progressBar.setMax(10000);
                progressBar.setPadding(0, 0, 0, 0);
                if (C3294g.m7023d()) {
                    progressBar.setProgressTintList(ColorStateList.valueOf(abstractC3080e.m7959P()));
                }
                c2776j.m8942a("PROGRESS_BAR", ((Long) c3214m.m7456a(C3109b.f7951cy)).longValue(), new C2776j.InterfaceC2778a() { // from class: com.applovin.impl.adview.activity.b.e.1
                    @Override // com.applovin.impl.adview.C2776j.InterfaceC2778a
                    /* renamed from: a */
                    public void mo8938a() {
                        C2711e c2711e = C2711e.this;
                        if (c2711e.f6465D) {
                            c2711e.f6482y.setVisibility(8);
                            return;
                        }
                        C2711e c2711e2 = C2711e.this;
                        c2711e2.f6482y.setProgress((int) ((((float) c2711e.f6477t.getCurrentPosition()) / ((float) c2711e2.f6463B)) * 10000.0f));
                    }

                    @Override // com.applovin.impl.adview.C2776j.InterfaceC2778a
                    /* renamed from: b */
                    public boolean mo8937b() {
                        return !C2711e.this.f6465D;
                    }
                });
            } else {
                this.f6482y = null;
            }
            C6970g1.C6971a c6971a = new C6970g1.C6971a(activity);
            C7394a.m5131d(!c6971a.f12120s);
            c6971a.f12120s = true;
            C6970g1 c6970g1 = new C6970g1(c6971a);
            this.f6477t = c6970g1;
            C2722b c2722b = new C2722b();
            c6970g1.f12079d.m5779W(c2722b);
            c6970g1.mo5767B(0);
            PlayerView playerView = new PlayerView(activity);
            this.f6476s = playerView;
            playerView.m5236b();
            playerView.setControllerVisibilityListener(c2722b);
            playerView.setPlayer(c6970g1);
            playerView.setOnTouchListener(new AppLovinTouchToClickListener(c3214m, C3109b.f7808aM, activity, c2722b));
            m9089z();
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    /* renamed from: E */
    private void m9102E() {
        C2803t c2803t;
        C2802s m7972C = this.f6405a.m7972C();
        if (m7972C == null || !m7972C.m8881e() || this.f6465D || (c2803t = this.f6481x) == null) {
            return;
        }
        final boolean z = c2803t.getVisibility() == 4;
        final long m8880f = m7972C.m8880f();
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.5
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    C3340q.m6887a(C2711e.this.f6481x, m8880f, (Runnable) null);
                } else {
                    C3340q.m6885b(C2711e.this.f6481x, m8880f, null);
                }
            }
        });
    }

    /* renamed from: a */
    private static boolean m9099a(boolean z, C3214m c3214m) {
        if (((Boolean) c3214m.m7456a(C3109b.f7943cq)).booleanValue()) {
            if (!((Boolean) c3214m.m7456a(C3109b.f7944cr)).booleanValue() || z) {
                return true;
            }
            return ((Boolean) c3214m.m7456a(C3109b.f7946ct)).booleanValue();
        }
        return false;
    }

    /* renamed from: A */
    public void m9106A() {
        if (this.f6473L.compareAndSet(false, true)) {
            m9153a(this.f6479v, this.f6405a.m7882q(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.4
                @Override // java.lang.Runnable
                public void run() {
                    C2711e.this.f6474M = -1L;
                    C2711e.this.f6475N = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    /* renamed from: B */
    public void m9105B() {
        this.f6464C = m9103D();
        this.f6477t.mo5729r(false);
    }

    /* renamed from: C */
    public void m9104C() {
        if (this.f6465D) {
            if (C3349v.m6862a()) {
                this.f6407c.m6851d("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
            }
        } else if (this.f6406b.m7436ad().m6836a()) {
            if (C3349v.m6862a()) {
                this.f6407c.m6851d("AppLovinFullscreenActivity", "Skip video resume - app paused");
            }
        } else {
            long j = this.f6471J;
            if (j >= 0) {
                if (C3349v.m6862a()) {
                    C3349v c3349v = this.f6407c;
                    StringBuilder m12390a = C0486c.m12390a("Resuming video at position ", j, "ms for MediaPlayer: ");
                    m12390a.append(this.f6477t);
                    c3349v.m6855b("AppLovinFullscreenActivity", m12390a.toString());
                }
                this.f6477t.mo5729r(true);
                this.f6483z.m8946a();
                this.f6471J = -1L;
                if (!this.f6477t.isPlaying()) {
                    mo9093v();
                }
            } else if (C3349v.m6862a()) {
                C3349v c3349v2 = this.f6407c;
                c3349v2.m6855b("AppLovinFullscreenActivity", "Invalid last video position, isVideoPlaying=" + this.f6477t.isPlaying());
            }
        }
    }

    /* renamed from: D */
    public int m9103D() {
        C6970g1 c6970g1 = this.f6477t;
        if (c6970g1 == null) {
            return 0;
        }
        long currentPosition = c6970g1.getCurrentPosition();
        if (this.f6466E) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((((float) currentPosition) / ((float) this.f6463B)) * 100.0f) : this.f6464C;
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
        m9151a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.6
            @Override // java.lang.Runnable
            public void run() {
                C2711e.this.m9104C();
            }
        }, j);
    }

    /* renamed from: a */
    public void mo9101a(PointF pointF) {
        if (!this.f6405a.mo7971D()) {
            m9102E();
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
        this.f6467F.m9165a(this.f6480w, this.f6479v, this.f6481x, this.f6478u, this.f6482y, this.f6476s, this.f6410f, viewGroup);
        this.f6477t.mo5729r(true);
        if (this.f6405a.m7917am()) {
            this.f6421q.m7835a(this.f6405a, new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.2
                @Override // java.lang.Runnable
                public void run() {
                    C2711e.this.mo9063a(250L);
                }
            });
        }
        if (this.f6470I) {
            mo9093v();
        }
        this.f6410f.renderAd(this.f6405a);
        this.f6408d.m7744b(this.f6470I ? 1L : 0L);
        if (this.f6479v != null) {
            this.f6406b.m7469S().m7618a(new C3189z(this.f6406b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.3
                @Override // java.lang.Runnable
                public void run() {
                    C2711e.this.m9106A();
                }
            }), C3163o.EnumC3165a.MAIN, this.f6405a.m7881r(), true);
        }
        super.m9143b(this.f6462A);
    }

    @Override // com.applovin.impl.sdk.p030b.C3097b.InterfaceC3104a
    /* renamed from: b */
    public void mo7825b() {
        if (C3349v.m6862a()) {
            this.f6407c.m6855b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        mo9097c();
    }

    /* renamed from: c */
    public void mo9097c() {
        this.f6474M = SystemClock.elapsedRealtime() - this.f6475N;
        if (C3349v.m6862a()) {
            this.f6407c.m6855b("AppLovinFullscreenActivity", C0017a.m13071a(new StringBuilder("Skipping video with skip time: "), this.f6474M, "ms"));
        }
        this.f6408d.m7738f();
        this.f6414j++;
        if (this.f6405a.m7875x()) {
            mo9052h();
        } else {
            mo9090y();
        }
    }

    /* renamed from: c */
    public void mo9096c(long j) {
        this.f6463B = j;
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: c */
    public void mo9073c(boolean z) {
        super.mo9073c(z);
        if (z) {
            mo9063a(0L);
        } else if (this.f6465D) {
        } else {
            mo9053e();
        }
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: d */
    public void mo9055d() {
        mo9062a((ViewGroup) null);
    }

    /* renamed from: d */
    public void m9094d(boolean z) {
        if (C3294g.m7023d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f6409e.getDrawable(z ? C3393R.C3395drawable.unmute_to_mute : C3393R.C3395drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f6480w.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f6480w.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri m7939aC = z ? this.f6405a.m7939aC() : this.f6405a.m7938aD();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f6480w.setImageURI(m7939aC);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: e */
    public void mo9053e() {
        C3349v c3349v;
        String str;
        if (C3349v.m6862a()) {
            this.f6407c.m6855b("AppLovinFullscreenActivity", "Pausing video");
        }
        if (this.f6477t.isPlaying()) {
            this.f6471J = this.f6477t.getCurrentPosition();
            this.f6477t.mo5729r(false);
            this.f6483z.m8939c();
            if (C3349v.m6862a()) {
                c3349v = this.f6407c;
                str = C0017a.m13071a(new StringBuilder("Paused video at position "), this.f6471J, "ms");
            } else {
                return;
            }
        } else if (C3349v.m6862a()) {
            c3349v = this.f6407c;
            str = "Nothing to pause";
        } else {
            return;
        }
        c3349v.m6855b("AppLovinFullscreenActivity", str);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdExoPlayerPresenter";
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: h */
    public void mo9052h() {
        this.f6483z.m8941b();
        this.f6469H.removeCallbacksAndMessages(null);
        mo9051m();
        super.mo9052h();
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: k */
    public void mo9069k() {
        String str;
        AudioTrack audioTrack;
        C6970g1 c6970g1 = this.f6477t;
        c6970g1.m5739g0();
        if (C7408g0.f13905a < 21 && (audioTrack = c6970g1.f12094s) != null) {
            audioTrack.release();
            c6970g1.f12094s = null;
        }
        c6970g1.f12088m.m6026a();
        C6976h1 c6976h1 = c6970g1.f12090o;
        C6976h1.C6978b c6978b = c6976h1.f12142e;
        if (c6978b != null) {
            try {
                c6976h1.f12138a.unregisterReceiver(c6978b);
            } catch (RuntimeException e) {
                C7421n.m5055c("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            c6976h1.f12142e = null;
        }
        c6970g1.f12091p.getClass();
        c6970g1.f12092q.getClass();
        AudioFocusManager audioFocusManager = c6970g1.f12089n;
        audioFocusManager.f10458c = null;
        audioFocusManager.m6223a();
        C6968g0 c6968g0 = c6970g1.f12079d;
        c6968g0.getClass();
        String hexString = Integer.toHexString(System.identityHashCode(c6968g0));
        String str2 = C7408g0.f13909e;
        HashSet<String> hashSet = C6999l0.f12262a;
        synchronized (C6999l0.class) {
            str = C6999l0.f12263b;
        }
        StringBuilder m9043a = C2745h.m9043a(C0552c.m12193a(str, C0552c.m12193a(str2, C0552c.m12193a(hexString, 36))), "Release ", hexString, " [ExoPlayerLib/2.15.1] [", str2);
        m9043a.append("] [");
        m9043a.append(str);
        m9043a.append("]");
        Log.i("ExoPlayerImpl", m9043a.toString());
        if (!c6968g0.f12047h.m5621y()) {
            C7417m<Player.InterfaceC6626b> c7417m = c6968g0.f12048i;
            c7417m.m5060b(11, new C7136s());
            c7417m.m5061a();
        }
        c6968g0.f12048i.m5059c();
        c6968g0.f12045f.mo5067f();
        C6642d0 c6642d0 = c6968g0.f12054o;
        if (c6642d0 != null) {
            c6968g0.f12056q.mo5164e(c6642d0);
        }
        C7508z0 m4862f = c6968g0.f12038D.m4862f(1);
        c6968g0.f12038D = m4862f;
        C7508z0 m4867a = m4862f.m4867a(m4862f.f14257b);
        c6968g0.f12038D = m4867a;
        m4867a.f14272q = m4867a.f14274s;
        c6968g0.f12038D.f14273r = 0L;
        final C6642d0 c6642d02 = c6970g1.f12087l;
        AnalyticsListener.C6634a m6142Q = c6642d02.m6142Q();
        c6642d02.f10575d.put(1036, m6142Q);
        c6642d02.m6137V(m6142Q, 1036, new C6605y(m6142Q));
        InterfaceC7412i interfaceC7412i = c6642d02.f10578g;
        C7394a.m5130e(interfaceC7412i);
        interfaceC7412i.mo5069d(new Runnable() { // from class: com.google.android.exoplayer2.analytics.t
            @Override // java.lang.Runnable
            public final void run() {
                C6642d0.this.f10576e.m5059c();
            }
        });
        c6970g1.m5750a0();
        Surface surface = c6970g1.f12096u;
        if (surface != null) {
            surface.release();
            c6970g1.f12096u = null;
        }
        c6970g1.f12072E = Collections.emptyList();
        if (this.f6470I) {
            AppLovinCommunicator.getInstance(this.f6409e).unsubscribe(this, "video_caching_failed");
        }
        super.mo9069k();
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: m */
    public void mo9051m() {
        super.m9156a(m9103D(), this.f6470I, mo9050r(), this.f6474M);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j = messageData.getLong("ad_id");
            if (((Boolean) this.f6406b.m7456a(C3109b.f8017eM)).booleanValue() && j == this.f6405a.getAdIdNumber() && this.f6470I) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i >= 200 && i < 300) || this.f6466E || this.f6477t.isPlaying()) {
                    return;
                }
                mo9095c("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: r */
    public boolean mo9050r() {
        return this.f6405a != null && m9103D() >= this.f6405a.m7958Q();
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
                long j = this.f6463B;
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
    public void mo9093v() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.7
            @Override // java.lang.Runnable
            public void run() {
                C2671a c2671a = C2711e.this.f6478u;
                if (c2671a != null) {
                    c2671a.m9180a();
                }
            }
        });
    }

    /* renamed from: w */
    public void mo9092w() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.8
            @Override // java.lang.Runnable
            public void run() {
                C2671a c2671a = C2711e.this.f6478u;
                if (c2671a != null) {
                    c2671a.m9179b();
                }
            }
        });
    }

    /* renamed from: x */
    public void mo9091x() {
        boolean z = !this.f6462A ? 1 : 0;
        this.f6462A = z;
        this.f6477t.m5743e0(!z ? 1 : 0);
        m9094d(this.f6462A);
        m9147a(this.f6462A, 0L);
    }

    /* renamed from: y */
    public void mo9090y() {
        m9105B();
        this.f6467F.m9164a(this.f6411g, this.f6410f);
        StringBuilder sb = new StringBuilder("javascript:al_onPoststitialShow(");
        sb.append(this.f6414j);
        sb.append(",");
        m9149a(C0539e.m12264b(sb, this.f6415k, ");"), this.f6405a.m7956S());
        if (this.f6411g != null) {
            if (this.f6405a.m7880s() >= 0) {
                m9153a(this.f6411g, this.f6405a.m7880s(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.9
                    @Override // java.lang.Runnable
                    public void run() {
                        C2711e.this.f6413i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.f6411g.setVisibility(0);
            }
        }
        this.f6465D = true;
    }

    /* renamed from: z */
    public void m9089z() {
        String str;
        boolean z;
        m9148a(!this.f6470I);
        Activity activity = this.f6409e;
        int i = C7408g0.f13905a;
        try {
            str = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        String str2 = Build.VERSION.RELEASE;
        StringBuilder m9043a = C2745h.m9043a(C0552c.m12193a(str2, C0552c.m12193a(str, 54)), "com.applovin.sdk/", str, " (Linux;Android ", str2);
        m9043a.append(") ExoPlayerLib/2.15.1");
        C7372p c7372p = new C7372p(activity, m9043a.toString());
        C7152c0 c7152c0 = new C7152c0(new C6821f());
        C7375r c7375r = new C7375r();
        Uri mo7887h = this.f6405a.mo7887h();
        int i2 = C7127q0.f12640f;
        Collections.emptyList();
        Collections.emptyMap();
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        C7127q0.C7133f c7133f = null;
        if (mo7887h != null) {
            c7133f = new C7127q0.C7133f(mo7887h, null, null, null, emptyList, null, emptyList2, null);
        }
        C7127q0 c7127q0 = new C7127q0("", new C7127q0.C7130c(0L, Long.MIN_VALUE, false, false, false), c7133f, new C7127q0.C7132e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), MediaMetadata.f10479D);
        c7127q0.f12642b.getClass();
        C7127q0.C7133f c7133f2 = c7127q0.f12642b;
        Object obj = c7133f2.f12672f;
        c7133f2.getClass();
        c7127q0.f12642b.getClass();
        C7147b0 c7147b0 = new C7147b0(c7127q0, c7372p, c7152c0, InterfaceC6792o.f11046a, c7375r, 1048576);
        this.f6477t.m5743e0(!this.f6462A ? 1 : 0);
        C6970g1 c6970g1 = this.f6477t;
        c6970g1.m5739g0();
        C6968g0 c6968g0 = c6970g1.f12079d;
        c6968g0.getClass();
        List singletonList = Collections.singletonList(c7147b0);
        c6968g0.m5776Z();
        c6968g0.getCurrentPosition();
        c6968g0.f12062w++;
        ArrayList arrayList = c6968g0.f12051l;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i3 = size - 1; i3 >= 0; i3--) {
                c6968g0.f12051l.remove(i3);
            }
            c6968g0.f12035A = c6968g0.f12035A.mo5431b(size);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < singletonList.size(); i4++) {
            C7500x0.C7503c c7503c = new C7500x0.C7503c((InterfaceC7188p) singletonList.get(i4), c6968g0.f12052m);
            arrayList2.add(c7503c);
            arrayList.add(i4 + 0, new C6968g0.C6969a(c7503c.f14245a.f12912n, c7503c.f14246b));
        }
        c6968g0.f12035A = c6968g0.f12035A.mo5428e(arrayList2.size());
        C6737c1 c6737c1 = new C6737c1(c6968g0.f12051l, c6968g0.f12035A);
        if (!c6737c1.m5685p() && -1 >= c6737c1.f10891f) {
            throw new C7123o0();
        }
        int mo5425a = c6737c1.mo5425a(c6968g0.f12061v);
        C7508z0 m5772d0 = c6968g0.m5772d0(c6968g0.f12038D, c6737c1, c6968g0.m5775a0(c6737c1, mo5425a, -9223372036854775807L));
        int i5 = m5772d0.f14260e;
        if (mo5425a != -1 && i5 != 1) {
            i5 = (c6737c1.m5685p() || mo5425a >= c6737c1.f10891f) ? 4 : 2;
        }
        C7508z0 m4862f = m5772d0.m4862f(i5);
        long m6217b = C6622C.m6217b(-9223372036854775807L);
        InterfaceC7167g0 interfaceC7167g0 = c6968g0.f12035A;
        C6989k0 c6989k0 = c6968g0.f12047h;
        c6989k0.getClass();
        c6989k0.f12213g.mo5063j(17, new C6989k0.C6990a(arrayList2, interfaceC7167g0, mo5425a, m6217b)).m5122a();
        if (!c6968g0.f12038D.f14257b.f12928a.equals(m4862f.f14257b.f12928a) && !c6968g0.f12038D.f14256a.m5685p()) {
            z = true;
        } else {
            z = false;
        }
        c6968g0.m5768h0(m4862f, 0, 1, false, z, 4, c6968g0.m5777Y(m4862f), -1);
        this.f6477t.prepare();
        this.f6477t.mo5729r(false);
    }

    /* renamed from: c */
    public void mo9095c(String str) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6407c;
            StringBuilder m13052b = C0063d.m13052b("Encountered media error: ", str, " for ad: ");
            m13052b.append(this.f6405a);
            c3349v.m6850e("AppLovinFullscreenActivity", m13052b.toString());
        }
        if (this.f6472K.compareAndSet(false, true)) {
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.f6419o;
            if (appLovinAdDisplayListener instanceof InterfaceC3087g) {
                ((InterfaceC3087g) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            mo9052h();
        }
    }
}
