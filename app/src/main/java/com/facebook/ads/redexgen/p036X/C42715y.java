package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5y */
/* loaded from: assets/audience_network.dex */
public final class C42715y {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"o8zuart55Bmx3Pw0EGryupigSLJoPiZx", "bq35BXrVyo2MmN2pvK0AAoIbsBJXmHFn", "Ag4UQwTEuL9TJhKNxG6", "PmxOul6ExA7xevKGmIJ7", "bJjslG0QPgIDYXjJzGe0RXJuWF5PAt6I", "GLZoSVJacutm5kJ9CSmVpuybEaBnhneX", "dIwLXajRtHFv7I4e8IdUhcaSFtkhp8vw", "TtnuuoV6cihzxwpt43jVepBLS"};
    public static final String A03;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {112, 82, 93, 93, 92, 71, 19, 84, 86, 71, 19, 82, 87, 69, 86, 65, 71, 90, 64, 90, 93, 84, 19, 90, 93, 85, 92, 19, 92, 93, 19, 94, 82, 90, 93, 19, 71, 91, 65, 86, 82, 87, 29, 91, 87, 85, 22, 95, 87, 87, 95, 84, 93, 22, 89, 86, 92, 74, 87, 81, 92, 22, 95, 85, 75, 82, 94, 92, 31, 86, 94, 94, 86, 93, 84, 31, 80, 95, 85, 67, 94, 88, 85, 31, 86, 92, 66, 31, 80, 85, 66, 31, 88, 85, 84, 95, 69, 88, 87, 88, 84, 67, 31, 112, 85, 71, 84, 67, 69, 88, 66, 88, 95, 86, 120, 85, 114, 93, 88, 84, 95, 69, 109, 97, 99, 32, 105, 97, 97, 105, 98, 107, 32, 111, 96, 106, 124, 97, 103, 106, 32, 105, 99, 125, 32, 111, 106, 125, 32, 103, 106, 107, 96, 122, 103, 104, 103, 107, 124, 32, 125, 107, 124, 120, 103, 109, 107, 32, 93, 90, 79, 92, 90, 18, 30, 28, 95, 22, 30, 30, 22, 29, 20, 95, 16, 31, 21, 3, 30, 24, 21, 95, 22, 28, 2, 95, 18, 30, 28, 28, 30, 31, 95, 54, 30, 30, 22, 29, 20, 33, 29, 16, 8, 34, 20, 3, 7, 24, 18, 20, 2, 36, 5, 24, 29, 67, 65, 74, 65, 86, 77, 71, 106, 104, 121, 76, 105, 123, 104, Byte.MAX_VALUE, 121, 100, 126, 100, 99, 106, 68, 105, 68, 99, 107, 98, 123, 121, 104, 85, 120, 33, 59, 15, 39, 39, 47, 36, 45, 24, 36, 41, 49, 27, 45, 58, 62, 33, 43, 45, 59, 9, 62, 41, 33, 36, 41, 42, 36, 45, 43, 49, 14, 43, 47, 43, 54, 3, 38, 22, 48, 35, 33, 41, 43, 44, 37, 7, 44, 35, 32, 46, 39, 38};
        if (A02[0].charAt(25) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[7] = "5c2qL4dH8BvO0Uzn9h0t1hzuT";
        strArr[3] = "iopOujFX2mYmGwDZvEry";
        A01 = bArr;
    }

    static {
        A05();
        A03 = C42645q.class.getSimpleName();
        A00 = A04(173, 52, 75);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r3 != false) goto L18;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.p036X.C42645q A00(com.facebook.ads.redexgen.p036X.C44148U r5) {
        /*
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 == r0) goto L4b
            com.facebook.ads.redexgen.X.5q r4 = A01(r5)
            if (r4 == 0) goto L36
            java.lang.String r0 = r4.A03()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.p036X.C42715y.A02
            r0 = 0
            r1 = r1[r0]
            r0 = 25
            char r1 = r1.charAt(r0)
            r0 = 76
            if (r1 == r0) goto L2d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C42715y.A02
            java.lang.String r1 = "uy9l7RLQ2P1HyKRuXc5qKTdvpqbxTZwF"
            r0 = 4
            r2[r0] = r1
            if (r3 == 0) goto L3a
        L36:
            com.facebook.ads.redexgen.X.5q r4 = A02(r5)
        L3a:
            if (r4 == 0) goto L46
            java.lang.String r0 = r4.A03()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L4a
        L46:
            com.facebook.ads.redexgen.X.5q r4 = A03(r5)
        L4a:
            return r4
        L4b:
            r2 = 0
            r1 = 43
            r0 = 9
            java.lang.String r1 = A04(r2, r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C42715y.A00(com.facebook.ads.redexgen.X.8U):com.facebook.ads.redexgen.X.5q");
    }

    @Nullable
    @VisibleForTesting
    public static C42645q A01(C44148U c44148u) {
        InterfaceC44188Y A7K = c44148u.A03().A7K();
        if (A7K != null) {
            return new C42645q(A7K.getId(), A7K.A8Y(), EnumC42635p.A03);
        }
        return null;
    }

    @Nullable
    @VisibleForTesting
    public static C42645q A02(C44148U c44148u) {
        Object A002;
        Method A022;
        Object A003;
        boolean z = true;
        Method A023 = C42725z.A02(A00, A04(257, 29, 114), Context.class);
        if (A023 == null || (A002 = C42725z.A00(null, A023, c44148u)) == null || ((Integer) A002).intValue() != 0 || (A022 = C42725z.A02(A04(65, 57, 11), A04(232, 20, 55), Context.class)) == null || (A003 = C42725z.A00(null, A022, c44148u)) == null) {
            return null;
        }
        Method A012 = C42725z.A01(A003.getClass(), A04(252, 5, 38), new Class[0]);
        Method getId = C42725z.A01(A003.getClass(), A04(286, 24, 120), new Class[0]);
        if (A012 == null || getId == null) {
            return null;
        }
        Object advertisingInfo = C42725z.A00(A003, A012, new Object[0]);
        String str = (String) advertisingInfo;
        Boolean bool = (Boolean) C42725z.A00(A003, getId, new Object[0]);
        if (str != null) {
            return new C42645q(str, (bool == null || !bool.booleanValue()) ? false : false, EnumC42635p.A07);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo] */
    @Nullable
    @SuppressLint({"CatchGeneralException"})
    @VisibleForTesting
    public static C42645q A03(C44148U c44148u) {
        ServiceConnectionC42705x serviceConnectionC42705x = new ServiceConnectionC42705x();
        Intent intent = new Intent(A04(122, 51, 52));
        intent.setPackage(A04(43, 22, 2));
        if (c44148u.bindService(intent, serviceConnectionC42705x, 1)) {
            try {
                final IBinder A022 = serviceConnectionC42705x.A02();
                ?? r0 = new IInterface(A022) { // from class: com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo
                    public static byte[] A01;
                    public static String[] A02 = {"", "dlCQJjSx2v0yIAE7uR5", "YVJONne7N3U8xm", "", "eKTK4BSI8P33PVYq98zfXeBzSnXDY", "", "Oc9p6kWmaRe51UGQv0AehnzsYEIJ", "vamZVSY5oxMc9Fm9XA4FwhL"};
                    public IBinder A00;

                    public static String A00(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                        int i4 = 0;
                        while (true) {
                            int length = copyOfRange.length;
                            String[] strArr = A02;
                            if (strArr[5].length() != strArr[0].length()) {
                                throw new RuntimeException();
                            }
                            A02[3] = "";
                            if (i4 >= length) {
                                return new String(copyOfRange);
                            }
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
                            i4++;
                        }
                    }

                    public static void A01() {
                        A01 = new byte[]{42, 54, 52, -11, 46, 54, 54, 46, 51, 44, -11, 40, 53, 43, 57, 54, 48, 43, -11, 46, 52, 58, -11, 40, 43, 58, -11, 48, 43, 44, 53, 59, 48, 45, 48, 44, 57, -11, 48, 53, 59, 44, 57, 53, 40, 51, -11, 16, 8, 43, 61, 44, 57, 59, 48, 58, 48, 53, 46, 16, 43, 26, 44, 57, 61, 48, 42, 44};
                    }

                    static {
                        A01();
                    }

                    {
                        this.A00 = A022;
                    }

                    public final String A02() throws RemoteException {
                        Parcel reply = Parcel.obtain();
                        Parcel obtain = Parcel.obtain();
                        try {
                            reply.writeInterfaceToken(A00(0, 68, 119));
                            this.A00.transact(1, reply, obtain, 0);
                            obtain.readException();
                            String readString = obtain.readString();
                            return readString != null ? readString : A00(0, 0, 88);
                        } finally {
                            obtain.recycle();
                            reply.recycle();
                        }
                    }

                    public final boolean A03() throws RemoteException {
                        Parcel reply = Parcel.obtain();
                        Parcel obtain = Parcel.obtain();
                        try {
                            reply.writeInterfaceToken(A00(0, 68, 119));
                            boolean z = true;
                            reply.writeInt(1);
                            this.A00.transact(2, reply, obtain, 0);
                            obtain.readException();
                            if (obtain.readInt() == 0) {
                                z = false;
                            }
                            return z;
                        } finally {
                            obtain.recycle();
                            reply.recycle();
                        }
                    }

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.A00;
                    }
                };
                return new C42645q(r0.A02(), r0.A03(), EnumC42635p.A08);
            } catch (Throwable th) {
                try {
                    c44148u.A06().A8y(A04(225, 7, 30), C44458z.A1Q, new C444690(th));
                } finally {
                    c44148u.unbindService(serviceConnectionC42705x);
                }
            }
        }
        return null;
    }
}
