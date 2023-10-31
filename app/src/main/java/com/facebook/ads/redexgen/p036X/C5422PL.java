package com.facebook.ads.redexgen.p036X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.PL */
/* loaded from: assets/audience_network.dex */
public final class C5422PL {
    public static byte[] A08;
    public WeakReference<C5411PA> A00;
    public WeakReference<InterfaceC5619SW> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C5953Xy A03;
    public final C5399Ox A04;
    public final String A05;
    public final String A06;
    public final WeakReference<InterfaceC5080Jh> A07;

    static {
        A09();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{44, 56, 54, 54, 42, 55, 45, 10, 11, 12, 7, 27, 18, 26, Utf8.REPLACEMENT_BYTE, 78, 71, 58, -29, -14, -21, -21, -30, -23, -36, -32, -20, -31, -30, 12, 27, 20, 20, 11, 18, 5, 19, 11, 25, 25, 7, 13, 11, -37, -22, -29, -29, -38, -31, -44, -23, -18, -27, -38, -23, -29, -9, 52, 53, 36, 46, 41, 90, 75, 95, 93, 79, 78, 44, 99, Utf8.REPLACEMENT_BYTE, 93, 79, 92, 57, 58, 39, 56, 58, 43, 42, 8, Utf8.REPLACEMENT_BYTE, 27, 57, 43, 56, 83, 84, 65, 84, 69, 48, 45, 39, 6, 32, 52, -10, -31, -20, -11, -27};
    }

    public C5422PL(C5953Xy c5953Xy, C5411PA c5411pa, InterfaceC5080Jh interfaceC5080Jh, C5399Ox c5399Ox, String str, String str2) {
        this.A03 = c5953Xy;
        this.A00 = new WeakReference<>(c5411pa);
        this.A07 = new WeakReference<>(interfaceC5080Jh);
        this.A04 = c5399Ox;
        this.A05 = str;
        this.A06 = str2;
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    private void A04() {
        InterfaceC5619SW interfaceC5619SW = this.A01.get();
        if (interfaceC5619SW == null) {
            return;
        }
        interfaceC5619SW.close();
    }

    private void A05() {
        InterfaceC5619SW interfaceC5619SW = this.A01.get();
        if (interfaceC5619SW == null) {
            return;
        }
        interfaceC5619SW.A81();
    }

    private void A06() {
        InterfaceC5619SW interfaceC5619SW = this.A01.get();
        if (interfaceC5619SW == null) {
            return;
        }
        interfaceC5619SW.A8h();
    }

    private void A07() {
        this.A03.A0D().A4u();
        this.A02 = true;
        InterfaceC5619SW interfaceC5619SW = this.A01.get();
        if (interfaceC5619SW == null) {
            return;
        }
        interfaceC5619SW.AF2();
        if (C5064JR.A1I(this.A03)) {
            this.A03.A09().AAT();
        }
    }

    private void A08() {
        InterfaceC5619SW interfaceC5619SW = this.A01.get();
        if (interfaceC5619SW == null) {
            return;
        }
        interfaceC5619SW.AAr();
    }

    private void A0A(C5411PA c5411pa, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences A00 = C5151Kt.A00(this.A03);
        String A01 = A01(0, 0, 21);
        String optString = jSONObject.optString(A01(57, 5, 81), A01);
        String opId = jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50));
        StringBuilder sb = new StringBuilder();
        String key = A01(14, 4, 103);
        sb.append(key);
        sb.append(opId);
        String key2 = sb.toString();
        String key3 = A00.getString(key2, A01);
        if (key3 != null) {
            A01 = key3;
        }
        c5411pa.A0g(optString, A01);
    }

    private void A0B(C5411PA c5411pa, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String A01 = A01(0, 0, 21);
        String optString = jSONObject.optString(A01(98, 5, 12), A01);
        String optString2 = jSONObject.optString(A01(57, 5, 81), A01);
        String optString3 = jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50));
        SharedPreferences.Editor edit = C5151Kt.A00(this.A03).edit();
        edit.putString(A01(14, 4, 103) + optString3, optString).apply();
        c5411pa.A0f(optString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(EnumC5420PJ enumC5420PJ, String str) throws JSONException {
        switch (enumC5420PJ) {
            case A0A:
                A0I(new JSONObject(str));
                break;
            case A0E:
                A06();
                break;
            case A03:
                A04();
                break;
            case A0D:
                A07();
                break;
            case A09:
                A0K(new JSONObject(str));
                break;
            case A0H:
                A0L(new JSONObject(str));
                break;
            case A04:
                if (BuildConfigApi.isDebug()) {
                }
                break;
            case A0M:
                A05();
            case A07:
                this.A03.A0D().A56(str);
                break;
            case A0C:
            case A0N:
            case A0K:
            case A0J:
            case A0G:
                A0D(enumC5420PJ, str);
                break;
            case A0B:
                A0J(new JSONObject(str));
                break;
            case A08:
                A08();
                break;
            case A0I:
                A0M(new JSONObject(str));
                break;
        }
        C5411PA c5411pa = this.A00.get();
        if (c5411pa == null) {
            return;
        }
        switch (enumC5420PJ) {
            case A06:
                c5411pa.A0S();
                return;
            case A05:
                c5411pa.A0R();
                return;
            case A0P:
                A0B(c5411pa, str);
                return;
            case A0L:
                A0A(c5411pa, str);
                return;
            case A0F:
                c5411pa.A0i(A03(new JSONObject(str)));
                return;
            default:
                return;
        }
    }

    private void A0D(EnumC5420PJ enumC5420PJ, String str) throws JSONException {
        InterfaceC5619SW interfaceC5619SW = this.A01.get();
        if (interfaceC5619SW == null) {
            return;
        }
        switch (enumC5420PJ) {
            case A0C:
                interfaceC5619SW.AAv();
                return;
            case A0N:
                interfaceC5619SW.ACK();
                return;
            case A0K:
                A0G(interfaceC5619SW, str);
                return;
            case A0J:
                A0F(interfaceC5619SW, str);
                return;
            case A0G:
                A0E(interfaceC5619SW, str);
                return;
            default:
                return;
        }
    }

    private void A0E(InterfaceC5619SW interfaceC5619SW, String str) throws JSONException {
        interfaceC5619SW.ABZ(new JSONObject(str).optBoolean(A01(87, 5, 108), false));
    }

    private void A0F(InterfaceC5619SW interfaceC5619SW, String str) throws JSONException {
        interfaceC5619SW.ACn(new JSONObject(str).optBoolean(A01(62, 12, 118), false));
    }

    private void A0G(InterfaceC5619SW interfaceC5619SW, String str) throws JSONException {
        interfaceC5619SW.ACp(new JSONObject(str).optBoolean(A01(74, 13, 82), false));
    }

    private void A0I(JSONObject jSONObject) {
        InterfaceC5619SW interfaceC5619SW = this.A01.get();
        if (interfaceC5619SW == null) {
            return;
        }
        String optString = jSONObject.optString(A01(0, 7, 85));
        if (TextUtils.isEmpty(optString)) {
            interfaceC5619SW.A7w();
        } else {
            interfaceC5619SW.A7x(optString);
        }
    }

    private void A0J(JSONObject jSONObject) {
        if (this.A01.get() == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 85));
    }

    private void A0K(JSONObject jSONObject) {
        InterfaceC5080Jh interfaceC5080Jh = this.A07.get();
        if (interfaceC5080Jh == null) {
            return;
        }
        String optString = jSONObject.optString(A01(43, 11, 1));
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        new C5088Jp(this.A06, interfaceC5080Jh).A03(optString, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int optInt = jSONObject.optInt(A01(18, 11, 9), -1);
        if (optInt == -1) {
            return;
        }
        String optString = jSONObject.optString(A01(29, 14, 50));
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.A03.A0D().A8w(optInt, optString);
    }

    private void A0M(JSONObject jSONObject) {
        String optString;
        InterfaceC5619SW interfaceC5619SW = this.A01.get();
        if (interfaceC5619SW == null || (optString = jSONObject.optString(A01(92, 6, 71))) == null) {
            return;
        }
        interfaceC5619SW.AD2(optString);
    }

    public final void A0N(InterfaceC5619SW interfaceC5619SW) {
        this.A01 = new WeakReference<>(interfaceC5619SW);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        ExecutorC5239MM.A00(new RunnableC5418PH(this, str));
    }
}
