package com.vungle.warren.model;

/* renamed from: com.vungle.warren.model.o */
/* loaded from: classes3.dex */
public final class C9881o {

    /* renamed from: a */
    public final long f19842a;

    /* renamed from: b */
    public final String f19843b;

    /* renamed from: c */
    public final String f19844c;

    /* renamed from: d */
    public final String f19845d;

    public C9881o(long j, String str, String str2, String str3) {
        this.f19842a = j;
        this.f19843b = str;
        this.f19844c = str2;
        this.f19845d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9881o.class != obj.getClass()) {
            return false;
        }
        C9881o c9881o = (C9881o) obj;
        if (this.f19842a != c9881o.f19842a) {
            return false;
        }
        String str = c9881o.f19843b;
        String str2 = this.f19843b;
        if (str2 == null ? str == null : str2.equals(str)) {
            String str3 = c9881o.f19844c;
            String str4 = this.f19844c;
            if (str4 == null ? str3 == null : str4.equals(str3)) {
                String str5 = c9881o.f19845d;
                String str6 = this.f19845d;
                return str6 != null ? str6.equals(str5) : str5 == null;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f19842a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f19843b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19844c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19845d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
