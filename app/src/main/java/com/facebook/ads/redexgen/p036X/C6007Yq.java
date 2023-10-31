package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Yq */
/* loaded from: assets/audience_network.dex */
public class C6007Yq implements InterfaceC43306v {
    public static byte[] A01;
    public static String[] A02 = {"DYzZ33D", "FX", "1OACtFyT458udh1Nq8LtT5hKAntFdlV0", "NREy1eS", "YXbhfnB1JeAOpwzc7R5F4UgUcnERyrlo", "CB", "UiK58QgaQ3DZSY0y2Dj7Y4rAezwTtVBd", "ZsDGmeWwG8AfDaZfTpPswbVEo9CgGFmV"};
    public final /* synthetic */ C6005Yo A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 123);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{49, 39, 44, 49, 45, 48};
    }

    static {
        A01();
    }

    public C6007Yq(C6005Yo c6005Yo) {
        this.A00 = c6005Yo;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() throws Exception {
        Context context;
        C6005Yo c6005Yo = this.A00;
        context = c6005Yo.A01;
        c6005Yo.A00 = (SensorManager) context.getSystemService(A00(0, 6, 57));
        if (Build.VERSION.SDK_INT < 20) {
            return this.A00.A07(EnumC434176.A05);
        }
        C6005Yo c6005Yo2 = this.A00;
        String[] strArr = A02;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[5] = "Uf";
        strArr2[1] = "fm";
        if (c6005Yo2.A00 == null) {
            return this.A00.A07(EnumC434176.A07);
        }
        List<Sensor> sensorList = this.A00.A00.getSensorList(-1);
        ArrayList arrayList = new ArrayList();
        for (Sensor sensor : sensorList) {
            arrayList.add(new C6006Yp(sensor));
        }
        return this.A00.A0D(arrayList);
    }
}
