package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.MM */
/* loaded from: assets/audience_network.dex */
public final class ExecutorC5239MM implements Executor {
    public static final ExecutorC5239MM A01 = new ExecutorC5239MM();
    public final Handler A00 = new Handler(Looper.getMainLooper());

    public static void A00(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            A01.execute(runnable);
        }
    }

    @NonNull
    public final Handler A01() {
        return this.A00;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
