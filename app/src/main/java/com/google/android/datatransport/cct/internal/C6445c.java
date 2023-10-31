package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0484a;

/* renamed from: com.google.android.datatransport.cct.internal.c */
/* loaded from: classes.dex */
public final class C6445c extends AbstractC6437a {

    /* renamed from: a */
    public final Integer f10117a;

    /* renamed from: b */
    public final String f10118b;

    /* renamed from: c */
    public final String f10119c;

    /* renamed from: d */
    public final String f10120d;

    /* renamed from: e */
    public final String f10121e;

    /* renamed from: f */
    public final String f10122f;

    /* renamed from: g */
    public final String f10123g;

    /* renamed from: h */
    public final String f10124h;

    /* renamed from: i */
    public final String f10125i;

    /* renamed from: j */
    public final String f10126j;

    /* renamed from: k */
    public final String f10127k;

    /* renamed from: l */
    public final String f10128l;

    public C6445c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f10117a = num;
        this.f10118b = str;
        this.f10119c = str2;
        this.f10120d = str3;
        this.f10121e = str4;
        this.f10122f = str5;
        this.f10123g = str6;
        this.f10124h = str7;
        this.f10125i = str8;
        this.f10126j = str9;
        this.f10127k = str10;
        this.f10128l = str11;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6437a
    @Nullable
    /* renamed from: a */
    public final String mo6349a() {
        return this.f10128l;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6437a
    @Nullable
    /* renamed from: b */
    public final String mo6348b() {
        return this.f10126j;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6437a
    @Nullable
    /* renamed from: c */
    public final String mo6347c() {
        return this.f10120d;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6437a
    @Nullable
    /* renamed from: d */
    public final String mo6346d() {
        return this.f10124h;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6437a
    @Nullable
    /* renamed from: e */
    public final String mo6345e() {
        return this.f10119c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6437a) {
            AbstractC6437a abstractC6437a = (AbstractC6437a) obj;
            Integer num = this.f10117a;
            if (num != null ? num.equals(abstractC6437a.mo6338l()) : abstractC6437a.mo6338l() == null) {
                String str = this.f10118b;
                if (str != null ? str.equals(abstractC6437a.mo6341i()) : abstractC6437a.mo6341i() == null) {
                    String str2 = this.f10119c;
                    if (str2 != null ? str2.equals(abstractC6437a.mo6345e()) : abstractC6437a.mo6345e() == null) {
                        String str3 = this.f10120d;
                        if (str3 != null ? str3.equals(abstractC6437a.mo6347c()) : abstractC6437a.mo6347c() == null) {
                            String str4 = this.f10121e;
                            if (str4 != null ? str4.equals(abstractC6437a.mo6339k()) : abstractC6437a.mo6339k() == null) {
                                String str5 = this.f10122f;
                                if (str5 != null ? str5.equals(abstractC6437a.mo6340j()) : abstractC6437a.mo6340j() == null) {
                                    String str6 = this.f10123g;
                                    if (str6 != null ? str6.equals(abstractC6437a.mo6343g()) : abstractC6437a.mo6343g() == null) {
                                        String str7 = this.f10124h;
                                        if (str7 != null ? str7.equals(abstractC6437a.mo6346d()) : abstractC6437a.mo6346d() == null) {
                                            String str8 = this.f10125i;
                                            if (str8 != null ? str8.equals(abstractC6437a.mo6344f()) : abstractC6437a.mo6344f() == null) {
                                                String str9 = this.f10126j;
                                                if (str9 != null ? str9.equals(abstractC6437a.mo6348b()) : abstractC6437a.mo6348b() == null) {
                                                    String str10 = this.f10127k;
                                                    if (str10 != null ? str10.equals(abstractC6437a.mo6342h()) : abstractC6437a.mo6342h() == null) {
                                                        String str11 = this.f10128l;
                                                        String mo6349a = abstractC6437a.mo6349a();
                                                        if (str11 == null) {
                                                            if (mo6349a == null) {
                                                                return true;
                                                            }
                                                        } else if (str11.equals(mo6349a)) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6437a
    @Nullable
    /* renamed from: f */
    public final String mo6344f() {
        return this.f10125i;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6437a
    @Nullable
    /* renamed from: g */
    public final String mo6343g() {
        return this.f10123g;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6437a
    @Nullable
    /* renamed from: h */
    public final String mo6342h() {
        return this.f10127k;
    }

    public final int hashCode() {
        Integer num = this.f10117a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f10118b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f10119c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10120d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f10121e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f10122f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f10123g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f10124h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f10125i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f10126j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f10127k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f10128l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6437a
    @Nullable
    /* renamed from: i */
    public final String mo6341i() {
        return this.f10118b;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6437a
    @Nullable
    /* renamed from: j */
    public final String mo6340j() {
        return this.f10122f;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6437a
    @Nullable
    /* renamed from: k */
    public final String mo6339k() {
        return this.f10121e;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6437a
    @Nullable
    /* renamed from: l */
    public final Integer mo6338l() {
        return this.f10117a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f10117a);
        sb.append(", model=");
        sb.append(this.f10118b);
        sb.append(", hardware=");
        sb.append(this.f10119c);
        sb.append(", device=");
        sb.append(this.f10120d);
        sb.append(", product=");
        sb.append(this.f10121e);
        sb.append(", osBuild=");
        sb.append(this.f10122f);
        sb.append(", manufacturer=");
        sb.append(this.f10123g);
        sb.append(", fingerprint=");
        sb.append(this.f10124h);
        sb.append(", locale=");
        sb.append(this.f10125i);
        sb.append(", country=");
        sb.append(this.f10126j);
        sb.append(", mccMnc=");
        sb.append(this.f10127k);
        sb.append(", applicationBuild=");
        return C0484a.m12392a(sb, this.f10128l, "}");
    }
}
