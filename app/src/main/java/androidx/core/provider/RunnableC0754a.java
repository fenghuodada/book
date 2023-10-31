package androidx.core.provider;

import android.graphics.Typeface;
import androidx.core.content.res.C0676f;
import androidx.core.graphics.C0711e;

/* renamed from: androidx.core.provider.a */
/* loaded from: classes.dex */
public final class RunnableC0754a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FontsContractCompat$FontRequestCallback f2432a;

    /* renamed from: b */
    public final /* synthetic */ Typeface f2433b;

    public RunnableC0754a(FontsContractCompat$FontRequestCallback fontsContractCompat$FontRequestCallback, Typeface typeface) {
        this.f2432a = fontsContractCompat$FontRequestCallback;
        this.f2433b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0676f.AbstractC0681e abstractC0681e = ((C0711e.C0712a) this.f2432a).f2404a;
        if (abstractC0681e != null) {
            abstractC0681e.lambda$callbackSuccessAsync$0(this.f2433b);
        }
    }
}
