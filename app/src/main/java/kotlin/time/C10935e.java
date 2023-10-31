package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.time.e */
/* loaded from: classes3.dex */
public class C10935e {
    @SinceKotlin(version = "1.5")
    /* renamed from: a */
    public static final long m356a(long j, @NotNull EnumC10934d sourceUnit, @NotNull EnumC10934d targetUnit) {
        C10843j.m430f(sourceUnit, "sourceUnit");
        C10843j.m430f(targetUnit, "targetUnit");
        return targetUnit.f21489a.convert(j, sourceUnit.f21489a);
    }
}
