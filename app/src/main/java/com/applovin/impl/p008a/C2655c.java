package com.applovin.impl.p008a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.C3343r;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.a.c */
/* loaded from: classes.dex */
public class C2655c {

    /* renamed from: a */
    private final List<C2654b> f6277a;

    private C2655c(List<C2654b> list) {
        this.f6277a = list;
    }

    @Nullable
    /* renamed from: a */
    public static C2655c m9251a(C3343r c3343r, @Nullable C2655c c2655c, C2657e c2657e, C3214m c3214m) {
        try {
            List<C2654b> m9252a = c2655c != null ? c2655c.m9252a() : new ArrayList<>();
            for (C3343r c3343r2 : c3343r.m6883a("Verification")) {
                C2654b m9256a = C2654b.m9256a(c3343r2, c2657e, c3214m);
                if (m9256a != null) {
                    m9252a.add(m9256a);
                }
            }
            return new C2655c(m9252a);
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                c3214m.m7487A().m6854b("VastAdVerifications", "Error occurred while initializing", th);
                return null;
            }
            return null;
        }
    }

    /* renamed from: a */
    public List<C2654b> m9252a() {
        return this.f6277a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2655c) {
            return this.f6277a.equals(((C2655c) obj).f6277a);
        }
        return false;
    }

    public int hashCode() {
        return this.f6277a.hashCode();
    }

    @NonNull
    public String toString() {
        return "VastAdVerification{verifications='" + this.f6277a + "'}";
    }
}
