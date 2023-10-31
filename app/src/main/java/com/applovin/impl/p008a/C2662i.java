package com.applovin.impl.p008a;

import androidx.annotation.NonNull;
import androidx.concurrent.futures.C0484a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.C3343r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.unity3d.ads.metadata.MediationMetaData;

/* renamed from: com.applovin.impl.a.i */
/* loaded from: classes.dex */
public class C2662i {

    /* renamed from: a */
    private String f6319a;

    /* renamed from: b */
    private String f6320b;

    private C2662i() {
    }

    /* renamed from: a */
    public static C2662i m9226a(C3343r c3343r, C2662i c2662i, C3214m c3214m) {
        if (c3343r != null) {
            if (c3214m != null) {
                if (c2662i == null) {
                    try {
                        c2662i = new C2662i();
                    } catch (Throwable th) {
                        if (C3349v.m6862a()) {
                            c3214m.m7487A().m6854b("VastSystemInfo", "Error occurred while initializing", th);
                            return null;
                        }
                        return null;
                    }
                }
                if (!StringUtils.isValidString(c2662i.f6319a)) {
                    String m6880c = c3343r.m6880c();
                    if (StringUtils.isValidString(m6880c)) {
                        c2662i.f6319a = m6880c;
                    }
                }
                if (!StringUtils.isValidString(c2662i.f6320b)) {
                    String str = c3343r.m6882b().get(MediationMetaData.KEY_VERSION);
                    if (StringUtils.isValidString(str)) {
                        c2662i.f6320b = str;
                    }
                }
                return c2662i;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2662i) {
            C2662i c2662i = (C2662i) obj;
            String str = this.f6319a;
            if (str == null ? c2662i.f6319a == null : str.equals(c2662i.f6319a)) {
                String str2 = this.f6320b;
                String str3 = c2662i.f6320b;
                return str2 != null ? str2.equals(str3) : str3 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6319a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6320b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("VastSystemInfo{name='");
        sb.append(this.f6319a);
        sb.append("', version='");
        return C0484a.m12392a(sb, this.f6320b, "'}");
    }
}
