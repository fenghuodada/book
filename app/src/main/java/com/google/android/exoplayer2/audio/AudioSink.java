package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import androidx.constraintlayout.core.C0510h;
import com.google.android.exoplayer2.C6633a1;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.audio.InterfaceC6699h;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface AudioSink {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface SinkFormatSupport {
    }

    /* renamed from: com.google.android.exoplayer2.audio.AudioSink$a */
    /* loaded from: classes.dex */
    public static final class C6667a extends Exception {

        /* renamed from: a */
        public final C7003m0 f10597a;

        public C6667a(InterfaceC6699h.C6701b c6701b, C7003m0 c7003m0) {
            super(c6701b);
            this.f10597a = c7003m0;
        }

        public C6667a(String str, C7003m0 c7003m0) {
            super(str);
            this.f10597a = c7003m0;
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.AudioSink$b */
    /* loaded from: classes.dex */
    public static final class C6668b extends Exception {

        /* renamed from: a */
        public final boolean f10598a;

        /* renamed from: b */
        public final C7003m0 f10599b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C6668b(int r4, int r5, int r6, int r7, com.google.android.exoplayer2.C7003m0 r8, boolean r9, @androidx.annotation.Nullable java.lang.RuntimeException r10) {
            /*
                r3 = this;
                if (r9 == 0) goto L5
                java.lang.String r0 = " (recoverable)"
                goto L7
            L5:
                java.lang.String r0 = ""
            L7:
                int r1 = r0.length()
                int r1 = r1 + 80
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "AudioTrack init failed "
                r2.append(r1)
                r2.append(r4)
                java.lang.String r4 = " Config("
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = ", "
                r2.append(r4)
                r2.append(r6)
                r2.append(r4)
                r2.append(r7)
                java.lang.String r4 = ")"
                java.lang.String r4 = androidx.concurrent.futures.C0484a.m12392a(r2, r4, r0)
                r3.<init>(r4, r10)
                r3.f10598a = r9
                r3.f10599b = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.C6668b.<init>(int, int, int, int, com.google.android.exoplayer2.m0, boolean, java.lang.RuntimeException):void");
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.AudioSink$c */
    /* loaded from: classes.dex */
    public interface InterfaceC6669c {
    }

    /* renamed from: com.google.android.exoplayer2.audio.AudioSink$d */
    /* loaded from: classes.dex */
    public static final class C6670d extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C6670d(long r3, long r5) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 103(0x67, float:1.44E-43)
                r0.<init>(r1)
                java.lang.String r1 = "Unexpected audio track timestamp discontinuity: expected "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = ", got "
                r0.append(r5)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.C6670d.<init>(long, long):void");
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.AudioSink$e */
    /* loaded from: classes.dex */
    public static final class C6671e extends Exception {

        /* renamed from: a */
        public final boolean f10600a;

        /* renamed from: b */
        public final C7003m0 f10601b;

        public C6671e(int i, C7003m0 c7003m0, boolean z) {
            super(C0510h.m12340a(36, "AudioTrack write failed: ", i));
            this.f10600a = z;
            this.f10601b = c7003m0;
        }
    }

    /* renamed from: a */
    boolean mo6114a(C7003m0 c7003m0);

    /* renamed from: b */
    boolean mo6113b();

    /* renamed from: c */
    C6633a1 mo6112c();

    /* renamed from: f */
    void mo6109f(C6633a1 c6633a1);

    void flush();

    /* renamed from: g */
    void mo6108g() throws C6671e;

    /* renamed from: h */
    boolean mo6107h();

    /* renamed from: i */
    void mo6106i(int i);

    /* renamed from: j */
    void mo6105j(C7003m0 c7003m0, @Nullable int[] iArr) throws C6667a;

    /* renamed from: k */
    long mo6104k(boolean z);

    /* renamed from: l */
    void mo6103l();

    /* renamed from: m */
    void mo6102m(C6688d c6688d);

    /* renamed from: n */
    void mo6101n();

    /* renamed from: o */
    void mo6100o();

    /* renamed from: p */
    void mo6099p();

    void pause();

    /* renamed from: q */
    boolean mo6098q(ByteBuffer byteBuffer, long j, int i) throws C6668b, C6671e;

    /* renamed from: r */
    int mo6097r(C7003m0 c7003m0);

    void reset();

    /* renamed from: s */
    void mo6096s(boolean z);

    void setVolume(float f);

    /* renamed from: t */
    void mo6095t(C6724v c6724v);
}
