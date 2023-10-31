package com.vungle.warren.log;

import android.util.Log;
import com.vungle.warren.log.C9831c;
import java.io.File;

/* renamed from: com.vungle.warren.log.i */
/* loaded from: classes3.dex */
public final class C9842i implements C9831c.InterfaceC9832a {

    /* renamed from: a */
    public final /* synthetic */ File f19669a;

    /* renamed from: b */
    public final /* synthetic */ C9840h f19670b;

    public C9842i(C9840h c9840h, File file) {
        this.f19670b = c9840h;
        this.f19669a = file;
    }

    @Override // com.vungle.warren.log.C9831c.InterfaceC9832a
    /* renamed from: a */
    public final void mo1482a() {
        int i = C9840h.f19664g;
        Log.e("h", "Failed to write crash log.");
    }

    @Override // com.vungle.warren.log.C9831c.InterfaceC9832a
    /* renamed from: b */
    public final void mo1481b(File file, int i) {
        StringBuilder sb = new StringBuilder();
        File file2 = this.f19669a;
        sb.append(file2.getName());
        sb.append("_crash");
        this.f19670b.m1491d(file2, sb.toString());
    }
}
