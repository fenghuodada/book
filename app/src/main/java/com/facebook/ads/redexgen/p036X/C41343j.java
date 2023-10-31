package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.facebook.ads.sync.SyncModifiableBundle;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.ads.redexgen.X.3j */
/* loaded from: assets/audience_network.dex */
public final class C41343j implements InterfaceC4885GU, InterfaceC5557RW {
    public static byte[] A0A;
    public static String[] A0B = {"5Oiv1GLvIq7zEHzIHOTPzi3kaYzi9CKu", "OYJ8Vha7o3AKqeq5fQgjy4YAYzCEKBrH", "4fHxCa0vWIAizdOtLSYViH6HX8wZM136", "7SeobKfCaIBp1RCtBr0PVzHsRPnznuT1", "fOxTiSwrZex6", "3vZIMeafrjOpHP1eiyT8MHuy7IIJRNdQ", "XI5vdZH0G6FndxBvW8fNBqRq2FpLqBJ1", "pJZH6qXQIaEu24ksEJ9XliOUqsc1pAkZ"};
    public final C44148U A00;
    public final InterfaceC44318l A01;
    public final InterfaceC5527R2 A02;
    public final InterfaceC5558RX A03;
    public final C5566Rf A04;
    public final InterfaceC5567Rg A05;
    public final String A06;
    public final Map<EnumC5553RS, C4915Gy> A09 = new HashMap();
    public final Map<EnumC5553RS, C41714L> A08 = new HashMap();
    public final List<InterfaceC5571Rk> A07 = new ArrayList();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0A = new byte[]{101, -82, -72, 101, -73, -86, -72, -71, -73, -82, -88, -71, -86, -87, 115, 101, -104, -80, -82, -75, -75, -82, -77, -84, 101, -72, -66, -77, -88, -48, -1, -1, -81, -8, -3, -81, -15, -16, -14, -6, -10, 1, -2, 4, -3, -13, -67, -54, -24, -11, -11, -10, -5, -89, -22, -7, -20, -24, -5, -20, -89, -6, -20, -7, -3, -20, -7, -89, -23, -4, -11, -21, -13, -20, -89, -2, -16, -5, -17, -89, -11, -10, -11, -76, -6, -20, -7, -3, -20, -7, -89, -10, -2, -11, -20, -21, -89, -23, -4, -11, -21, -13, -20, -89, -48, -53, -85, -56, -37, -56, -121, -41, -39, -42, -54, -52, -38, -38, -48, -43, -50, -121, -42, -41, -37, -48, -42, -43, -121, -49, -12, -4, -25, -14, -17, -22, -90, -8, -21, -20, -8, -21, -7, -18, -90, -6, -17, -13, -21, -64, -90, -85, -22, -79, -56, -38, -125, -42, -56, -43, -39, -56, -43, -112, -46, -38, -47, -56, -57, -125, -59, -40, -47, -57, -49, -56, -125, -58, -43, -56, -60, -41, -56, -57, -99, -125, -120, -42, -101, -63, -74, -85, -80, -70, -73, -74, -79, -62, -87, -68, -79, -73, -74, 104, -70, -83, -71, -67, -83, -69, -68, 104, -68, -73, 104, 109, -69, -126, 82, 109, -69, -88, -50, -61, -72, -67, -57, -60, -61, -66, -49, -74, -55, -66, -60, -61, 117, -57, -70, -56, -59, -60, -61, -56, -70, -113, 95, 122, -56, 114, -104, -115, -126, -121, -111, -114, -115, -120, -103, Byte.MIN_VALUE, -109, -120, -114, -115, Utf8.REPLACEMENT_BYTE, -111, -108, -115, Utf8.REPLACEMENT_BYTE, -123, Byte.MIN_VALUE, -120, -117, -124, -125, 90, Utf8.REPLACEMENT_BYTE, -123, -114, -111, -126, -120, -115, -122, Utf8.REPLACEMENT_BYTE, -120, -115, Utf8.REPLACEMENT_BYTE, 68, -125, Utf8.REPLACEMENT_BYTE, -110, -124, -126, -114, -115, -125, -110, -103, -84, -91, -101, -93, -100, -86, -107, -95, -96, -90, -105, -86, -90, -122, -125, -106, -125, -89, -86, -81, -88, -90, -77, -79, -77, -86, -81, -75, -39, -54, -30, -43, -40, -54, -51, -90, -45, -58, -57, -45, -58, -44, -55, -40, -53, -41, -37, -53, -39, -38, -34, -47, -33, -36, -37, -38, -33, -47, -59, -73, -60, -56, -73, -60, -95, -55, -64, -73, -74, -108, -57, -64, -74, -66, -73, -107, -60, -73, -77, -58, -73, -74, -19, -13, -24, -35, -30, -20, -23, -24, -29, -12, -37, -18, -29, -23, -24, -64, -29, -24, -29, -19, -30, -33, -34, -44, -38, -49, -60, -55, -45, -48, -49, -54, -37, -62, -43, -54, -48, -49, -76, -43, -62, -45, -43, -58, -59, -73, -92, -75, -86, -88, -73, -94, -75, -88, -87, -75, -88, -74, -85, -94, -74};
    }

    static {
        A05();
    }

    public C41343j(C44148U c44148u, InterfaceC44318l interfaceC44318l, InterfaceC5527R2 interfaceC5527R2, String str, InterfaceC5567Rg interfaceC5567Rg, C5566Rf c5566Rf, InterfaceC5556RV interfaceC5556RV) {
        this.A00 = c44148u;
        this.A01 = interfaceC44318l;
        this.A02 = interfaceC5527R2;
        this.A06 = str;
        this.A05 = interfaceC5567Rg;
        this.A04 = c5566Rf;
        this.A03 = interfaceC5556RV.A4C(this);
    }

    public static int A00(JSONObject jSONObject) throws JSONException {
        int i = jSONObject.getJSONObject(A01(335, 7, 80)).getInt(A01(426, 16, 50));
        if (i > 0) {
            return i;
        }
        throw new JSONException(String.format(Locale.US, A01(129, 24, 117), Integer.valueOf(i)));
    }

    private Set<InterfaceC5570Rj> A02(JSONObject responseObject) throws JSONException {
        HashSet hashSet = new HashSet();
        JSONObject jSONObject = responseObject.getJSONObject(A01(349, 8, 91));
        JSONObject jSONObject2 = responseObject.getJSONObject(A01(298, 7, 38));
        for (final C4915Gy c4915Gy : this.A09.values()) {
            int i = C5569Ri.A01[EnumC5575Ro.A00(jSONObject.getString(c4915Gy.A6l().A03())).ordinal()];
            if (i == 1) {
                final JSONObject jSONObject3 = jSONObject2.getJSONObject(c4915Gy.A6l().A03()).getJSONObject(A01(312, 4, 17));
                final JSONObject optJSONObject = jSONObject2.getJSONObject(c4915Gy.A6l().A03()).optJSONObject(A01(316, 11, 48));
                hashSet.add(new AbstractC4881GQ(c4915Gy, jSONObject3, optJSONObject) { // from class: com.facebook.ads.redexgen.X.3m
                    public final JSONObject A00;
                    @Nullable
                    public final JSONObject A01;

                    {
                        EnumC5575Ro enumC5575Ro = EnumC5575Ro.A03;
                        this.A00 = jSONObject3;
                        this.A01 = optJSONObject;
                    }

                    @Override // com.facebook.ads.redexgen.p036X.AbstractC4881GQ, com.facebook.ads.redexgen.p036X.InterfaceC5570Rj
                    public final void A3O(Map<InterfaceC5552RR, EnumC5575Ro> map, Map<InterfaceC4886GV, EnumC5562Rb> map2) {
                        super.A00.A05(this.A00, this.A01);
                        super.A3O(map, map2);
                    }
                });
            } else if (i == 2) {
                hashSet.add(new AbstractC4881GQ(c4915Gy) { // from class: com.facebook.ads.redexgen.X.3l
                    {
                        EnumC5575Ro enumC5575Ro = EnumC5575Ro.A04;
                    }
                });
            } else {
                throw new AssertionError();
            }
        }
        for (final C41714L c41714l : this.A08.values()) {
            int i2 = C5569Ri.A00[EnumC5562Rb.A00(jSONObject.getString(c41714l.A6l().A03())).ordinal()];
            if (i2 == 1) {
                hashSet.add(new AbstractC4882GR(c41714l) { // from class: com.facebook.ads.redexgen.X.45
                    {
                        EnumC5562Rb enumC5562Rb = EnumC5562Rb.A04;
                    }
                });
            } else if (i2 == 2) {
                hashSet.add(new AbstractC4882GR(c41714l) { // from class: com.facebook.ads.redexgen.X.3k
                    {
                        EnumC5562Rb enumC5562Rb = EnumC5562Rb.A05;
                    }

                    @Override // com.facebook.ads.redexgen.p036X.AbstractC4882GR, com.facebook.ads.redexgen.p036X.InterfaceC5570Rj
                    public final void A3O(Map<InterfaceC5552RR, EnumC5575Ro> map, Map<InterfaceC4886GV, EnumC5562Rb> map2) {
                        this.A01.A06();
                        super.A3O(map, map2);
                    }
                });
            } else {
                throw new AssertionError();
            }
        }
        return hashSet;
    }

    private JSONObject A03(Map<InterfaceC5552RR, EnumC5574Rn> map, Map<InterfaceC4886GV, EnumC5561Ra> map2, Map<InterfaceC4886GV, JSONObject> map3, Map<InterfaceC4886GV, JSONObject> map4) throws JSONException {
        String A01;
        JSONObject bundleData = new JSONObject();
        for (Map.Entry<InterfaceC5552RR, EnumC5574Rn> entry : map.entrySet()) {
            bundleData.put(entry.getKey().A6l().A03(), entry.getValue().A02());
        }
        for (Map.Entry<InterfaceC4886GV, EnumC5561Ra> entry2 : map2.entrySet()) {
            bundleData.put(entry2.getKey().A6l().A03(), entry2.getValue().A02());
        }
        JSONObject jSONObject = new JSONObject();
        Iterator<Map.Entry<InterfaceC5552RR, EnumC5574Rn>> it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            A01 = A01(316, 11, 48);
            if (!hasNext) {
                break;
            }
            Map.Entry<InterfaceC5552RR, EnumC5574Rn> next = it.next();
            if (next.getValue() == EnumC5574Rn.A04) {
                JSONObject jSONObject2 = new JSONObject();
                InterfaceC5552RR key = next.getKey();
                jSONObject.put(key.A6l().A03(), jSONObject2);
                InterfaceC5552RR bundle = next.getKey();
                if (bundle.A6l().A04()) {
                    jSONObject2.put(A01, key.A6g());
                } else {
                    jSONObject2.put(A01, JSONObject.NULL);
                }
                jSONObject.put(key.A6l().A03(), jSONObject2);
            }
        }
        for (Map.Entry<InterfaceC4886GV, EnumC5561Ra> entry3 : map2.entrySet()) {
            JSONObject jSONObject3 = new JSONObject();
            InterfaceC4886GV key2 = entry3.getKey();
            InterfaceC5552RR bundle2 = entry3.getKey();
            jSONObject3.put(A01, map4.get(bundle2));
            if (entry3.getValue() == EnumC5561Ra.A05) {
                jSONObject3.put(A01(312, 4, 17), map3.get(key2));
                jSONObject.put(key2.A6l().A03(), jSONObject3);
            } else {
                String A03 = key2.A6l().A03();
                String[] strArr = A0B;
                if (strArr[1].charAt(20) == strArr[6].charAt(20)) {
                    throw new RuntimeException();
                }
                A0B[5] = "j6hI8A69HBwx3QyEu85lNgwu8aXeWQ7U";
                jSONObject.put(A03, jSONObject3);
            }
        }
        JSONObject jSONObject4 = new JSONObject();
        for (Map.Entry<String, String> entry4 : this.A05.A6X().entrySet()) {
            if (entry4.getValue() != null) {
                jSONObject4.put(entry4.getKey(), entry4.getValue());
            }
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put(A01(342, 7, 85), bundleData);
        jSONObject5.put(A01(298, 7, 38), jSONObject);
        jSONObject5.put(A01(305, 7, 33), jSONObject4);
        return jSONObject5;
    }

    private void A04() throws Throwable {
        Map<InterfaceC5552RR, EnumC5574Rn> hashMap = new HashMap<>();
        Map<InterfaceC4886GV, EnumC5561Ra> hashMap2 = new HashMap<>();
        Map<InterfaceC4886GV, JSONObject> hashMap3 = new HashMap<>();
        Map<InterfaceC4886GV, JSONObject> hashMap4 = new HashMap<>();
        synchronized (this) {
            for (InterfaceC5552RR interfaceC5552RR : this.A09.values()) {
                if (interfaceC5552RR.A8c()) {
                    hashMap.put(interfaceC5552RR, EnumC5574Rn.A04);
                } else {
                    hashMap.put(interfaceC5552RR, EnumC5574Rn.A03);
                }
            }
            AtomicReference<JSONObject> atomicReference = new AtomicReference<>();
            AtomicReference<JSONObject> atomicReference2 = new AtomicReference<>();
            for (C41714L c41714l : this.A08.values()) {
                if (c41714l.A8c()) {
                    if (c41714l.A07(atomicReference, atomicReference2)) {
                        hashMap2.put(c41714l, EnumC5561Ra.A05);
                        hashMap3.put(c41714l, atomicReference.get());
                    } else {
                        hashMap2.put(c41714l, EnumC5561Ra.A04);
                    }
                    hashMap4.put(c41714l, atomicReference2.get());
                }
            }
            Iterator<InterfaceC5571Rk> it = this.A07.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(A01(404, 22, 80));
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference<Throwable> failureContainer = new AtomicReference<>();
        AtomicReference atomicReference3 = new AtomicReference();
        JSONObject A03 = A03(hashMap, hashMap2, hashMap3, hashMap4);
        String.format(Locale.US, A01(188, 33, 55), this.A06, A03.toString(2));
        InterfaceC5527R2 interfaceC5527R2 = this.A02;
        String str = this.A06;
        interfaceC5527R2.ADC(str, (A01(327, 8, 88) + URLEncoder.encode(A03.toString())).getBytes(), new C4883GS(this, failureContainer, atomicReference3, countDownLatch));
        while (countDownLatch.getCount() > 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this) {
            if (atomicReference3.get() == null) {
                JSONObject syncRequest = (JSONObject) failureContainer.get();
                Set<InterfaceC5570Rj> A02 = A02(syncRequest);
                Map<SyncModifiableBundle, JSONObject> clientBundleFingerprint = new HashMap<>();
                HashMap hashMap5 = new HashMap();
                for (InterfaceC5570Rj response : A02) {
                    response.A3O(clientBundleFingerprint, hashMap5);
                }
                this.A03.A5S(A00((JSONObject) failureContainer.get()));
                Iterator<InterfaceC5571Rk> it2 = this.A07.iterator();
                if (it2.hasNext()) {
                    it2.next();
                    throw new NullPointerException(A01(381, 23, 105));
                }
            } else {
                throw ((Throwable) atomicReference3.get());
            }
        }
    }

    public static void A06(String str, AtomicReference<JSONObject> atomicReference, AtomicReference<Throwable> atomicReference2) {
        String.format(Locale.US, A01(221, 28, 68), str);
        try {
            atomicReference.set((JSONObject) new JSONTokener(str).nextValue());
        } catch (ClassCastException | JSONException e) {
            atomicReference2.set(e);
        }
    }

    private synchronized void A08(Throwable th) {
        Iterator<InterfaceC5571Rk> it = this.A07.iterator();
        if (it.hasNext()) {
            it.next();
            new HashMap();
            new HashMap();
            throw new NullPointerException(A01(381, 23, 105));
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4885GU
    public final synchronized InterfaceC5552RR A4O(EnumC5553RS enumC5553RS) {
        if (enumC5553RS.A02() == EnumC5555RU.A03) {
            if (this.A09.containsKey(enumC5553RS)) {
                return this.A09.get(enumC5553RS);
            }
            C4915Gy c4915Gy = new C4915Gy(enumC5553RS);
            this.A09.put(enumC5553RS, c4915Gy);
            Iterator<InterfaceC5571Rk> it = this.A07.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(A01(357, 24, 65));
            }
            String.format(Locale.US, A01(153, 35, 82), enumC5553RS);
            return c4915Gy;
        }
        throw new IllegalArgumentException(A01(47, 59, 118));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4885GU, com.facebook.ads.redexgen.p036X.InterfaceC44208a
    public final void A5U() {
        this.A03.A5T();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5557RW
    @SuppressLint({"CatchGeneralException"})
    public final void AEE() {
        if (this.A01.A8d()) {
            String str = A01(106, 23, 86) + this.A01.A6K().A07() + A01(0, 29, 52);
            A08(new C5573Rm());
            return;
        }
        try {
            if (!C5064JR.A1O(this.A00) || this.A00.A02().A8V()) {
                A04();
                return;
            }
            throw new IllegalStateException(A01(29, 18, 126));
        } catch (Throwable th) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int A01 = this.A04.A01();
            if (A0B[5].charAt(3) != 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[2] = "JEtZyGAVdUTB5WRsJGoBqRot3n7K2sjz";
            strArr[3] = "em0I48mZsoEuthzWerVnjSUWeJS3cW5z";
            objArr[0] = Integer.valueOf(A01);
            String.format(locale, A01(249, 49, 14), objArr);
            A08(th);
            this.A03.A5S(this.A04.A01());
        }
    }
}
