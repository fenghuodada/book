package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.FragmentC1502w;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.lifecycle.j */
/* loaded from: classes.dex */
public final class C1476j {
    @NotNull

    /* renamed from: a */
    public static final AtomicBoolean f3449a = new AtomicBoolean(false);

    @VisibleForTesting
    /* renamed from: androidx.lifecycle.j$a */
    /* loaded from: classes.dex */
    public static final class C1477a extends C1454d {
        @Override // androidx.lifecycle.C1454d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            C10843j.m430f(activity, "activity");
            int i = FragmentC1502w.f3479b;
            FragmentC1502w.C1504b.m10521b(activity);
        }
    }
}
