package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.PublishedApi;
import org.jetbrains.annotations.Nullable;

@PublishedApi
/* renamed from: kotlinx.coroutines.k1 */
/* loaded from: classes3.dex */
public class C11075k1 extends C11084n1 {

    /* renamed from: c */
    public final boolean f21681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11075k1(@Nullable InterfaceC11017h1 interfaceC11017h1) {
        super(true);
        C11089o c11089o;
        boolean z = true;
        m205P(interfaceC11017h1);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C11084n1.f21688b;
        InterfaceC11082n interfaceC11082n = (InterfaceC11082n) atomicReferenceFieldUpdater.get(this);
        if (interfaceC11082n instanceof C11089o) {
            c11089o = (C11089o) interfaceC11082n;
        } else {
            c11089o = null;
        }
        if (c11089o != null) {
            do {
                C11084n1 m217m = c11089o.m217m();
                if (m217m.mo210J()) {
                    break;
                }
                InterfaceC11082n interfaceC11082n2 = (InterfaceC11082n) atomicReferenceFieldUpdater.get(m217m);
                if (interfaceC11082n2 instanceof C11089o) {
                    c11089o = (C11089o) interfaceC11082n2;
                    continue;
                } else {
                    c11089o = null;
                    continue;
                }
            } while (c11089o != null);
            z = false;
        } else {
            z = false;
        }
        this.f21681c = z;
    }

    @Override // kotlinx.coroutines.C11084n1
    /* renamed from: J */
    public final boolean mo210J() {
        return this.f21681c;
    }

    @Override // kotlinx.coroutines.C11084n1
    /* renamed from: K */
    public final boolean mo209K() {
        return true;
    }
}
