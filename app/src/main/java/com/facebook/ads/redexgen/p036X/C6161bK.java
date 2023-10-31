package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bK */
/* loaded from: assets/audience_network.dex */
public final class C6161bK implements InterfaceC42585k {
    public static byte[] A03;
    public static String[] A04 = {"Yyt8Jrp", "FvQHlihhdkZe9tXm7YLHdG4gIBqm", "h7ITXytSbKbsxwMfZDKdUPEvMsTrizAq", "0TuNzKSIMRKA8K3EzRQL94hbriXTa7QT", "ySuQOOQJHVodSpCznPaDLfXVVxuxvbGA", "XYB8XYCfCTfWBGtKG07Wi1HuHmIQx2qC", "71D0xe3tljOi7f3b0iOVOXaXnoSWhNo4", "dwdYeokke3ChTNA3vTF4hdqHGwVronGN"};
    public final InterfaceC5552RR A01;
    public Set<InterfaceC42615n> A00 = new HashSet();
    public final List<InterfaceC42605m> A02 = new ArrayList();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-72, -72, -67, 11, -46, -72, -67, 11, 41, 59, 59, 45, 60, 59};
    }

    static {
        A02();
    }

    public C6161bK(InterfaceC4885GU interfaceC4885GU) {
        this.A01 = interfaceC4885GU.A4O(EnumC5553RS.A0B);
        this.A01.A3F(new C6162bL(this));
        A03();
    }

    @Nullable
    public static Set<InterfaceC42615n> A01(JSONObject jSONObject) {
        C6160bJ A00;
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(8, 6, 93));
        if (optJSONArray == null) {
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject assetJson = optJSONArray.optJSONObject(i);
            if (assetJson == null || (A00 = C6160bJ.A00(assetJson)) == null) {
                return null;
            }
            hashSet.add(A00);
            int i2 = A04[1].length();
            if (i2 == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "2zeGpFgTpOohtr7xv9EhLTO87hKhrQIZ";
            strArr[3] = "Z45Lb0RXWpRaUi2IX7mXCACeVe5qt7dU";
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A03() {
        if (!this.A01.A8c()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<InterfaceC42615n> A01 = A01(this.A01.A6J());
        if (!this.A00.equals(A01) && A01 != null) {
            this.A00 = A01;
            for (InterfaceC42605m listener : this.A02) {
                listener.A3S();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (InterfaceC42615n interfaceC42615n : this.A00) {
                String.format(Locale.US, A00(0, 8, 45), interfaceC42615n.A7j(), interfaceC42615n.getUrl());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42585k
    public final void A3D(InterfaceC42605m interfaceC42605m) {
        this.A02.add(interfaceC42605m);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42585k
    public final synchronized Set<InterfaceC42615n> A5j() {
        return new HashSet(this.A00);
    }
}
