package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C10881f;
import kotlin.ranges.C10882g;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1484:1\n1436#1,6:1486\n1439#1,3:1492\n1436#1,6:1495\n1436#1,6:1501\n1439#1,3:1510\n1#2:1485\n1726#3,3:1507\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n1360#1:1486,6\n1394#1:1492,3\n1397#1:1495,6\n1400#1:1501,6\n1436#1:1510,3\n1425#1:1507,3\n*E\n"})
/* renamed from: kotlin.time.c */
/* loaded from: classes3.dex */
public final class C10933c {
    /* renamed from: a */
    public static final long m359a(long j) {
        long j2 = (j << 1) + 1;
        int i = C10931a.f21479d;
        int i2 = C10932b.f21481a;
        return j2;
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    /* renamed from: b */
    public static final long m358b(int i, @NotNull EnumC10934d unit) {
        C10843j.m430f(unit, "unit");
        if (unit.compareTo(EnumC10934d.SECONDS) <= 0) {
            long m356a = C10935e.m356a(i, unit, EnumC10934d.NANOSECONDS) << 1;
            int i2 = C10931a.f21479d;
            int i3 = C10932b.f21481a;
            return m356a;
        }
        return m357c(i, unit);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    /* renamed from: c */
    public static final long m357c(long j, @NotNull EnumC10934d unit) {
        C10843j.m430f(unit, "unit");
        EnumC10934d enumC10934d = EnumC10934d.NANOSECONDS;
        long m356a = C10935e.m356a(4611686018426999999L, enumC10934d, unit);
        if (new C10881f(-m356a, m356a).m414a(j)) {
            long m356a2 = C10935e.m356a(j, unit, enumC10934d) << 1;
            int i = C10931a.f21479d;
            int i2 = C10932b.f21481a;
            return m356a2;
        }
        EnumC10934d targetUnit = EnumC10934d.MILLISECONDS;
        C10843j.m430f(targetUnit, "targetUnit");
        return m359a(C10882g.m413a(targetUnit.f21489a.convert(j, unit.f21489a)));
    }
}
