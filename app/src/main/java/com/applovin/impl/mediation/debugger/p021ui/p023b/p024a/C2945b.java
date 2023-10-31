package com.applovin.impl.mediation.debugger.p021ui.p023b.p024a;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c;
import com.applovin.impl.sdk.C3199j;

/* renamed from: com.applovin.impl.mediation.debugger.ui.b.a.b */
/* loaded from: classes.dex */
public class C2945b extends C2957c {

    /* renamed from: a */
    private final C3199j.C3200a f7200a;

    /* renamed from: o */
    private final Context f7201o;

    /* renamed from: p */
    private final boolean f7202p;

    public C2945b(C3199j.C3200a c3200a, boolean z, Context context) {
        super(C2957c.EnumC2960b.RIGHT_DETAIL);
        this.f7200a = c3200a;
        this.f7201o = context;
        this.f7266d = new SpannedString(c3200a.m7516a());
        this.f7202p = z;
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c
    /* renamed from: b */
    public boolean mo8266b() {
        return true;
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c
    /* renamed from: c_ */
    public SpannedString mo8264c_() {
        return new SpannedString(this.f7200a.m7513b(this.f7201o));
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c
    /* renamed from: d_ */
    public boolean mo8263d_() {
        Boolean m7515a = this.f7200a.m7515a(this.f7201o);
        if (m7515a != null) {
            return m7515a.equals(Boolean.valueOf(this.f7202p));
        }
        return false;
    }
}
