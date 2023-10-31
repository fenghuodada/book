package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* renamed from: com.google.android.datatransport.cct.internal.g */
/* loaded from: classes.dex */
public final class C6450g extends AbstractC6458m {

    /* renamed from: a */
    public final long f10146a;

    /* renamed from: b */
    public final long f10147b;

    /* renamed from: c */
    public final AbstractC6454k f10148c;

    /* renamed from: d */
    public final Integer f10149d;

    /* renamed from: e */
    public final String f10150e;

    /* renamed from: f */
    public final List<AbstractC6456l> f10151f;

    /* renamed from: g */
    public final EnumC6463p f10152g;

    public C6450g() {
        throw null;
    }

    public C6450g(long j, long j2, AbstractC6454k abstractC6454k, Integer num, String str, List list, EnumC6463p enumC6463p) {
        this.f10146a = j;
        this.f10147b = j2;
        this.f10148c = abstractC6454k;
        this.f10149d = num;
        this.f10150e = str;
        this.f10151f = list;
        this.f10152g = enumC6463p;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6458m
    @Nullable
    /* renamed from: a */
    public final AbstractC6454k mo6327a() {
        return this.f10148c;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6458m
    @Nullable
    @Encodable.Field(name = "logEvent")
    /* renamed from: b */
    public final List<AbstractC6456l> mo6326b() {
        return this.f10151f;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6458m
    @Nullable
    /* renamed from: c */
    public final Integer mo6325c() {
        return this.f10149d;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6458m
    @Nullable
    /* renamed from: d */
    public final String mo6324d() {
        return this.f10150e;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6458m
    @Nullable
    /* renamed from: e */
    public final EnumC6463p mo6323e() {
        return this.f10152g;
    }

    public final boolean equals(Object obj) {
        AbstractC6454k abstractC6454k;
        Integer num;
        String str;
        List<AbstractC6456l> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6458m) {
            AbstractC6458m abstractC6458m = (AbstractC6458m) obj;
            if (this.f10146a == abstractC6458m.mo6322f() && this.f10147b == abstractC6458m.mo6321g() && ((abstractC6454k = this.f10148c) != null ? abstractC6454k.equals(abstractC6458m.mo6327a()) : abstractC6458m.mo6327a() == null) && ((num = this.f10149d) != null ? num.equals(abstractC6458m.mo6325c()) : abstractC6458m.mo6325c() == null) && ((str = this.f10150e) != null ? str.equals(abstractC6458m.mo6324d()) : abstractC6458m.mo6324d() == null) && ((list = this.f10151f) != null ? list.equals(abstractC6458m.mo6326b()) : abstractC6458m.mo6326b() == null)) {
                EnumC6463p enumC6463p = this.f10152g;
                EnumC6463p mo6323e = abstractC6458m.mo6323e();
                if (enumC6463p == null) {
                    if (mo6323e == null) {
                        return true;
                    }
                } else if (enumC6463p.equals(mo6323e)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6458m
    /* renamed from: f */
    public final long mo6322f() {
        return this.f10146a;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6458m
    /* renamed from: g */
    public final long mo6321g() {
        return this.f10147b;
    }

    public final int hashCode() {
        long j = this.f10146a;
        long j2 = this.f10147b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        AbstractC6454k abstractC6454k = this.f10148c;
        int hashCode = (i ^ (abstractC6454k == null ? 0 : abstractC6454k.hashCode())) * 1000003;
        Integer num = this.f10149d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f10150e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC6456l> list = this.f10151f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC6463p enumC6463p = this.f10152g;
        return hashCode4 ^ (enumC6463p != null ? enumC6463p.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f10146a + ", requestUptimeMs=" + this.f10147b + ", clientInfo=" + this.f10148c + ", logSource=" + this.f10149d + ", logSourceName=" + this.f10150e + ", logEvents=" + this.f10151f + ", qosTier=" + this.f10152g + "}";
    }
}
