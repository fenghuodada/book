package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.util.e */
/* loaded from: classes.dex */
public final class C3852e {

    /* renamed from: a */
    public static final ExecutorC3853a f9943a = new ExecutorC3853a();

    /* renamed from: b */
    public static final ExecutorC3854b f9944b = new ExecutorC3854b();

    /* renamed from: com.bumptech.glide.util.e$a */
    /* loaded from: classes.dex */
    public class ExecutorC3853a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            C3861k.m6399e().post(runnable);
        }
    }

    /* renamed from: com.bumptech.glide.util.e$b */
    /* loaded from: classes.dex */
    public class ExecutorC3854b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }
}
