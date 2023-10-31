package androidx.core.p003os;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(18)
/* renamed from: androidx.core.os.a */
/* loaded from: classes.dex */
public final class C0730a {
    @JvmStatic
    @DoNotInline
    /* renamed from: a */
    public static final void m11865a(@NotNull Bundle bundle, @NotNull String key, @Nullable IBinder iBinder) {
        C10843j.m430f(bundle, "bundle");
        C10843j.m430f(key, "key");
        bundle.putBinder(key, iBinder);
    }
}
