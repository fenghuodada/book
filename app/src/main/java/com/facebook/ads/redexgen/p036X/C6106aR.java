package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aR */
/* loaded from: assets/audience_network.dex */
public final class C6106aR extends C43216m {
    public static byte[] A01;
    public final AudioManager A00;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 33);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{-22, -2, -19, -14, -8};
    }

    public C6106aR(Context context, C42856C c42856c) {
        super(context, c42856c);
        this.A00 = (AudioManager) context.getSystemService(A04(0, 5, 104));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC43457A A03(HashMap<Integer, C6107aS> hashMap) {
        return new C5962Y7(SystemClock.elapsedRealtime(), A02(), hashMap, EnumC434479.A06);
    }

    public final InterfaceC43306v A0G() {
        return new C6109aU(this);
    }

    public final InterfaceC43306v A0H() {
        return new C6112aX(this);
    }

    public final InterfaceC43306v A0I() {
        return new C6111aW(this);
    }

    public final InterfaceC43306v A0J() {
        return new C6110aV(this);
    }

    public final InterfaceC43306v A0K(List<C43296u> list) {
        return new C6108aT(this, list);
    }
}
