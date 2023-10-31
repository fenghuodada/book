package p060j$.util.stream;

import java.util.Iterator;
import p060j$.util.InterfaceC10321P;

/* renamed from: j$.util.stream.i */
/* loaded from: classes2.dex */
public interface InterfaceC10636i extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    Iterator iterator();

    InterfaceC10636i onClose(Runnable runnable);

    InterfaceC10636i parallel();

    InterfaceC10636i sequential();

    InterfaceC10321P spliterator();

    InterfaceC10636i unordered();
}
