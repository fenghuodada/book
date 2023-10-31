package com.ambrose.overwall.p005mv.main;

import cn.hutool.core.codec.C2026c;
import io.reactivex.rxjava3.android.schedulers.C10142b;
import io.reactivex.rxjava3.functions.InterfaceC10174b;
import io.reactivex.rxjava3.schedulers.C10235a;
import p060j$.util.concurrent.ThreadLocalRandom;

/* renamed from: com.ambrose.overwall.mv.main.a */
/* loaded from: classes.dex */
public final class C2494a implements InterfaceC10174b<Throwable> {

    /* renamed from: b */
    public final /* synthetic */ C2506m f5957b;

    public C2494a(C2506m c2506m) {
        this.f5957b = c2506m;
    }

    @Override // io.reactivex.rxjava3.functions.InterfaceC10174b
    public final void accept(Throwable th) throws Throwable {
        boolean z;
        String str;
        if (ThreadLocalRandom.current().nextInt(2) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "aHR0cHM6Ly9mcmVlaXBhcGkuY29tL2FwaS9qc29u";
        } else {
            str = "aHR0cHM6Ly9hcGkuYmlnZGF0YWNsb3VkLm5ldC9kYXRhL3JldmVyc2UtZ2VvY29kZS1jbGllbnQ=";
        }
        String m9721b = C2026c.m9721b(str);
        C2506m c2506m = this.f5957b;
        c2506m.f5970a.mo1209c(c2506m.f5971b.m9377c(m9721b).m1223b(C10142b.m1225a()).m1220f(C10235a.f20570b).m1222c(new C2495b(), new C2496c()));
    }
}
