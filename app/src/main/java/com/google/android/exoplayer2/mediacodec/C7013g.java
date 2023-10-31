package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.decoder.C6744c;
import com.google.android.exoplayer2.util.C7401d;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.common.base.C7929b;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi(23)
/* renamed from: com.google.android.exoplayer2.mediacodec.g */
/* loaded from: classes.dex */
public final class C7013g {
    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")

    /* renamed from: h */
    public static final ArrayDeque<C7014a> f12348h = new ArrayDeque<>();

    /* renamed from: i */
    public static final Object f12349i = new Object();

    /* renamed from: a */
    public final MediaCodec f12350a;

    /* renamed from: b */
    public final HandlerThread f12351b;

    /* renamed from: c */
    public HandlerC7012f f12352c;

    /* renamed from: d */
    public final AtomicReference<RuntimeException> f12353d;

    /* renamed from: e */
    public final C7401d f12354e;

    /* renamed from: f */
    public final boolean f12355f;

    /* renamed from: g */
    public boolean f12356g;

    /* renamed from: com.google.android.exoplayer2.mediacodec.g$a */
    /* loaded from: classes.dex */
    public static class C7014a {

        /* renamed from: a */
        public int f12357a;

        /* renamed from: b */
        public int f12358b;

        /* renamed from: c */
        public int f12359c;

        /* renamed from: d */
        public final MediaCodec.CryptoInfo f12360d = new MediaCodec.CryptoInfo();

        /* renamed from: e */
        public long f12361e;

        /* renamed from: f */
        public int f12362f;
    }

    public C7013g(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z) {
        boolean z2;
        C7401d c7401d = new C7401d();
        this.f12350a = mediaCodec;
        this.f12351b = handlerThread;
        this.f12354e = c7401d;
        this.f12353d = new AtomicReference<>();
        boolean z3 = true;
        if (!z) {
            String m4294a = C7929b.m4294a(C7408g0.f13907c);
            if (!m4294a.contains("samsung") && !m4294a.contains("motorola")) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                z3 = false;
            }
        }
        this.f12355f = z3;
    }

    /* renamed from: c */
    public static void m5606c(C7014a c7014a) {
        ArrayDeque<C7014a> arrayDeque = f12348h;
        synchronized (arrayDeque) {
            arrayDeque.add(c7014a);
        }
    }

    /* renamed from: a */
    public final void m5608a() {
        if (this.f12356g) {
            try {
                HandlerC7012f handlerC7012f = this.f12352c;
                int i = C7408g0.f13905a;
                handlerC7012f.removeCallbacksAndMessages(null);
                C7401d c7401d = this.f12354e;
                synchronized (c7401d) {
                    c7401d.f13891a = false;
                }
                this.f12352c.obtainMessage(2).sendToTarget();
                c7401d.m5121a();
                RuntimeException andSet = this.f12353d.getAndSet(null);
                if (andSet != null) {
                    throw andSet;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: b */
    public final void m5607b(int i, C6744c c6744c, long j) {
        C7014a removeFirst;
        RuntimeException andSet = this.f12353d.getAndSet(null);
        if (andSet == null) {
            ArrayDeque<C7014a> arrayDeque = f12348h;
            synchronized (arrayDeque) {
                if (arrayDeque.isEmpty()) {
                    removeFirst = new C7014a();
                } else {
                    removeFirst = arrayDeque.removeFirst();
                }
            }
            removeFirst.f12357a = i;
            removeFirst.f12358b = 0;
            removeFirst.f12359c = 0;
            removeFirst.f12361e = j;
            removeFirst.f12362f = 0;
            int i2 = c6744c.f10921f;
            MediaCodec.CryptoInfo cryptoInfo = removeFirst.f12360d;
            cryptoInfo.numSubSamples = i2;
            int[] iArr = c6744c.f10919d;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 != null && iArr2.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                } else {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = c6744c.f10920e;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 != null && iArr4.length >= iArr3.length) {
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                } else {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = c6744c.f10917b;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 != null && bArr2.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                } else {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                }
            }
            bArr2.getClass();
            cryptoInfo.key = bArr2;
            byte[] bArr3 = c6744c.f10916a;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 != null && bArr4.length >= bArr3.length) {
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                } else {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                }
            }
            bArr4.getClass();
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = c6744c.f10918c;
            if (C7408g0.f13905a >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c6744c.f10922g, c6744c.f10923h));
            }
            this.f12352c.obtainMessage(1, removeFirst).sendToTarget();
            return;
        }
        throw andSet;
    }
}
