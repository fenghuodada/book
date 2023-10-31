package com.iab.omid.library.adcolony.adsession;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0561g;
import com.adcolony.sdk.C2218o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: com.iab.omid.library.adcolony.adsession.d */
/* loaded from: classes3.dex */
public final class C8714d {

    /* renamed from: a */
    public final C8720j f16534a;

    /* renamed from: b */
    public final WebView f16535b;

    /* renamed from: c */
    public final ArrayList f16536c;

    /* renamed from: d */
    public final HashMap f16537d;

    /* renamed from: e */
    public final String f16538e;

    /* renamed from: f */
    public final String f16539f;
    @Nullable

    /* renamed from: g */
    public final String f16540g;

    /* renamed from: h */
    public final EnumC8715e f16541h;

    public C8714d(C8720j c8720j, C2218o0 c2218o0, String str, ArrayList arrayList, @Nullable String str2, EnumC8715e enumC8715e) {
        ArrayList arrayList2 = new ArrayList();
        this.f16536c = arrayList2;
        this.f16537d = new HashMap();
        this.f16534a = c8720j;
        this.f16535b = c2218o0;
        this.f16538e = str;
        this.f16541h = enumC8715e;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String uuid = UUID.randomUUID().toString();
                this.f16537d.put(uuid, (C8721k) it.next());
            }
        }
        this.f16540g = str2;
        this.f16539f = null;
    }

    /* renamed from: a */
    public static C8714d m3192a(C8720j c8720j, String str, ArrayList arrayList) {
        C0561g.m12182a(c8720j, "Partner is null");
        C0561g.m12182a(str, "OM SDK JS script content is null");
        C0561g.m12182a(arrayList, "VerificationScriptResources is null");
        return new C8714d(c8720j, null, str, arrayList, null, EnumC8715e.NATIVE);
    }
}
