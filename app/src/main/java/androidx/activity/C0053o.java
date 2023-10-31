package androidx.activity;

import android.view.View;
import com.ambrose.overwall.R;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@JvmName(name = "ViewTreeOnBackPressedDispatcherOwner")
/* renamed from: androidx.activity.o */
/* loaded from: classes.dex */
public final class C0053o {
    @JvmName(name = "set")
    /* renamed from: a */
    public static final void m13054a(@NotNull View view, @NotNull InterfaceC0052n onBackPressedDispatcherOwner) {
        C10843j.m430f(view, "<this>");
        C10843j.m430f(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
