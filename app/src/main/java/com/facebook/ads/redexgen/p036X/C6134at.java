package com.facebook.ads.redexgen.p036X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.at */
/* loaded from: assets/audience_network.dex */
public final class C6134at extends C43216m {
    public static byte[] A04;
    @Nullable
    public ConfigurationInfo A00;
    public final ActivityManager.RunningAppProcessInfo A01;
    public final ActivityManager A02;
    public final Context A03;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 6);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{13, 15, 24, 5, 26, 5, 24, 21};
    }

    public C6134at(Context context, C42856C c42856c) {
        super(context, c42856c);
        this.A03 = context;
        this.A02 = (ActivityManager) this.A03.getSystemService(A04(0, 8, 106));
        ActivityManager activityManager = this.A02;
        if (activityManager != null) {
            this.A00 = activityManager.getDeviceConfigurationInfo();
        }
        this.A01 = new ActivityManager.RunningAppProcessInfo();
    }

    public final InterfaceC43306v A0G() {
        return new C6137aw(this);
    }

    public final InterfaceC43306v A0H() {
        return new C6136av(this);
    }

    public final InterfaceC43306v A0I() {
        return new C6141b0(this);
    }

    public final InterfaceC43306v A0J() {
        return new C6140az(this);
    }

    public final InterfaceC43306v A0K() {
        return new C6139ay(this);
    }

    public final InterfaceC43306v A0L() {
        return new C6142b1(this);
    }

    public final InterfaceC43306v A0M() {
        return new C6138ax(this);
    }

    public final InterfaceC43306v A0N() {
        return new C6143b2(this);
    }

    public final InterfaceC43306v A0O() {
        return new C6135au(this);
    }

    public final InterfaceC43306v A0P() {
        return new C6145b4(this);
    }

    public final InterfaceC43306v A0Q() {
        return new C6144b3(this);
    }
}
