package p060j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;

/* renamed from: j$.util.stream.n */
/* loaded from: classes2.dex */
public abstract class AbstractC10661n {

    /* renamed from: a */
    public static final /* synthetic */ int f21211a = 0;

    static {
        EnumC10641j enumC10641j = EnumC10641j.CONCURRENT;
        EnumC10641j enumC10641j2 = EnumC10641j.UNORDERED;
        EnumC10641j enumC10641j3 = EnumC10641j.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC10641j, enumC10641j2, enumC10641j3));
        Collections.unmodifiableSet(EnumSet.of(enumC10641j, enumC10641j2));
        Collections.unmodifiableSet(EnumSet.of(enumC10641j3));
        Collections.unmodifiableSet(EnumSet.of(enumC10641j2, enumC10641j3));
        Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m647a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }
}
