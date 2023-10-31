package androidx.core.view;

import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.InterfaceC1479k;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.core.view.p */
/* loaded from: classes.dex */
public final class C0983p {

    /* renamed from: a */
    public final Runnable f2662a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<InterfaceC0895b0> f2663b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final HashMap f2664c = new HashMap();

    /* renamed from: androidx.core.view.p$a */
    /* loaded from: classes.dex */
    public static class C0984a {

        /* renamed from: a */
        public final AbstractC1464h f2665a;

        /* renamed from: b */
        public InterfaceC1479k f2666b;

        public C0984a(@NonNull AbstractC1464h abstractC1464h, @NonNull InterfaceC1479k interfaceC1479k) {
            this.f2665a = abstractC1464h;
            this.f2666b = interfaceC1479k;
            abstractC1464h.mo10539a(interfaceC1479k);
        }
    }

    public C0983p(@NonNull Runnable runnable) {
        this.f2662a = runnable;
    }

    /* renamed from: a */
    public final void m11398a(@NonNull InterfaceC0895b0 interfaceC0895b0) {
        this.f2663b.remove(interfaceC0895b0);
        C0984a c0984a = (C0984a) this.f2664c.remove(interfaceC0895b0);
        if (c0984a != null) {
            c0984a.f2665a.mo10537c(c0984a.f2666b);
            c0984a.f2666b = null;
        }
        this.f2662a.run();
    }
}
