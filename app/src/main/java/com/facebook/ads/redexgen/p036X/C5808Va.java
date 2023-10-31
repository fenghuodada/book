package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Va */
/* loaded from: assets/audience_network.dex */
public final class C5808Va implements InterfaceC4969Hs {
    public static String[] A0C = {"nBGgOhUJr5w54zk2FcSY", "YYZuUd", "gwBohD1o6c6DfEcFdJm47xfjaEoVukk3", "3TNnSL", "hJWvKqQqk09hkKqv49F3L8Ilz7Jhye22", "G8FOHrMAxxSNQBngbaVWxtAhYQnldn5N", "v6FRbmkBAKb4FwdIpHjrHHJWg4k1tULi", "7hirQzfzNIRD79h7knAyc8"};
    public long A00;
    public long A02;
    public C4959Hi A03;
    public final Uri A05;
    public final C4825FU A07;
    public final InterfaceC4955He A08;
    public final C5003IQ A09;
    public volatile boolean A0A;
    public final /* synthetic */ C4644CE A0B;
    public final C4665Cj A06 = new C4665Cj();
    public boolean A04 = true;
    public long A01 = -1;

    public C5808Va(C4644CE c4644ce, Uri uri, InterfaceC4955He interfaceC4955He, C4825FU c4825fu, C5003IQ c5003iq) {
        this.A0B = c4644ce;
        this.A05 = (Uri) C4997IK.A01(uri);
        this.A08 = (InterfaceC4955He) C4997IK.A01(interfaceC4955He);
        this.A07 = (C4825FU) C4997IK.A01(c4825fu);
        this.A09 = c5003iq;
    }

    public final void A04(long j, long j2) {
        this.A06.A00 = j;
        this.A02 = j2;
        this.A04 = true;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4969Hs
    public final void A3y() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4969Hs
    public final void A8m() throws IOException, InterruptedException {
        int i = 0;
        while (i == 0) {
            boolean z = this.A0A;
            if (A0C[0].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "6lKOSY";
            strArr[1] = "aO7eUD";
            if (!z) {
                InterfaceC4659Cd interfaceC4659Cd = null;
                try {
                    long j = this.A06.A00;
                    this.A03 = new C4959Hi(this.A05, j, -1L, C4644CE.A08(this.A0B));
                    this.A01 = this.A08.ACw(this.A03);
                    if (this.A01 != -1) {
                        this.A01 += j;
                    }
                    C5887Wu c5887Wu = new C5887Wu(this.A08, j, this.A01);
                    InterfaceC4658Cc A02 = this.A07.A02(c5887Wu, this.A08.A7k());
                    if (this.A04) {
                        A02.AEL(j, this.A02);
                        this.A04 = false;
                    }
                    while (i == 0 && !this.A0A) {
                        this.A09.A00();
                        i = A02.ADX(c5887Wu, this.A06);
                        if (c5887Wu.A7F() > C4644CE.A03(this.A0B) + j) {
                            j = c5887Wu.A7F();
                            this.A09.A01();
                            C4644CE.A04(this.A0B).post(C4644CE.A06(this.A0B));
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else {
                        this.A06.A00 = c5887Wu.A7F();
                        this.A00 = this.A06.A00 - this.A03.A01;
                    }
                    C5038Iz.A0W(this.A08);
                } catch (Throwable th) {
                    if (i != 1 && 0 != 0) {
                        this.A06.A00 = interfaceC4659Cd.A7F();
                        this.A00 = this.A06.A00 - this.A03.A01;
                    }
                    C5038Iz.A0W(this.A08);
                    throw th;
                }
            } else {
                return;
            }
        }
    }
}
