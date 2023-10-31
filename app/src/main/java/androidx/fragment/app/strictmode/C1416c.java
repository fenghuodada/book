package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.C10757m;
import kotlin.collections.C10761q;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.fragment.app.strictmode.c */
/* loaded from: classes.dex */
public final class C1416c {
    @NotNull

    /* renamed from: a */
    public static final C1418b f3347a = C1418b.f3358c;

    /* renamed from: androidx.fragment.app.strictmode.c$a */
    /* loaded from: classes.dex */
    public enum EnumC1417a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* renamed from: androidx.fragment.app.strictmode.c$b */
    /* loaded from: classes.dex */
    public static final class C1418b {
        @JvmField
        @NotNull

        /* renamed from: c */
        public static final C1418b f3358c = new C1418b();
        @NotNull

        /* renamed from: a */
        public final Set<EnumC1417a> f3359a = C10761q.f21365a;
        @NotNull

        /* renamed from: b */
        public final LinkedHashMap f3360b = new LinkedHashMap();
    }

    /* renamed from: a */
    public static C1418b m10582a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                C10843j.m431e(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.getStrictModePolicy() != null) {
                    C1418b strictModePolicy = parentFragmentManager.getStrictModePolicy();
                    C10843j.m433c(strictModePolicy);
                    return strictModePolicy;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f3347a;
    }

    /* renamed from: b */
    public static void m10581b(C1418b c1418b, final AbstractC1428m abstractC1428m) {
        Fragment fragment = abstractC1428m.f3362a;
        final String name = fragment.getClass().getName();
        EnumC1417a enumC1417a = EnumC1417a.PENALTY_LOG;
        Set<EnumC1417a> set = c1418b.f3359a;
        if (set.contains(enumC1417a)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), abstractC1428m);
        }
        if (set.contains(EnumC1417a.PENALTY_DEATH)) {
            Runnable runnable = new Runnable() { // from class: androidx.fragment.app.strictmode.b
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1428m violation = abstractC1428m;
                    C10843j.m430f(violation, "$violation");
                    Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + name, violation);
                    throw violation;
                }
            };
            if (fragment.isAdded()) {
                Handler handler = fragment.getParentFragmentManager().getHost().getHandler();
                C10843j.m431e(handler, "fragment.parentFragmentManager.host.handler");
                if (!C10843j.m435a(handler.getLooper(), Looper.myLooper())) {
                    handler.post(runnable);
                    return;
                }
            }
            runnable.run();
            throw null;
        }
    }

    /* renamed from: c */
    public static void m10580c(AbstractC1428m abstractC1428m) {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "StrictMode violation in ".concat(abstractC1428m.f3362a.getClass().getName()), abstractC1428m);
        }
    }

    @JvmStatic
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: d */
    public static final void m10579d(@NotNull Fragment fragment, @NotNull String previousFragmentId) {
        C10843j.m430f(fragment, "fragment");
        C10843j.m430f(previousFragmentId, "previousFragmentId");
        C1414a c1414a = new C1414a(fragment, previousFragmentId);
        m10580c(c1414a);
        C1418b m10582a = m10582a(fragment);
        if (m10582a.f3359a.contains(EnumC1417a.DETECT_FRAGMENT_REUSE) && m10578e(m10582a, fragment.getClass(), C1414a.class)) {
            m10581b(m10582a, c1414a);
        }
    }

    /* renamed from: e */
    public static boolean m10578e(C1418b c1418b, Class cls, Class cls2) {
        Set set = (Set) c1418b.f3360b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!C10843j.m435a(cls2.getSuperclass(), AbstractC1428m.class) && C10757m.m480i(set, cls2.getSuperclass())) {
            return false;
        }
        return !set.contains(cls2);
    }
}
