package com.google.android.exoplayer2.extractor.flv;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.C6831g;
import com.google.android.exoplayer2.util.C7436v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.flv.c */
/* loaded from: classes.dex */
public final class C6827c extends AbstractC6828d {

    /* renamed from: b */
    public long f11170b;

    /* renamed from: c */
    public long[] f11171c;

    /* renamed from: d */
    public long[] f11172d;

    public C6827c() {
        super(new C6831g());
        this.f11170b = -9223372036854775807L;
        this.f11171c = new long[0];
        this.f11172d = new long[0];
    }

    @Nullable
    /* renamed from: c */
    public static Serializable m5940c(int i, C7436v c7436v) {
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(c7436v.m5008j())).doubleValue());
                                c7436v.m5018A(2);
                                return date;
                            }
                            int m4999s = c7436v.m4999s();
                            ArrayList arrayList = new ArrayList(m4999s);
                            for (int i2 = 0; i2 < m4999s; i2++) {
                                Serializable m5940c = m5940c(c7436v.m5002p(), c7436v);
                                if (m5940c != null) {
                                    arrayList.add(m5940c);
                                }
                            }
                            return arrayList;
                        }
                        return m5939d(c7436v);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String m5938e = m5938e(c7436v);
                        int m5002p = c7436v.m5002p();
                        if (m5002p == 9) {
                            return hashMap;
                        }
                        Serializable m5940c2 = m5940c(m5002p, c7436v);
                        if (m5940c2 != null) {
                            hashMap.put(m5938e, m5940c2);
                        }
                    }
                } else {
                    return m5938e(c7436v);
                }
            } else {
                if (c7436v.m5002p() != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(c7436v.m5008j()));
        }
    }

    /* renamed from: d */
    public static HashMap<String, Object> m5939d(C7436v c7436v) {
        int m4999s = c7436v.m4999s();
        HashMap<String, Object> hashMap = new HashMap<>(m4999s);
        for (int i = 0; i < m4999s; i++) {
            String m5938e = m5938e(c7436v);
            Serializable m5940c = m5940c(c7436v.m5002p(), c7436v);
            if (m5940c != null) {
                hashMap.put(m5938e, m5940c);
            }
        }
        return hashMap;
    }

    /* renamed from: e */
    public static String m5938e(C7436v c7436v) {
        int m4997u = c7436v.m4997u();
        int i = c7436v.f13979b;
        c7436v.m5018A(m4997u);
        return new String(c7436v.f13978a, i, m4997u);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.AbstractC6828d
    /* renamed from: a */
    public final boolean mo5937a(C7436v c7436v) {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.AbstractC6828d
    /* renamed from: b */
    public final boolean mo5936b(long j, C7436v c7436v) {
        if (c7436v.m5002p() != 2 || !"onMetaData".equals(m5938e(c7436v)) || c7436v.m5002p() != 8) {
            return false;
        }
        HashMap<String, Object> m5939d = m5939d(c7436v);
        Object obj = m5939d.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f11170b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = m5939d.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f11171c = new long[size];
                this.f11172d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f11171c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f11172d[i] = ((Double) obj5).longValue();
                    } else {
                        this.f11171c = new long[0];
                        this.f11172d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }
}
