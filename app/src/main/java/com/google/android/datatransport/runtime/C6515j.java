package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.InterfaceC6499b;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.datatransport.runtime.j */
/* loaded from: classes.dex */
public final class C6515j implements InterfaceC6499b<Executor> {

    /* renamed from: com.google.android.datatransport.runtime.j$a */
    /* loaded from: classes.dex */
    public static final class C6516a {

        /* renamed from: a */
        public static final C6515j f10274a = new C6515j();
    }

    @Override // javax.inject.InterfaceC10733a
    public final Object get() {
        return new ExecutorC6518l(Executors.newSingleThreadExecutor());
    }
}
