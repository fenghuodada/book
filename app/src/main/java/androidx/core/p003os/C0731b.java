package androidx.core.p003os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(21)
/* renamed from: androidx.core.os.b */
/* loaded from: classes.dex */
public final class C0731b {
    @JvmStatic
    @DoNotInline
    /* renamed from: a */
    public static final void m11864a(@NotNull Bundle bundle, @NotNull String key, @Nullable Size size) {
        C10843j.m430f(bundle, "bundle");
        C10843j.m430f(key, "key");
        bundle.putSize(key, size);
    }

    @JvmStatic
    @DoNotInline
    /* renamed from: b */
    public static final void m11863b(@NotNull Bundle bundle, @NotNull String key, @Nullable SizeF sizeF) {
        C10843j.m430f(bundle, "bundle");
        C10843j.m430f(key, "key");
        bundle.putSizeF(key, sizeF);
    }
}
