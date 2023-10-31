package com.applovin.impl.p008a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.C3343r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.applovin.impl.a.b */
/* loaded from: classes.dex */
public class C2654b {

    /* renamed from: a */
    private final String f6273a;

    /* renamed from: b */
    private final List<C2659g> f6274b;

    /* renamed from: c */
    private final String f6275c;

    /* renamed from: d */
    private final Set<C2663j> f6276d;

    private C2654b(String str, List<C2659g> list, String str2, Set<C2663j> set) {
        this.f6273a = str;
        this.f6274b = list;
        this.f6275c = str2;
        this.f6276d = set;
    }

    @Nullable
    /* renamed from: a */
    public static C2654b m9256a(C3343r c3343r, C2657e c2657e, C3214m c3214m) {
        try {
            String str = c3343r.m6882b().get("vendor");
            C3343r m6879c = c3343r.m6879c("VerificationParameters");
            String m6880c = m6879c != null ? m6879c.m6880c() : null;
            List<C3343r> m6883a = c3343r.m6883a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(m6883a.size());
            for (C3343r c3343r2 : m6883a) {
                C2659g m9235a = C2659g.m9235a(c3343r2, c3214m);
                if (m9235a != null) {
                    arrayList.add(m9235a);
                }
            }
            HashMap hashMap = new HashMap();
            C2665l.m9212a(c3343r, hashMap, c2657e, c3214m);
            return new C2654b(str, arrayList, m6880c, (Set) hashMap.get("verificationNotExecuted"));
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                c3214m.m7487A().m6854b("VastAdVerification", "Error occurred while initializing", th);
            }
            return null;
        }
    }

    /* renamed from: a */
    public String m9257a() {
        return this.f6273a;
    }

    /* renamed from: b */
    public List<C2659g> m9255b() {
        return this.f6274b;
    }

    /* renamed from: c */
    public String m9254c() {
        return this.f6275c;
    }

    /* renamed from: d */
    public Set<C2663j> m9253d() {
        return this.f6276d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2654b c2654b = (C2654b) obj;
        String str = this.f6273a;
        if (str == null ? c2654b.f6273a == null : str.equals(c2654b.f6273a)) {
            List<C2659g> list = this.f6274b;
            if (list == null ? c2654b.f6274b == null : list.equals(c2654b.f6274b)) {
                String str2 = this.f6275c;
                if (str2 == null ? c2654b.f6275c == null : str2.equals(c2654b.f6275c)) {
                    Set<C2663j> set = this.f6276d;
                    Set<C2663j> set2 = c2654b.f6276d;
                    return set != null ? set.equals(set2) : set2 == null;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6273a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<C2659g> list = this.f6274b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f6275c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set<C2663j> set = this.f6276d;
        return hashCode3 + (set != null ? set.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        return "VastAdVerification{vendorId='" + this.f6273a + "'javascriptResources='" + this.f6274b + "'verificationParameters='" + this.f6275c + "'errorEventTrackers='" + this.f6276d + "'}";
    }
}
