package com.applovin.impl.mediation.debugger.p017b.p018a;

import com.applovin.impl.mediation.debugger.p017b.p019b.C2911b;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.d */
/* loaded from: classes.dex */
public class C2908d implements Comparable<C2908d> {

    /* renamed from: a */
    private final String f7065a;

    /* renamed from: b */
    private final String f7066b;

    /* renamed from: c */
    private final boolean f7067c;

    /* renamed from: d */
    private final C2911b f7068d;

    public C2908d(String str, String str2, boolean z, C2911b c2911b) {
        this.f7065a = str;
        this.f7066b = str2;
        this.f7067c = z;
        this.f7068d = c2911b;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C2908d c2908d) {
        return this.f7066b.compareToIgnoreCase(c2908d.f7066b);
    }

    /* renamed from: a */
    public String m8412a() {
        return this.f7065a;
    }

    /* renamed from: b */
    public String m8410b() {
        return this.f7066b;
    }

    /* renamed from: c */
    public C2911b m8409c() {
        return this.f7068d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2908d c2908d = (C2908d) obj;
        String str = this.f7065a;
        if (str == null ? c2908d.f7065a == null : str.equals(c2908d.f7065a)) {
            String str2 = this.f7066b;
            if (str2 == null ? c2908d.f7066b == null : str2.equals(c2908d.f7066b)) {
                return this.f7067c == c2908d.f7067c;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f7065a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7066b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f7067c ? 1 : 0);
    }
}
