package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.YH */
/* loaded from: assets/audience_network.dex */
public class C5972YH implements InterfaceC43306v {
    public static byte[] A01;
    public final /* synthetic */ C5971YG A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{84, 91, 81, 71, 90, 92, 81, 27, 93, 84, 71, 81, 66, 84, 71, 80, 27, 64, 70, 87, 27, 84, 86, 65, 92, 90, 91, 27, 96, 102, 119, 106, 102, 97, 116, 97, 112, 28, 16, 17, 17, 26, 28, 11, 26, 27};
    }

    public C5972YH(C5971YG c5971yg) {
        this.A00 = c5971yg;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        Context context;
        context = this.A00.A00;
        Intent intent = context.registerReceiver(null, new IntentFilter(A00(0, 37, 55)));
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            return this.A00.A0F(extras.getBoolean(A00(37, 9, 125)));
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
