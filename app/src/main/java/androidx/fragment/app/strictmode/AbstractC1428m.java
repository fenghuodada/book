package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.fragment.app.strictmode.m */
/* loaded from: classes.dex */
public abstract class AbstractC1428m extends RuntimeException {
    @NotNull

    /* renamed from: a */
    public final Fragment f3362a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1428m(@NotNull Fragment fragment, @Nullable String str) {
        super(str);
        C10843j.m430f(fragment, "fragment");
        this.f3362a = fragment;
    }
}
