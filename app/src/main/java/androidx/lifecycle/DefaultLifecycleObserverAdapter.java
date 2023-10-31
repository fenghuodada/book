package androidx.lifecycle;

import androidx.lifecycle.AbstractC1464h;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m508d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/k;", "lifecycle-common"}, m507k = 1, m506mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC1479k {
    @NotNull

    /* renamed from: a */
    public final InterfaceC1452c f3377a;
    @Nullable

    /* renamed from: b */
    public final InterfaceC1479k f3378b;

    /* renamed from: androidx.lifecycle.DefaultLifecycleObserverAdapter$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C1441a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3379a;

        static {
            int[] iArr = new int[AbstractC1464h.EnumC1465a.values().length];
            try {
                iArr[AbstractC1464h.EnumC1465a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1464h.EnumC1465a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1464h.EnumC1465a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1464h.EnumC1465a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1464h.EnumC1465a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1464h.EnumC1465a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC1464h.EnumC1465a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f3379a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(@NotNull InterfaceC1452c defaultLifecycleObserver, @Nullable InterfaceC1479k interfaceC1479k) {
        C10843j.m430f(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f3377a = defaultLifecycleObserver;
        this.f3378b = interfaceC1479k;
    }

    @Override // androidx.lifecycle.InterfaceC1479k
    public final void onStateChanged(@NotNull InterfaceC1483m interfaceC1483m, @NotNull AbstractC1464h.EnumC1465a enumC1465a) {
        int i = C1441a.f3379a[enumC1465a.ordinal()];
        InterfaceC1452c interfaceC1452c = this.f3377a;
        switch (i) {
            case 1:
                interfaceC1452c.mo10562a(interfaceC1483m);
                break;
            case 2:
                interfaceC1452c.mo10558e(interfaceC1483m);
                break;
            case 3:
                interfaceC1452c.mo10557f();
                break;
            case 4:
                interfaceC1452c.mo10561b(interfaceC1483m);
                break;
            case 5:
                interfaceC1452c.mo10560c(interfaceC1483m);
                break;
            case 6:
                interfaceC1452c.mo10559d(interfaceC1483m);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1479k interfaceC1479k = this.f3378b;
        if (interfaceC1479k != null) {
            interfaceC1479k.onStateChanged(interfaceC1483m, enumC1465a);
        }
    }
}
