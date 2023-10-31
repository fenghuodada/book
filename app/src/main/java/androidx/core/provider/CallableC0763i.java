package androidx.core.provider;

import android.content.Context;
import androidx.core.provider.C0767m;
import java.util.concurrent.Callable;

/* renamed from: androidx.core.provider.i */
/* loaded from: classes.dex */
public final class CallableC0763i implements Callable<C0767m.C0768a> {

    /* renamed from: a */
    public final /* synthetic */ String f2444a;

    /* renamed from: b */
    public final /* synthetic */ Context f2445b;

    /* renamed from: c */
    public final /* synthetic */ C0762h f2446c;

    /* renamed from: d */
    public final /* synthetic */ int f2447d;

    public CallableC0763i(String str, Context context, C0762h c0762h, int i) {
        this.f2444a = str;
        this.f2445b = context;
        this.f2446c = c0762h;
        this.f2447d = i;
    }

    @Override // java.util.concurrent.Callable
    public final C0767m.C0768a call() throws Exception {
        return C0767m.m11823a(this.f2444a, this.f2445b, this.f2446c, this.f2447d);
    }
}
