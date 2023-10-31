package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b;
import com.bumptech.glide.load.resource.gif.C3756b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* renamed from: com.bumptech.glide.gifdecoder.d */
/* loaded from: classes.dex */
public final class C3429d implements GifDecoder {
    @ColorInt

    /* renamed from: a */
    public int[] f9112a;

    /* renamed from: c */
    public final GifDecoder.InterfaceC3425a f9114c;

    /* renamed from: d */
    public ByteBuffer f9115d;

    /* renamed from: e */
    public byte[] f9116e;

    /* renamed from: f */
    public short[] f9117f;

    /* renamed from: g */
    public byte[] f9118g;

    /* renamed from: h */
    public byte[] f9119h;

    /* renamed from: i */
    public byte[] f9120i;
    @ColorInt

    /* renamed from: j */
    public int[] f9121j;

    /* renamed from: k */
    public int f9122k;

    /* renamed from: l */
    public C3427b f9123l;

    /* renamed from: m */
    public Bitmap f9124m;

    /* renamed from: n */
    public boolean f9125n;

    /* renamed from: o */
    public int f9126o;

    /* renamed from: p */
    public int f9127p;

    /* renamed from: q */
    public int f9128q;

    /* renamed from: r */
    public int f9129r;
    @Nullable

    /* renamed from: s */
    public Boolean f9130s;
    @ColorInt

    /* renamed from: b */
    public final int[] f9113b = new int[256];
    @NonNull

    /* renamed from: t */
    public Bitmap.Config f9131t = Bitmap.Config.ARGB_8888;

    public C3429d(@NonNull C3756b c3756b, C3427b c3427b, ByteBuffer byteBuffer, int i) {
        byte[] bArr;
        int[] iArr;
        this.f9114c = c3756b;
        this.f9123l = new C3427b();
        synchronized (this) {
            if (i > 0) {
                int highestOneBit = Integer.highestOneBit(i);
                this.f9126o = 0;
                this.f9123l = c3427b;
                this.f9122k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f9115d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f9115d.order(ByteOrder.LITTLE_ENDIAN);
                this.f9125n = false;
                Iterator it = c3427b.f9101e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C3426a) it.next()).f9092g == 3) {
                        this.f9125n = true;
                        break;
                    }
                }
                this.f9127p = highestOneBit;
                int i2 = c3427b.f9102f;
                this.f9129r = i2 / highestOneBit;
                int i3 = c3427b.f9103g;
                this.f9128q = i3 / highestOneBit;
                int i4 = i2 * i3;
                InterfaceC3483b interfaceC3483b = ((C3756b) this.f9114c).f9742b;
                if (interfaceC3483b == null) {
                    bArr = new byte[i4];
                } else {
                    bArr = (byte[]) interfaceC3483b.mo6702c(i4, byte[].class);
                }
                this.f9120i = bArr;
                GifDecoder.InterfaceC3425a interfaceC3425a = this.f9114c;
                int i5 = this.f9129r * this.f9128q;
                InterfaceC3483b interfaceC3483b2 = ((C3756b) interfaceC3425a).f9742b;
                if (interfaceC3483b2 == null) {
                    iArr = new int[i5];
                } else {
                    iArr = (int[]) interfaceC3483b2.mo6702c(i5, int[].class);
                }
                this.f9121j = iArr;
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @Nullable
    /* renamed from: a */
    public final synchronized Bitmap mo6756a() {
        C3426a c3426a;
        byte[] bArr;
        if (this.f9123l.f9099c <= 0 || this.f9122k < 0) {
            if (Log.isLoggable("d", 3)) {
                Log.d("d", "Unable to decode frame, frameCount=" + this.f9123l.f9099c + ", framePointer=" + this.f9122k);
            }
            this.f9126o = 1;
        }
        int i = this.f9126o;
        if (i != 1 && i != 2) {
            this.f9126o = 0;
            if (this.f9116e == null) {
                InterfaceC3483b interfaceC3483b = ((C3756b) this.f9114c).f9742b;
                if (interfaceC3483b == null) {
                    bArr = new byte[255];
                } else {
                    bArr = (byte[]) interfaceC3483b.mo6702c(255, byte[].class);
                }
                this.f9116e = bArr;
            }
            C3426a c3426a2 = (C3426a) this.f9123l.f9101e.get(this.f9122k);
            int i2 = this.f9122k - 1;
            if (i2 >= 0) {
                c3426a = (C3426a) this.f9123l.f9101e.get(i2);
            } else {
                c3426a = null;
            }
            int[] iArr = c3426a2.f9096k;
            if (iArr == null) {
                iArr = this.f9123l.f9097a;
            }
            this.f9112a = iArr;
            if (iArr == null) {
                if (Log.isLoggable("d", 3)) {
                    Log.d("d", "No valid color table found for frame #" + this.f9122k);
                }
                this.f9126o = 1;
                return null;
            }
            if (c3426a2.f9091f) {
                System.arraycopy(iArr, 0, this.f9113b, 0, iArr.length);
                int[] iArr2 = this.f9113b;
                this.f9112a = iArr2;
                iArr2[c3426a2.f9093h] = 0;
                if (c3426a2.f9092g == 2 && this.f9122k == 0) {
                    this.f9130s = Boolean.TRUE;
                }
            }
            return m6748i(c3426a2, c3426a);
        }
        if (Log.isLoggable("d", 3)) {
            Log.d("d", "Unable to decode frame, status=" + this.f9126o);
        }
        return null;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: b */
    public final void mo6755b() {
        this.f9122k = (this.f9122k + 1) % this.f9123l.f9099c;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: c */
    public final int mo6754c() {
        return this.f9123l.f9099c;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final void clear() {
        InterfaceC3483b interfaceC3483b;
        InterfaceC3483b interfaceC3483b2;
        InterfaceC3483b interfaceC3483b3;
        this.f9123l = null;
        byte[] bArr = this.f9120i;
        GifDecoder.InterfaceC3425a interfaceC3425a = this.f9114c;
        if (bArr != null && (interfaceC3483b3 = ((C3756b) interfaceC3425a).f9742b) != null) {
            interfaceC3483b3.put(bArr);
        }
        int[] iArr = this.f9121j;
        if (iArr != null && (interfaceC3483b2 = ((C3756b) interfaceC3425a).f9742b) != null) {
            interfaceC3483b2.put(iArr);
        }
        Bitmap bitmap = this.f9124m;
        if (bitmap != null) {
            ((C3756b) interfaceC3425a).f9741a.mo6538d(bitmap);
        }
        this.f9124m = null;
        this.f9115d = null;
        this.f9130s = null;
        byte[] bArr2 = this.f9116e;
        if (bArr2 != null && (interfaceC3483b = ((C3756b) interfaceC3425a).f9742b) != null) {
            interfaceC3483b.put(bArr2);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: d */
    public final int mo6753d() {
        int i;
        C3427b c3427b = this.f9123l;
        int i2 = c3427b.f9099c;
        if (i2 > 0 && (i = this.f9122k) >= 0) {
            if (i >= 0 && i < i2) {
                return ((C3426a) c3427b.f9101e.get(i)).f9094i;
            }
            return -1;
        }
        return 0;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: e */
    public final int mo6752e() {
        return this.f9122k;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: f */
    public final int mo6751f() {
        return (this.f9121j.length * 4) + this.f9115d.limit() + this.f9120i.length;
    }

    /* renamed from: g */
    public final Bitmap m6750g() {
        Bitmap.Config config;
        Boolean bool = this.f9130s;
        if (bool != null && !bool.booleanValue()) {
            config = this.f9131t;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap mo6693c = ((C3756b) this.f9114c).f9741a.mo6693c(this.f9129r, this.f9128q, config);
        mo6693c.setHasAlpha(true);
        return mo6693c;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @NonNull
    public final ByteBuffer getData() {
        return this.f9115d;
    }

    /* renamed from: h */
    public final void m6749h(@NonNull Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f9131t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
        if (r3.f9106j == r36.f9093h) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap m6748i(com.bumptech.glide.gifdecoder.C3426a r36, com.bumptech.glide.gifdecoder.C3426a r37) {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.C3429d.m6748i(com.bumptech.glide.gifdecoder.a, com.bumptech.glide.gifdecoder.a):android.graphics.Bitmap");
    }
}
