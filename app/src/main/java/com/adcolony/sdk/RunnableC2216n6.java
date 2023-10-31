package com.adcolony.sdk;

import android.content.Context;
import android.widget.Toast;

/* renamed from: com.adcolony.sdk.n6 */
/* loaded from: classes.dex */
public final class RunnableC2216n6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f5395a;

    /* renamed from: b */
    public final /* synthetic */ String f5396b;

    /* renamed from: c */
    public final /* synthetic */ int f5397c = 0;

    public RunnableC2216n6(Context context, String str) {
        this.f5395a = context;
        this.f5396b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.f5395a, this.f5396b, this.f5397c).show();
    }
}
