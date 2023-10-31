package androidx.core.provider;

import android.content.Context;
import androidx.core.provider.C0767m;
import java.util.concurrent.Callable;

/* renamed from: androidx.core.provider.k */
/* loaded from: classes.dex */
public final class CallableC0765k implements Callable<C0767m.C0768a> {

    /* renamed from: a */
    public final /* synthetic */ String f2449a;

    /* renamed from: b */
    public final /* synthetic */ Context f2450b;

    /* renamed from: c */
    public final /* synthetic */ C0762h f2451c;

    /* renamed from: d */
    public final /* synthetic */ int f2452d;

    public CallableC0765k(String str, Context context, C0762h c0762h, int i) {
        this.f2449a = str;
        this.f2450b = context;
        this.f2451c = c0762h;
        this.f2452d = i;
    }

    @Override // java.util.concurrent.Callable
    public final C0767m.C0768a call() throws Exception {
        try {
            return C0767m.m11823a(this.f2449a, this.f2450b, this.f2451c, this.f2452d);
        } catch (Throwable unused) {
            return new C0767m.C0768a(-3);
        }
    }
}
