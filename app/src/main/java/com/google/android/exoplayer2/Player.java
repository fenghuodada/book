package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.InterfaceC6696g;
import com.google.android.exoplayer2.device.InterfaceC6753a;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.metadata.InterfaceC7052e;
import com.google.android.exoplayer2.source.C7178k0;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.InterfaceC7239i;
import com.google.android.exoplayer2.trackselection.C7303k;
import com.google.android.exoplayer2.util.C7409h;
import com.google.android.exoplayer2.video.C7496w;
import com.google.android.exoplayer2.video.InterfaceC7465l;
import com.google.common.base.C7937f;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public interface Player {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Command {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface DiscontinuityReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Event {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface MediaItemTransitionReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface PlayWhenReadyChangeReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface PlaybackSuppressionReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface RepeatMode {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface State {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TimelineChangeReason {
    }

    /* renamed from: com.google.android.exoplayer2.Player$a */
    /* loaded from: classes.dex */
    public static final class C6624a {

        /* renamed from: a */
        public final C7409h f10540a;

        /* renamed from: com.google.android.exoplayer2.Player$a$a */
        /* loaded from: classes.dex */
        public static final class C6625a {

            /* renamed from: a */
            public final C7409h.C7410a f10541a = new C7409h.C7410a();

            /* renamed from: a */
            public final void m6212a(int i, boolean z) {
                C7409h.C7410a c7410a = this.f10541a;
                if (z) {
                    c7410a.m5077a(i);
                } else {
                    c7410a.getClass();
                }
            }
        }

        static {
            new C7409h.C7410a().m5076b();
        }

        public C6624a(C7409h c7409h) {
            this.f10540a = c7409h;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C6624a) {
                return this.f10540a.equals(((C6624a) obj).f10540a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f10540a.hashCode();
        }
    }

    @Deprecated
    /* renamed from: com.google.android.exoplayer2.Player$b */
    /* loaded from: classes.dex */
    public interface InterfaceC6626b {
        void onAvailableCommandsChanged(C6624a c6624a);

        void onEvents(Player player, C6627c c6627c);

        void onIsLoadingChanged(boolean z);

        void onIsPlayingChanged(boolean z);

        @Deprecated
        void onLoadingChanged(boolean z);

        void onMediaItemTransition(@Nullable C7127q0 c7127q0, int i);

        void onMediaMetadataChanged(MediaMetadata mediaMetadata);

        void onPlayWhenReadyChanged(boolean z, int i);

        void onPlaybackParametersChanged(C6633a1 c6633a1);

        void onPlaybackStateChanged(int i);

        void onPlaybackSuppressionReasonChanged(int i);

        void onPlayerError(PlaybackException playbackException);

        void onPlayerErrorChanged(@Nullable PlaybackException playbackException);

        @Deprecated
        void onPlayerStateChanged(boolean z, int i);

        @Deprecated
        void onPositionDiscontinuity(int i);

        void onPositionDiscontinuity(C6629e c6629e, C6629e c6629e2, int i);

        void onRepeatModeChanged(int i);

        @Deprecated
        void onSeekProcessed();

        void onShuffleModeEnabledChanged(boolean z);

        @Deprecated
        void onStaticMetadataChanged(List<C7042a> list);

        void onTimelineChanged(AbstractC6984j1 abstractC6984j1, int i);

        void onTracksChanged(C7178k0 c7178k0, C7303k c7303k);
    }

    /* renamed from: com.google.android.exoplayer2.Player$c */
    /* loaded from: classes.dex */
    public static final class C6627c {

        /* renamed from: a */
        public final C7409h f10542a;

        public C6627c(C7409h c7409h) {
            this.f10542a = c7409h;
        }

        /* renamed from: a */
        public final boolean m6211a(int... iArr) {
            C7409h c7409h = this.f10542a;
            c7409h.getClass();
            for (int i : iArr) {
                if (c7409h.f13916a.get(i)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C6627c) {
                return this.f10542a.equals(((C6627c) obj).f10542a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f10542a.hashCode();
        }
    }

    /* renamed from: com.google.android.exoplayer2.Player$d */
    /* loaded from: classes.dex */
    public interface InterfaceC6628d extends InterfaceC7465l, InterfaceC6696g, InterfaceC7239i, InterfaceC7052e, InterfaceC6753a, InterfaceC6626b {
    }

    /* renamed from: com.google.android.exoplayer2.Player$e */
    /* loaded from: classes.dex */
    public static final class C6629e {
        @Nullable

        /* renamed from: a */
        public final Object f10543a;

        /* renamed from: b */
        public final int f10544b;
        @Nullable

        /* renamed from: c */
        public final Object f10545c;

        /* renamed from: d */
        public final int f10546d;

        /* renamed from: e */
        public final long f10547e;

        /* renamed from: f */
        public final long f10548f;

        /* renamed from: g */
        public final int f10549g;

        /* renamed from: h */
        public final int f10550h;

        public C6629e(@Nullable Object obj, int i, @Nullable Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f10543a = obj;
            this.f10544b = i;
            this.f10545c = obj2;
            this.f10546d = i2;
            this.f10547e = j;
            this.f10548f = j2;
            this.f10549g = i3;
            this.f10550h = i4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C6629e.class != obj.getClass()) {
                return false;
            }
            C6629e c6629e = (C6629e) obj;
            return this.f10544b == c6629e.f10544b && this.f10546d == c6629e.f10546d && this.f10547e == c6629e.f10547e && this.f10548f == c6629e.f10548f && this.f10549g == c6629e.f10549g && this.f10550h == c6629e.f10550h && C7937f.m4290a(this.f10543a, c6629e.f10543a) && C7937f.m4290a(this.f10545c, c6629e.f10545c);
        }

        public final int hashCode() {
            int i = this.f10544b;
            return Arrays.hashCode(new Object[]{this.f10543a, Integer.valueOf(i), this.f10545c, Integer.valueOf(this.f10546d), Integer.valueOf(i), Long.valueOf(this.f10547e), Long.valueOf(this.f10548f), Integer.valueOf(this.f10549g), Integer.valueOf(this.f10550h)});
        }
    }

    /* renamed from: A */
    boolean mo5791A(int i);

    /* renamed from: B */
    void mo5767B(int i);

    /* renamed from: C */
    void mo5766C(@Nullable SurfaceView surfaceView);

    /* renamed from: D */
    int mo5765D();

    /* renamed from: E */
    C7178k0 mo5764E();

    /* renamed from: F */
    int mo5763F();

    /* renamed from: G */
    AbstractC6984j1 mo5762G();

    /* renamed from: H */
    Looper mo5761H();

    /* renamed from: I */
    boolean mo5760I();

    /* renamed from: J */
    long mo5759J();

    /* renamed from: K */
    void mo5790K();

    /* renamed from: L */
    void mo5789L();

    /* renamed from: M */
    void mo5758M(@Nullable TextureView textureView);

    /* renamed from: N */
    C7303k mo5757N();

    /* renamed from: O */
    void mo5788O();

    /* renamed from: P */
    MediaMetadata mo5756P();

    /* renamed from: Q */
    long mo5755Q();

    /* renamed from: c */
    C6633a1 mo5748c();

    /* renamed from: d */
    boolean mo5746d();

    /* renamed from: e */
    long mo5744e();

    /* renamed from: f */
    void mo5742f(int i, long j);

    /* renamed from: g */
    boolean mo5740g();

    long getCurrentPosition();

    long getDuration();

    /* renamed from: h */
    void mo5738h(boolean z);

    /* renamed from: i */
    void mo5737i();

    boolean isPlaying();

    /* renamed from: j */
    int mo5736j();

    /* renamed from: k */
    void mo5735k(@Nullable TextureView textureView);

    /* renamed from: l */
    C7496w mo5734l();

    /* renamed from: m */
    void mo5733m(InterfaceC6628d interfaceC6628d);

    /* renamed from: n */
    int mo5732n();

    /* renamed from: o */
    void mo5731o(@Nullable SurfaceView surfaceView);

    /* renamed from: p */
    int mo5730p();

    void prepare();

    /* renamed from: q */
    void mo5780q();

    /* renamed from: r */
    void mo5729r(boolean z);

    /* renamed from: s */
    long mo5728s();

    /* renamed from: t */
    long mo5727t();

    /* renamed from: u */
    void mo5726u(InterfaceC6628d interfaceC6628d);

    /* renamed from: v */
    int mo5725v();

    /* renamed from: w */
    List<Cue> mo5724w();

    @Nullable
    /* renamed from: x */
    ExoPlaybackException mo5723x();

    /* renamed from: y */
    int mo5722y();

    /* renamed from: z */
    C6624a mo5721z();
}
