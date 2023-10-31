package p060j$.util;

import java.util.Collections;
import java.util.Comparator;
import p060j$.util.Comparator;
import p060j$.util.function.Function;
import p060j$.util.function.ToDoubleFunction;
import p060j$.util.function.ToIntFunction;
import p060j$.util.function.ToLongFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.e */
/* loaded from: classes2.dex */
public final class EnumC10367e implements Comparator, Comparator {
    public static final EnumC10367e INSTANCE;

    /* renamed from: a */
    private static final /* synthetic */ EnumC10367e[] f20843a;

    static {
        EnumC10367e enumC10367e = new EnumC10367e();
        INSTANCE = enumC10367e;
        f20843a = new EnumC10367e[]{enumC10367e};
    }

    private EnumC10367e() {
    }

    public static EnumC10367e valueOf(String str) {
        return (EnumC10367e) Enum.valueOf(EnumC10367e.class, str);
    }

    public static EnumC10367e[] values() {
        return (EnumC10367e[]) f20843a.clone();
    }

    @Override // java.util.Comparator, p060j$.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator, p060j$.util.Comparator
    public final Comparator reversed() {
        return Collections.reverseOrder();
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
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function) {
        return Comparator.CC.$default$thenComparing(this, Function.VivifiedWrapper.convert(function));
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, Function.VivifiedWrapper.convert(function), comparator);
    }

    @Override // p060j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction));
    }

    @Override // p060j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(java.util.function.ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, ToIntFunction.VivifiedWrapper.convert(toIntFunction));
    }

    @Override // p060j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(java.util.function.ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, ToLongFunction.VivifiedWrapper.convert(toLongFunction));
    }
}
