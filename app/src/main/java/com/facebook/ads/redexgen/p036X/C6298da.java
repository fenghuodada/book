package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.da */
/* loaded from: assets/audience_network.dex */
public class C6298da implements InterfaceC39500i, InterfaceC39540n {
    public static byte[] A0A;
    public static String[] A0B = {"OTBhn", "woE0GsYsDC", "jJJsRhZ6eh", "RbmDZKGZyk", "MbYnCV2deeCvNEpfUSPgn7RvJuamywdV", "va4Mi1JJiq4w08mNkhVxy34L1bzftr4W", "QQZqW8pW387BdDH3gcXSwYVoWAeaIxNz", "E72k8"};
    public static final String A0C;
    public int A00;
    public C396811 A01;
    @Nullable
    public InterfaceC396912 A02;
    @Nullable
    public InterfaceC5103K4 A03;
    @Nullable
    public List<C5721UB> A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C5953Xy A09;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 106);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0A = new byte[]{124, 89, 92, 77, 73, 88, 79, 29, 92, 81, 79, 88, 92, 89, 68, 29, 81, 82, 92, 89, 88, 89, 29, 89, 92, 73, 92, 93, 114, 119, 125, 117, 62, 118, Byte.MAX_VALUE, 110, 110, 123, 112, 123, 122, 62, 113, 112, 62, 114, 113, 125, 117, 109, 125, 108, 123, 123, 112, 62, Byte.MAX_VALUE, 122, 104, 71, 66, 72, 64, 11, 71, 68, 76, 76, 78, 79, 45, 26, 26, 7, 26, 72, 13, 16, 13, 11, 29, 28, 1, 6, 15, 72, 9, 11, 28, 1, 7, 6, 64, 66, 81, 71, 64, 77, 87, 54, 52, 39, 49, 60, 59, 49, 92, 75, 48, 45, 34, 51, 48, 43, 44, 55, 66, 93, 81, 67};
    }

    static {
        A04();
        A0C = C6298da.class.getSimpleName();
    }

    public C6298da(C5953Xy c5953Xy) {
        this(c5953Xy, new C396811());
    }

    public C6298da(C5953Xy c5953Xy, C396811 c396811) {
        this.A00 = 200;
        this.A01 = c396811;
        this.A09 = c5953Xy;
    }

    private Map<String, String> A03(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        String A02 = A02(116, 4, 94);
        if (map.containsKey(A02)) {
            hashMap.put(A02, map.get(A02));
        }
        String A022 = A02(108, 8, 41);
        if (map.containsKey(A022)) {
            hashMap.put(A022, map.get(A022));
        }
        return hashMap;
    }

    private void A05(C396811 c396811) {
        if (!this.A05) {
            this.A01 = c396811;
            List<C396811> A0f = this.A01.A0f();
            if (A0f != null && A0f.size() > 0) {
                int size = A0f.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    C6298da c6298da = new C6298da(this.A09);
                    c6298da.A05(A0f.get(i));
                    arrayList.add(new C5721UB(this.A09, c6298da, (C44649I) null, this.A03));
                }
                this.A04 = arrayList;
            }
            this.A05 = true;
            this.A06 = A07();
            return;
        }
        throw new IllegalStateException(A02(0, 27, 87));
    }

    private void A06(Map<String, String> map, Map<String, String> map2) {
        try {
            Map<String, String> urlParams = A03(map);
            new Handler().postDelayed(new C6299db(this, map2, urlParams), this.A01.A07() * 1000);
        } catch (Exception unused) {
        }
    }

    private boolean A07() {
        if (((!this.A01.A0h() && !TextUtils.isEmpty(this.A01.A0W())) || (!TextUtils.isEmpty(this.A01.A0T()) && this.A01.A0h())) && (this.A01.A0G() != null || this.A01.A0h())) {
            C5104K5 A0F = this.A01.A0F();
            if (A0B[2].length() != 10) {
                throw new RuntimeException();
            }
            A0B[6] = "coz4LHwVNN2LSDndRSBnj9WvwXuRM5HO";
            if (A0F != null || A7B() == AdPlacementType.NATIVE_BANNER) {
                return true;
            }
        }
        return false;
    }

    public final int A08() {
        return this.A01.A02();
    }

    public final int A09() {
        return this.A01.A05();
    }

    public final int A0A() {
        int A06 = this.A01.A06();
        if (A06 < 0 || A06 > 100) {
            return 0;
        }
        return A06;
    }

    public final int A0B() {
        return this.A00;
    }

    public final int A0C() {
        return this.A01.A08();
    }

    public final int A0D() {
        return this.A01.A09();
    }

    public final C396811 A0E() {
        return this.A01;
    }

    @Nullable
    public final InterfaceC396912 A0F() {
        return this.A02;
    }

    public final String A0G() {
        return this.A01.A0a();
    }

    @Nullable
    public final List<C5721UB> A0H() {
        if (!A0T()) {
            return null;
        }
        return this.A04;
    }

    public final void A0I() {
        if (!this.A08) {
            String A0b = A0E().A0b();
            if (A0B[2].length() != 10) {
                throw new RuntimeException();
            }
            A0B[5] = "8ArINtb0xmmgo9NmELWQk3NiIhKYvaDc";
            if (A0b != null) {
                this.A09.A08().ADD(A0b);
            }
            this.A08 = true;
        }
    }

    public final void A0J() {
        Iterator<C5721UB> it;
        List<C5721UB> list = this.A04;
        if (list == null) {
            return;
        }
        boolean isEmpty = list.isEmpty();
        if (A0B[6].charAt(13) != 'D') {
            throw new RuntimeException();
        }
        A0B[6] = "kj4WnsmCok25qDrlf1kxSYggARLvW33C";
        if (!isEmpty) {
            List<C5721UB> list2 = this.A04;
            if (A0B[2].length() != 10) {
                it = list2.iterator();
            } else {
                A0B[2] = "wGXHpE1nya";
                it = list2.iterator();
            }
            while (true) {
                boolean hasNext = it.hasNext();
                if (A0B[2].length() != 10) {
                    A0B[6] = "0lb5BUzW8n1EJDWyWAqaA7d0lZJNpkzV";
                    if (!hasNext) {
                        return;
                    }
                } else {
                    A0B[5] = "QJQdkpg5cmGOeaue26HVF3aLtsB2qwfM";
                    if (!hasNext) {
                        return;
                    }
                }
                C5721UB internalNativeAd = it.next();
                internalNativeAd.unregisterView();
            }
        }
    }

    public final void A0K(InterfaceC396912 interfaceC396912) {
        this.A02 = interfaceC396912;
    }

    public final void A0L(C5953Xy c5953Xy, InterfaceC396912 interfaceC396912, InterfaceC5080Jh interfaceC5080Jh, C40191q c40191q, InterfaceC5103K4 interfaceC5103K4) {
        int i;
        this.A02 = interfaceC396912;
        this.A03 = interfaceC5103K4;
        JSONObject A03 = c40191q.A03();
        C44649I A01 = c40191q.A01();
        if (A01 != null) {
            i = A01.A06();
        } else {
            i = 200;
        }
        this.A00 = i;
        A05(C397013.A00(c5953Xy, A03, C5214Lx.A02(A03, A02(106, 2, 85))));
        if (C39510j.A03(c5953Xy, this, interfaceC5080Jh)) {
            c5953Xy.A0D().A41();
            interfaceC396912.ABe(this, C5115KH.A00(AdErrorType.NO_FILL));
        } else if (interfaceC396912 != null) {
            interfaceC396912.ABb(this);
        }
    }

    public final void A0M(Map<String, String> urlParams) {
        if (!A0T()) {
            return;
        }
        if (C5064JR.A1N(this.A09) && C5246MT.A03(urlParams)) {
            String str = A0C;
            if (A0B[4].charAt(15) != 'f') {
                throw new RuntimeException();
            }
            A0B[6] = "D3JUlaax70Z19DqZX7Vx94n8SobUQcIP";
            Log.e(str, A02(27, 31, 116));
            return;
        }
        HashMap hashMap = new HashMap();
        if (urlParams != null) {
            hashMap.putAll(urlParams);
        }
        C5197Lg.A02(this.A09, A02(58, 12, 65));
        InterfaceC396912 interfaceC396912 = this.A02;
        if (interfaceC396912 != null) {
            interfaceC396912.ABa(this);
        }
        if (this.A01.A0h()) {
            hashMap.put(A02(99, 7, 63), String.valueOf(A0E().A04()));
            hashMap.put(A02(92, 7, 73), String.valueOf(A0E().A03()));
        }
        C5953Xy c5953Xy = this.A09;
        AbstractC39470f adAction = C39480g.A00(c5953Xy, c5953Xy.A08(), this.A01.A0Y(), this.A01.A0B(), hashMap);
        if (adAction != null) {
            try {
                adAction.A0C();
            } catch (Exception e) {
                Log.e(A0C, A02(70, 22, 2), e);
            }
        }
    }

    public final void A0N(Map<String, String> map) {
        this.A09.A08().A8u(this.A01.A0Y(), map);
    }

    public final void A0O(Map<String, String> map) {
        if (A0T() && !this.A07) {
            InterfaceC396912 interfaceC396912 = this.A02;
            if (interfaceC396912 != null) {
                interfaceC396912.ABc(this);
            }
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (this.A01.A0h()) {
                hashMap.put(A02(99, 7, 63), String.valueOf(A0E().A04()));
                hashMap.put(A02(92, 7, 73), String.valueOf(A0E().A03()));
            }
            if (!TextUtils.isEmpty(A65())) {
                if (!this.A01.A0h()) {
                    this.A09.A0D().A2Y();
                    C403829.A00(this.A01.A0Z());
                }
                this.A09.A08().A93(A65(), hashMap);
            }
            if (A0V() || A0W()) {
                A06(map, hashMap);
            }
            this.A07 = true;
        }
    }

    public final void A0P(Map<String, String> map) {
        this.A09.A08().A9N(this.A01.A0Y(), map);
    }

    public final void A0Q(Map<String, String> map) {
        this.A09.A08().A9O(this.A01.A0Y(), map);
    }

    public final boolean A0R() {
        return true;
    }

    public final boolean A0S() {
        return A0T() && this.A01.A0B() != null;
    }

    public final boolean A0T() {
        return this.A05 && this.A06;
    }

    public final boolean A0U() {
        return this.A01.A0g();
    }

    public final boolean A0V() {
        if (C5064JR.A0z(this.A09) && A0T()) {
            boolean A0i = this.A01.A0i();
            if (A0B[4].charAt(15) != 'f') {
                throw new RuntimeException();
            }
            A0B[6] = "hsrOxssvGH6abDOIeI9T6FJFSNjQSl4a";
            if (A0i) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0W() {
        if (C5064JR.A0z(this.A09) && A0T()) {
            boolean A0j = this.A01.A0j();
            String[] strArr = A0B;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0B[2] = "qputmJyOXU";
            if (A0j) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39500i
    public final String A65() {
        return this.A01.A0Y();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39500i
    @Nullable
    public final Collection<String> A6O() {
        return A0E().A0e();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39500i
    @Nullable
    public final EnumC39490h A6p() {
        return A0E().A0C();
    }

    public AdPlacementType A7B() {
        return AdPlacementType.NATIVE;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39540n
    public final void onDestroy() {
    }
}
