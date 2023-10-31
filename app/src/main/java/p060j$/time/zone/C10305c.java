package p060j$.time.zone;

import java.io.Serializable;
import java.util.Arrays;
import p060j$.time.AbstractC10240a;
import p060j$.time.C10253f;
import p060j$.time.Instant;
import p060j$.time.ZoneOffset;
import p060j$.util.AbstractC10331a;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.zone.c */
/* loaded from: classes2.dex */
public final class C10305c implements Serializable {

    /* renamed from: g */
    private static final long[] f20700g = new long[0];

    /* renamed from: h */
    private static final AbstractC10304b[] f20701h = new AbstractC10304b[0];

    /* renamed from: a */
    private final long[] f20702a;

    /* renamed from: b */
    private final ZoneOffset[] f20703b;

    /* renamed from: c */
    private final long[] f20704c;

    /* renamed from: d */
    private final ZoneOffset[] f20705d;

    /* renamed from: e */
    private final AbstractC10304b[] f20706e;

    /* renamed from: f */
    private final transient ConcurrentHashMap f20707f = new ConcurrentHashMap();

    private C10305c(ZoneOffset zoneOffset) {
        this.f20703b = r0;
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        long[] jArr = f20700g;
        this.f20702a = jArr;
        this.f20704c = jArr;
        this.f20705d = zoneOffsetArr;
        this.f20706e = f20701h;
    }

    /* renamed from: c */
    public static C10305c m1043c(ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            return new C10305c(zoneOffset);
        }
        throw new NullPointerException("offset");
    }

    /* renamed from: a */
    public final ZoneOffset m1045a(Instant instant) {
        long[] jArr = this.f20704c;
        if (jArr.length == 0) {
            return this.f20703b[0];
        }
        long m1182h = instant.m1182h();
        AbstractC10304b[] abstractC10304bArr = this.f20706e;
        int length = abstractC10304bArr.length;
        ZoneOffset[] zoneOffsetArr = this.f20705d;
        if (length <= 0 || m1182h <= jArr[jArr.length - 1]) {
            int binarySearch = Arrays.binarySearch(jArr, m1182h);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            return zoneOffsetArr[binarySearch + 1];
        }
        int m1150l = C10253f.m1147o(AbstractC10240a.m1160g(zoneOffsetArr[zoneOffsetArr.length - 1].m1168g() + m1182h, 86400L)).m1150l();
        Integer valueOf = Integer.valueOf(m1150l);
        ConcurrentHashMap concurrentHashMap = this.f20707f;
        AbstractC10303a[] abstractC10303aArr = (AbstractC10303a[]) concurrentHashMap.get(valueOf);
        AbstractC10303a abstractC10303a = null;
        if (abstractC10303aArr == null) {
            abstractC10303aArr = new AbstractC10303a[abstractC10304bArr.length];
            if (abstractC10304bArr.length > 0) {
                AbstractC10304b abstractC10304b = abstractC10304bArr[0];
                throw null;
            } else if (m1150l < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, abstractC10303aArr);
            }
        }
        for (int i = 0; i < abstractC10303aArr.length; i++) {
            abstractC10303a = abstractC10303aArr[i];
            if (m1182h < abstractC10303a.m1046c()) {
                return abstractC10303a.m1047b();
            }
        }
        return abstractC10303a.m1048a();
    }

    /* renamed from: b */
    public final boolean m1044b() {
        return this.f20704c.length == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10305c) {
            C10305c c10305c = (C10305c) obj;
            c10305c.getClass();
            return AbstractC10331a.m1003u(null, null) && Arrays.equals(this.f20702a, c10305c.f20702a) && Arrays.equals(this.f20703b, c10305c.f20703b) && Arrays.equals(this.f20704c, c10305c.f20704c) && Arrays.equals(this.f20705d, c10305c.f20705d) && Arrays.equals(this.f20706e, c10305c.f20706e);
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f20702a) ^ 0) ^ Arrays.hashCode(this.f20703b)) ^ Arrays.hashCode(this.f20704c)) ^ Arrays.hashCode(this.f20705d)) ^ Arrays.hashCode(this.f20706e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZoneRules[currentStandardOffset=");
        ZoneOffset[] zoneOffsetArr = this.f20703b;
        sb.append(zoneOffsetArr[zoneOffsetArr.length - 1]);
        sb.append("]");
        return sb.toString();
    }
}
