package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* renamed from: kotlin.random.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10870a extends AbstractC10873c {
    @Override // kotlin.random.AbstractC10873c
    /* renamed from: a */
    public final int mo416a() {
        return mo415b().nextInt();
    }

    @NotNull
    /* renamed from: b */
    public abstract Random mo415b();
}
