package com.facebook.ads.redexgen.p036X;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.util.common.Preconditions;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.XO */
/* loaded from: assets/audience_network.dex */
public final class C5917XO implements InterfaceC44879g {
    public static byte[] A03;
    public static final String A04;
    public final C5952Xx A00;
    public final InterfaceC44989r<C5077Je> A01;
    public final InterfaceC44989r<C5077Je> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{102, 100, 43, 34, 100, 48, 61, 52, 33, 126, 100, 24, 61, 28, 47, 60, 55, 45, 10, 45, 54, 43, 56, 62, 60, 11, 60, 58, 54, 43, 61, 29, 56, 45, 56, 59, 56, 42, 60, 105, 72, 65, 72, 89, 72, 73, 13, 72, 91, 72, 67, 89, 23, 13, 15, 66, 101, 109, 104, 97, 96, 36, 112, 107, 36, 103, 104, 97, 101, 118, 36, 97, 114, 97, 106, 112, 119, 36, 119, 112, 107, 118, 101, 99, 97, 97, 70, 78, 75, 66, 67, 7, 83, 72, 7, 67, 66, 84, 66, 85, 78, 70, 75, 78, 93, 66, 7, 70, 73, 7, 66, 81, 66, 73, 83, 7, 65, 85, 72, 74, 7, 67, 70, 83, 70, 69, 70, 84, 66, 7, 107, 76, 68, 65, 72, 73, 13, 89, 66, 13, 64, 66, 91, 72, 13, 72, 91, 72, 67, 89, 94, 13, 75, 95, 66, 64, 13, 68, 67, 0, 75, 65, 68, 74, 69, 89, 13, 94, 89, 66, 95, 76, 74, 72, 13, 79, 76, 78, 70, 13, 89, 66, 13, 72, 91, 72, 67, 89, 94, 13, 73, 76, 89, 76, 79, 76, 94, 72, 118, 81, 89, 92, 85, 84, 16, 68, 95, 16, 64, 81, 66, 67, 85, 16, 81, 94, 16, 85, 70, 85, 94, 68, 16, 86, 66, 95, 93, 16, 89, 94, 29, 86, 92, 89, 87, 88, 68, 16, 67, 68, 95, 66, 81, 87, 85, 123, 92, 84, 81, 88, 89, 29, 73, 82, 29, 79, 88, 92, 89, 29, 73, 85, 88, 29, 83, 72, 80, 95, 88, 79, 29, 82, 91, 29, 88, 75, 88, 83, 73, 78, 29, 91, 79, 82, 80, 29, 89, 92, 73, 92, 95, 92, 78, 88, 12, 43, 35, 38, 47, 46, 106, 62, 37, 106, 57, 47, 56, 35, 43, 38, 35, 48, 47, 106, 43, 46, 106, 47, 60, 47, 36, 62, 105, 78, 70, 76, 73, 71, 72, 84, 13, 97, 68, 101, 86, 69, 78, 84, 115, 84, 79, 82, 65, 71, 69, 114, 69, 67, 79, 82, 68, 100, 65, 84, 65, 66, 65, 83, 69, 56, 15, 9, 5, 24, 14, 74, 14, 11, 30, 11, 8, 11, 25, 15, 74, 12, 11, 3, 6, 31, 24, 15, 74, 5, 9, 9, 31, 24, 24, 15, 14, 74, 29, 2, 15, 4, 74, 24, 15, 11, 14, 3, 4, 13, 74, 15, 28, 15, 4, 30, 25, 68, 61, 40, 40, 57, 49, 44, 40, 28, 25, 12, 25, 47, 34, 95, 72, 78, 66, 95, 73, 114, 73, 76, 89, 76, 79, 76, 94, 72, 65, 87, 65, 65, 91, 93, 92, 109, 91, 86, 46, 56, 46, 46, 52, 50, 51, 2, 41, 52, 48, 56, 100, 121, 125, 117, 49, 42, 46, 32, 43, 88, 85, 92, 73, 12, 23, 18, 23, 22, 14, 23};
    }

    static {
        A03();
        A04 = C5917XO.class.getSimpleName();
    }

    public C5917XO(C5952Xx c5952Xx) throws IOException {
        this.A00 = c5952Xx;
        this.A01 = new C5914XL(C44959o.A00(A00(11, 28, 31), c5952Xx), new C5919XQ(this));
        this.A02 = new C5914XL(C44959o.A00(A00(322, 37, 102), c5952Xx), new C5918XP(this));
    }

    private List<JSONObject> A01(List<JSONObject> list, byte[] bArr, int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            if (i2 == 0) {
                break;
            }
            try {
                list.add(A02(bArr, i, i2));
            } catch (JSONException e) {
                if (this.A00.A03().A8P()) {
                    Log.e(A04, A00(85, 45, 97), e);
                }
                A05(C44458z.A2O, e);
            }
            i += i2;
        }
        return list;
    }

    public static JSONObject A02(byte[] bArr, int i, int i2) throws JSONException {
        return new JSONObject(new String(Arrays.copyOfRange(bArr, i, i + i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i, String str) {
        C444690 c444690 = new C444690(str);
        c444690.A03(1);
        this.A00.A06().A8z(A00(425, 15, 107), i, c444690);
    }

    private void A05(int i, Throwable th) {
        this.A00.A06().A8y(A00(425, 15, 107), i, new C444690(th));
    }

    public static byte[] A07(C44148U c44148u, String str, C5077Je c5077Je) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(423, 2, 0), str);
            jSONObject.put(A00(466, 5, 3), c5077Je.A08());
            jSONObject.put(A00(471, 4, 106), c5077Je.A06().toString());
            jSONObject.put(A00(462, 4, 86), C5236MJ.A02(c5077Je.A04()));
            jSONObject.put(A00(450, 12, 27), C5236MJ.A02(c5077Je.A03()));
            jSONObject.put(A00(440, 10, 116), c5077Je.A07());
            jSONObject.put(A00(419, 4, 62), new JSONObject(c5077Je.A09()));
            jSONObject.put(A00(412, 7, 26), 0);
        } catch (JSONException e) {
            if (c44148u.A03().A8P()) {
                Log.e(A04, A00(294, 28, 12), e);
            }
        }
        return jSONObject.toString().getBytes();
    }

    public static byte[] A09(JSONObject jSONObject) {
        return jSONObject.toString().getBytes();
    }

    public final int A0A() {
        try {
            return this.A01.A7I();
        } catch (C4507A0 e) {
            if (this.A00.A03().A8P()) {
                Log.e(A04, A00(245, 49, 123), e);
                return 0;
            }
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec A[Catch: A0 -> 0x0132, TryCatch #0 {A0 -> 0x0132, blocks: (B:33:0x00e0, B:35:0x00ec, B:36:0x00fb, B:22:0x0088, B:24:0x008e, B:26:0x009a, B:27:0x00d6, B:39:0x0104, B:40:0x0108, B:42:0x010e, B:43:0x011e, B:44:0x0122, B:46:0x0128), top: B:57:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A0B(int r13, java.util.Set<java.lang.String> r14, java.util.Set<java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5917XO.A0B(int, java.util.Set, java.util.Set):int");
    }

    public final List<JSONObject> A0C(int i) {
        boolean z = false;
        if (i == -1) {
            z = true;
            i = 30;
        }
        int[] iArr = new int[i];
        byte[] bArr = new byte[i * 1000];
        List<JSONObject> linkedList = new LinkedList<>();
        LinkedList linkedList2 = new LinkedList();
        try {
            InterfaceC44979q lastFetch = this.A01.A5M(bArr, iArr);
            linkedList2.add(lastFetch);
            int A5N = lastFetch.A5N();
            linkedList = A01(linkedList, bArr, iArr);
            while (lastFetch.A9V() && (A5N < i || z)) {
                if (!z) {
                    iArr = new int[i - A5N];
                } else {
                    Arrays.fill(iArr, 0);
                }
                lastFetch = this.A01.A5M(bArr, iArr);
                linkedList2.add(lastFetch);
                linkedList = A01(linkedList, bArr, iArr);
            }
            for (JSONObject jSONObject : linkedList) {
                this.A02.AF5(A09(jSONObject));
            }
            Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                ((InterfaceC44979q) it.next()).A4i();
            }
        } catch (C4507A0 e) {
            if (this.A00.A03().A8P()) {
                Log.e(A04, A00(359, 53, 44), e);
            }
            A05(C44458z.A2L, e);
        }
        return linkedList;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44879g
    public final void A40() {
        try {
            this.A01.clear();
            this.A02.clear();
        } catch (C4507A0 e) {
            if (this.A00.A03().A8P()) {
                Log.e(A04, A00(55, 30, 66), e);
            }
            A05(C44458z.A2I, e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9d != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44879g
    public final void AFi(final C5077Je c5077Je, final AbstractC44849d<String> abstractC44849d) {
        Executor executor = ExecutorC5250MX.A07;
        final InterfaceC44989r<C5077Je> interfaceC44989r = this.A01;
        final C5952Xx c5952Xx = this.A00;
        C5247MU.A00(executor, new AsyncTask<Void, Void, String>(c5077Je, abstractC44849d, interfaceC44989r, c5952Xx) { // from class: com.facebook.ads.redexgen.X.9h
            public static byte[] A05;
            public static String[] A06 = {"eZRg0", "9V6E8W", "xj5QhV", "OA95VIvTvwhgOpg1JzD5APn5ld4Fxl09", "KVXKxw3vFVm2nsonOqXLQ2M9", "1wiEXg5TWKy6aTJl", "hr3sX5JQ1zlqribj", "Vt9t5ut5ZgjhHbMTByjzA5y3IT5Rov5"};
            @Nullable
            public C4507A0 A00;
            public final C44148U A01;
            public final AbstractC44849d<String> A02;
            public final InterfaceC44989r<C5077Je> A03;
            public final C5077Je A04;

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
                }
                return new String(copyOfRange);
            }

            public static void A02() {
                A05 = new byte[]{26, 40, 31, 31, 2, 31, 77, 0, 8, 30, 30, 12, 10, 8, 77, 14, 12, 3, 3, 2, 25, 77, 15, 8, 77, 3, 24, 1, 1, 13, 46, 38, 38, 40, 47, 38, 97, 36, 55, 36, 47, 53, 123, 97, 9, 30, 24, 20, 9, 31, 36, 31, 26, 15, 26, 25, 26, 8, 30};
            }

            static {
                A02();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9d != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9r != com.facebook.ads.internal.eventstorage.record.RecordDatabase<com.facebook.ads.internal.logging.AdEvent> */
            {
                this.A04 = c5077Je;
                this.A03 = interfaceC44989r;
                this.A02 = abstractC44849d;
                this.A01 = c5952Xx;
            }

            @Nullable
            private final String A01(Void... voidArr) {
                String eventId;
                byte[] A07;
                if (C5158L0.A02(this)) {
                    return null;
                }
                String str = null;
                try {
                    try {
                        str = UUID.randomUUID().toString();
                        InterfaceC44448y A062 = this.A01.A06();
                        String eventId2 = this.A04.A06().toString();
                        A062.A8F(eventId2);
                        eventId = this.A04.A08();
                    } catch (C4507A0 e) {
                        this.A00 = e;
                        this.A01.A06().A8y(A00(44, 15, 76), C44458z.A2M, new C444690(e));
                    }
                    if (TextUtils.isEmpty(eventId)) {
                        return null;
                    }
                    if (this.A01.A03().A8P()) {
                        StringBuilder sb = new StringBuilder();
                        String eventId3 = A00(29, 15, 118);
                        sb.append(eventId3);
                        String eventId4 = this.A04.A06().toString();
                        sb.append(eventId4);
                        String eventId5 = A00(0, 1, 13);
                        sb.append(eventId5);
                        String eventId6 = this.A04.A09().toString();
                        sb.append(eventId6);
                        sb.toString();
                    }
                    InterfaceC44989r<C5077Je> interfaceC44989r2 = this.A03;
                    A07 = C5917XO.A07(this.A01, str, this.A04);
                    interfaceC44989r2.AF5(A07);
                    return str;
                } catch (Throwable th) {
                    C5158L0.A00(th, this);
                    return null;
                }
            }

            private final void A03(String str) {
                if (C5158L0.A02(this)) {
                    return;
                }
                try {
                    if (this.A00 == null) {
                        this.A02.A02(str);
                    } else {
                        this.A02.A01(0, (String) Preconditions.checkNotNull(this.A00.getMessage(), A00(1, 28, 90)));
                    }
                } catch (Throwable th) {
                    C5158L0.A00(th, this);
                }
            }

            @Override // android.os.AsyncTask
            @Nullable
            public final /* bridge */ /* synthetic */ String doInBackground(Void[] voidArr) {
                if (C5158L0.A02(this)) {
                    return null;
                }
                try {
                    return A01(voidArr);
                } catch (Throwable th) {
                    C5158L0.A00(th, this);
                    if (A06[7].length() != 31) {
                        throw new RuntimeException();
                    }
                    A06[1] = "V";
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ void onPostExecute(String str) {
                if (C5158L0.A02(this)) {
                    return;
                }
                try {
                    A03(str);
                } catch (Throwable th) {
                    C5158L0.A00(th, this);
                }
            }
        }, new Void[0]);
    }
}
