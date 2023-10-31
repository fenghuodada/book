package com.facebook.ads.redexgen.p036X;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cZ */
/* loaded from: assets/audience_network.dex */
public final class C6235cZ implements InterfaceC5228MB<Bundle> {
    public static byte[] A03;
    public final C40412C A00;
    public final InterfaceC5467Q4 A01;
    public final List<C6234cY> A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{126, 121, 108, 121, 100, 126, 121, 100, 110, 126, 106, 123, 109, 106, 109};
    }

    public C6235cZ(List<AbstractC40392A> list, Bundle bundle, InterfaceC5467Q4 interfaceC5467Q4) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC5467Q4;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 15));
        for (int i = 0; i < list.size(); i++) {
            this.A02.add(new C6234cY(list.get(i), (Bundle) parcelableArrayList.get(i)));
        }
        this.A00 = (C40412C) C5222M5.A00(bundle.getByteArray(A00(0, 10, 28)));
    }

    public C6235cZ(List<AbstractC40392A> list, InterfaceC5467Q4 interfaceC5467Q4) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC5467Q4;
        for (AbstractC40392A abstractC40392A : list) {
            this.A02.add(new C6234cY(abstractC40392A));
        }
        this.A00 = new C40412C();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 28), C5222M5.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        for (C6234cY c6234cY : this.A02) {
            arrayList.add(c6234cY.A05());
        }
        bundle.putParcelableArrayList(A00(10, 5, 15), arrayList);
        return bundle;
    }

    public final C40412C A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        for (C6234cY test : this.A02) {
            test.A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d, double d2) {
        if (d2 >= 0.0d) {
            this.A00.A05(d, d2);
        }
        double A7p = this.A01.A7p();
        this.A00.A04(d, A7p);
        for (C6234cY c6234cY : this.A02) {
            c6234cY.A07(d, A7p);
        }
    }
}
