package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* renamed from: com.adcolony.sdk.o4 */
/* loaded from: classes.dex */
public final class C2229o4<T> {

    /* renamed from: a */
    public final ArrayList f5428a = new ArrayList();

    /* renamed from: b */
    public boolean f5429b = false;

    /* renamed from: com.adcolony.sdk.o4$a */
    /* loaded from: classes.dex */
    public interface InterfaceCallableC2230a<T> extends Callable<T> {
        /* renamed from: a */
        T m9566a();
    }

    /* renamed from: a */
    public final ArrayList m9568a() {
        this.f5429b = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f5428a;
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(arrayList2.size());
        ArrayList arrayList3 = new ArrayList();
        try {
            arrayList3.addAll(newFixedThreadPool.invokeAll(arrayList2));
            newFixedThreadPool.shutdownNow();
        } catch (Exception unused) {
        }
        for (int i = 0; i < arrayList3.size(); i++) {
            Future future = (Future) arrayList3.get(i);
            if (!future.isCancelled()) {
                try {
                    arrayList.add(future.get());
                } catch (Exception unused2) {
                }
            } else if (arrayList2.get(i) instanceof InterfaceCallableC2230a) {
                arrayList.add(((InterfaceCallableC2230a) arrayList2.get(i)).m9566a());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void m9567b(Callable<T> callable) {
        if (this.f5429b) {
            return;
        }
        this.f5428a.add(callable);
    }
}
