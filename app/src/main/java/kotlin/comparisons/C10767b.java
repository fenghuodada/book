package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import p060j$.util.Comparator;
import p060j$.util.function.Function;
import p060j$.util.function.ToDoubleFunction;
import p060j$.util.function.ToIntFunction;
import p060j$.util.function.ToLongFunction;

/* renamed from: kotlin.comparisons.b */
/* loaded from: classes3.dex */
public final class C10767b implements Comparator<Comparable<? super Object>>, p060j$.util.Comparator {
    @NotNull

    /* renamed from: a */
    public static final C10767b f21367a = new C10767b();

    @Override // java.util.Comparator, p060j$.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable a = (Comparable) obj;
        Comparable b = (Comparable) obj2;
        C10843j.m430f(a, "a");
        C10843j.m430f(b, "b");
        return b.compareTo(a);
    }

    @Override // java.util.Comparator, p060j$.util.Comparator
    @NotNull
    public final Comparator<Comparable<Object>> reversed() {
        return C10766a.f21366a;
    }

    @Override // p060j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Function function) {
        return Comparator.CC.$default$thenComparing(this, function);
    }

    @Override // p060j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }

    @Override // java.util.Comparator, p060j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator<Comparable<? super Object>> thenComparing(java.util.function.Function function) {
        return Comparator.CC.$default$thenComparing(this, Function.VivifiedWrapper.convert(function));
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator<Comparable<? super Object>> thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, Function.VivifiedWrapper.convert(function), comparator);
    }

    @Override // p060j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator<Comparable<? super Object>> thenComparingDouble(java.util.function.ToDoubleFunction<? super Comparable<? super Object>> toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction));
    }

    @Override // p060j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator<Comparable<? super Object>> thenComparingInt(java.util.function.ToIntFunction<? super Comparable<? super Object>> toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, ToIntFunction.VivifiedWrapper.convert(toIntFunction));
    }

    @Override // p060j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator<Comparable<? super Object>> thenComparingLong(java.util.function.ToLongFunction<? super Comparable<? super Object>> toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, ToLongFunction.VivifiedWrapper.convert(toLongFunction));
    }
}
