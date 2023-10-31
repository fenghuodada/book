package com.google.android.datatransport.runtime.scheduling.persistence;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.runtime.AbstractC6512h;
import com.google.android.datatransport.runtime.AbstractC6522n;
import java.io.Closeable;

@WorkerThread
/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.d */
/* loaded from: classes.dex */
public interface InterfaceC6574d extends Closeable {
    /* renamed from: B */
    long mo6248B(AbstractC6522n abstractC6522n);

    /* renamed from: C */
    boolean mo6247C(AbstractC6522n abstractC6522n);

    /* renamed from: D */
    void mo6246D(Iterable<AbstractC6591k> iterable);

    /* renamed from: b */
    int mo6245b();

    /* renamed from: i */
    void mo6244i(Iterable<AbstractC6591k> iterable);

    /* renamed from: n */
    Iterable<AbstractC6591k> mo6243n(AbstractC6522n abstractC6522n);

    /* renamed from: p */
    Iterable<AbstractC6522n> mo6242p();

    /* renamed from: t */
    void mo6241t(long j, AbstractC6522n abstractC6522n);

    @Nullable
    /* renamed from: z */
    C6570b mo6240z(AbstractC6522n abstractC6522n, AbstractC6512h abstractC6512h);
}
