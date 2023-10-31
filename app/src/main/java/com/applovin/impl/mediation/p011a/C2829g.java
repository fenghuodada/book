package com.applovin.impl.mediation.p011a;

import androidx.core.p003os.C0740h;
import com.applovin.impl.mediation.C2980g;

/* renamed from: com.applovin.impl.mediation.a.g */
/* loaded from: classes.dex */
public class C2829g {

    /* renamed from: a */
    private final C2831h f6798a;

    /* renamed from: b */
    private final String f6799b;

    /* renamed from: c */
    private final String f6800c;

    /* renamed from: d */
    private final String f6801d;

    /* renamed from: e */
    private final String f6802e;

    /* renamed from: com.applovin.impl.mediation.a.g$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2830a {
        /* renamed from: a */
        void mo8538a(C2829g c2829g);
    }

    private C2829g(C2831h c2831h, C2980g c2980g, String str, String str2) {
        String str3;
        this.f6798a = c2831h;
        this.f6801d = str;
        this.f6802e = str2;
        if (c2980g != null) {
            this.f6799b = c2980g.m8137h();
            str3 = c2980g.m8135i();
        } else {
            str3 = null;
            this.f6799b = null;
        }
        this.f6800c = str3;
    }

    /* renamed from: a */
    public static C2829g m8704a(C2831h c2831h, C2980g c2980g, String str) {
        if (c2831h != null) {
            if (c2980g != null) {
                return new C2829g(c2831h, c2980g, str, null);
            }
            throw new IllegalArgumentException("No adapterWrapper specified");
        }
        throw new IllegalArgumentException("No spec specified");
    }

    /* renamed from: a */
    public static C2829g m8703a(C2831h c2831h, String str) {
        return m8701b(c2831h, null, str);
    }

    /* renamed from: b */
    public static C2829g m8701b(C2831h c2831h, C2980g c2980g, String str) {
        if (c2831h != null) {
            return new C2829g(c2831h, c2980g, null, str);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    /* renamed from: a */
    public C2831h m8705a() {
        return this.f6798a;
    }

    /* renamed from: b */
    public String m8702b() {
        return this.f6799b;
    }

    /* renamed from: c */
    public String m8700c() {
        return this.f6800c;
    }

    /* renamed from: d */
    public String m8699d() {
        return this.f6801d;
    }

    /* renamed from: e */
    public String m8698e() {
        return this.f6802e;
    }

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.f6798a);
        sb.append(", mSdkVersion='");
        sb.append(this.f6799b);
        sb.append("', mAdapterVersion='");
        sb.append(this.f6800c);
        sb.append("', mSignalDataLength='");
        String str = this.f6801d;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        sb.append(i);
        sb.append("', mErrorMessage=");
        return C0740h.m11848b(sb, this.f6802e, '}');
    }
}
