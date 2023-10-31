package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.fragment.app.strictmode.e */
/* loaded from: classes.dex */
public final class C1420e extends AbstractC1423h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1420e(@NotNull Fragment fragment) {
        super(fragment, "Attempting to get retain instance for fragment " + fragment);
        C10843j.m430f(fragment, "fragment");
    }
}
