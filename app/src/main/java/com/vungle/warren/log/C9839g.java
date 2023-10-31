package com.vungle.warren.log;

import android.util.Log;
import com.vungle.warren.log.C9831c;
import com.vungle.warren.log.C9835f;
import java.io.File;

/* renamed from: com.vungle.warren.log.g */
/* loaded from: classes3.dex */
public final class C9839g implements C9831c.InterfaceC9832a {

    /* renamed from: a */
    public final /* synthetic */ C9840h f19663a;

    public C9839g(C9840h c9840h) {
        this.f19663a = c9840h;
    }

    @Override // com.vungle.warren.log.C9831c.InterfaceC9832a
    /* renamed from: a */
    public final void mo1482a() {
        int i = C9840h.f19664g;
        Log.e("h", "Failed to write sdk logs.");
    }

    @Override // com.vungle.warren.log.C9831c.InterfaceC9832a
    /* renamed from: b */
    public final void mo1481b(File file, int i) {
        C9840h c9840h = this.f19663a;
        if (i >= c9840h.f19667f) {
            File file2 = c9840h.f19666e;
            if (c9840h.m1491d(file2, file.getName() + "_pending")) {
                c9840h.f19666e = c9840h.m1484e();
                C9835f.InterfaceC9838c interfaceC9838c = c9840h.f19665d;
                if (interfaceC9838c != null) {
                    C9835f.this.m1486c();
                }
            }
        }
    }
}
