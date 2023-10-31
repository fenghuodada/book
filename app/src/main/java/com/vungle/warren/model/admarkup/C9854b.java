package com.vungle.warren.model.admarkup;

import androidx.annotation.Nullable;
import androidx.core.p003os.C0740h;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.gson.AbstractC8692o;
import com.google.gson.C8688k;
import com.google.gson.C8690m;
import com.google.gson.C8695r;
import com.google.gson.C8703x;
import com.vungle.warren.model.C9874j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.vungle.warren.model.admarkup.b */
/* loaded from: classes3.dex */
public final class C9854b extends AbstractC9853a {

    /* renamed from: b */
    public final String f19810b;

    public C9854b(String str, String[] strArr) {
        this.f19810b = str;
        this.f19809a = strArr;
    }

    @Nullable
    /* renamed from: c */
    public static C9854b m1453c(String str) {
        ArrayList arrayList;
        if (str == null) {
            return null;
        }
        try {
            C8695r c8695r = (C8695r) new C8688k().m3226a().m3235c(C8695r.class, str);
            if (c8695r == null) {
                return null;
            }
            if (C9874j.m1441c(c8695r, AdSDKNotificationListener.IMPRESSION_EVENT)) {
                C8690m m3212y = c8695r.m3212y(AdSDKNotificationListener.IMPRESSION_EVENT);
                m3212y.getClass();
                arrayList = new ArrayList();
                Iterator<AbstractC8692o> it = m3212y.m3221m().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().mo3202p());
                }
            } else {
                arrayList = null;
            }
            return new C9854b(C9874j.m1442b(c8695r, "event_id", null), arrayList != null ? (String[]) arrayList.toArray(new String[0]) : null);
        } catch (C8703x unused) {
            return null;
        }
    }

    @Override // com.vungle.warren.model.admarkup.AbstractC9853a
    /* renamed from: a */
    public final String mo1452a() {
        return this.f19810b;
    }

    @Override // com.vungle.warren.model.admarkup.AbstractC9853a
    /* renamed from: b */
    public final int mo1451b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9854b.class != obj.getClass()) {
            return false;
        }
        String str = ((C9854b) obj).f19810b;
        String str2 = this.f19810b;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public final int hashCode() {
        String str = this.f19810b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("    AdMarkup {eventId='");
        sb.append(this.f19810b);
        sb.append("', impression=");
        return C0740h.m11848b(sb, Arrays.toString(this.f19809a), '}');
    }
}
