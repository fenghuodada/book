package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.google.android.exoplayer2.util.C7394a;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class DataSpec {

    /* renamed from: a */
    public final Uri f13712a;

    /* renamed from: b */
    public final long f13713b;

    /* renamed from: c */
    public final int f13714c;
    @Nullable

    /* renamed from: d */
    public final byte[] f13715d;

    /* renamed from: e */
    public final Map<String, String> f13716e;

    /* renamed from: f */
    public final long f13717f;

    /* renamed from: g */
    public final long f13718g;
    @Nullable

    /* renamed from: h */
    public final String f13719h;

    /* renamed from: i */
    public final int f13720i;
    @Nullable

    /* renamed from: j */
    public final Object f13721j;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Flags {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface HttpMethod {
    }

    public DataSpec(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        boolean z = true;
        C7394a.m5134a(j + j2 >= 0);
        C7394a.m5134a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C7394a.m5134a(z);
        this.f13712a = uri;
        this.f13713b = j;
        this.f13714c = i;
        this.f13715d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f13716e = Collections.unmodifiableMap(new HashMap(map));
        this.f13717f = j2;
        this.f13718g = j3;
        this.f13719h = str;
        this.f13720i = i2;
        this.f13721j = obj;
    }

    public final String toString() {
        String str;
        int i = this.f13714c;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str = "POST";
            }
        } else {
            str = "GET";
        }
        String valueOf = String.valueOf(this.f13712a);
        int length = valueOf.length() + str.length() + 70;
        String str2 = this.f13719h;
        StringBuilder m9043a = C2745h.m9043a(C0552c.m12193a(str2, length), "DataSpec[", str, " ", valueOf);
        m9043a.append(", ");
        m9043a.append(this.f13717f);
        m9043a.append(", ");
        m9043a.append(this.f13718g);
        m9043a.append(", ");
        m9043a.append(str2);
        m9043a.append(", ");
        return C0539e.m12264b(m9043a, this.f13720i, "]");
    }
}
