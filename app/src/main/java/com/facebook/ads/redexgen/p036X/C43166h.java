package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.6h */
/* loaded from: assets/audience_network.dex */
public final class C43166h {
    public static final String A08 = C43166h.class.getSimpleName();
    public final int A00;
    public final Context A01;
    public final C42856C A02;
    public final C43026T A03;
    public final C6148b7 A04;
    public final C6147b6 A05;
    public final C6146b5 A06;
    public final C43497E A07;

    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.ads.redexgen.X.6k] */
    public C43166h(final Context context, final C42856C c42856c) {
        final C43206l c43206l = new C43206l(new C43226n(context, c42856c));
        ?? r2 = new Object(context, c43206l, c42856c) { // from class: com.facebook.ads.redexgen.X.6k
            public static byte[] A07;
            public static String[] A08 = {"Nj4TqS4QnuHXli7th2heksSDMg2Z", "RSouwChKZWzGhunCWCHEu7HkA4YX3nJn", "5fVToSkDBkuydhS3BZw", "o644y0JXIVns0cvIXh4fs0HcxxzuSHU9", "L6wIWC4w0dKe6dclyvwc8pXUf7KK", "NV8kH7O4XMciCHnyYHa8lR80N34PEowy", "S6E1x33SpjjOrFFRELF", "CEXaqd5N8FzuUquPi7vxqko1f9a5yOv1"};
            public int A00;
            public final C42856C A01;
            public final C6148b7 A02;
            public final C6147b6 A03;
            public final C6146b5 A04;
            public final C43206l A05;
            public final C43497E A06;

            public static String A02(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 75);
                }
                return new String(copyOfRange);
            }

            public static void A04() {
                A07 = new byte[]{-31, 4};
            }

            static {
                A04();
            }

            {
                this.A03 = new C6147b6(context, c42856c);
                this.A04 = new C6146b5(context, c42856c);
                this.A02 = new C6148b7(context, c42856c);
                this.A06 = new C43497E(context, c42856c);
                this.A05 = c43206l;
                this.A01 = c42856c;
                A05();
            }

            @Nullable
            public static C43296u A00(int i, String str, int i2, int i3) {
                if (i != 10300) {
                    if (i == 10920) {
                        return A01(str, i2, i3, EnumC43286t.A03);
                    }
                    if (i != 10940 && i != 10941) {
                        switch (i) {
                            case 10943:
                            case 10944:
                            case 10945:
                                break;
                            default:
                                return null;
                        }
                    }
                }
                return A01(str, i2, i3, EnumC43286t.A04);
            }

            @Nullable
            public static C43296u A01(String str, int i, int i2, EnumC43286t enumC43286t) {
                int i3 = C43186j.A00[enumC43286t.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        return null;
                    }
                    return new C43296u(str, i, i2);
                }
                return new C43296u(Integer.valueOf(Integer.parseInt(str)), i, i2);
            }

            @Nullable
            private List<C43296u> A03(int i) throws JSONException {
                ArrayList arrayList = new ArrayList();
                Map<Integer, String> A0i = this.A01.A0i();
                if (A0i == null || A0i.isEmpty() || !A0i.containsKey(Integer.valueOf(i))) {
                    return arrayList;
                }
                JSONObject jSONObject = new JSONObject(A0i.get(Integer.valueOf(i)));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    if (jSONArray != null && jSONArray.length() == 2) {
                        int i2 = jSONArray.getInt(0);
                        int minApiLevel = jSONArray.getInt(1);
                        arrayList.add(A00(i, next, i2, minApiLevel));
                    }
                }
                return arrayList;
            }

            @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
            private final void A05() {
                String A02 = A02(1, 1, 69);
                try {
                    JSONObject jSONObject = new JSONObject(this.A01.A0h());
                    Integer valueOf = jSONObject.has(A02) ? Integer.valueOf(jSONObject.getInt(A02)) : null;
                    if (valueOf == null) {
                        return;
                    }
                    this.A00 = valueOf.intValue();
                    this.A06.A06(this.A00);
                    A06(jSONObject.getJSONArray(A02(0, 1, 51)));
                } catch (Throwable th) {
                    C42976O.A03(th);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
                if (r4.containsKey(r8) == false) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
                if (r9 == false) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
                if (r9 == false) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
                r0 = r10.A05.A01(r6, r7);
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
                r1 = new com.facebook.ads.redexgen.p036X.C43276s(r6, r5, r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
                if (r5.contains(com.facebook.ads.redexgen.p036X.EnumC43346z.A07) == false) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
                r10.A06.A07(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
                if (r5.contains(com.facebook.ads.redexgen.p036X.EnumC43346z.A0B) == false) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
                r10.A03.A03(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
                r0 = r4.get(java.lang.Integer.valueOf(r6));
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00fb, code lost:
                if (r4.containsKey(r8) == false) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x00fe, code lost:
                r10.A04.A02(r1);
             */
            @android.annotation.SuppressLint({"BadMethodUse-android.util.Log.e"})
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void A06(org.json.JSONArray r11) throws java.lang.Exception {
                /*
                    Method dump skipped, instructions count: 262
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C43196k.A06(org.json.JSONArray):void");
            }

            private final boolean A07(EnumSet<EnumC43346z> enumSet) {
                return (enumSet.contains(this.A01.A0a()) && enumSet.contains(EnumC43346z.A05) && enumSet.contains(EnumC43346z.A06) && !enumSet.contains(EnumC43346z.A0A)) ? false : true;
            }

            public final int A08() {
                return this.A00;
            }

            public final C6148b7 A09() {
                return this.A02;
            }

            public final C6147b6 A0A() {
                return this.A03;
            }

            public final C6146b5 A0B() {
                return this.A04;
            }

            public final C43497E A0C() {
                return this.A06;
            }
        };
        this.A01 = context;
        this.A05 = r2.A0A();
        this.A06 = r2.A0B();
        this.A04 = r2.A09();
        this.A00 = r2.A08();
        this.A02 = c42856c;
        this.A03 = new C43026T();
        this.A03.A01(this.A04);
        this.A07 = r2.A0C();
        this.A07.A05();
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
    public static JSONObject A00() {
        JSONObject jsonSignalObject = new JSONObject();
        Map<Integer, C42906H<AbstractC43457A>> A03 = C43326x.A01().A03();
        if (A03 == null || A03.isEmpty()) {
            return jsonSignalObject;
        }
        try {
            for (Integer num : A03.keySet()) {
                List<AbstractC43457A> A032 = A03.get(num).A03();
                JSONArray jSONArray = new JSONArray();
                for (AbstractC43457A abstractC43457A : A032) {
                    jSONArray.put(abstractC43457A.A09(true));
                }
                jsonSignalObject.put(num.toString(), jSONArray);
            }
        } catch (Throwable th) {
            C42976O.A03(th);
        }
        return jsonSignalObject;
    }

    @SuppressLint({"BadMethodUse-java.lang.System.currentTimeMillis"})
    private void A01(String str, EnumC43316w enumC43316w, EnumC433570 enumC433570) {
        InterfaceC42956M A0Y = this.A02.A0Y();
        if (A0Y != null) {
            int sessionEndTime = (int) (System.currentTimeMillis() / 1000);
            A0Y.A9K(C43547J.A05(), str, this.A00, enumC43316w.A03(), sessionEndTime, A00(), enumC433570);
        }
        C43547J.A0B(this.A02, EnumC42926J.A07.A02(), str);
    }

    public final void A02() {
        this.A03.A00();
    }

    public final void A03(EnumC43316w enumC43316w) {
        this.A04.A03(enumC43316w, this.A01);
    }

    public final void A04(EnumC43336y enumC43336y, EnumC43316w enumC43316w, @Nullable String str) {
        A05(enumC43336y, enumC43316w, str, EnumC433570.A04);
    }

    public final void A05(EnumC43336y enumC43336y, EnumC43316w enumC43316w, @Nullable String str, EnumC433570 enumC433570) {
        this.A05.A04(enumC43316w);
        if (enumC43336y == EnumC43336y.A02) {
            this.A06.A03(enumC43316w);
            if (str != null) {
                A01(str, enumC43316w, enumC433570);
            }
        }
    }

    public final boolean A06() {
        List<C43276s> A02 = this.A05.A02();
        return (A02 == null || A02.isEmpty()) ? false : true;
    }
}
