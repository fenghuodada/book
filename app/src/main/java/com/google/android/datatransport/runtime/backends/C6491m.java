package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.google.android.datatransport.runtime.backends.m */
/* loaded from: classes.dex */
public final class C6491m implements InterfaceC6483e {

    /* renamed from: a */
    public final C6492a f10216a;

    /* renamed from: b */
    public final C6489k f10217b;

    /* renamed from: c */
    public final HashMap f10218c;

    /* renamed from: com.google.android.datatransport.runtime.backends.m$a */
    /* loaded from: classes.dex */
    public static class C6492a {

        /* renamed from: a */
        public final Context f10219a;

        /* renamed from: b */
        public Map<String, String> f10220b = null;

        public C6492a(Context context) {
            this.f10219a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
        @androidx.annotation.Nullable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.google.android.datatransport.runtime.backends.InterfaceC6482d m6304a(java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 242
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.backends.C6491m.C6492a.m6304a(java.lang.String):com.google.android.datatransport.runtime.backends.d");
        }
    }

    @Inject
    public C6491m(Context context, C6489k c6489k) {
        C6492a c6492a = new C6492a(context);
        this.f10218c = new HashMap();
        this.f10216a = c6492a;
        this.f10217b = c6489k;
    }

    @Override // com.google.android.datatransport.runtime.backends.InterfaceC6483e
    @Nullable
    public final synchronized InterfaceC6494o get(String str) {
        if (this.f10218c.containsKey(str)) {
            return (InterfaceC6494o) this.f10218c.get(str);
        }
        InterfaceC6482d m6304a = this.f10216a.m6304a(str);
        if (m6304a == null) {
            return null;
        }
        C6489k c6489k = this.f10217b;
        InterfaceC6494o create = m6304a.create(new C6481c(c6489k.f10210a, c6489k.f10211b, c6489k.f10212c, str));
        this.f10218c.put(str, create);
        return create;
    }
}
