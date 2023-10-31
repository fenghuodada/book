package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Yv */
/* loaded from: assets/audience_network.dex */
public final class C6012Yv extends C43216m {
    public static byte[] A07;
    public static final String A08;
    public final Context A00;
    @Nullable
    public final PackageInfo A01;
    @Nullable
    public final PackageManager A02;
    public final C42856C A03;
    @Nullable
    public final ActivityInfo[] A04;
    @Nullable
    public final ServiceInfo[] A05;
    @Nullable
    public final String[] A06;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{29, 57, 35, 35, 57, 62, 55, 112, 0, 49, 51, 59, 49, 55, 53, 112, 0, 53, 34, 61, 57, 35, 35, 57, Utf8.REPLACEMENT_BYTE, 62, 35};
    }

    static {
        A07();
        A08 = C6012Yv.class.getSimpleName();
    }

    public C6012Yv(Context context, C42856C c42856c) {
        super(context, c42856c);
        this.A00 = context;
        this.A03 = c42856c;
        this.A01 = A02(context);
        this.A02 = context.getPackageManager();
        this.A04 = A08(context);
        this.A05 = A0A(context);
        this.A06 = A0C(context);
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private PackageInfo A02(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(A08, A06(0, 27, 39), e);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private ActivityInfo[] A08(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(A08, A06(0, 27, 39), e);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private ServiceInfo[] A0A(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(A08, A06(0, 27, 39), e);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private String[] A0C(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(A08, A06(0, 27, 39), e);
            return null;
        }
    }

    public final InterfaceC43306v A0G() {
        return new C6014Yx(this);
    }

    public final InterfaceC43306v A0H() {
        return new C6015Yy(this);
    }

    public final InterfaceC43306v A0I() {
        return new C6013Yw(this);
    }

    public final InterfaceC43306v A0J() {
        return new C6016Yz(this);
    }

    public final InterfaceC43306v A0K() {
        return new C6021Z4(this);
    }

    public final InterfaceC43306v A0L() {
        return new C6025Z8(this);
    }

    public final InterfaceC43306v A0M() {
        return new C6020Z3(this);
    }

    public final InterfaceC43306v A0N() {
        return new C6017Z0(this);
    }

    public final InterfaceC43306v A0O() {
        return new C6019Z2(this);
    }

    public final InterfaceC43306v A0P() {
        return new C6018Z1(this);
    }

    public final InterfaceC43306v A0Q() {
        return new C6022Z5(this);
    }

    public final InterfaceC43306v A0R() {
        return new C6023Z6(this);
    }

    public final InterfaceC43306v A0S() {
        return new C6024Z7(this);
    }

    public final InterfaceC43306v A0T() {
        return new C6027ZA(this);
    }

    public final InterfaceC43306v A0U() {
        return new C6028ZB(this);
    }

    public final InterfaceC43306v A0V() {
        return new C6026Z9(this);
    }

    public final InterfaceC43306v A0W() {
        return new C6030ZD(this);
    }

    public final InterfaceC43306v A0X() {
        return new C6031ZE(this);
    }

    public final InterfaceC43306v A0Y() {
        return new C6029ZC(this);
    }
}
