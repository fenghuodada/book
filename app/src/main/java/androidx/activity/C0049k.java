package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n1855#3,2:192\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n154#1:192,2\n*E\n"})
/* renamed from: androidx.activity.k */
/* loaded from: classes.dex */
public final class C0049k {
    @NotNull

    /* renamed from: a */
    public final Executor f96a;
    @NotNull

    /* renamed from: b */
    public final InterfaceC10809a<C10868p> f97b;
    @NotNull

    /* renamed from: c */
    public final Object f98c;
    @GuardedBy("lock")

    /* renamed from: d */
    public boolean f99d;
    @GuardedBy("lock")
    @NotNull

    /* renamed from: e */
    public final ArrayList f100e;

    public C0049k(@NotNull ComponentActivity.InterfaceExecutorC0031e executor, @NotNull C0039c c0039c) {
        C10843j.m430f(executor, "executor");
        this.f96a = executor;
        this.f97b = c0039c;
        this.f98c = new Object();
        this.f100e = new ArrayList();
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: a */
    public final void m13055a() {
        synchronized (this.f98c) {
            this.f99d = true;
            Iterator it = this.f100e.iterator();
            while (it.hasNext()) {
                ((InterfaceC10809a) it.next()).invoke();
            }
            this.f100e.clear();
            C10868p c10868p = C10868p.f21418a;
        }
    }
}
