package com.permissionx.guolindev.request;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.permissionx.guolindev.request.v */
/* loaded from: classes3.dex */
public final class C8992v {

    /* renamed from: a */
    public FragmentActivity f17172a;
    @Nullable

    /* renamed from: b */
    public final Fragment f17173b;
    @JvmField
    @NotNull

    /* renamed from: d */
    public final Set<String> f17175d;
    @JvmField
    @NotNull

    /* renamed from: e */
    public final Set<String> f17176e;
    @JvmField
    @NotNull

    /* renamed from: j */
    public final LinkedHashSet f17181j;

    /* renamed from: c */
    public int f17174c = -1;
    @JvmField
    @NotNull

    /* renamed from: f */
    public final LinkedHashSet f17177f = new LinkedHashSet();
    @JvmField
    @NotNull

    /* renamed from: g */
    public final LinkedHashSet f17178g = new LinkedHashSet();
    @JvmField
    @NotNull

    /* renamed from: h */
    public final LinkedHashSet f17179h = new LinkedHashSet();
    @JvmField
    @NotNull

    /* renamed from: i */
    public final LinkedHashSet f17180i = new LinkedHashSet();

    public C8992v(@Nullable FragmentActivity fragmentActivity, @NotNull LinkedHashSet linkedHashSet, @NotNull LinkedHashSet linkedHashSet2) {
        new LinkedHashSet();
        this.f17181j = new LinkedHashSet();
        if (fragmentActivity != null) {
            this.f17172a = fragmentActivity;
        }
        this.f17173b = null;
        this.f17175d = linkedHashSet;
        this.f17176e = linkedHashSet2;
    }

    @NotNull
    /* renamed from: a */
    public final FragmentActivity m2824a() {
        FragmentActivity fragmentActivity = this.f17172a;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        C10843j.m424l("activity");
        throw null;
    }

    /* renamed from: b */
    public final FragmentManager m2823b() {
        Fragment fragment = this.f17173b;
        FragmentManager childFragmentManager = fragment != null ? fragment.getChildFragmentManager() : null;
        if (childFragmentManager == null) {
            FragmentManager supportFragmentManager = m2824a().getSupportFragmentManager();
            C10843j.m431e(supportFragmentManager, "activity.supportFragmentManager");
            return supportFragmentManager;
        }
        return childFragmentManager;
    }

    /* renamed from: c */
    public final C8991u m2822c() {
        Fragment findFragmentByTag = m2823b().findFragmentByTag("InvisibleFragment");
        if (findFragmentByTag != null) {
            return (C8991u) findFragmentByTag;
        }
        C8991u c8991u = new C8991u();
        m2823b().beginTransaction().add(c8991u, "InvisibleFragment").commitNowAllowingStateLoss();
        return c8991u;
    }

    /* renamed from: d */
    public final int m2821d() {
        return m2824a().getApplicationInfo().targetSdkVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final void m2820e(@NotNull Set<String> permissions, @NotNull InterfaceC8971c chainTask) {
        C10843j.m430f(permissions, "permissions");
        C10843j.m430f(chainTask, "chainTask");
        C8991u m2822c = m2822c();
        m2822c.f17162b = this;
        m2822c.f17163c = chainTask;
        Object[] array = permissions.toArray(new String[0]);
        C10843j.m432d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        m2822c.f17164d.launch(array);
    }
}
