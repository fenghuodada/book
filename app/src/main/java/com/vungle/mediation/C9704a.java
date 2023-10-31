package com.vungle.mediation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.vungle.mediation.a */
/* loaded from: classes3.dex */
public final class C9704a {

    /* renamed from: com.vungle.mediation.a$a */
    /* loaded from: classes3.dex */
    public static class C9705a {

        /* renamed from: a */
        public String f19239a;

        /* renamed from: b */
        public String f19240b;
    }

    @NonNull
    /* renamed from: a */
    public static C9705a m1661a(@Nullable Bundle bundle, @NonNull String str) {
        String str2;
        if (bundle != null && bundle.containsKey("uniqueVungleRequestKey")) {
            str2 = bundle.getString("uniqueVungleRequestKey");
        } else {
            str2 = null;
        }
        C9705a c9705a = new C9705a();
        c9705a.f19239a = str;
        c9705a.f19240b = str2;
        return c9705a;
    }
}
