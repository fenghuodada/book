package com.vungle.warren.utility;

import android.content.Context;
import android.content.Intent;
import com.vungle.warren.p058ui.C10011f;
import com.vungle.warren.p058ui.InterfaceC10009e;
import com.vungle.warren.utility.C10069a;
import java.lang.ref.WeakReference;

/* renamed from: com.vungle.warren.utility.b */
/* loaded from: classes3.dex */
public final class C10077b extends C10069a.C10075f {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f20299a;

    /* renamed from: b */
    public final /* synthetic */ Intent f20300b;

    /* renamed from: c */
    public final /* synthetic */ Intent f20301c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC10009e f20302d;

    /* renamed from: e */
    public final /* synthetic */ C10069a.InterfaceC10074e f20303e;

    public C10077b(WeakReference weakReference, Intent intent, Intent intent2, InterfaceC10009e interfaceC10009e, C10011f c10011f) {
        this.f20299a = weakReference;
        this.f20300b = intent;
        this.f20301c = intent2;
        this.f20302d = interfaceC10009e;
        this.f20303e = c10011f;
    }

    @Override // com.vungle.warren.utility.C10069a.C10075f
    /* renamed from: c */
    public final void mo1279c() {
        C10069a c10069a = C10069a.f20278j;
        c10069a.f20282d.remove(this);
        Context context = (Context) this.f20299a.get();
        if (context != null) {
            if (C10069a.m1285c(context, this.f20300b, this.f20301c, this.f20302d)) {
                c10069a.m1286b(this.f20303e);
            }
        }
    }
}
