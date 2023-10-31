package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.internal.s */
/* loaded from: classes3.dex */
public class C11060s<E> {
    @NotNull

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f21665a = AtomicReferenceFieldUpdater.newUpdater(C11060s.class, Object.class, "_cur");
    @Volatile
    @Nullable
    private volatile Object _cur = new C11061t(8, false);

    /* renamed from: a */
    public final boolean m241a(@NotNull E e) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21665a;
            C11061t c11061t = (C11061t) atomicReferenceFieldUpdater.get(this);
            int m237a = c11061t.m237a(e);
            if (m237a == 0) {
                return true;
            }
            if (m237a == 1) {
                C11061t<E> m235c = c11061t.m235c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c11061t, m235c) && atomicReferenceFieldUpdater.get(this) == c11061t) {
                }
            } else if (m237a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m240b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21665a;
            C11061t c11061t = (C11061t) atomicReferenceFieldUpdater.get(this);
            if (c11061t.m236b()) {
                return;
            }
            C11061t<E> m235c = c11061t.m235c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c11061t, m235c) && atomicReferenceFieldUpdater.get(this) == c11061t) {
            }
        }
    }

    /* renamed from: c */
    public final int m239c() {
        C11061t c11061t = (C11061t) f21665a.get(this);
        c11061t.getClass();
        long j = C11061t.f21667f.get(c11061t);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    @Nullable
    /* renamed from: d */
    public final E m238d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21665a;
            C11061t c11061t = (C11061t) atomicReferenceFieldUpdater.get(this);
            E e = (E) c11061t.m234d();
            if (e != C11061t.f21668g) {
                return e;
            }
            C11061t<E> m235c = c11061t.m235c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c11061t, m235c) && atomicReferenceFieldUpdater.get(this) == c11061t) {
            }
        }
    }
}
