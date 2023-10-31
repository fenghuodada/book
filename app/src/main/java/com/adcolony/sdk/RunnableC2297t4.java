package com.adcolony.sdk;

import java.io.IOException;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.t4 */
/* loaded from: classes.dex */
public final class RunnableC2297t4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2323u4 f5590a;

    public RunnableC2297t4(C2323u4 c2323u4) {
        this.f5590a = c2323u4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2323u4 c2323u4 = this.f5590a;
        synchronized (c2323u4) {
            try {
                if (c2323u4.f5630c.size() > 0) {
                    c2323u4.f5628a.m9504a(c2323u4.m9492a(c2323u4.f5632e, c2323u4.f5630c));
                    c2323u4.f5630c.clear();
                }
            } catch (IOException | JSONException unused) {
                c2323u4.f5630c.clear();
            }
        }
    }
}
