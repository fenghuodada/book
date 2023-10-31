package p060j$.time;

import p060j$.time.temporal.AbstractC10295j;
import p060j$.time.temporal.C10301p;
import p060j$.time.temporal.C10302q;
import p060j$.time.temporal.EnumC10286a;
import p060j$.time.temporal.InterfaceC10296k;
import p060j$.time.temporal.InterfaceC10297l;
import p060j$.time.temporal.InterfaceC10299n;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.ZoneOffset */
/* loaded from: classes2.dex */
public final class ZoneOffset extends AbstractC10282l implements InterfaceC10296k, Comparable<ZoneOffset> {

    /* renamed from: a */
    private final int f20591a;

    /* renamed from: b */
    private final transient String f20592b;

    /* renamed from: c */
    private static final ConcurrentHashMap f20587c = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: d */
    private static final ConcurrentHashMap f20588d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = m1167h(0);

    /* renamed from: e */
    public static final ZoneOffset f20589e = m1167h(-64800);

    /* renamed from: f */
    public static final ZoneOffset f20590f = m1167h(64800);

    private ZoneOffset(int i) {
        String sb;
        this.f20591a = i;
        if (i == 0) {
            sb = "Z";
        } else {
            int abs = Math.abs(i);
            StringBuilder sb2 = new StringBuilder();
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            sb2.append(i < 0 ? "-" : "+");
            sb2.append(i2 < 10 ? "0" : "");
            sb2.append(i2);
            sb2.append(i3 < 10 ? ":0" : ":");
            sb2.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb2.append(i4 >= 10 ? ":" : ":0");
                sb2.append(i4);
            }
            sb = sb2.toString();
        }
        this.f20592b = sb;
    }

    /* renamed from: h */
    public static ZoneOffset m1167h(int i) {
        if (i < -64800 || i > 64800) {
            throw new C10241b("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 == 0) {
            Integer valueOf = Integer.valueOf(i);
            ConcurrentHashMap concurrentHashMap = f20587c;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
            if (zoneOffset == null) {
                concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i));
                ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
                f20588d.putIfAbsent(zoneOffset2.f20592b, zoneOffset2);
                return zoneOffset2;
            }
            return zoneOffset;
        }
        return new ZoneOffset(i);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: a */
    public final C10302q mo1068a(InterfaceC10297l interfaceC10297l) {
        return AbstractC10295j.m1076c(this, interfaceC10297l);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: b */
    public final boolean mo1067b(InterfaceC10297l interfaceC10297l) {
        return interfaceC10297l instanceof EnumC10286a ? interfaceC10297l == EnumC10286a.OFFSET_SECONDS : interfaceC10297l != null && interfaceC10297l.mo1063a(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: c */
    public final long mo1066c(InterfaceC10297l interfaceC10297l) {
        if (interfaceC10297l == EnumC10286a.OFFSET_SECONDS) {
            return this.f20591a;
        }
        if (interfaceC10297l instanceof EnumC10286a) {
            throw new C10301p("Unsupported field: " + interfaceC10297l);
        }
        return interfaceC10297l.mo1060d(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f20591a - this.f20591a;
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: d */
    public final Object mo1065d(InterfaceC10299n interfaceC10299n) {
        return (interfaceC10299n == AbstractC10295j.m1072g() || interfaceC10299n == AbstractC10295j.m1070i()) ? this : AbstractC10295j.m1077b(this, interfaceC10299n);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: e */
    public final int mo1064e(EnumC10286a enumC10286a) {
        if (enumC10286a == EnumC10286a.OFFSET_SECONDS) {
            return this.f20591a;
        }
        if (enumC10286a instanceof EnumC10286a) {
            throw new C10301p("Unsupported field: " + enumC10286a);
        }
        return AbstractC10295j.m1076c(this, enumC10286a).m1058a(mo1066c(enumC10286a), enumC10286a);
    }

    @Override // p060j$.time.AbstractC10282l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            return this.f20591a == ((ZoneOffset) obj).f20591a;
        }
        return false;
    }

    @Override // p060j$.time.AbstractC10282l
    /* renamed from: f */
    public final String mo1094f() {
        return this.f20592b;
    }

    /* renamed from: g */
    public final int m1168g() {
        return this.f20591a;
    }

    @Override // p060j$.time.AbstractC10282l
    public final int hashCode() {
        return this.f20591a;
    }

    @Override // p060j$.time.AbstractC10282l
    public final String toString() {
        return this.f20592b;
    }
}
