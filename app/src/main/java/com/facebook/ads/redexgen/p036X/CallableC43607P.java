package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.7P */
/* loaded from: assets/audience_network.dex */
public class CallableC43607P implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C43657U A01;

    public CallableC43607P(C43657U c43657u, C43617Q c43617q) {
        this.A01 = c43657u;
        new Handler(Looper.getMainLooper()).post(new C5955Y0(this, c43657u, c43617q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00 */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C43617Q c43617q) {
        C44148U c44148u;
        C44148U c44148u2;
        long currentTimeMillis = System.currentTimeMillis();
        c44148u = this.A01.A04;
        C5509Qk A05 = C5509Qk.A05(c44148u.A00());
        Uri A00 = C5191La.A00(c43617q.A08);
        long j = c43617q.A00;
        if (j == -1) {
            c44148u2 = this.A01.A04;
            j = C5064JR.A0M(c44148u2);
        }
        A05.A0G(A00, new C5954Xz(this, c43617q, j, currentTimeMillis), j);
    }
}
