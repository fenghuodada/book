package androidx.activity;

import androidx.annotation.MainThread;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.C10868p;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nOnBackPressedCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1855#2,2:86\n*S KotlinDebug\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n*L\n67#1:86,2\n*E\n"})
/* renamed from: androidx.activity.l */
/* loaded from: classes.dex */
public abstract class AbstractC0050l {
    @NotNull
    private final CopyOnWriteArrayList<InterfaceC0037a> cancellables = new CopyOnWriteArrayList<>();
    @Nullable
    private InterfaceC10809a<C10868p> enabledChangedCallback;
    private boolean isEnabled;

    public AbstractC0050l(boolean z) {
        this.isEnabled = z;
    }

    @JvmName(name = "addCancellable")
    public final void addCancellable(@NotNull InterfaceC0037a cancellable) {
        C10843j.m430f(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    @Nullable
    public final InterfaceC10809a<C10868p> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    @MainThread
    public abstract void handleOnBackPressed();

    @MainThread
    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @MainThread
    public final void remove() {
        for (InterfaceC0037a interfaceC0037a : this.cancellables) {
            interfaceC0037a.cancel();
        }
    }

    @JvmName(name = "removeCancellable")
    public final void removeCancellable(@NotNull InterfaceC0037a cancellable) {
        C10843j.m430f(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    @MainThread
    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        InterfaceC10809a<C10868p> interfaceC10809a = this.enabledChangedCallback;
        if (interfaceC10809a != null) {
            interfaceC10809a.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(@Nullable InterfaceC10809a<C10868p> interfaceC10809a) {
        this.enabledChangedCallback = interfaceC10809a;
    }
}
