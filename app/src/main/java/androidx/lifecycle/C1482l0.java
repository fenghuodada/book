package androidx.lifecycle;

import android.view.View;
import com.ambrose.overwall.R;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName(name = "ViewTreeLifecycleOwner")
/* renamed from: androidx.lifecycle.l0 */
/* loaded from: classes.dex */
public final class C1482l0 {
    @JvmName(name = "set")
    /* renamed from: a */
    public static final void m10540a(@NotNull View view, @Nullable InterfaceC1483m interfaceC1483m) {
        C10843j.m430f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC1483m);
    }
}
