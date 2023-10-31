package androidx.core.provider;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.util.List;

/* renamed from: androidx.core.provider.h */
/* loaded from: classes.dex */
public final class C0762h {

    /* renamed from: a */
    public final String f2439a;

    /* renamed from: b */
    public final String f2440b;

    /* renamed from: c */
    public final String f2441c;

    /* renamed from: d */
    public final List<List<byte[]>> f2442d;

    /* renamed from: e */
    public final String f2443e;

    public C0762h(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        str.getClass();
        this.f2439a = str;
        str2.getClass();
        this.f2440b = str2;
        this.f2441c = str3;
        list.getClass();
        this.f2442d = list;
        this.f2443e = C0761g.m11824a(str, "-", str2, "-", str3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2439a + ", mProviderPackage: " + this.f2440b + ", mQuery: " + this.f2441c + ", mCertificates:");
        int i = 0;
        while (true) {
            List<List<byte[]>> list = this.f2442d;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List<byte[]> list2 = list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
