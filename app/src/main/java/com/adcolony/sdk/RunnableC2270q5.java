package com.adcolony.sdk;

import android.content.ContentValues;

/* renamed from: com.adcolony.sdk.q5 */
/* loaded from: classes.dex */
public final class RunnableC2270q5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f5526a;

    /* renamed from: b */
    public final /* synthetic */ ContentValues f5527b;

    /* renamed from: c */
    public final /* synthetic */ C2279r5 f5528c;

    public RunnableC2270q5(C2279r5 c2279r5, String str, ContentValues contentValues) {
        this.f5528c = c2279r5;
        this.f5526a = str;
        this.f5527b = contentValues;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2279r5 c2279r5 = this.f5528c;
        String str = this.f5526a;
        ContentValues contentValues = this.f5527b;
        synchronized (c2279r5) {
            C2138i4.m9616a(str, contentValues, c2279r5.f5546b);
        }
    }
}
