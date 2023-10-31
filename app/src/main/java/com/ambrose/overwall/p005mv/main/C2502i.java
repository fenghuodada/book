package com.ambrose.overwall.p005mv.main;

import cn.hutool.core.codec.C2026c;
import io.reactivex.rxjava3.android.schedulers.C10142b;
import io.reactivex.rxjava3.functions.InterfaceC10174b;
import io.reactivex.rxjava3.schedulers.C10235a;

/* renamed from: com.ambrose.overwall.mv.main.i */
/* loaded from: classes.dex */
public final class C2502i implements InterfaceC10174b<Throwable> {

    /* renamed from: b */
    public final /* synthetic */ String f5965b;

    /* renamed from: c */
    public final /* synthetic */ String f5966c;

    /* renamed from: d */
    public final /* synthetic */ C2506m f5967d;

    public C2502i(C2506m c2506m, String str, String str2) {
        this.f5967d = c2506m;
        this.f5965b = str;
        this.f5966c = str2;
    }

    @Override // io.reactivex.rxjava3.functions.InterfaceC10174b
    public final void accept(Throwable th) throws Throwable {
        C2506m c2506m = this.f5967d;
        c2506m.getClass();
        c2506m.f5970a.mo1209c(c2506m.f5971b.m9379a(C2026c.m9721b("aHR0cHM6Ly9hcGkuYml1eGxhZmZiYi5vbmUvZ29mbHkvdmVyc2lvblRpdGxl"), this.f5965b, this.f5966c).m1223b(C10142b.m1225a()).m1220f(C10235a.f20570b).m1222c(new C2503j(c2506m), new C2504k(c2506m)));
    }
}
