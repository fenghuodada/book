package com.facebook.ads.redexgen.p036X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.KC */
/* loaded from: assets/audience_network.dex */
public class RunnableC5111KC implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ C44148U A00;
    public final /* synthetic */ C5114KF A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 121);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{3, 27, 5, 60, 61, 39, 32, 59, 38, 45, 89, 78, 91, 68, 89, 95, 66, 69, 76, 54, 33, 53, 49, 33, 55, 48, 27, 45, 32};
    }

    public RunnableC5111KC(C5114KF c5114kf, String str, C44148U c44148u) {
        this.A01 = c5114kf;
        this.A02 = str;
        this.A00 = c44148u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        ArrayList arrayList;
        List list3;
        int i;
        int i2;
        int i3;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            C444690 c444690 = new C444690(A00(0, 3, 52));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, 45), jSONArray);
            jSONObject.put(A00(19, 10, 61), this.A02);
            list = this.A01.A0D;
            synchronized (list) {
                list2 = this.A01.A0D;
                arrayList = new ArrayList(list2);
                list3 = this.A01.A0D;
                list3.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C5113KE c5113ke = (C5113KE) it.next();
                StringBuilder sb = new StringBuilder();
                sb.append(A00(0, 0, 60));
                i = c5113ke.A00;
                sb.append(i);
                sb.append(';');
                i2 = c5113ke.A02;
                sb.append(i2);
                sb.append(';');
                i3 = c5113ke.A01;
                sb.append(i3);
                jSONArray.put(sb.toString());
            }
            c444690.A05(jSONObject);
            c444690.A03(1);
            this.A00.A06().A8z(A00(10, 9, 82), C44458z.A2Q, c444690);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
