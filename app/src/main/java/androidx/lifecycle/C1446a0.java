package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.C1689b;
import java.util.Map;
import kotlin.C10795h;
import kotlin.C10865m;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,221:1\n215#2,2:222\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n146#1:222,2\n*E\n"})
/* renamed from: androidx.lifecycle.a0 */
/* loaded from: classes.dex */
public final class C1446a0 implements C1689b.InterfaceC1691b {
    @NotNull

    /* renamed from: a */
    public final C1689b f3408a;

    /* renamed from: b */
    public boolean f3409b;
    @Nullable

    /* renamed from: c */
    public Bundle f3410c;
    @NotNull

    /* renamed from: d */
    public final C10865m f3411d;

    /* renamed from: androidx.lifecycle.a0$a */
    /* loaded from: classes.dex */
    public static final class C1447a extends AbstractC10844k implements InterfaceC10809a<C1451b0> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC1480k0 f3412a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1447a(InterfaceC1480k0 interfaceC1480k0) {
            super(0);
            this.f3412a = interfaceC1480k0;
        }

        @Override // kotlin.jvm.functions.InterfaceC10809a
        public final C1451b0 invoke() {
            return C1510z.m10516c(this.f3412a);
        }
    }

    public C1446a0(@NotNull C1689b savedStateRegistry, @NotNull InterfaceC1480k0 viewModelStoreOwner) {
        C10843j.m430f(savedStateRegistry, "savedStateRegistry");
        C10843j.m430f(viewModelStoreOwner, "viewModelStoreOwner");
        this.f3408a = savedStateRegistry;
        this.f3411d = C10795h.m446a(new C1447a(viewModelStoreOwner));
    }

    @Override // androidx.savedstate.C1689b.InterfaceC1691b
    @NotNull
    /* renamed from: a */
    public final Bundle mo10049a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3410c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((C1451b0) this.f3411d.getValue()).f3420a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle mo10049a = ((C1508y) entry.getValue()).f3487e.mo10049a();
            if (!C10843j.m435a(mo10049a, Bundle.EMPTY)) {
                bundle.putBundle(str, mo10049a);
            }
        }
        this.f3409b = false;
        return bundle;
    }
}
