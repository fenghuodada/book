package androidx.core.provider;

import androidx.core.content.res.C0676f;
import androidx.core.graphics.C0711e;

/* renamed from: androidx.core.provider.b */
/* loaded from: classes.dex */
public final class RunnableC0755b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FontsContractCompat$FontRequestCallback f2434a;

    /* renamed from: b */
    public final /* synthetic */ int f2435b;

    public RunnableC0755b(FontsContractCompat$FontRequestCallback fontsContractCompat$FontRequestCallback, int i) {
        this.f2434a = fontsContractCompat$FontRequestCallback;
        this.f2435b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0676f.AbstractC0681e abstractC0681e = ((C0711e.C0712a) this.f2434a).f2404a;
        if (abstractC0681e != null) {
            abstractC0681e.lambda$callbackFailAsync$1(this.f2435b);
        }
    }
}
