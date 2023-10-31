package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: com.google.common.util.concurrent.a */
/* loaded from: classes3.dex */
public interface InterfaceFutureC8037a<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
