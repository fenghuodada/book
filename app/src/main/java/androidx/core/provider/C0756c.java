package androidx.core.provider;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.graphics.C0711e;
import androidx.core.provider.C0767m;

/* renamed from: androidx.core.provider.c */
/* loaded from: classes.dex */
public final class C0756c {
    @NonNull

    /* renamed from: a */
    public final FontsContractCompat$FontRequestCallback f2436a;
    @NonNull

    /* renamed from: b */
    public final Handler f2437b;

    public C0756c(@NonNull C0711e.C0712a c0712a, @NonNull Handler handler) {
        this.f2436a = c0712a;
        this.f2437b = handler;
    }

    /* renamed from: a */
    public final void m11828a(@NonNull C0767m.C0768a c0768a) {
        boolean z;
        int i = c0768a.f2459b;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Handler handler = this.f2437b;
        FontsContractCompat$FontRequestCallback fontsContractCompat$FontRequestCallback = this.f2436a;
        if (z) {
            handler.post(new RunnableC0754a(fontsContractCompat$FontRequestCallback, c0768a.f2458a));
        } else {
            handler.post(new RunnableC0755b(fontsContractCompat$FontRequestCallback, i));
        }
    }
}
