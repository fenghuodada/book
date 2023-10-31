package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.C7408g0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.exoplayer2.audio.h */
/* loaded from: classes.dex */
public interface InterfaceC6699h {

    /* renamed from: a */
    public static final ByteBuffer f10731a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: com.google.android.exoplayer2.audio.h$a */
    /* loaded from: classes.dex */
    public static final class C6700a {

        /* renamed from: e */
        public static final C6700a f10732e = new C6700a(-1, -1, -1);

        /* renamed from: a */
        public final int f10733a;

        /* renamed from: b */
        public final int f10734b;

        /* renamed from: c */
        public final int f10735c;

        /* renamed from: d */
        public final int f10736d;

        public C6700a(int i, int i2, int i3) {
            this.f10733a = i;
            this.f10734b = i2;
            this.f10735c = i3;
            this.f10736d = C7408g0.m5086t(i3) ? C7408g0.m5091o(i3, i2) : -1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(83);
            sb.append("AudioFormat[sampleRate=");
            sb.append(this.f10733a);
            sb.append(", channelCount=");
            sb.append(this.f10734b);
            sb.append(", encoding=");
            sb.append(this.f10735c);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.h$b */
    /* loaded from: classes.dex */
    public static final class C6701b extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C6701b(com.google.android.exoplayer2.audio.InterfaceC6699h.C6700a r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                int r0 = r0 + 18
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Unhandled format: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.InterfaceC6699h.C6701b.<init>(com.google.android.exoplayer2.audio.h$a):void");
        }
    }

    /* renamed from: b */
    boolean mo6040b();

    /* renamed from: c */
    boolean mo6039c();

    /* renamed from: d */
    ByteBuffer mo6038d();

    /* renamed from: e */
    void mo6032e(ByteBuffer byteBuffer);

    /* renamed from: f */
    C6700a mo6037f(C6700a c6700a) throws C6701b;

    void flush();

    /* renamed from: g */
    void mo6036g();

    void reset();
}
