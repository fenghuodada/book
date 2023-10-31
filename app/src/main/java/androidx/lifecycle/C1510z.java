package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.C1508y;
import androidx.lifecycle.viewmodel.AbstractC1497a;
import androidx.lifecycle.viewmodel.C1499b;
import androidx.lifecycle.viewmodel.C1500c;
import androidx.lifecycle.viewmodel.C1501d;
import androidx.savedstate.C1689b;
import androidx.savedstate.InterfaceC1693d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10837d;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.C10860y;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@JvmName(name = "SavedStateHandleSupport")
@SourceDebugExtension({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,221:1\n1#2:222\n31#3:223\n63#3,2:224\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n*L\n109#1:223\n110#1:224,2\n*E\n"})
/* renamed from: androidx.lifecycle.z */
/* loaded from: classes.dex */
public final class C1510z {
    @JvmField
    @NotNull

    /* renamed from: a */
    public static final C1512b f3488a = new C1512b();
    @JvmField
    @NotNull

    /* renamed from: b */
    public static final C1513c f3489b = new C1513c();
    @JvmField
    @NotNull

    /* renamed from: c */
    public static final C1511a f3490c = new C1511a();

    /* renamed from: androidx.lifecycle.z$a */
    /* loaded from: classes.dex */
    public static final class C1511a {
    }

    /* renamed from: androidx.lifecycle.z$b */
    /* loaded from: classes.dex */
    public static final class C1512b {
    }

    /* renamed from: androidx.lifecycle.z$c */
    /* loaded from: classes.dex */
    public static final class C1513c {
    }

    /* renamed from: androidx.lifecycle.z$d */
    /* loaded from: classes.dex */
    public static final class C1514d extends AbstractC10844k implements InterfaceC10820l<AbstractC1497a, C1451b0> {

        /* renamed from: a */
        public static final C1514d f3491a = new C1514d();

        public C1514d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.InterfaceC10820l
        public final C1451b0 invoke(AbstractC1497a abstractC1497a) {
            AbstractC1497a initializer = abstractC1497a;
            C10843j.m430f(initializer, "$this$initializer");
            return new C1451b0();
        }
    }

    @MainThread
    @NotNull
    /* renamed from: a */
    public static final C1508y m10518a(@NotNull C1500c c1500c) {
        C1446a0 c1446a0;
        Bundle bundle;
        C1512b c1512b = f3488a;
        LinkedHashMap linkedHashMap = c1500c.f3474a;
        InterfaceC1693d interfaceC1693d = (InterfaceC1693d) linkedHashMap.get(c1512b);
        if (interfaceC1693d != null) {
            InterfaceC1480k0 interfaceC1480k0 = (InterfaceC1480k0) linkedHashMap.get(f3489b);
            if (interfaceC1480k0 != null) {
                Bundle bundle2 = (Bundle) linkedHashMap.get(f3490c);
                String str = (String) linkedHashMap.get(C1475i0.f3448a);
                if (str != null) {
                    C1689b.InterfaceC1691b m10053b = interfaceC1693d.getSavedStateRegistry().m10053b();
                    if (m10053b instanceof C1446a0) {
                        c1446a0 = (C1446a0) m10053b;
                    } else {
                        c1446a0 = null;
                    }
                    if (c1446a0 != null) {
                        LinkedHashMap linkedHashMap2 = m10516c(interfaceC1480k0).f3420a;
                        C1508y c1508y = (C1508y) linkedHashMap2.get(str);
                        if (c1508y == null) {
                            Class<? extends Object>[] clsArr = C1508y.f3482f;
                            boolean z = true;
                            if (!c1446a0.f3409b) {
                                c1446a0.f3410c = c1446a0.f3408a.m10054a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                                c1446a0.f3409b = true;
                                C1451b0 c1451b0 = (C1451b0) c1446a0.f3411d.getValue();
                            }
                            Bundle bundle3 = c1446a0.f3410c;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(str);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = c1446a0.f3410c;
                            if (bundle4 != null) {
                                bundle4.remove(str);
                            }
                            Bundle bundle5 = c1446a0.f3410c;
                            if ((bundle5 == null || !bundle5.isEmpty()) ? false : false) {
                                c1446a0.f3410c = null;
                            }
                            C1508y m10519a = C1508y.C1509a.m10519a(bundle, bundle2);
                            linkedHashMap2.put(str, m10519a);
                            return m10519a;
                        }
                        return c1508y;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @MainThread
    /* renamed from: b */
    public static final <T extends InterfaceC1693d & InterfaceC1480k0> void m10517b(@NotNull T t) {
        C10843j.m430f(t, "<this>");
        AbstractC1464h.EnumC1468b mo10538b = t.getLifecycle().mo10538b();
        if (!(mo10538b == AbstractC1464h.EnumC1468b.INITIALIZED || mo10538b == AbstractC1464h.EnumC1468b.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t.getSavedStateRegistry().m10053b() == null) {
            C1446a0 c1446a0 = new C1446a0(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().m10052c("androidx.lifecycle.internal.SavedStateHandlesProvider", c1446a0);
            t.getLifecycle().mo10539a(new SavedStateHandleAttacher(c1446a0));
        }
    }

    @NotNull
    /* renamed from: c */
    public static final C1451b0 m10516c(@NotNull InterfaceC1480k0 interfaceC1480k0) {
        C10843j.m430f(interfaceC1480k0, "<this>");
        ArrayList arrayList = new ArrayList();
        C10837d m422a = C10860y.m422a(C1451b0.class);
        C1514d initializer = C1514d.f3491a;
        C10843j.m430f(initializer, "initializer");
        Class<?> mo423a = m422a.mo423a();
        C10843j.m432d(mo423a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new C1501d(mo423a, initializer));
        C1501d[] c1501dArr = (C1501d[]) arrayList.toArray(new C1501d[0]);
        return (C1451b0) new C1469h0(interfaceC1480k0, new C1499b((C1501d[]) Arrays.copyOf(c1501dArr, c1501dArr.length))).m10544b(C1451b0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
