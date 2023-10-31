package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
public class DecoderInputBuffer extends AbstractC6742a {
    @Nullable

    /* renamed from: c */
    public ByteBuffer f10904c;

    /* renamed from: d */
    public boolean f10905d;

    /* renamed from: e */
    public long f10906e;
    @Nullable

    /* renamed from: f */
    public ByteBuffer f10907f;

    /* renamed from: g */
    public final int f10908g;

    /* renamed from: b */
    public final C6744c f10903b = new C6744c();

    /* renamed from: h */
    public final int f10909h = 0;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface BufferReplacementMode {
    }

    /* renamed from: com.google.android.exoplayer2.decoder.DecoderInputBuffer$a */
    /* loaded from: classes.dex */
    public static final class C6741a extends IllegalStateException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C6741a(int r3, int r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 44
                r0.<init>(r1)
                java.lang.String r1 = "Buffer too small ("
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " < "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = ")"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.decoder.DecoderInputBuffer.C6741a.<init>(int, int):void");
        }
    }

    public DecoderInputBuffer(int i) {
        this.f10908g = i;
    }

    /* renamed from: h */
    public void mo5603h() {
        this.f10915a = 0;
        ByteBuffer byteBuffer = this.f10904c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f10907f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f10905d = false;
    }

    /* renamed from: i */
    public final ByteBuffer m6021i(int i) {
        int i2 = this.f10908g;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f10904c;
        throw new C6741a(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    @EnsuresNonNull({"data"})
    /* renamed from: j */
    public final void m6020j(int i) {
        int i2 = i + this.f10909h;
        ByteBuffer byteBuffer = this.f10904c;
        if (byteBuffer == null) {
            this.f10904c = m6021i(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.f10904c = byteBuffer;
            return;
        }
        ByteBuffer m6021i = m6021i(i3);
        m6021i.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m6021i.put(byteBuffer);
        }
        this.f10904c = m6021i;
    }

    /* renamed from: k */
    public final void m6019k() {
        ByteBuffer byteBuffer = this.f10904c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f10907f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
