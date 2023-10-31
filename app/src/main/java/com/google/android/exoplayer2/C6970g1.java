package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6556o;
import com.google.android.datatransport.runtime.scheduling.persistence.C6596p;
import com.google.android.exoplayer2.AudioFocusManager;
import com.google.android.exoplayer2.C6729b;
import com.google.android.exoplayer2.C6733b1;
import com.google.android.exoplayer2.C6976h1;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.C6642d0;
import com.google.android.exoplayer2.audio.C6688d;
import com.google.android.exoplayer2.audio.InterfaceC6696g;
import com.google.android.exoplayer2.audio.InterfaceC6718s;
import com.google.android.exoplayer2.decoder.C6747e;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.device.InterfaceC6753a;
import com.google.android.exoplayer2.extractor.C6821f;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.metadata.InterfaceC7052e;
import com.google.android.exoplayer2.source.C7163f;
import com.google.android.exoplayer2.source.C7178k0;
import com.google.android.exoplayer2.source.InterfaceC7199w;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.InterfaceC7239i;
import com.google.android.exoplayer2.trackselection.AbstractC7307m;
import com.google.android.exoplayer2.trackselection.C7286f;
import com.google.android.exoplayer2.trackselection.C7303k;
import com.google.android.exoplayer2.upstream.C7369n;
import com.google.android.exoplayer2.upstream.InterfaceC7352d;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7397b0;
import com.google.android.exoplayer2.util.C7401d;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7409h;
import com.google.android.exoplayer2.util.C7417m;
import com.google.android.exoplayer2.util.C7421n;
import com.google.android.exoplayer2.util.InterfaceC7396b;
import com.google.android.exoplayer2.video.C7496w;
import com.google.android.exoplayer2.video.InterfaceC7457i;
import com.google.android.exoplayer2.video.InterfaceC7458j;
import com.google.android.exoplayer2.video.InterfaceC7465l;
import com.google.android.exoplayer2.video.InterfaceC7494v;
import com.google.android.exoplayer2.video.spherical.C7487k;
import com.google.android.exoplayer2.video.spherical.InterfaceC7475a;
import com.google.common.collect.C8018t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.exoplayer2.g1 */
/* loaded from: classes.dex */
public final class C6970g1 extends AbstractC6967g {

    /* renamed from: A */
    public int f12068A;

    /* renamed from: B */
    public final int f12069B;

    /* renamed from: C */
    public float f12070C;

    /* renamed from: D */
    public boolean f12071D;

    /* renamed from: E */
    public List<Cue> f12072E;

    /* renamed from: F */
    public final boolean f12073F;

    /* renamed from: G */
    public boolean f12074G;

    /* renamed from: H */
    public DeviceInfo f12075H;

    /* renamed from: I */
    public C7496w f12076I;

    /* renamed from: b */
    public final Renderer[] f12077b;

    /* renamed from: c */
    public final C7401d f12078c;

    /* renamed from: d */
    public final C6968g0 f12079d;

    /* renamed from: e */
    public final SurfaceHolder$CallbackC6972b f12080e;

    /* renamed from: f */
    public final C6973c f12081f;

    /* renamed from: g */
    public final CopyOnWriteArraySet<InterfaceC7465l> f12082g;

    /* renamed from: h */
    public final CopyOnWriteArraySet<InterfaceC6696g> f12083h;

    /* renamed from: i */
    public final CopyOnWriteArraySet<InterfaceC7239i> f12084i;

    /* renamed from: j */
    public final CopyOnWriteArraySet<InterfaceC7052e> f12085j;

    /* renamed from: k */
    public final CopyOnWriteArraySet<InterfaceC6753a> f12086k;

    /* renamed from: l */
    public final C6642d0 f12087l;

    /* renamed from: m */
    public final C6729b f12088m;

    /* renamed from: n */
    public final AudioFocusManager f12089n;

    /* renamed from: o */
    public final C6976h1 f12090o;

    /* renamed from: p */
    public final C6997k1 f12091p;

    /* renamed from: q */
    public final C7000l1 f12092q;

    /* renamed from: r */
    public final long f12093r;
    @Nullable

    /* renamed from: s */
    public AudioTrack f12094s;
    @Nullable

    /* renamed from: t */
    public Object f12095t;
    @Nullable

    /* renamed from: u */
    public Surface f12096u;
    @Nullable

    /* renamed from: v */
    public SurfaceHolder f12097v;
    @Nullable

    /* renamed from: w */
    public C7487k f12098w;

    /* renamed from: x */
    public boolean f12099x;
    @Nullable

    /* renamed from: y */
    public TextureView f12100y;

    /* renamed from: z */
    public int f12101z;

    /* renamed from: com.google.android.exoplayer2.g1$a */
    /* loaded from: classes.dex */
    public static final class C6971a {

        /* renamed from: a */
        public final Context f12102a;

        /* renamed from: b */
        public final InterfaceC6808e1 f12103b;

        /* renamed from: c */
        public final C7397b0 f12104c;

        /* renamed from: d */
        public final AbstractC7307m f12105d;

        /* renamed from: e */
        public final InterfaceC7199w f12106e;

        /* renamed from: f */
        public final C6998l f12107f;

        /* renamed from: g */
        public final InterfaceC7352d f12108g;

        /* renamed from: h */
        public final C6642d0 f12109h;

        /* renamed from: i */
        public final Looper f12110i;

        /* renamed from: j */
        public final C6688d f12111j;

        /* renamed from: k */
        public final int f12112k;

        /* renamed from: l */
        public final boolean f12113l;

        /* renamed from: m */
        public final C6966f1 f12114m;

        /* renamed from: n */
        public final long f12115n;

        /* renamed from: o */
        public final long f12116o;

        /* renamed from: p */
        public final C6988k f12117p;

        /* renamed from: q */
        public final long f12118q;

        /* renamed from: r */
        public final long f12119r;

        /* renamed from: s */
        public boolean f12120s;

        public C6971a(Context context) {
            C7369n c7369n;
            DefaultRenderersFactory defaultRenderersFactory = new DefaultRenderersFactory(context);
            C6821f c6821f = new C6821f();
            C7286f c7286f = new C7286f(context);
            C7163f c7163f = new C7163f(context, c6821f);
            C6998l c6998l = new C6998l();
            C8018t<String, Integer> c8018t = C7369n.f13785n;
            synchronized (C7369n.class) {
                if (C7369n.f13792u == null) {
                    C7369n.C7370a c7370a = new C7369n.C7370a(context);
                    C7369n.f13792u = new C7369n(c7370a.f13806a, c7370a.f13807b, c7370a.f13808c, c7370a.f13809d, c7370a.f13810e);
                }
                c7369n = C7369n.f13792u;
            }
            C7397b0 c7397b0 = InterfaceC7396b.f13883a;
            C6642d0 c6642d0 = new C6642d0();
            this.f12102a = context;
            this.f12103b = defaultRenderersFactory;
            this.f12105d = c7286f;
            this.f12106e = c7163f;
            this.f12107f = c6998l;
            this.f12108g = c7369n;
            this.f12109h = c6642d0;
            Looper myLooper = Looper.myLooper();
            this.f12110i = myLooper == null ? Looper.getMainLooper() : myLooper;
            this.f12111j = C6688d.f10690f;
            this.f12112k = 1;
            this.f12113l = true;
            this.f12114m = C6966f1.f12031c;
            this.f12115n = 5000L;
            this.f12116o = 15000L;
            this.f12117p = new C6988k(C6622C.m6217b(20L), C6622C.m6217b(500L), 0.999f);
            this.f12104c = c7397b0;
            this.f12118q = 500L;
            this.f12119r = 2000L;
        }
    }

    /* renamed from: com.google.android.exoplayer2.g1$b */
    /* loaded from: classes.dex */
    public final class SurfaceHolder$CallbackC6972b implements InterfaceC7494v, InterfaceC6718s, InterfaceC7239i, InterfaceC7052e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, C7487k.InterfaceC7489b, AudioFocusManager.InterfaceC6621b, C6729b.InterfaceC6731b, C6976h1.InterfaceC6977a, Player.InterfaceC6626b, InterfaceC7120n {
        public SurfaceHolder$CallbackC6972b() {
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7494v
        /* renamed from: B */
        public final void mo4903B(C6747e c6747e) {
            C6970g1 c6970g1 = C6970g1.this;
            c6970g1.getClass();
            c6970g1.f12087l.mo4903B(c6747e);
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7494v
        /* renamed from: C */
        public final void mo4902C(C7003m0 c7003m0, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            C6970g1 c6970g1 = C6970g1.this;
            c6970g1.getClass();
            c6970g1.f12087l.mo4902C(c7003m0, decoderReuseEvaluation);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
        /* renamed from: D */
        public final void mo5720D(long j) {
            C6970g1.this.f12087l.mo5720D(j);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
        /* renamed from: F */
        public final void mo5719F(Exception exc) {
            C6970g1.this.f12087l.mo5719F(exc);
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7494v
        /* renamed from: G */
        public final void mo4901G(Exception exc) {
            C6970g1.this.f12087l.mo4901G(exc);
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7494v
        /* renamed from: I */
        public final void mo4900I(long j, Object obj) {
            C6970g1 c6970g1 = C6970g1.this;
            c6970g1.f12087l.mo4900I(j, obj);
            if (c6970g1.f12095t == obj) {
                Iterator<InterfaceC7465l> it = c6970g1.f12082g.iterator();
                while (it.hasNext()) {
                    it.next().mo4925b();
                }
            }
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7494v
        /* renamed from: J */
        public final void mo4899J(C6747e c6747e) {
            C6970g1.this.f12087l.mo4899J(c6747e);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
        /* renamed from: N */
        public final void mo5718N(int i, long j, long j2) {
            C6970g1.this.f12087l.mo5718N(i, j, j2);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
        /* renamed from: a */
        public final void mo5195a(boolean z) {
            C6970g1 c6970g1 = C6970g1.this;
            if (c6970g1.f12071D == z) {
                return;
            }
            c6970g1.f12071D = z;
            c6970g1.f12087l.mo5195a(z);
            Iterator<InterfaceC6696g> it = c6970g1.f12083h.iterator();
            while (it.hasNext()) {
                it.next().mo5195a(c6970g1.f12071D);
            }
        }

        @Override // com.google.android.exoplayer2.InterfaceC7120n
        /* renamed from: b */
        public final /* synthetic */ void mo5505b() {
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7494v
        /* renamed from: c */
        public final void mo4898c(C7496w c7496w) {
            C6970g1 c6970g1 = C6970g1.this;
            c6970g1.f12076I = c7496w;
            c6970g1.f12087l.mo4898c(c7496w);
            Iterator<InterfaceC7465l> it = c6970g1.f12082g.iterator();
            while (it.hasNext()) {
                InterfaceC7465l next = it.next();
                next.mo4898c(c7496w);
                int i = c7496w.f14219a;
                next.mo4924f();
            }
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
        /* renamed from: d */
        public final /* synthetic */ void mo5717d() {
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7494v
        /* renamed from: e */
        public final /* synthetic */ void mo4897e() {
        }

        @Override // com.google.android.exoplayer2.video.spherical.C7487k.InterfaceC7489b
        /* renamed from: f */
        public final void mo4906f() {
            C6970g1.this.m5745d0(null);
        }

        @Override // com.google.android.exoplayer2.video.spherical.C7487k.InterfaceC7489b
        /* renamed from: g */
        public final void mo4905g(Surface surface) {
            C6970g1.this.m5745d0(surface);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
        /* renamed from: h */
        public final void mo5716h(C6747e c6747e) {
            C6970g1.this.f12087l.mo5716h(c6747e);
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7494v
        /* renamed from: i */
        public final void mo4896i(String str) {
            C6970g1.this.f12087l.mo4896i(str);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
        /* renamed from: j */
        public final void mo5715j(C6747e c6747e) {
            C6970g1 c6970g1 = C6970g1.this;
            c6970g1.getClass();
            c6970g1.f12087l.mo5715j(c6747e);
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7494v
        /* renamed from: k */
        public final void mo4895k(int i, long j) {
            C6970g1.this.f12087l.mo4895k(i, j);
        }

        @Override // com.google.android.exoplayer2.InterfaceC7120n
        /* renamed from: l */
        public final void mo5504l() {
            C6970g1.m5754W(C6970g1.this);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onAvailableCommandsChanged(Player.C6624a c6624a) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onEvents(Player player, Player.C6627c c6627c) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final void onIsLoadingChanged(boolean z) {
            C6970g1.this.getClass();
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onMediaItemTransition(C7127q0 c7127q0, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final void onPlayWhenReadyChanged(boolean z, int i) {
            C6970g1.m5754W(C6970g1.this);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPlaybackParametersChanged(C6633a1 c6633a1) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final void onPlaybackStateChanged(int i) {
            C6970g1.m5754W(C6970g1.this);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPlayerError(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPositionDiscontinuity(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPositionDiscontinuity(Player.C6629e c6629e, Player.C6629e c6629e2, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onRepeatModeChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onSeekProcessed() {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onStaticMetadataChanged(List list) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C6970g1 c6970g1 = C6970g1.this;
            c6970g1.getClass();
            Surface surface = new Surface(surfaceTexture);
            c6970g1.m5745d0(surface);
            c6970g1.f12096u = surface;
            c6970g1.m5751Z(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C6970g1 c6970g1 = C6970g1.this;
            c6970g1.m5745d0(null);
            c6970g1.m5751Z(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C6970g1.this.m5751Z(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onTimelineChanged(AbstractC6984j1 abstractC6984j1, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onTracksChanged(C7178k0 c7178k0, C7303k c7303k) {
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
        /* renamed from: q */
        public final void mo5714q(String str) {
            C6970g1.this.f12087l.mo5714q(str);
        }

        @Override // com.google.android.exoplayer2.metadata.InterfaceC7052e
        /* renamed from: r */
        public final void mo5193r(C7042a c7042a) {
            C6970g1 c6970g1 = C6970g1.this;
            c6970g1.f12087l.mo5193r(c7042a);
            C6968g0 c6968g0 = c6970g1.f12079d;
            MediaMetadata mediaMetadata = c6968g0.f12037C;
            mediaMetadata.getClass();
            MediaMetadata.C6623a c6623a = new MediaMetadata.C6623a(mediaMetadata);
            int i = 0;
            while (true) {
                C7042a.InterfaceC7044b[] interfaceC7044bArr = c7042a.f12490a;
                if (i >= interfaceC7044bArr.length) {
                    break;
                }
                interfaceC7044bArr[i].mo5509a(c6623a);
                i++;
            }
            MediaMetadata mediaMetadata2 = new MediaMetadata(c6623a);
            if (!mediaMetadata2.equals(c6968g0.f12037C)) {
                c6968g0.f12037C = mediaMetadata2;
                C6556o c6556o = new C6556o(c6968g0);
                C7417m<Player.InterfaceC6626b> c7417m = c6968g0.f12048i;
                c7417m.m5060b(15, c6556o);
                c7417m.m5061a();
            }
            Iterator<InterfaceC7052e> it = c6970g1.f12085j.iterator();
            while (it.hasNext()) {
                it.next().mo5193r(c7042a);
            }
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7494v
        /* renamed from: s */
        public final void mo4894s(int i, long j) {
            C6970g1.this.f12087l.mo4894s(i, j);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C6970g1.this.m5751Z(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C6970g1 c6970g1 = C6970g1.this;
            if (c6970g1.f12099x) {
                c6970g1.m5745d0(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C6970g1 c6970g1 = C6970g1.this;
            if (c6970g1.f12099x) {
                c6970g1.m5745d0(null);
            }
            c6970g1.m5751Z(0, 0);
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7494v
        /* renamed from: t */
        public final void mo4893t(long j, String str, long j2) {
            C6970g1.this.f12087l.mo4893t(j, str, j2);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
        /* renamed from: u */
        public final void mo5713u(C7003m0 c7003m0, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            C6970g1 c6970g1 = C6970g1.this;
            c6970g1.getClass();
            c6970g1.f12087l.mo5713u(c7003m0, decoderReuseEvaluation);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
        /* renamed from: x */
        public final void mo5712x(long j, String str, long j2) {
            C6970g1.this.f12087l.mo5712x(j, str, j2);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
        /* renamed from: y */
        public final void mo5711y(Exception exc) {
            C6970g1.this.f12087l.mo5711y(exc);
        }

        @Override // com.google.android.exoplayer2.text.InterfaceC7239i
        /* renamed from: z */
        public final void mo5191z(List<Cue> list) {
            C6970g1 c6970g1 = C6970g1.this;
            c6970g1.f12072E = list;
            Iterator<InterfaceC7239i> it = c6970g1.f12084i.iterator();
            while (it.hasNext()) {
                it.next().mo5191z(list);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.g1$c */
    /* loaded from: classes.dex */
    public static final class C6973c implements InterfaceC7458j, InterfaceC7475a, C6733b1.InterfaceC6735b {
        @Nullable

        /* renamed from: a */
        public InterfaceC7458j f12122a;
        @Nullable

        /* renamed from: b */
        public InterfaceC7475a f12123b;
        @Nullable

        /* renamed from: c */
        public InterfaceC7458j f12124c;
        @Nullable

        /* renamed from: d */
        public InterfaceC7475a f12125d;

        @Override // com.google.android.exoplayer2.video.spherical.InterfaceC7475a
        /* renamed from: a */
        public final void mo4912a(long j, float[] fArr) {
            InterfaceC7475a interfaceC7475a = this.f12125d;
            if (interfaceC7475a != null) {
                interfaceC7475a.mo4912a(j, fArr);
            }
            InterfaceC7475a interfaceC7475a2 = this.f12123b;
            if (interfaceC7475a2 != null) {
                interfaceC7475a2.mo4912a(j, fArr);
            }
        }

        @Override // com.google.android.exoplayer2.video.spherical.InterfaceC7475a
        /* renamed from: c */
        public final void mo4910c() {
            InterfaceC7475a interfaceC7475a = this.f12125d;
            if (interfaceC7475a != null) {
                interfaceC7475a.mo4910c();
            }
            InterfaceC7475a interfaceC7475a2 = this.f12123b;
            if (interfaceC7475a2 != null) {
                interfaceC7475a2.mo4910c();
            }
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7458j
        /* renamed from: f */
        public final void mo4908f(long j, long j2, C7003m0 c7003m0, @Nullable MediaFormat mediaFormat) {
            InterfaceC7458j interfaceC7458j = this.f12124c;
            if (interfaceC7458j != null) {
                interfaceC7458j.mo4908f(j, j2, c7003m0, mediaFormat);
            }
            InterfaceC7458j interfaceC7458j2 = this.f12122a;
            if (interfaceC7458j2 != null) {
                interfaceC7458j2.mo4908f(j, j2, c7003m0, mediaFormat);
            }
        }

        @Override // com.google.android.exoplayer2.C6733b1.InterfaceC6735b
        /* renamed from: p */
        public final void mo4917p(int i, @Nullable Object obj) {
            InterfaceC7475a cameraMotionListener;
            if (i == 6) {
                this.f12122a = (InterfaceC7458j) obj;
            } else if (i == 7) {
                this.f12123b = (InterfaceC7475a) obj;
            } else if (i != 10000) {
            } else {
                C7487k c7487k = (C7487k) obj;
                if (c7487k == null) {
                    cameraMotionListener = null;
                    this.f12124c = null;
                } else {
                    this.f12124c = c7487k.getVideoFrameMetadataListener();
                    cameraMotionListener = c7487k.getCameraMotionListener();
                }
                this.f12125d = cameraMotionListener;
            }
        }
    }

    public C6970g1(C6971a c6971a) {
        C6970g1 c6970g1;
        int generateAudioSessionId;
        C7401d c7401d = new C7401d();
        this.f12078c = c7401d;
        try {
            Context context = c6971a.f12102a;
            Context applicationContext = context.getApplicationContext();
            C6642d0 c6642d0 = c6971a.f12109h;
            this.f12087l = c6642d0;
            C6688d c6688d = c6971a.f12111j;
            int i = c6971a.f12112k;
            int i2 = 0;
            this.f12071D = false;
            this.f12093r = c6971a.f12119r;
            SurfaceHolder$CallbackC6972b surfaceHolder$CallbackC6972b = new SurfaceHolder$CallbackC6972b();
            this.f12080e = surfaceHolder$CallbackC6972b;
            C6973c c6973c = new C6973c();
            this.f12081f = c6973c;
            this.f12082g = new CopyOnWriteArraySet<>();
            this.f12083h = new CopyOnWriteArraySet<>();
            this.f12084i = new CopyOnWriteArraySet<>();
            this.f12085j = new CopyOnWriteArraySet<>();
            this.f12086k = new CopyOnWriteArraySet<>();
            Handler handler = new Handler(c6971a.f12110i);
            Renderer[] m6215a = ((DefaultRenderersFactory) c6971a.f12103b).m6215a(handler, surfaceHolder$CallbackC6972b, surfaceHolder$CallbackC6972b, surfaceHolder$CallbackC6972b, surfaceHolder$CallbackC6972b);
            this.f12077b = m6215a;
            this.f12070C = 1.0f;
            if (C7408g0.f13905a < 21) {
                AudioTrack audioTrack = this.f12094s;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f12094s.release();
                    this.f12094s = null;
                }
                if (this.f12094s == null) {
                    this.f12094s = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                generateAudioSessionId = this.f12094s.getAudioSessionId();
            } else {
                UUID uuid = C6622C.f10466a;
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                if (audioManager == null) {
                    generateAudioSessionId = -1;
                } else {
                    generateAudioSessionId = audioManager.generateAudioSessionId();
                }
            }
            this.f12069B = generateAudioSessionId;
            this.f12072E = Collections.emptyList();
            this.f12073F = true;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {20, 21, 22, 23, 24, 25, 26, 27};
            int i3 = 8;
            while (i2 < i3) {
                int i4 = iArr[i2];
                C7394a.m5131d(!false);
                sparseBooleanArray.append(i4, true);
                i2++;
                i3 = 8;
                iArr = iArr;
            }
            C7394a.m5131d(!false);
            try {
                C6968g0 c6968g0 = new C6968g0(m6215a, c6971a.f12105d, c6971a.f12106e, c6971a.f12107f, c6971a.f12108g, c6642d0, c6971a.f12113l, c6971a.f12114m, c6971a.f12115n, c6971a.f12116o, c6971a.f12117p, c6971a.f12118q, c6971a.f12104c, c6971a.f12110i, this, new Player.C6624a(new C7409h(sparseBooleanArray)));
                c6970g1 = this;
                try {
                    c6970g1.f12079d = c6968g0;
                    c6968g0.m5779W(surfaceHolder$CallbackC6972b);
                    c6968g0.f12049j.add(surfaceHolder$CallbackC6972b);
                    C6729b c6729b = new C6729b(context, handler, surfaceHolder$CallbackC6972b);
                    c6970g1.f12088m = c6729b;
                    c6729b.m6026a();
                    AudioFocusManager audioFocusManager = new AudioFocusManager(context, handler, surfaceHolder$CallbackC6972b);
                    c6970g1.f12089n = audioFocusManager;
                    audioFocusManager.m6221c();
                    C6976h1 c6976h1 = new C6976h1(context, handler, surfaceHolder$CallbackC6972b);
                    c6970g1.f12090o = c6976h1;
                    c6976h1.m5694b(C7408g0.m5090p(c6688d.f10693c));
                    c6970g1.f12091p = new C6997k1(context);
                    c6970g1.f12092q = new C7000l1(context);
                    c6970g1.f12075H = m5752Y(c6976h1);
                    c6970g1.f12076I = C7496w.f14218e;
                    c6970g1.m5749b0(1, 102, Integer.valueOf(c6970g1.f12069B));
                    c6970g1.m5749b0(2, 102, Integer.valueOf(c6970g1.f12069B));
                    c6970g1.m5749b0(1, 3, c6688d);
                    c6970g1.m5749b0(2, 4, Integer.valueOf(i));
                    c6970g1.m5749b0(1, 101, Boolean.valueOf(c6970g1.f12071D));
                    c6970g1.m5749b0(2, 6, c6973c);
                    c6970g1.m5749b0(6, 7, c6973c);
                    c7401d.m5119c();
                } catch (Throwable th) {
                    th = th;
                    c6970g1.f12078c.m5119c();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c6970g1 = this;
            }
        } catch (Throwable th3) {
            th = th3;
            c6970g1 = this;
        }
    }

    /* renamed from: W */
    public static void m5754W(C6970g1 c6970g1) {
        int mo5725v = c6970g1.mo5725v();
        C7000l1 c7000l1 = c6970g1.f12092q;
        C6997k1 c6997k1 = c6970g1.f12091p;
        if (mo5725v != 1) {
            if (mo5725v != 2 && mo5725v != 3) {
                if (mo5725v != 4) {
                    throw new IllegalStateException();
                }
            } else {
                c6970g1.m5739g0();
                boolean z = c6970g1.f12079d.f12038D.f14271p;
                c6970g1.mo5740g();
                c6997k1.getClass();
                c6970g1.mo5740g();
                c7000l1.getClass();
            }
        }
        c6997k1.getClass();
        c7000l1.getClass();
    }

    /* renamed from: Y */
    public static DeviceInfo m5752Y(C6976h1 c6976h1) {
        int i;
        c6976h1.getClass();
        int i2 = C7408g0.f13905a;
        AudioManager audioManager = c6976h1.f12141d;
        if (i2 >= 28) {
            i = audioManager.getStreamMinVolume(c6976h1.f12143f);
        } else {
            i = 0;
        }
        return new DeviceInfo(i, audioManager.getStreamMaxVolume(c6976h1.f12143f));
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: B */
    public final void mo5767B(int i) {
        m5739g0();
        this.f12079d.mo5767B(i);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: C */
    public final void mo5766C(@Nullable SurfaceView surfaceView) {
        SurfaceHolder holder;
        m5739g0();
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        m5739g0();
        if (holder != null && holder == this.f12097v) {
            m5753X();
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: D */
    public final int mo5765D() {
        m5739g0();
        return this.f12079d.f12038D.f14268m;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: E */
    public final C7178k0 mo5764E() {
        m5739g0();
        return this.f12079d.f12038D.f14263h;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: F */
    public final int mo5763F() {
        m5739g0();
        return this.f12079d.f12060u;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: G */
    public final AbstractC6984j1 mo5762G() {
        m5739g0();
        return this.f12079d.f12038D.f14256a;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: H */
    public final Looper mo5761H() {
        return this.f12079d.f12055p;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: I */
    public final boolean mo5760I() {
        m5739g0();
        return this.f12079d.f12061v;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: J */
    public final long mo5759J() {
        m5739g0();
        return this.f12079d.mo5759J();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: M */
    public final void mo5758M(@Nullable TextureView textureView) {
        SurfaceTexture surfaceTexture;
        m5739g0();
        if (textureView == null) {
            m5753X();
            return;
        }
        m5750a0();
        this.f12100y = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f12080e);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            m5745d0(null);
            m5751Z(0, 0);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        m5745d0(surface);
        this.f12096u = surface;
        m5751Z(textureView.getWidth(), textureView.getHeight());
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: N */
    public final C7303k mo5757N() {
        m5739g0();
        return this.f12079d.mo5757N();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: P */
    public final MediaMetadata mo5756P() {
        return this.f12079d.f12037C;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: Q */
    public final long mo5755Q() {
        m5739g0();
        return this.f12079d.f12057r;
    }

    /* renamed from: X */
    public final void m5753X() {
        m5739g0();
        m5750a0();
        m5745d0(null);
        m5751Z(0, 0);
    }

    /* renamed from: Z */
    public final void m5751Z(int i, int i2) {
        if (i == this.f12101z && i2 == this.f12068A) {
            return;
        }
        this.f12101z = i;
        this.f12068A = i2;
        this.f12087l.mo4926K(i, i2);
        Iterator<InterfaceC7465l> it = this.f12082g.iterator();
        while (it.hasNext()) {
            it.next().mo4926K(i, i2);
        }
    }

    /* renamed from: a0 */
    public final void m5750a0() {
        C7487k c7487k = this.f12098w;
        SurfaceHolder$CallbackC6972b surfaceHolder$CallbackC6972b = this.f12080e;
        if (c7487k != null) {
            C6733b1 m5778X = this.f12079d.m5778X(this.f12081f);
            C7394a.m5131d(!m5778X.f10887g);
            m5778X.f10884d = 10000;
            C7394a.m5131d(!m5778X.f10887g);
            m5778X.f10885e = null;
            m5778X.m6023c();
            this.f12098w.f14181a.remove(surfaceHolder$CallbackC6972b);
            this.f12098w = null;
        }
        TextureView textureView = this.f12100y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != surfaceHolder$CallbackC6972b) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f12100y.setSurfaceTextureListener(null);
            }
            this.f12100y = null;
        }
        SurfaceHolder surfaceHolder = this.f12097v;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(surfaceHolder$CallbackC6972b);
            this.f12097v = null;
        }
    }

    /* renamed from: b0 */
    public final void m5749b0(int i, int i2, @Nullable Object obj) {
        Renderer[] rendererArr;
        for (Renderer renderer : this.f12077b) {
            if (renderer.mo5698v() == i) {
                C6733b1 m5778X = this.f12079d.m5778X(renderer);
                C7394a.m5131d(!m5778X.f10887g);
                m5778X.f10884d = i2;
                C7394a.m5131d(!m5778X.f10887g);
                m5778X.f10885e = obj;
                m5778X.m6023c();
            }
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: c */
    public final C6633a1 mo5748c() {
        m5739g0();
        return this.f12079d.f12038D.f14269n;
    }

    /* renamed from: c0 */
    public final void m5747c0(SurfaceHolder surfaceHolder) {
        this.f12099x = false;
        this.f12097v = surfaceHolder;
        surfaceHolder.addCallback(this.f12080e);
        Surface surface = this.f12097v.getSurface();
        if (surface == null || !surface.isValid()) {
            m5751Z(0, 0);
            return;
        }
        Rect surfaceFrame = this.f12097v.getSurfaceFrame();
        m5751Z(surfaceFrame.width(), surfaceFrame.height());
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: d */
    public final boolean mo5746d() {
        m5739g0();
        return this.f12079d.mo5746d();
    }

    /* renamed from: d0 */
    public final void m5745d0(@Nullable Object obj) {
        Renderer[] rendererArr;
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        for (Renderer renderer : this.f12077b) {
            if (renderer.mo5698v() == 2) {
                C6733b1 m5778X = this.f12079d.m5778X(renderer);
                C7394a.m5131d(!m5778X.f10887g);
                m5778X.f10884d = 1;
                C7394a.m5131d(true ^ m5778X.f10887g);
                m5778X.f10885e = obj;
                m5778X.m6023c();
                arrayList.add(m5778X);
            }
        }
        Object obj2 = this.f12095t;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C6733b1) it.next()).m6025a(this.f12093r);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            z = false;
            Object obj3 = this.f12095t;
            Surface surface = this.f12096u;
            if (obj3 == surface) {
                surface.release();
                this.f12096u = null;
            }
        } else {
            z = false;
        }
        this.f12095t = obj;
        if (z) {
            C6968g0 c6968g0 = this.f12079d;
            ExoPlaybackException exoPlaybackException = new ExoPlaybackException(2, new ExoTimeoutException(3), 1003);
            C7508z0 c7508z0 = c6968g0.f12038D;
            C7508z0 m4867a = c7508z0.m4867a(c7508z0.f14257b);
            m4867a.f14272q = m4867a.f14274s;
            m4867a.f14273r = 0L;
            C7508z0 m4863e = m4867a.m4862f(1).m4863e(exoPlaybackException);
            c6968g0.f12062w++;
            c6968g0.f12047h.f12213g.mo5068e(6).m5122a();
            if (m4863e.f14256a.m5685p() && !c6968g0.f12038D.f14256a.m5685p()) {
                z2 = true;
            } else {
                z2 = false;
            }
            c6968g0.m5768h0(m4863e, 0, 1, false, z2, 4, c6968g0.m5777Y(m4863e), -1);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: e */
    public final long mo5744e() {
        m5739g0();
        return this.f12079d.mo5744e();
    }

    /* renamed from: e0 */
    public final void m5743e0(float f) {
        m5739g0();
        float m5100f = C7408g0.m5100f(f, 0.0f, 1.0f);
        if (this.f12070C == m5100f) {
            return;
        }
        this.f12070C = m5100f;
        m5749b0(1, 2, Float.valueOf(this.f12089n.f10462g * m5100f));
        this.f12087l.mo5194o(m5100f);
        Iterator<InterfaceC6696g> it = this.f12083h.iterator();
        while (it.hasNext()) {
            it.next().mo5194o(m5100f);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: f */
    public final void mo5742f(int i, long j) {
        m5739g0();
        C6642d0 c6642d0 = this.f12087l;
        if (!c6642d0.f10579h) {
            AnalyticsListener.C6634a m6142Q = c6642d0.m6142Q();
            c6642d0.f10579h = true;
            c6642d0.m6137V(m6142Q, -1, new C6596p(m6142Q));
        }
        this.f12079d.mo5742f(i, j);
    }

    /* renamed from: f0 */
    public final void m5741f0(int i, int i2, boolean z) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        this.f12079d.m5770f0(i3, i2, z2);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: g */
    public final boolean mo5740g() {
        m5739g0();
        return this.f12079d.f12038D.f14267l;
    }

    /* renamed from: g0 */
    public final void m5739g0() {
        IllegalStateException illegalStateException;
        C7401d c7401d = this.f12078c;
        synchronized (c7401d) {
            boolean z = false;
            while (!c7401d.f13891a) {
                try {
                    c7401d.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f12079d.f12055p.getThread()) {
            String m5096j = C7408g0.m5096j("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f12079d.f12055p.getThread().getName());
            if (!this.f12073F) {
                if (this.f12074G) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                C7421n.m5055c("SimpleExoPlayer", m5096j, illegalStateException);
                this.f12074G = true;
                return;
            }
            throw new IllegalStateException(m5096j);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getCurrentPosition() {
        m5739g0();
        return this.f12079d.getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getDuration() {
        m5739g0();
        return this.f12079d.getDuration();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: h */
    public final void mo5738h(boolean z) {
        m5739g0();
        this.f12079d.mo5738h(z);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: i */
    public final void mo5737i() {
        m5739g0();
        this.f12079d.getClass();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: j */
    public final int mo5736j() {
        m5739g0();
        return this.f12079d.mo5736j();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: k */
    public final void mo5735k(@Nullable TextureView textureView) {
        m5739g0();
        if (textureView == null || textureView != this.f12100y) {
            return;
        }
        m5753X();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: l */
    public final C7496w mo5734l() {
        return this.f12076I;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: m */
    public final void mo5733m(Player.InterfaceC6628d interfaceC6628d) {
        interfaceC6628d.getClass();
        this.f12083h.remove(interfaceC6628d);
        this.f12082g.remove(interfaceC6628d);
        this.f12084i.remove(interfaceC6628d);
        this.f12085j.remove(interfaceC6628d);
        this.f12086k.remove(interfaceC6628d);
        this.f12079d.m5771e0(interfaceC6628d);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: n */
    public final int mo5732n() {
        m5739g0();
        return this.f12079d.mo5732n();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: o */
    public final void mo5731o(@Nullable SurfaceView surfaceView) {
        SurfaceHolder holder;
        m5739g0();
        if (surfaceView instanceof InterfaceC7457i) {
            m5750a0();
            m5745d0(surfaceView);
        } else {
            boolean z = surfaceView instanceof C7487k;
            SurfaceHolder$CallbackC6972b surfaceHolder$CallbackC6972b = this.f12080e;
            if (z) {
                m5750a0();
                this.f12098w = (C7487k) surfaceView;
                C6733b1 m5778X = this.f12079d.m5778X(this.f12081f);
                C7394a.m5131d(!m5778X.f10887g);
                m5778X.f10884d = 10000;
                C7487k c7487k = this.f12098w;
                C7394a.m5131d(true ^ m5778X.f10887g);
                m5778X.f10885e = c7487k;
                m5778X.m6023c();
                this.f12098w.f14181a.add(surfaceHolder$CallbackC6972b);
                m5745d0(this.f12098w.getVideoSurface());
            } else {
                if (surfaceView == null) {
                    holder = null;
                } else {
                    holder = surfaceView.getHolder();
                }
                m5739g0();
                if (holder == null) {
                    m5753X();
                    return;
                }
                m5750a0();
                this.f12099x = true;
                this.f12097v = holder;
                holder.addCallback(surfaceHolder$CallbackC6972b);
                Surface surface = holder.getSurface();
                if (surface != null && surface.isValid()) {
                    m5745d0(surface);
                    Rect surfaceFrame = holder.getSurfaceFrame();
                    m5751Z(surfaceFrame.width(), surfaceFrame.height());
                    return;
                }
                m5745d0(null);
                m5751Z(0, 0);
                return;
            }
        }
        m5747c0(surfaceView.getHolder());
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: p */
    public final int mo5730p() {
        m5739g0();
        return this.f12079d.mo5730p();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void prepare() {
        m5739g0();
        boolean mo5740g = mo5740g();
        int i = 2;
        int m6219e = this.f12089n.m6219e(2, mo5740g);
        if (!mo5740g || m6219e == 1) {
            i = 1;
        }
        m5741f0(m6219e, i, mo5740g);
        this.f12079d.prepare();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: r */
    public final void mo5729r(boolean z) {
        m5739g0();
        int m6219e = this.f12089n.m6219e(mo5725v(), z);
        int i = 1;
        if (z && m6219e != 1) {
            i = 2;
        }
        m5741f0(m6219e, i, z);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: s */
    public final long mo5728s() {
        m5739g0();
        return this.f12079d.f12058s;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: t */
    public final long mo5727t() {
        m5739g0();
        return this.f12079d.mo5727t();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: u */
    public final void mo5726u(Player.InterfaceC6628d interfaceC6628d) {
        interfaceC6628d.getClass();
        this.f12083h.add(interfaceC6628d);
        this.f12082g.add(interfaceC6628d);
        this.f12084i.add(interfaceC6628d);
        this.f12085j.add(interfaceC6628d);
        this.f12086k.add(interfaceC6628d);
        this.f12079d.m5779W(interfaceC6628d);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: v */
    public final int mo5725v() {
        m5739g0();
        return this.f12079d.f12038D.f14260e;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: w */
    public final List<Cue> mo5724w() {
        m5739g0();
        return this.f12072E;
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    /* renamed from: x */
    public final ExoPlaybackException mo5723x() {
        m5739g0();
        return this.f12079d.f12038D.f14261f;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: y */
    public final int mo5722y() {
        m5739g0();
        return this.f12079d.mo5722y();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: z */
    public final Player.C6624a mo5721z() {
        m5739g0();
        return this.f12079d.f12036B;
    }
}
