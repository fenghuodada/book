package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.util.C7408g0;
import java.lang.reflect.Method;

/* renamed from: com.google.android.exoplayer2.audio.u */
/* loaded from: classes.dex */
public final class C6722u {

    /* renamed from: A */
    public long f10831A;

    /* renamed from: B */
    public long f10832B;

    /* renamed from: C */
    public long f10833C;

    /* renamed from: D */
    public boolean f10834D;

    /* renamed from: E */
    public long f10835E;

    /* renamed from: F */
    public long f10836F;

    /* renamed from: a */
    public final InterfaceC6723a f10837a;

    /* renamed from: b */
    public final long[] f10838b;
    @Nullable

    /* renamed from: c */
    public AudioTrack f10839c;

    /* renamed from: d */
    public int f10840d;

    /* renamed from: e */
    public int f10841e;
    @Nullable

    /* renamed from: f */
    public C6720t f10842f;

    /* renamed from: g */
    public int f10843g;

    /* renamed from: h */
    public boolean f10844h;

    /* renamed from: i */
    public long f10845i;

    /* renamed from: j */
    public float f10846j;

    /* renamed from: k */
    public boolean f10847k;

    /* renamed from: l */
    public long f10848l;

    /* renamed from: m */
    public long f10849m;
    @Nullable

    /* renamed from: n */
    public Method f10850n;

    /* renamed from: o */
    public long f10851o;

    /* renamed from: p */
    public boolean f10852p;

    /* renamed from: q */
    public boolean f10853q;

    /* renamed from: r */
    public long f10854r;

    /* renamed from: s */
    public long f10855s;

    /* renamed from: t */
    public long f10856t;

    /* renamed from: u */
    public long f10857u;

    /* renamed from: v */
    public int f10858v;

    /* renamed from: w */
    public int f10859w;

    /* renamed from: x */
    public long f10860x;

    /* renamed from: y */
    public long f10861y;

    /* renamed from: z */
    public long f10862z;

    /* renamed from: com.google.android.exoplayer2.audio.u$a */
    /* loaded from: classes.dex */
    public interface InterfaceC6723a {
        /* renamed from: a */
        void mo6045a(long j);

        /* renamed from: b */
        void mo6044b(int i, long j);

        /* renamed from: c */
        void mo6043c(long j);

        /* renamed from: d */
        void mo6042d(long j, long j2, long j3, long j4);

        /* renamed from: e */
        void mo6041e(long j, long j2, long j3, long j4);
    }

    public C6722u(DefaultAudioSink.C6678g c6678g) {
        this.f10837a = c6678g;
        if (C7408g0.f13905a >= 18) {
            try {
                this.f10850n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f10838b = new long[10];
    }

    /* renamed from: a */
    public final long m6048a() {
        AudioTrack audioTrack = this.f10839c;
        audioTrack.getClass();
        if (this.f10860x != -9223372036854775807L) {
            return Math.min(this.f10831A, this.f10862z + ((((SystemClock.elapsedRealtime() * 1000) - this.f10860x) * this.f10843g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f10844h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f10857u = this.f10855s;
            }
            playbackHeadPosition += this.f10857u;
        }
        if (C7408g0.f13905a <= 29) {
            if (playbackHeadPosition == 0 && this.f10855s > 0 && playState == 3) {
                if (this.f10861y == -9223372036854775807L) {
                    this.f10861y = SystemClock.elapsedRealtime();
                }
                return this.f10855s;
            }
            this.f10861y = -9223372036854775807L;
        }
        if (this.f10855s > playbackHeadPosition) {
            this.f10856t++;
        }
        this.f10855s = playbackHeadPosition;
        return playbackHeadPosition + (this.f10856t << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m6047b(long r6) {
        /*
            r5 = this;
            long r0 = r5.m6048a()
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r7 = 1
            if (r6 > 0) goto L2b
            boolean r6 = r5.f10844h
            r0 = 0
            if (r6 == 0) goto L26
            android.media.AudioTrack r6 = r5.f10839c
            r6.getClass()
            int r6 = r6.getPlayState()
            r1 = 2
            if (r6 != r1) goto L26
            long r1 = r5.m6048a()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L26
            r6 = r7
            goto L27
        L26:
            r6 = r0
        L27:
            if (r6 == 0) goto L2a
            goto L2b
        L2a:
            r7 = r0
        L2b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C6722u.m6047b(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r4 != false) goto L11;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6046c(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.f10839c = r3
            r2.f10840d = r6
            r2.f10841e = r7
            com.google.android.exoplayer2.audio.t r0 = new com.google.android.exoplayer2.audio.t
            r0.<init>(r3)
            r2.f10842f = r0
            int r3 = r3.getSampleRate()
            r2.f10843g = r3
            r3 = 0
            if (r4 == 0) goto L29
            int r4 = com.google.android.exoplayer2.util.C7408g0.f13905a
            r0 = 23
            r1 = 1
            if (r4 >= r0) goto L25
            r4 = 5
            if (r5 == r4) goto L23
            r4 = 6
            if (r5 != r4) goto L25
        L23:
            r4 = r1
            goto L26
        L25:
            r4 = r3
        L26:
            if (r4 == 0) goto L29
            goto L2a
        L29:
            r1 = r3
        L2a:
            r2.f10844h = r1
            boolean r4 = com.google.android.exoplayer2.util.C7408g0.m5086t(r5)
            r2.f10853q = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L44
            int r7 = r7 / r6
            long r4 = (long) r7
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r6
            int r6 = r2.f10843g
            long r6 = (long) r6
            long r4 = r4 / r6
            goto L45
        L44:
            r4 = r0
        L45:
            r2.f10845i = r4
            r4 = 0
            r2.f10855s = r4
            r2.f10856t = r4
            r2.f10857u = r4
            r2.f10852p = r3
            r2.f10860x = r0
            r2.f10861y = r0
            r2.f10854r = r4
            r2.f10851o = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f10846j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C6722u.m6046c(android.media.AudioTrack, boolean, int, int, int):void");
    }
}
