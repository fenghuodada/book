package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C6633a1;
import com.google.android.exoplayer2.C6964f;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.C6694f0;
import com.google.android.exoplayer2.audio.C6722u;
import com.google.android.exoplayer2.audio.InterfaceC6718s;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7421n;
import com.google.android.exoplayer2.util.C7424q;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.internal.p064ws.RealWebSocket;

/* loaded from: classes.dex */
public final class DefaultAudioSink implements AudioSink {

    /* renamed from: A */
    public long f10602A;

    /* renamed from: B */
    public long f10603B;

    /* renamed from: C */
    public long f10604C;

    /* renamed from: D */
    public int f10605D;

    /* renamed from: E */
    public boolean f10606E;

    /* renamed from: F */
    public boolean f10607F;

    /* renamed from: G */
    public long f10608G;

    /* renamed from: H */
    public float f10609H;

    /* renamed from: I */
    public InterfaceC6699h[] f10610I;

    /* renamed from: J */
    public ByteBuffer[] f10611J;
    @Nullable

    /* renamed from: K */
    public ByteBuffer f10612K;

    /* renamed from: L */
    public int f10613L;
    @Nullable

    /* renamed from: M */
    public ByteBuffer f10614M;

    /* renamed from: N */
    public byte[] f10615N;

    /* renamed from: O */
    public int f10616O;

    /* renamed from: P */
    public int f10617P;

    /* renamed from: Q */
    public boolean f10618Q;

    /* renamed from: R */
    public boolean f10619R;

    /* renamed from: S */
    public boolean f10620S;

    /* renamed from: T */
    public boolean f10621T;

    /* renamed from: U */
    public int f10622U;

    /* renamed from: V */
    public C6724v f10623V;

    /* renamed from: W */
    public boolean f10624W;

    /* renamed from: X */
    public long f10625X;

    /* renamed from: Y */
    public boolean f10626Y;

    /* renamed from: Z */
    public boolean f10627Z;
    @Nullable

    /* renamed from: a */
    public final C6692f f10628a;

    /* renamed from: b */
    public final InterfaceC6673b f10629b;

    /* renamed from: c */
    public final boolean f10630c;

    /* renamed from: d */
    public final C6726x f10631d;

    /* renamed from: e */
    public final C6712m0 f10632e;

    /* renamed from: f */
    public final InterfaceC6699h[] f10633f;

    /* renamed from: g */
    public final InterfaceC6699h[] f10634g;

    /* renamed from: h */
    public final ConditionVariable f10635h;

    /* renamed from: i */
    public final C6722u f10636i;

    /* renamed from: j */
    public final ArrayDeque<C6676e> f10637j;

    /* renamed from: k */
    public final boolean f10638k;

    /* renamed from: l */
    public final int f10639l;

    /* renamed from: m */
    public C6679h f10640m;

    /* renamed from: n */
    public final C6677f<AudioSink.C6668b> f10641n;

    /* renamed from: o */
    public final C6677f<AudioSink.C6671e> f10642o;
    @Nullable

    /* renamed from: p */
    public AudioSink.InterfaceC6669c f10643p;
    @Nullable

    /* renamed from: q */
    public C6674c f10644q;

    /* renamed from: r */
    public C6674c f10645r;
    @Nullable

    /* renamed from: s */
    public AudioTrack f10646s;

    /* renamed from: t */
    public C6688d f10647t;
    @Nullable

    /* renamed from: u */
    public C6676e f10648u;

    /* renamed from: v */
    public C6676e f10649v;

    /* renamed from: w */
    public C6633a1 f10650w;
    @Nullable

    /* renamed from: x */
    public ByteBuffer f10651x;

    /* renamed from: y */
    public int f10652y;

    /* renamed from: z */
    public long f10653z;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface OffloadMode {
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$a */
    /* loaded from: classes.dex */
    public class C6672a extends Thread {

        /* renamed from: a */
        public final /* synthetic */ AudioTrack f10654a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6672a(AudioTrack audioTrack) {
            super("ExoPlayer:AudioTrackReleaseThread");
            this.f10654a = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            AudioTrack audioTrack = this.f10654a;
            try {
                audioTrack.flush();
                audioTrack.release();
            } finally {
                defaultAudioSink.f10635h.open();
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$b */
    /* loaded from: classes.dex */
    public interface InterfaceC6673b {
        /* renamed from: a */
        C6633a1 mo6084a(C6633a1 c6633a1);

        /* renamed from: b */
        long mo6083b(long j);

        /* renamed from: c */
        long mo6082c();

        /* renamed from: d */
        boolean mo6081d(boolean z);
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$c */
    /* loaded from: classes.dex */
    public static final class C6674c {

        /* renamed from: a */
        public final C7003m0 f10656a;

        /* renamed from: b */
        public final int f10657b;

        /* renamed from: c */
        public final int f10658c;

        /* renamed from: d */
        public final int f10659d;

        /* renamed from: e */
        public final int f10660e;

        /* renamed from: f */
        public final int f10661f;

        /* renamed from: g */
        public final int f10662g;

        /* renamed from: h */
        public final int f10663h;

        /* renamed from: i */
        public final InterfaceC6699h[] f10664i;

        public C6674c(C7003m0 c7003m0, int i, int i2, int i3, int i4, int i5, int i6, boolean z, InterfaceC6699h[] interfaceC6699hArr) {
            float f;
            int m5099g;
            this.f10656a = c7003m0;
            this.f10657b = i;
            this.f10658c = i2;
            this.f10659d = i3;
            this.f10660e = i4;
            this.f10661f = i5;
            this.f10662g = i6;
            this.f10664i = interfaceC6699hArr;
            long j = 250000;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException();
                    }
                } else {
                    j = 50000000;
                }
                m5099g = m6085d(j);
            } else {
                if (z) {
                    f = 8.0f;
                } else {
                    f = 1.0f;
                }
                int minBufferSize = AudioTrack.getMinBufferSize(i4, i5, i6);
                C7394a.m5131d(minBufferSize != -2);
                m5099g = C7408g0.m5099g(minBufferSize * 4, ((int) ((250000 * i4) / 1000000)) * i3, Math.max(minBufferSize, ((int) ((750000 * i4) / 1000000)) * i3));
                if (f != 1.0f) {
                    m5099g = Math.round(m5099g * f);
                }
            }
            this.f10663h = m5099g;
        }

        @RequiresApi(21)
        /* renamed from: c */
        public static AudioAttributes m6086c(C6688d c6688d, boolean z) {
            if (z) {
                return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            }
            return c6688d.m6071a();
        }

        /* renamed from: a */
        public final AudioTrack m6088a(boolean z, C6688d c6688d, int i) throws AudioSink.C6668b {
            int i2 = this.f10658c;
            try {
                AudioTrack m6087b = m6087b(z, c6688d, i);
                int state = m6087b.getState();
                if (state == 1) {
                    return m6087b;
                }
                try {
                    m6087b.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.C6668b(state, this.f10660e, this.f10661f, this.f10663h, this.f10656a, i2 == 1, null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new AudioSink.C6668b(0, this.f10660e, this.f10661f, this.f10663h, this.f10656a, i2 == 1, e);
            }
        }

        /* renamed from: b */
        public final AudioTrack m6087b(boolean z, C6688d c6688d, int i) {
            AudioTrack audioTrack;
            AudioTrack.Builder offloadedPlayback;
            int i2 = C7408g0.f13905a;
            int i3 = this.f10662g;
            int i4 = this.f10661f;
            int i5 = this.f10660e;
            if (i2 >= 29) {
                AudioFormat m6094u = DefaultAudioSink.m6094u(i5, i4, i3);
                AudioAttributes m6086c = m6086c(c6688d, z);
                boolean z2 = true;
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(m6086c).setAudioFormat(m6094u).setTransferMode(1).setBufferSizeInBytes(this.f10663h).setSessionId(i);
                if (this.f10658c != 1) {
                    z2 = false;
                }
                offloadedPlayback = sessionId.setOffloadedPlayback(z2);
                return offloadedPlayback.build();
            } else if (i2 >= 21) {
                return new AudioTrack(m6086c(c6688d, z), DefaultAudioSink.m6094u(i5, i4, i3), this.f10663h, 1, i);
            } else {
                int m5090p = C7408g0.m5090p(c6688d.f10693c);
                int i6 = this.f10660e;
                int i7 = this.f10661f;
                int i8 = this.f10662g;
                int i9 = this.f10663h;
                if (i == 0) {
                    audioTrack = new AudioTrack(m5090p, i6, i7, i8, i9, 1);
                } else {
                    audioTrack = new AudioTrack(m5090p, i6, i7, i8, i9, 1, i);
                }
                return audioTrack;
            }
        }

        /* renamed from: d */
        public final int m6085d(long j) {
            int i;
            int i2 = this.f10662g;
            switch (i2) {
                case 5:
                    i = 80000;
                    break;
                case 6:
                case 18:
                    i = 768000;
                    break;
                case 7:
                    i = 192000;
                    break;
                case 8:
                    i = 2250000;
                    break;
                case 9:
                    i = 40000;
                    break;
                case 10:
                    i = 100000;
                    break;
                case 11:
                    i = 16000;
                    break;
                case 12:
                    i = 7000;
                    break;
                case 13:
                default:
                    throw new IllegalArgumentException();
                case 14:
                    i = 3062500;
                    break;
                case 15:
                    i = 8000;
                    break;
                case 16:
                    i = 256000;
                    break;
                case 17:
                    i = 336000;
                    break;
            }
            if (i2 == 5) {
                i *= 2;
            }
            return (int) ((j * i) / 1000000);
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$d */
    /* loaded from: classes.dex */
    public static class C6675d implements InterfaceC6673b {

        /* renamed from: a */
        public final InterfaceC6699h[] f10665a;

        /* renamed from: b */
        public final C6706j0 f10666b;

        /* renamed from: c */
        public final C6710l0 f10667c;

        public C6675d(InterfaceC6699h... interfaceC6699hArr) {
            C6706j0 c6706j0 = new C6706j0();
            C6710l0 c6710l0 = new C6710l0();
            InterfaceC6699h[] interfaceC6699hArr2 = new InterfaceC6699h[interfaceC6699hArr.length + 2];
            this.f10665a = interfaceC6699hArr2;
            System.arraycopy(interfaceC6699hArr, 0, interfaceC6699hArr2, 0, interfaceC6699hArr.length);
            this.f10666b = c6706j0;
            this.f10667c = c6710l0;
            interfaceC6699hArr2[interfaceC6699hArr.length] = c6706j0;
            interfaceC6699hArr2[interfaceC6699hArr.length + 1] = c6710l0;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.InterfaceC6673b
        /* renamed from: a */
        public final C6633a1 mo6084a(C6633a1 c6633a1) {
            float f = c6633a1.f10557a;
            C6710l0 c6710l0 = this.f10667c;
            if (c6710l0.f10781c != f) {
                c6710l0.f10781c = f;
                c6710l0.f10787i = true;
            }
            float f2 = c6710l0.f10782d;
            float f3 = c6633a1.f10558b;
            if (f2 != f3) {
                c6710l0.f10782d = f3;
                c6710l0.f10787i = true;
            }
            return c6633a1;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.InterfaceC6673b
        /* renamed from: b */
        public final long mo6083b(long j) {
            C6710l0 c6710l0 = this.f10667c;
            if (c6710l0.f10793o >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
                long j2 = c6710l0.f10792n;
                C6708k0 c6708k0 = c6710l0.f10788j;
                c6708k0.getClass();
                long j3 = j2 - ((c6708k0.f10766k * c6708k0.f10757b) * 2);
                int i = c6710l0.f10786h.f10733a;
                int i2 = c6710l0.f10785g.f10733a;
                if (i == i2) {
                    return C7408g0.m5081y(j, j3, c6710l0.f10793o);
                }
                return C7408g0.m5081y(j, j3 * i, c6710l0.f10793o * i2);
            }
            return (long) (c6710l0.f10781c * j);
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.InterfaceC6673b
        /* renamed from: c */
        public final long mo6082c() {
            return this.f10666b.f10753t;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.InterfaceC6673b
        /* renamed from: d */
        public final boolean mo6081d(boolean z) {
            this.f10666b.f10746m = z;
            return z;
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$e */
    /* loaded from: classes.dex */
    public static final class C6676e {

        /* renamed from: a */
        public final C6633a1 f10668a;

        /* renamed from: b */
        public final boolean f10669b;

        /* renamed from: c */
        public final long f10670c;

        /* renamed from: d */
        public final long f10671d;

        public C6676e(C6633a1 c6633a1, boolean z, long j, long j2) {
            this.f10668a = c6633a1;
            this.f10669b = z;
            this.f10670c = j;
            this.f10671d = j2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$f */
    /* loaded from: classes.dex */
    public static final class C6677f<T extends Exception> {
        @Nullable

        /* renamed from: a */
        public T f10672a;

        /* renamed from: b */
        public long f10673b;

        /* renamed from: a */
        public final void m6080a(T t) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f10672a == null) {
                this.f10672a = t;
                this.f10673b = 100 + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f10673b) {
                T t2 = this.f10672a;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f10672a;
                this.f10672a = null;
                throw t3;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$g */
    /* loaded from: classes.dex */
    public final class C6678g implements C6722u.InterfaceC6723a {
        public C6678g() {
        }

        @Override // com.google.android.exoplayer2.audio.C6722u.InterfaceC6723a
        /* renamed from: a */
        public final void mo6045a(final long j) {
            final InterfaceC6718s.C6719a c6719a;
            Handler handler;
            AudioSink.InterfaceC6669c interfaceC6669c = DefaultAudioSink.this.f10643p;
            if (interfaceC6669c != null && (handler = (c6719a = C6694f0.this.f10706L0).f10818a) != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6718s.C6719a c6719a2 = InterfaceC6718s.C6719a.this;
                        c6719a2.getClass();
                        int i = C7408g0.f13905a;
                        c6719a2.f10819b.mo5720D(j);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.audio.C6722u.InterfaceC6723a
        /* renamed from: b */
        public final void mo6044b(final int i, final long j) {
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            if (defaultAudioSink.f10643p != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime() - defaultAudioSink.f10625X;
                final InterfaceC6718s.C6719a c6719a = C6694f0.this.f10706L0;
                Handler handler = c6719a.f10818a;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = i;
                            long j2 = j;
                            long j3 = elapsedRealtime;
                            InterfaceC6718s interfaceC6718s = InterfaceC6718s.C6719a.this.f10819b;
                            int i3 = C7408g0.f13905a;
                            interfaceC6718s.mo5718N(i2, j2, j3);
                        }
                    });
                }
            }
        }

        @Override // com.google.android.exoplayer2.audio.C6722u.InterfaceC6723a
        /* renamed from: c */
        public final void mo6043c(long j) {
            StringBuilder sb = new StringBuilder(61);
            sb.append("Ignoring impossibly large audio latency: ");
            sb.append(j);
            Log.w("DefaultAudioSink", sb.toString());
        }

        @Override // com.google.android.exoplayer2.audio.C6722u.InterfaceC6723a
        /* renamed from: d */
        public final void mo6042d(long j, long j2, long j3, long j4) {
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            long m6091x = defaultAudioSink.m6091x();
            long m6090y = defaultAudioSink.m6090y();
            StringBuilder sb = new StringBuilder(182);
            sb.append("Spurious audio timestamp (frame position mismatch): ");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j4);
            sb.append(", ");
            sb.append(m6091x);
            sb.append(", ");
            sb.append(m6090y);
            Log.w("DefaultAudioSink", sb.toString());
        }

        @Override // com.google.android.exoplayer2.audio.C6722u.InterfaceC6723a
        /* renamed from: e */
        public final void mo6041e(long j, long j2, long j3, long j4) {
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            long m6091x = defaultAudioSink.m6091x();
            long m6090y = defaultAudioSink.m6090y();
            StringBuilder sb = new StringBuilder(180);
            sb.append("Spurious audio timestamp (system clock mismatch): ");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j4);
            sb.append(", ");
            sb.append(m6091x);
            sb.append(", ");
            sb.append(m6090y);
            Log.w("DefaultAudioSink", sb.toString());
        }
    }

    @RequiresApi(29)
    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$h */
    /* loaded from: classes.dex */
    public final class C6679h {

        /* renamed from: a */
        public final Handler f10675a = new Handler();

        /* renamed from: b */
        public final C6680a f10676b = new C6680a();

        /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$h$a */
        /* loaded from: classes.dex */
        public class C6680a extends AudioTrack.StreamEventCallback {
            public C6680a() {
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onDataRequest(AudioTrack audioTrack, int i) {
                boolean z;
                Renderer.InterfaceC6630a interfaceC6630a;
                if (audioTrack == DefaultAudioSink.this.f10646s) {
                    z = true;
                } else {
                    z = false;
                }
                C7394a.m5131d(z);
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                AudioSink.InterfaceC6669c interfaceC6669c = defaultAudioSink.f10643p;
                if (interfaceC6669c != null && defaultAudioSink.f10620S && (interfaceC6630a = C6694f0.this.f10715U0) != null) {
                    interfaceC6630a.mo5692a();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onTearDown(@NonNull AudioTrack audioTrack) {
                boolean z;
                Renderer.InterfaceC6630a interfaceC6630a;
                if (audioTrack == DefaultAudioSink.this.f10646s) {
                    z = true;
                } else {
                    z = false;
                }
                C7394a.m5131d(z);
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                AudioSink.InterfaceC6669c interfaceC6669c = defaultAudioSink.f10643p;
                if (interfaceC6669c != null && defaultAudioSink.f10620S && (interfaceC6630a = C6694f0.this.f10715U0) != null) {
                    interfaceC6630a.mo5692a();
                }
            }
        }

        public C6679h() {
        }
    }

    public DefaultAudioSink(@Nullable C6692f c6692f, C6675d c6675d) {
        this.f10628a = c6692f;
        this.f10629b = c6675d;
        int i = C7408g0.f13905a;
        this.f10630c = false;
        this.f10638k = false;
        this.f10639l = 0;
        this.f10635h = new ConditionVariable(true);
        this.f10636i = new C6722u(new C6678g());
        C6726x c6726x = new C6726x();
        this.f10631d = c6726x;
        C6712m0 c6712m0 = new C6712m0();
        this.f10632e = c6712m0;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C6704i0(), c6726x, c6712m0);
        Collections.addAll(arrayList, c6675d.f10665a);
        this.f10633f = (InterfaceC6699h[]) arrayList.toArray(new InterfaceC6699h[0]);
        this.f10634g = new InterfaceC6699h[]{new C6691e0()};
        this.f10609H = 1.0f;
        this.f10647t = C6688d.f10690f;
        this.f10622U = 0;
        this.f10623V = new C6724v();
        C6633a1 c6633a1 = C6633a1.f10556d;
        this.f10649v = new C6676e(c6633a1, false, 0L, 0L);
        this.f10650w = c6633a1;
        this.f10617P = -1;
        this.f10610I = new InterfaceC6699h[0];
        this.f10611J = new ByteBuffer[0];
        this.f10637j = new ArrayDeque<>();
        this.f10641n = new C6677f<>();
        this.f10642o = new C6677f<>();
    }

    /* renamed from: B */
    public static boolean m6124B(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (C7408g0.f13905a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    @RequiresApi(21)
    /* renamed from: u */
    public static AudioFormat m6094u(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c1, code lost:
        if (r3 != 5) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    @androidx.annotation.Nullable
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m6093v(com.google.android.exoplayer2.C7003m0 r13, @androidx.annotation.Nullable com.google.android.exoplayer2.audio.C6692f r14) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.m6093v(com.google.android.exoplayer2.m0, com.google.android.exoplayer2.audio.f):android.util.Pair");
    }

    /* renamed from: A */
    public final boolean m6125A() {
        return this.f10646s != null;
    }

    /* renamed from: C */
    public final void m6123C() {
        if (!this.f10619R) {
            this.f10619R = true;
            long m6090y = m6090y();
            C6722u c6722u = this.f10636i;
            c6722u.f10862z = c6722u.m6048a();
            c6722u.f10860x = SystemClock.elapsedRealtime() * 1000;
            c6722u.f10831A = m6090y;
            this.f10646s.stop();
            this.f10652y = 0;
        }
    }

    /* renamed from: D */
    public final void m6122D(long j) throws AudioSink.C6671e {
        ByteBuffer byteBuffer;
        int length = this.f10610I.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f10611J[i - 1];
            } else {
                byteBuffer = this.f10612K;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC6699h.f10731a;
                }
            }
            if (i == length) {
                m6115K(byteBuffer, j);
            } else {
                InterfaceC6699h interfaceC6699h = this.f10610I[i];
                if (i > this.f10617P) {
                    interfaceC6699h.mo6032e(byteBuffer);
                }
                ByteBuffer mo6038d = interfaceC6699h.mo6038d();
                this.f10611J[i] = mo6038d;
                if (mo6038d.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    /* renamed from: E */
    public final void m6121E() {
        this.f10653z = 0L;
        this.f10602A = 0L;
        this.f10603B = 0L;
        this.f10604C = 0L;
        int i = 0;
        this.f10627Z = false;
        this.f10605D = 0;
        this.f10649v = new C6676e(m6092w().f10668a, m6092w().f10669b, 0L, 0L);
        this.f10608G = 0L;
        this.f10648u = null;
        this.f10637j.clear();
        this.f10612K = null;
        this.f10613L = 0;
        this.f10614M = null;
        this.f10619R = false;
        this.f10618Q = false;
        this.f10617P = -1;
        this.f10651x = null;
        this.f10652y = 0;
        this.f10632e.f10803o = 0L;
        while (true) {
            InterfaceC6699h[] interfaceC6699hArr = this.f10610I;
            if (i < interfaceC6699hArr.length) {
                InterfaceC6699h interfaceC6699h = interfaceC6699hArr[i];
                interfaceC6699h.flush();
                this.f10611J[i] = interfaceC6699h.mo6038d();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: F */
    public final void m6120F(C6633a1 c6633a1, boolean z) {
        C6676e m6092w = m6092w();
        if (c6633a1.equals(m6092w.f10668a) && z == m6092w.f10669b) {
            return;
        }
        C6676e c6676e = new C6676e(c6633a1, z, -9223372036854775807L, -9223372036854775807L);
        if (m6125A()) {
            this.f10648u = c6676e;
        } else {
            this.f10649v = c6676e;
        }
    }

    @RequiresApi(23)
    /* renamed from: G */
    public final void m6119G(C6633a1 c6633a1) {
        if (m6125A()) {
            try {
                this.f10646s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(c6633a1.f10557a).setPitch(c6633a1.f10558b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                C7421n.m5055c("DefaultAudioSink", "Failed to set playback params", e);
            }
            c6633a1 = new C6633a1(this.f10646s.getPlaybackParams().getSpeed(), this.f10646s.getPlaybackParams().getPitch());
            float f = c6633a1.f10557a;
            C6722u c6722u = this.f10636i;
            c6722u.f10846j = f;
            C6720t c6720t = c6722u.f10842f;
            if (c6720t != null) {
                c6720t.m6050a();
            }
        }
        this.f10650w = c6633a1;
    }

    /* renamed from: H */
    public final void m6118H() {
        if (m6125A()) {
            if (C7408g0.f13905a >= 21) {
                this.f10646s.setVolume(this.f10609H);
                return;
            }
            AudioTrack audioTrack = this.f10646s;
            float f = this.f10609H;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m6117I() {
        /*
            r4 = this;
            boolean r0 = r4.f10624W
            r1 = 0
            if (r0 != 0) goto L37
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r0 = r4.f10645r
            com.google.android.exoplayer2.m0 r0 = r0.f10656a
            java.lang.String r0 = r0.f12287l
            java.lang.String r2 = "audio/raw"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L37
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r0 = r4.f10645r
            com.google.android.exoplayer2.m0 r0 = r0.f10656a
            int r0 = r0.f12270A
            boolean r2 = r4.f10630c
            r3 = 1
            if (r2 == 0) goto L33
            int r2 = com.google.android.exoplayer2.util.C7408g0.f13905a
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            if (r0 == r2) goto L2e
            r2 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == r2) goto L2e
            r2 = 4
            if (r0 != r2) goto L2c
            goto L2e
        L2c:
            r0 = r1
            goto L2f
        L2e:
            r0 = r3
        L2f:
            if (r0 == 0) goto L33
            r0 = r3
            goto L34
        L33:
            r0 = r1
        L34:
            if (r0 != 0) goto L37
            r1 = r3
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.m6117I():boolean");
    }

    /* renamed from: J */
    public final boolean m6116J(C7003m0 c7003m0, C6688d c6688d) {
        int i;
        int m5094l;
        boolean isOffloadedPlaybackSupported;
        boolean z;
        boolean z2;
        boolean z3;
        int i2 = C7408g0.f13905a;
        if (i2 < 29 || (i = this.f10639l) == 0) {
            return false;
        }
        String str = c7003m0.f12287l;
        str.getClass();
        int m5048b = C7424q.m5048b(str, c7003m0.f12284i);
        if (m5048b == 0 || (m5094l = C7408g0.m5094l(c7003m0.f12300y)) == 0) {
            return false;
        }
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(m6094u(c7003m0.f12301z, m5094l, m5048b), c6688d.m6071a());
        if (!isOffloadedPlaybackSupported) {
            return false;
        }
        if (c7003m0.f12271B == 0 && c7003m0.f12272C == 0) {
            z = false;
        } else {
            z = true;
        }
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            if (i2 >= 30 && C7408g0.f13908d.startsWith("Pixel")) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
        if (r15 < r14) goto L68;
     */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6115K(java.nio.ByteBuffer r13, long r14) throws com.google.android.exoplayer2.audio.AudioSink.C6671e {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.m6115K(java.nio.ByteBuffer, long):void");
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: a */
    public final boolean mo6114a(C7003m0 c7003m0) {
        return mo6097r(c7003m0) != 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: b */
    public final boolean mo6113b() {
        return !m6125A() || (this.f10618Q && !mo6107h());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: c */
    public final C6633a1 mo6112c() {
        if (this.f10638k) {
            return this.f10650w;
        }
        return m6092w().f10668a;
    }

    /* renamed from: d */
    public final void m6111d(long j) {
        C6633a1 c6633a1;
        final boolean z;
        final InterfaceC6718s.C6719a c6719a;
        Handler handler;
        boolean m6117I = m6117I();
        InterfaceC6673b interfaceC6673b = this.f10629b;
        if (m6117I) {
            c6633a1 = interfaceC6673b.mo6084a(m6092w().f10668a);
        } else {
            c6633a1 = C6633a1.f10556d;
        }
        C6633a1 c6633a12 = c6633a1;
        int i = 0;
        if (m6117I()) {
            z = interfaceC6673b.mo6081d(m6092w().f10669b);
        } else {
            z = false;
        }
        this.f10637j.add(new C6676e(c6633a12, z, Math.max(0L, j), (m6090y() * 1000000) / this.f10645r.f10660e));
        InterfaceC6699h[] interfaceC6699hArr = this.f10645r.f10664i;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC6699h interfaceC6699h : interfaceC6699hArr) {
            if (interfaceC6699h.mo6039c()) {
                arrayList.add(interfaceC6699h);
            } else {
                interfaceC6699h.flush();
            }
        }
        int size = arrayList.size();
        this.f10610I = (InterfaceC6699h[]) arrayList.toArray(new InterfaceC6699h[size]);
        this.f10611J = new ByteBuffer[size];
        while (true) {
            InterfaceC6699h[] interfaceC6699hArr2 = this.f10610I;
            if (i >= interfaceC6699hArr2.length) {
                break;
            }
            InterfaceC6699h interfaceC6699h2 = interfaceC6699hArr2[i];
            interfaceC6699h2.flush();
            this.f10611J[i] = interfaceC6699h2.mo6038d();
            i++;
        }
        AudioSink.InterfaceC6669c interfaceC6669c = this.f10643p;
        if (interfaceC6669c != null && (handler = (c6719a = C6694f0.this.f10706L0).f10818a) != null) {
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.q
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC6718s.C6719a c6719a2 = InterfaceC6718s.C6719a.this;
                    c6719a2.getClass();
                    int i2 = C7408g0.f13905a;
                    c6719a2.f10819b.mo5195a(z);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m6110e() throws com.google.android.exoplayer2.audio.AudioSink.C6671e {
        /*
            r9 = this;
            int r0 = r9.f10617P
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.f10617P = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.f10617P
            com.google.android.exoplayer2.audio.h[] r5 = r9.f10610I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.mo6036g()
        L1f:
            r9.m6122D(r7)
            boolean r0 = r4.mo6040b()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.f10617P
            int r0 = r0 + r1
            r9.f10617P = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f10614M
            if (r0 == 0) goto L3b
            r9.m6115K(r0, r7)
            java.nio.ByteBuffer r0 = r9.f10614M
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.f10617P = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.m6110e():boolean");
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: f */
    public final void mo6109f(C6633a1 c6633a1) {
        C6633a1 c6633a12 = new C6633a1(C7408g0.m5100f(c6633a1.f10557a, 0.1f, 8.0f), C7408g0.m5100f(c6633a1.f10558b, 0.1f, 8.0f));
        if (this.f10638k && C7408g0.f13905a >= 23) {
            m6119G(c6633a12);
        } else {
            m6120F(c6633a12, m6092w().f10669b);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void flush() {
        boolean z;
        if (m6125A()) {
            m6121E();
            C6722u c6722u = this.f10636i;
            AudioTrack audioTrack = c6722u.f10839c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f10646s.pause();
            }
            if (m6124B(this.f10646s)) {
                C6679h c6679h = this.f10640m;
                c6679h.getClass();
                this.f10646s.unregisterStreamEventCallback(c6679h.f10676b);
                c6679h.f10675a.removeCallbacksAndMessages(null);
            }
            AudioTrack audioTrack2 = this.f10646s;
            this.f10646s = null;
            if (C7408g0.f13905a < 21 && !this.f10621T) {
                this.f10622U = 0;
            }
            C6674c c6674c = this.f10644q;
            if (c6674c != null) {
                this.f10645r = c6674c;
                this.f10644q = null;
            }
            c6722u.f10848l = 0L;
            c6722u.f10859w = 0;
            c6722u.f10858v = 0;
            c6722u.f10849m = 0L;
            c6722u.f10833C = 0L;
            c6722u.f10836F = 0L;
            c6722u.f10847k = false;
            c6722u.f10839c = null;
            c6722u.f10842f = null;
            this.f10635h.close();
            new C6672a(audioTrack2).start();
        }
        this.f10642o.f10672a = null;
        this.f10641n.f10672a = null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: g */
    public final void mo6108g() throws AudioSink.C6671e {
        if (!this.f10618Q && m6125A() && m6110e()) {
            m6123C();
            this.f10618Q = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: h */
    public final boolean mo6107h() {
        return m6125A() && this.f10636i.m6047b(m6090y());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: i */
    public final void mo6106i(int i) {
        if (this.f10622U != i) {
            this.f10622U = i;
            this.f10621T = i != 0;
            flush();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r7 != false) goto L13;
     */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo6105j(com.google.android.exoplayer2.C7003m0 r13, @androidx.annotation.Nullable int[] r14) throws com.google.android.exoplayer2.audio.AudioSink.C6667a {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.mo6105j(com.google.android.exoplayer2.m0, int[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d5, code lost:
        if (r8 != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d8, code lost:
        if (r8 == false) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02b4 A[ADDED_TO_REGION, EDGE_INSN: B:169:0x02b4->B:149:0x02b4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016f  */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo6104k(boolean r32) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.mo6104k(boolean):long");
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: l */
    public final void mo6103l() {
        if (this.f10624W) {
            this.f10624W = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: m */
    public final void mo6102m(C6688d c6688d) {
        if (this.f10647t.equals(c6688d)) {
            return;
        }
        this.f10647t = c6688d;
        if (this.f10624W) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: n */
    public final void mo6101n() {
        this.f10606E = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: o */
    public final void mo6100o() {
        C7394a.m5131d(C7408g0.f13905a >= 21);
        C7394a.m5131d(this.f10621T);
        if (this.f10624W) {
            return;
        }
        this.f10624W = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: p */
    public final void mo6099p() {
        this.f10620S = true;
        if (m6125A()) {
            C6720t c6720t = this.f10636i.f10842f;
            c6720t.getClass();
            c6720t.m6050a();
            this.f10646s.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void pause() {
        boolean z = false;
        this.f10620S = false;
        if (m6125A()) {
            C6722u c6722u = this.f10636i;
            c6722u.f10848l = 0L;
            c6722u.f10859w = 0;
            c6722u.f10858v = 0;
            c6722u.f10849m = 0L;
            c6722u.f10833C = 0L;
            c6722u.f10836F = 0L;
            c6722u.f10847k = false;
            if (c6722u.f10860x == -9223372036854775807L) {
                C6720t c6720t = c6722u.f10842f;
                c6720t.getClass();
                c6720t.m6050a();
                z = true;
            }
            if (z) {
                this.f10646s.pause();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e8, code lost:
        if (r5.m6048a() == 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010b  */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo6098q(java.nio.ByteBuffer r19, long r20, int r22) throws com.google.android.exoplayer2.audio.AudioSink.C6668b, com.google.android.exoplayer2.audio.AudioSink.C6671e {
        /*
            Method dump skipped, instructions count: 894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.mo6098q(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: r */
    public final int mo6097r(C7003m0 c7003m0) {
        boolean z = true;
        if ("audio/raw".equals(c7003m0.f12287l)) {
            int i = c7003m0.f12270A;
            if (!C7408g0.m5086t(i)) {
                C6964f.m5792c(33, "Invalid PCM encoding: ", i, "DefaultAudioSink");
                return 0;
            } else if (i != 2 && (!this.f10630c || i != 4)) {
                return 1;
            } else {
                return 2;
            }
        } else if (!this.f10626Y && m6116J(c7003m0, this.f10647t)) {
            return 2;
        } else {
            if (m6093v(c7003m0, this.f10628a) == null) {
                z = false;
            }
            if (!z) {
                return 0;
            }
            return 2;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void reset() {
        flush();
        for (InterfaceC6699h interfaceC6699h : this.f10633f) {
            interfaceC6699h.reset();
        }
        for (InterfaceC6699h interfaceC6699h2 : this.f10634g) {
            interfaceC6699h2.reset();
        }
        this.f10620S = false;
        this.f10626Y = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: s */
    public final void mo6096s(boolean z) {
        m6120F(m6092w().f10668a, z);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void setVolume(float f) {
        if (this.f10609H != f) {
            this.f10609H = f;
            m6118H();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: t */
    public final void mo6095t(C6724v c6724v) {
        if (this.f10623V.equals(c6724v)) {
            return;
        }
        int i = c6724v.f10863a;
        AudioTrack audioTrack = this.f10646s;
        if (audioTrack != null) {
            if (this.f10623V.f10863a != i) {
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.f10646s.setAuxEffectSendLevel(c6724v.f10864b);
            }
        }
        this.f10623V = c6724v;
    }

    /* renamed from: w */
    public final C6676e m6092w() {
        C6676e c6676e = this.f10648u;
        if (c6676e != null) {
            return c6676e;
        }
        ArrayDeque<C6676e> arrayDeque = this.f10637j;
        return !arrayDeque.isEmpty() ? arrayDeque.getLast() : this.f10649v;
    }

    /* renamed from: x */
    public final long m6091x() {
        C6674c c6674c = this.f10645r;
        return c6674c.f10658c == 0 ? this.f10653z / c6674c.f10657b : this.f10602A;
    }

    /* renamed from: y */
    public final long m6090y() {
        C6674c c6674c = this.f10645r;
        return c6674c.f10658c == 0 ? this.f10603B / c6674c.f10659d : this.f10604C;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.exoplayer2.audio.c0] */
    /* renamed from: z */
    public final void m6089z() throws AudioSink.C6668b {
        boolean z;
        this.f10635h.block();
        boolean z2 = false;
        try {
            C6674c c6674c = this.f10645r;
            c6674c.getClass();
            AudioTrack m6088a = c6674c.m6088a(this.f10624W, this.f10647t, this.f10622U);
            this.f10646s = m6088a;
            if (m6124B(m6088a)) {
                AudioTrack audioTrack = this.f10646s;
                if (this.f10640m == null) {
                    this.f10640m = new C6679h();
                }
                C6679h c6679h = this.f10640m;
                final Handler handler = c6679h.f10675a;
                Objects.requireNonNull(handler);
                audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.android.exoplayer2.audio.c0
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handler.post(runnable);
                    }
                }, c6679h.f10676b);
                if (this.f10639l != 3) {
                    AudioTrack audioTrack2 = this.f10646s;
                    C7003m0 c7003m0 = this.f10645r.f10656a;
                    audioTrack2.setOffloadDelayPadding(c7003m0.f12271B, c7003m0.f12272C);
                }
            }
            this.f10622U = this.f10646s.getAudioSessionId();
            C6722u c6722u = this.f10636i;
            AudioTrack audioTrack3 = this.f10646s;
            C6674c c6674c2 = this.f10645r;
            if (c6674c2.f10658c == 2) {
                z = true;
            } else {
                z = false;
            }
            c6722u.m6046c(audioTrack3, z, c6674c2.f10662g, c6674c2.f10659d, c6674c2.f10663h);
            m6118H();
            int i = this.f10623V.f10863a;
            if (i != 0) {
                this.f10646s.attachAuxEffect(i);
                this.f10646s.setAuxEffectSendLevel(this.f10623V.f10864b);
            }
            this.f10607F = true;
        } catch (AudioSink.C6668b e) {
            if (this.f10645r.f10658c == 1) {
                z2 = true;
            }
            if (z2) {
                this.f10626Y = true;
            }
            AudioSink.InterfaceC6669c interfaceC6669c = this.f10643p;
            if (interfaceC6669c != null) {
                ((C6694f0.C6695a) interfaceC6669c).m6066a(e);
            }
            throw e;
        }
    }
}
