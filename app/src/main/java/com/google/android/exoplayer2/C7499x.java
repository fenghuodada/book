package com.google.android.exoplayer2;

import androidx.activity.result.C0054a;
import androidx.activity.result.InterfaceC0056b;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.C7417m;
import com.permissionx.guolindev.request.C8986p;
import com.permissionx.guolindev.request.C8991u;
import kotlin.jvm.internal.C10843j;

/* renamed from: com.google.android.exoplayer2.x */
/* loaded from: classes.dex */
public final /* synthetic */ class C7499x implements C7417m.InterfaceC7418a, InterfaceC0056b {

    /* renamed from: b */
    public final /* synthetic */ int f14225b;

    /* renamed from: c */
    public final /* synthetic */ Object f14226c;

    public /* synthetic */ C7499x(Object obj, int i) {
        this.f14225b = i;
        this.f14226c = obj;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public final void invoke(Object obj) {
        switch (this.f14225b) {
            case 0:
                ((Player.InterfaceC6626b) obj).onAvailableCommandsChanged(((C6968g0) this.f14226c).f12036B);
                return;
            default:
                ((AnalyticsListener) obj).m6206D();
                return;
        }
    }

    @Override // androidx.activity.result.InterfaceC0056b
    public final void onActivityResult(Object obj) {
        C8991u this$0 = (C8991u) this.f14226c;
        C0054a c0054a = (C0054a) obj;
        int i = C8991u.f17160l;
        C10843j.m430f(this$0, "this$0");
        this$0.m2825j(new C8986p(this$0));
    }
}
