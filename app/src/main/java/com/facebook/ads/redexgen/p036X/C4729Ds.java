package com.facebook.ads.redexgen.p036X;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import okio.Utf8;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.Ds */
/* loaded from: assets/audience_network.dex */
public final class C4729Ds implements InterfaceC5910XH, InterfaceC4556Ao, InterfaceC4554Am {
    public static byte[] A0O;
    public static String[] A0P = {"p1p2g9mbI7jG28uS1AIjZaN2DuNLisT4", "5M6TC2sONh3rGys5YKd78dMRKX2wOUqH", "h92WNkWPJTM", "jYXxaa6xf7axcTjhEWPmUH7zZsfwsjgI", "vYDSW5DyAu5jQwnIRgw24Ezub5gSEfu7", "VyMVayVAQGyPc0QthTR0tkMwCD52dsyF", "LU4FXKZXpKPxotYf", "puFnwNxTYtdaaLd9gUGAlTVzIEShK4ZY"};
    public float A00;
    public int A01;
    public int A02;
    @Nullable
    public Surface A03;
    @Nullable
    public SurfaceHolder A04;
    @Nullable
    public TextureView A05;
    public Format A06;
    public Format A07;
    public C4581BD A08;
    public C4626Bw A09;
    public C4626Bw A0A;
    public InterfaceC4831Fa A0B;
    public List<C4888GX> A0C;
    public boolean A0D;
    public final Handler A0E;
    public final InterfaceC5910XH A0F;
    public final SurfaceHolder$CallbackC5908XF A0G;
    public final C5906XD A0H;
    public final CopyOnWriteArraySet<InterfaceC4597BT> A0I;
    public final CopyOnWriteArraySet<InterfaceC4754EJ> A0J;
    public final CopyOnWriteArraySet<InterfaceC4892Gb> A0K;
    public final CopyOnWriteArraySet<InterfaceC5060JN> A0L;
    public final CopyOnWriteArraySet<InterfaceC5051JE> A0M;
    public final InterfaceC5909XG[] A0N;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0O, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0O = new byte[]{45, 23, 19, 14, 18, 27, 59, 6, 17, 46, 18, 31, 7, 27, 12, 9, 47, 40, 60, 59, 57, Utf8.REPLACEMENT_BYTE, 14, Utf8.REPLACEMENT_BYTE, 34, 46, 47, 40, Utf8.REPLACEMENT_BYTE, 22, 51, 41, 46, Utf8.REPLACEMENT_BYTE, 52, Utf8.REPLACEMENT_BYTE, 40, 122, 59, 54, 40, Utf8.REPLACEMENT_BYTE, 59, 62, 35, 122, 47, 52, 41, Utf8.REPLACEMENT_BYTE, 46, 122, 53, 40, 122, 40, Utf8.REPLACEMENT_BYTE, 42, 54, 59, 57, Utf8.REPLACEMENT_BYTE, 62, 116};
    }

    static {
        A0F();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C4729Ds(InterfaceC4564Aw interfaceC4564Aw, AbstractC4944HT abstractC4944HT, InterfaceC4543Ab interfaceC4543Ab, @Nullable InterfaceC4650CM<C5889Ww> interfaceC4650CM) {
        this(interfaceC4564Aw, abstractC4944HT, interfaceC4543Ab, interfaceC4650CM, new C4570B2());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C4729Ds(InterfaceC4564Aw interfaceC4564Aw, AbstractC4944HT abstractC4944HT, InterfaceC4543Ab interfaceC4543Ab, @Nullable InterfaceC4650CM<C5889Ww> interfaceC4650CM, C4570B2 c4570b2) {
        this(interfaceC4564Aw, abstractC4944HT, interfaceC4543Ab, interfaceC4650CM, c4570b2, InterfaceC5000IN.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C4729Ds(InterfaceC4564Aw interfaceC4564Aw, AbstractC4944HT abstractC4944HT, InterfaceC4543Ab interfaceC4543Ab, @Nullable InterfaceC4650CM<C5889Ww> interfaceC4650CM, C4570B2 c4570b2, InterfaceC5000IN interfaceC5000IN) {
        this.A0G = new SurfaceHolder$CallbackC5908XF(this);
        this.A0M = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0I = new CopyOnWriteArraySet<>();
        this.A0E = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        Handler handler = this.A0E;
        SurfaceHolder$CallbackC5908XF surfaceHolder$CallbackC5908XF = this.A0G;
        this.A0N = interfaceC4564Aw.A4R(handler, surfaceHolder$CallbackC5908XF, surfaceHolder$CallbackC5908XF, surfaceHolder$CallbackC5908XF, surfaceHolder$CallbackC5908XF, interfaceC4650CM);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A08 = C4581BD.A04;
        this.A02 = 1;
        this.A0C = Collections.emptyList();
        this.A0F = A02(this.A0N, abstractC4944HT, interfaceC4543Ab, interfaceC5000IN);
        this.A0H = c4570b2.A00(this.A0F, interfaceC5000IN);
        A3E(this.A0H);
        this.A0L.add(this.A0H);
        this.A0I.add(this.A0H);
        A0I(this.A0H);
        if (interfaceC4650CM instanceof C5891Wy) {
            ((C5891Wy) interfaceC4650CM).A04(this.A0E, this.A0H);
        }
    }

    private final InterfaceC5910XH A02(InterfaceC5909XG[] interfaceC5909XGArr, AbstractC4944HT abstractC4944HT, InterfaceC4543Ab interfaceC4543Ab, InterfaceC5000IN interfaceC5000IN) {
        return new C4740E3(interfaceC5909XGArr, abstractC4944HT, interfaceC4543Ab, interfaceC5000IN);
    }

    private void A0E() {
        TextureView textureView = this.A05;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.A0G) {
                Log.w(A07(0, 15, 68), A07(15, 49, 96));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        SurfaceHolder surfaceHolder = this.A04;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.A0G);
            this.A04 = null;
        }
    }

    public void A0G(@Nullable Surface surface, boolean z) {
        InterfaceC5909XG[] interfaceC5909XGArr;
        ArrayList<C4560As> arrayList = new ArrayList();
        for (InterfaceC5909XG interfaceC5909XG : this.A0N) {
            int A7i = interfaceC5909XG.A7i();
            String[] strArr = A0P;
            if (strArr[5].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[6] = "VrJ3McZcw7cn2zeT";
            strArr2[0] = "MNepmlV8OvsHi61EfIBswCx5NcPOIPrl";
            if (A7i == 2) {
                arrayList.add(this.A0F.A4L(interfaceC5909XG).A06(1).A07(surface).A05());
            }
        }
        Surface surface2 = this.A03;
        if (surface2 != null && surface2 != surface) {
            try {
                for (C4560As c4560As : arrayList) {
                    c4560As.A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0D) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        if (A0P[7].charAt(22) != 'V') {
            throw new RuntimeException();
        }
        String[] strArr3 = A0P;
        strArr3[5] = "BcNzrhvciYYCifYD3J0kGNpt4Q56t2ws";
        strArr3[4] = "LBzJc3KMaCoazXjGhEegCXyOf3paMmXp";
        this.A0D = z;
    }

    private final void A0I(InterfaceC4754EJ interfaceC4754EJ) {
        this.A0J.add(interfaceC4754EJ);
    }

    public final int A0J() {
        return this.A01;
    }

    public final Format A0K() {
        return this.A06;
    }

    @Nullable
    public final Format A0L() {
        return this.A07;
    }

    public final void A0M() {
        AF4(false);
    }

    public final void A0N(float f) {
        InterfaceC5909XG[] interfaceC5909XGArr;
        this.A00 = f;
        for (InterfaceC5909XG interfaceC5909XG : this.A0N) {
            String[] strArr = A0P;
            if (strArr[5].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[6] = "TZ1OBcEbhXggSiRE";
            strArr2[0] = "o47SCfAcsD46THYYRPii4HELThPbmwG8";
            if (interfaceC5909XG.A7i() == 1) {
                this.A0F.A4L(interfaceC5909XG).A06(2).A07(Float.valueOf(f)).A05();
            }
        }
    }

    public final void A0O(@Nullable Surface surface) {
        A0E();
        A0G(surface, false);
    }

    public final void A0P(InterfaceC4831Fa interfaceC4831Fa) {
        ADH(interfaceC4831Fa, true, true);
    }

    public final void A0Q(InterfaceC5051JE interfaceC5051JE) {
        this.A0M.add(interfaceC5051JE);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final void A3E(InterfaceC4552Ak interfaceC4552Ak) {
        this.A0F.A3E(interfaceC4552Ak);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5910XH
    public final C4560As A4L(InterfaceC4559Ar interfaceC4559Ar) {
        return this.A0F.A4L(interfaceC4559Ar);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final int A5r() {
        return this.A0F.A5r();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final long A5s() {
        return this.A0F.A5s();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final long A6A() {
        return this.A0F.A6A();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final int A6C() {
        return this.A0F.A6C();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final int A6D() {
        return this.A0F.A6D();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final long A6F() {
        return this.A0F.A6F();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final AbstractC4569B1 A6H() {
        return this.A0F.A6H();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final int A6I() {
        return this.A0F.A6I();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final long A6R() {
        return this.A0F.A6R();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final boolean A7D() {
        return this.A0F.A7D();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5910XH
    public final void ADH(InterfaceC4831Fa interfaceC4831Fa, boolean z, boolean z2) {
        InterfaceC4831Fa interfaceC4831Fa2 = this.A0B;
        if (interfaceC4831Fa2 != interfaceC4831Fa) {
            if (interfaceC4831Fa2 != null) {
                interfaceC4831Fa2.ADv(this.A0H);
                this.A0H.A07();
            }
            interfaceC4831Fa.A3C(this.A0E, this.A0H);
            this.A0B = interfaceC4831Fa;
        }
        this.A0F.ADH(interfaceC4831Fa, z, z2);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final void ADm() {
        this.A0F.ADm();
        A0E();
        Surface surface = this.A03;
        if (surface != null) {
            if (this.A0D) {
                surface.release();
            }
            this.A03 = null;
        }
        InterfaceC4831Fa interfaceC4831Fa = this.A0B;
        if (interfaceC4831Fa != null) {
            interfaceC4831Fa.ADv(this.A0H);
        }
        this.A0C = Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final void AEN(long j) {
        this.A0H.A06();
        this.A0F.AEN(j);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final void AEO() {
        this.A0H.A06();
        this.A0F.AEO();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final void AEe(boolean z) {
        this.A0F.AEe(z);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final void AF4(boolean z) {
        this.A0F.AF4(z);
        InterfaceC4831Fa interfaceC4831Fa = this.A0B;
        if (interfaceC4831Fa != null) {
            interfaceC4831Fa.ADv(this.A0H);
            this.A0B = null;
            this.A0H.A07();
        }
        this.A0C = Collections.emptyList();
        String[] strArr = A0P;
        if (strArr[6].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[5] = "8NqoZsSfBCZ1v43okD4Pix8d8oY1Moxp";
        strArr2[4] = "VfYOa1CKuZhM9jsFhHY6jw4UB0OoLmrV";
    }
}
