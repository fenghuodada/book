package com.applovin.impl.p008a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0484a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.C3343r;

/* renamed from: com.applovin.impl.a.g */
/* loaded from: classes.dex */
public class C2659g {

    /* renamed from: a */
    private final String f6309a;

    /* renamed from: b */
    private final String f6310b;

    private C2659g(String str, String str2) {
        this.f6309a = str;
        this.f6310b = str2;
    }

    @Nullable
    /* renamed from: a */
    public static C2659g m9235a(C3343r c3343r, C3214m c3214m) {
        if (c3343r != null) {
            if (c3214m != null) {
                try {
                    return new C2659g(c3343r.m6882b().get("apiFramework"), c3343r.m6880c());
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        c3214m.m7487A().m6854b("VastJavaScriptResource", "Error occurred while initializing", th);
                        return null;
                    }
                    return null;
                }
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    /* renamed from: a */
    public String m9236a() {
        return this.f6309a;
    }

    /* renamed from: b */
    public String m9234b() {
        return this.f6310b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2659g c2659g = (C2659g) obj;
        String str = this.f6309a;
        if (str == null ? c2659g.f6309a == null : str.equals(c2659g.f6309a)) {
            String str2 = this.f6310b;
            String str3 = c2659g.f6310b;
            return str2 != null ? str2.equals(str3) : str3 == null;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6309a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6310b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("VastJavaScriptResource{apiFramework='");
        sb.append(this.f6309a);
        sb.append("', javascriptResourceUrl='");
        return C0484a.m12392a(sb, this.f6310b, "'}");
    }
}
