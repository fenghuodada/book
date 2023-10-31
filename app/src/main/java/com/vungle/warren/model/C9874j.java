package com.vungle.warren.model;

import androidx.annotation.Nullable;
import com.google.gson.AbstractC8692o;
import com.google.gson.C8694q;
import com.google.gson.C8695r;

/* renamed from: com.vungle.warren.model.j */
/* loaded from: classes3.dex */
public final class C9874j {
    /* renamed from: a */
    public static boolean m1443a(@Nullable C8695r c8695r, String str, boolean z) {
        return m1441c(c8695r, str) ? c8695r.m3220n().m3213w(str).mo3207b() : z;
    }

    /* renamed from: b */
    public static String m1442b(@Nullable AbstractC8692o abstractC8692o, String str, String str2) {
        return m1441c(abstractC8692o, str) ? abstractC8692o.m3220n().m3213w(str).mo3202p() : str2;
    }

    /* renamed from: c */
    public static boolean m1441c(@Nullable AbstractC8692o abstractC8692o, String str) {
        if (abstractC8692o == null || (abstractC8692o instanceof C8694q) || !(abstractC8692o instanceof C8695r)) {
            return false;
        }
        C8695r m3220n = abstractC8692o.m3220n();
        if (!m3220n.m3219A(str) || m3220n.m3213w(str) == null) {
            return false;
        }
        AbstractC8692o m3213w = m3220n.m3213w(str);
        m3213w.getClass();
        if (m3213w instanceof C8694q) {
            return false;
        }
        return true;
    }
}
