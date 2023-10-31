package com.iab.omid.library.applovin.p046b;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.applovin.p049e.C8796a;

/* renamed from: com.iab.omid.library.applovin.b.c */
/* loaded from: classes3.dex */
public class C8778c {

    /* renamed from: a */
    private final C8796a f16700a;

    /* renamed from: b */
    private final String f16701b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f16702c;

    /* renamed from: d */
    private final String f16703d;

    public C8778c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f16700a = new C8796a(view);
        this.f16701b = view.getClass().getCanonicalName();
        this.f16702c = friendlyObstructionPurpose;
        this.f16703d = str;
    }

    /* renamed from: a */
    public C8796a m3111a() {
        return this.f16700a;
    }

    /* renamed from: b */
    public String m3110b() {
        return this.f16701b;
    }

    /* renamed from: c */
    public FriendlyObstructionPurpose m3109c() {
        return this.f16702c;
    }

    /* renamed from: d */
    public String m3108d() {
        return this.f16703d;
    }
}
