package com.google.android.exoplayer2;

import androidx.activity.result.InterfaceC0056b;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.C7409h;
import com.google.android.exoplayer2.util.C7417m;
import com.permissionx.guolindev.request.C8987q;
import com.permissionx.guolindev.request.C8991u;
import java.util.Map;
import kotlin.jvm.internal.C10843j;

/* renamed from: com.google.android.exoplayer2.u */
/* loaded from: classes.dex */
public final /* synthetic */ class C7309u implements C7417m.InterfaceC7419b, InterfaceC0056b {

    /* renamed from: b */
    public final /* synthetic */ Object f13481b;

    public /* synthetic */ C7309u(Object obj) {
        this.f13481b = obj;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7419b
    /* renamed from: b */
    public final void mo5058b(Object obj, C7409h c7409h) {
        ((Player.InterfaceC6626b) obj).onEvents((Player) this.f13481b, new Player.C6627c(c7409h));
    }

    @Override // androidx.activity.result.InterfaceC0056b
    public final void onActivityResult(Object obj) {
        C8991u this$0 = (C8991u) this.f13481b;
        int i = C8991u.f17160l;
        C10843j.m430f(this$0, "this$0");
        this$0.m2825j(new C8987q(this$0, (Map) obj));
    }
}
