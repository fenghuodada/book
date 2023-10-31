package kotlin.random.jdk8;

import java.util.Random;
import kotlin.jvm.internal.C10843j;
import kotlin.random.AbstractC10870a;
import org.jetbrains.annotations.NotNull;
import p060j$.util.concurrent.ThreadLocalRandom;

/* renamed from: kotlin.random.jdk8.a */
/* loaded from: classes3.dex */
public final class C10875a extends AbstractC10870a {
    @Override // kotlin.random.AbstractC10870a
    @NotNull
    /* renamed from: b */
    public final Random mo415b() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C10843j.m431e(current, "current()");
        return current;
    }
}
