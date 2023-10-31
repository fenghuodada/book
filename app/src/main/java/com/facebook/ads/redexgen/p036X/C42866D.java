package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.ThreadSafe;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ThreadSafe
@SuppressLint({"StaticFieldLeak"})
/* renamed from: com.facebook.ads.redexgen.X.6D */
/* loaded from: assets/audience_network.dex */
public final class C42866D {
    public static EnumC43316w A06;
    public static byte[] A07;
    public static String[] A08 = {"eZKmHpMMDfaoBqW8nqrxEoXtMavqlqNM", "AtFM24PyHDF8", "75v22abHTVt154frUD1Ye4KyqdVteY4i", "Q1X3dzo1KUJ0DHl8HY6jDpMlStfBjogW", "z2ZYiDayfErc", "35EgzrmLPkhoCqMLba9eqfKFMV7fawsP", "opJsobvHgIMCHkez4yG45JKspLs2PehX", "oVaFSOpmfGo5v5TJJzClDpDAWRdHWsbi"};
    public static final AtomicReference<C42866D> A09;
    public C42886F A00;
    public C43166h A01;
    public final Context A02;
    public final C42856C A03;
    public final AtomicReference<C43016S> A04 = new AtomicReference<>();
    public final AtomicReference<C6149b8> A05 = new AtomicReference<>();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{99, 101, 116, Byte.MAX_VALUE, 25, 20, 92, 90, 114, 109, 113};
    }

    static {
        A01();
        A09 = new AtomicReference<>();
    }

    public C42866D(Context context, C42856C c42856c, EnumC43316w enumC43316w) {
        this.A02 = context;
        this.A03 = c42856c;
        this.A01 = new C43166h(this.A02, this.A03);
        if (this.A04.get() == null && C43547J.A0E(enumC43316w)) {
            A02(enumC43316w);
        }
    }

    private synchronized void A02(EnumC43316w enumC43316w) {
        if (this.A04.get() == null) {
            C42976O.A02(this.A03.A0Z());
            C6149b8 c6149b8 = new C6149b8(this.A03, this.A01);
            this.A05.set(c6149b8);
            this.A00 = new C42886F();
            this.A00.A00(c6149b8);
            if (this.A01.A06() && C43547J.A0E(enumC43316w)) {
                c6149b8.A05(enumC43316w);
            }
            A06 = enumC43316w;
            this.A00.A01(enumC43316w);
            this.A04.set(C43016S.A00(this.A02, this.A03));
        }
    }

    private boolean A03(EnumC43316w enumC43316w) {
        if (C43547J.A0E(enumC43316w)) {
            A02(enumC43316w);
        }
        if (enumC43316w.equals(A06)) {
            return false;
        }
        A06 = enumC43316w;
        C42886F c42886f = this.A00;
        if (c42886f != null) {
            c42886f.A01(enumC43316w);
        }
        if (A08[0].charAt(4) != 't') {
            A08[2] = "al3lqCaa3X6BhafyoLSdmdZ2qZ9PyUcx";
            return true;
        }
        throw new RuntimeException();
    }

    private boolean A04(String str, EnumC433570 enumC433570) {
        if (!C43547J.A0E(A06) || this.A04.get() == null) {
            return false;
        }
        C43166h c43166h = this.A01;
        if (c43166h != null) {
            c43166h.A05(EnumC43336y.A02, A06, str, enumC433570);
            return true;
        }
        return true;
    }

    @SuppressLint({"CatchGeneralException"})
    public final void A05(MotionEvent motionEvent) {
        try {
            if (this.A04.get() == null) {
                return;
            }
            this.A04.get().A05(motionEvent);
        } catch (Throwable th) {
            C42976O.A03(th);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final synchronized boolean A06(String str) {
        JSONObject jSONObject;
        EnumC433570 enumC433570;
        String string;
        if (str != null) {
            if (!str.isEmpty()) {
                try {
                    jSONObject = new JSONObject(str).getJSONObject(A00(0, 2, 69));
                } catch (JSONException unused) {
                } catch (Throwable th) {
                    C42976O.A03(th);
                }
                if (jSONObject != null) {
                    r7 = jSONObject.has(A00(6, 2, 106)) ? false | A03(EnumC43316w.A00(jSONObject.getInt(A00(6, 2, 106)))) : false;
                    JSONArray jSONArray = jSONObject.getJSONArray(A00(2, 2, 83));
                    if (jSONObject.has(A00(8, 3, 69))) {
                        enumC433570 = EnumC433570.A00(jSONObject.getInt(A00(8, 3, 69)));
                    } else {
                        enumC433570 = EnumC433570.A04;
                    }
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2.has(A00(4, 2, 52)) && (string = jSONObject2.getString(A00(4, 2, 52))) != null && !string.isEmpty()) {
                            C43547J.A0B(this.A03, EnumC42926J.A04.A02(), string);
                            r7 |= A04(string, enumC433570);
                        }
                    }
                    return r7;
                }
                return false;
            }
        }
        return false;
    }
}
