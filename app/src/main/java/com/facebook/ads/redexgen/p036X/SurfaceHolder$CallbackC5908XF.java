package com.facebook.ads.redexgen.p036X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.XF */
/* loaded from: assets/audience_network.dex */
public final class SurfaceHolder$CallbackC5908XF implements InterfaceC5060JN, InterfaceC4597BT, InterfaceC4892Gb, InterfaceC4754EJ, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"tENgV7sVRmCggStQb7ahqyncu3McMlqx", "EBCLDe86SI67l2WgLGk", "Xc2z6PWfFp", "ZjGJvfPpi7mMWyj8ThC73X2hXIQsvVeY", "O", "wm4K2NOZzdg8zteNHm", "uxR1U8t68FFaIgGW", "ZP1sAESULwb937k6ya35I8qp57tsUFN9"};
    public final /* synthetic */ C4729Ds A00;

    public SurfaceHolder$CallbackC5908XF(C4729Ds c4729Ds) {
        this.A00 = c4729Ds;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4597BT
    public final void AA4(String str, long j, long j2) {
        Iterator it = C4729Ds.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC4597BT) it.next()).AA4(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4597BT
    public final void AA5(C4626Bw c4626Bw) {
        Iterator it = C4729Ds.A0D(this.A00).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[0].charAt(30) == strArr[7].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "r";
            strArr2[1] = "Pw7sEp82k0vieihjeRw";
            if (!hasNext) {
                C4729Ds c4729Ds = this.A00;
                String[] strArr3 = A01;
                if (strArr3[0].charAt(30) == strArr3[7].charAt(30)) {
                    throw new RuntimeException();
                }
                A01[5] = "AJXnTxM8Cjr";
                C4729Ds.A04(c4729Ds, null);
                C4729Ds.A06(this.A00, null);
                C4729Ds.A00(this.A00, 0);
                return;
            }
            InterfaceC4597BT interfaceC4597BT = (InterfaceC4597BT) it.next();
            if (A01[3].charAt(20) != '3') {
                throw new RuntimeException();
            }
            A01[5] = "rZ";
            interfaceC4597BT.AA5(c4626Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4597BT
    public final void AA6(C4626Bw c4626Bw) {
        C4729Ds.A06(this.A00, c4626Bw);
        Iterator it = C4729Ds.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC4597BT) it.next()).AA6(c4626Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4597BT
    public final void AA7(Format format) {
        C4729Ds.A04(this.A00, format);
        Iterator it = C4729Ds.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC4597BT) it.next()).AA7(format);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4597BT
    public final void AA8(int i) {
        C4729Ds.A00(this.A00, i);
        Iterator it = C4729Ds.A0D(this.A00).iterator();
        while (it.hasNext()) {
            InterfaceC4597BT interfaceC4597BT = (InterfaceC4597BT) it.next();
            if (A01[2].length() == 11) {
                throw new RuntimeException();
            }
            A01[2] = "0C";
            interfaceC4597BT.AA8(i);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4597BT
    public final void AA9(int i, long j, long j2) {
        Iterator it = C4729Ds.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC4597BT) it.next()).AA9(i, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4892Gb
    public final void AAS(List<C4888GX> list) {
        C4729Ds.A08(this.A00, list);
        Iterator it = C4729Ds.A09(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC4892Gb) it.next()).AAS(list);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5060JN
    public final void AAe(int i, long j) {
        Iterator it = C4729Ds.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC5060JN) it.next()).AAe(i, j);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4754EJ
    public final void ABY(Metadata metadata) {
        Iterator it = C4729Ds.A0A(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC4754EJ) it.next()).ABY(metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5060JN
    public final void AC7(Surface surface) {
        if (C4729Ds.A01(this.A00) == surface) {
            Iterator it = C4729Ds.A0C(this.A00).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = C4729Ds.A0B(this.A00).iterator();
        while (it2.hasNext()) {
            ((InterfaceC5060JN) it2.next()).AC7(surface);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5060JN
    public final void ACg(String str, long j, long j2) {
        Iterator it = C4729Ds.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC5060JN) it.next()).ACg(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5060JN
    public final void ACh(C4626Bw c4626Bw) {
        Iterator it = C4729Ds.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC5060JN) it.next()).ACh(c4626Bw);
        }
        C4729Ds.A03(this.A00, null);
        C4729Ds.A05(this.A00, null);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5060JN
    public final void ACi(C4626Bw c4626Bw) {
        C4729Ds.A05(this.A00, c4626Bw);
        Iterator it = C4729Ds.A0B(this.A00).iterator();
        while (it.hasNext()) {
            InterfaceC5060JN interfaceC5060JN = (InterfaceC5060JN) it.next();
            if (A01[3].charAt(20) != '3') {
                throw new RuntimeException();
            }
            A01[5] = "6iGRC7";
            interfaceC5060JN.ACi(c4626Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5060JN
    public final void ACl(Format format) {
        C4729Ds.A03(this.A00, format);
        Iterator it = C4729Ds.A0B(this.A00).iterator();
        while (it.hasNext()) {
            InterfaceC5060JN interfaceC5060JN = (InterfaceC5060JN) it.next();
            String[] strArr = A01;
            if (strArr[0].charAt(30) == strArr[7].charAt(30)) {
                throw new RuntimeException();
            }
            A01[5] = "M1lNqMtLlEQhDRLPZV8vitTN6y5pnm";
            interfaceC5060JN.ACl(format);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5060JN
    public final void ACq(int i, int i2, int i3, float f) {
        Iterator it = C4729Ds.A0C(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC5051JE) it.next()).ACq(i, i2, i3, f);
        }
        Iterator it2 = C4729Ds.A0B(this.A00).iterator();
        while (it2.hasNext()) {
            ((InterfaceC5060JN) it2.next()).ACq(i, i2, i3, f);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C4729Ds.A0H(this.A00, new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C4729Ds.A0H(this.A00, null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C4729Ds.A0H(this.A00, surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C4729Ds.A0H(this.A00, null, false);
    }
}
