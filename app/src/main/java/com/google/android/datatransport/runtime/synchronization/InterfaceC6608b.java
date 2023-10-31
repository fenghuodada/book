package com.google.android.datatransport.runtime.synchronization;

import androidx.annotation.WorkerThread;

@WorkerThread
/* renamed from: com.google.android.datatransport.runtime.synchronization.b */
/* loaded from: classes.dex */
public interface InterfaceC6608b {

    /* renamed from: com.google.android.datatransport.runtime.synchronization.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC6609a<T> {
        T execute();
    }

    /* renamed from: c */
    <T> T mo6227c(InterfaceC6609a<T> interfaceC6609a);
}
