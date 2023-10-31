package p060j$.util;

import java.util.Comparator;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.P */
/* loaded from: classes2.dex */
public interface InterfaceC10321P {
    /* renamed from: a */
    boolean mo534a(Consumer consumer);

    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer consumer);

    Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    InterfaceC10321P trySplit();
}
