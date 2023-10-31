package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.PublishedApi;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC11144u0;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.InterfaceC11047k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalCoroutinesApi
@SourceDebugExtension({"SMAP\nThreadSafeHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n28#2,4:169\n28#2,4:174\n28#2,4:179\n28#2,4:184\n28#2,4:189\n28#2,4:194\n28#2,4:199\n28#2,4:204\n20#3:173\n20#3:178\n20#3:183\n20#3:188\n20#3:193\n20#3:198\n20#3:203\n20#3:208\n1#4:209\n*S KotlinDebug\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n35#1:169,4\n42#1:174,4\n50#1:179,4\n52#1:184,4\n60#1:189,4\n69#1:194,4\n72#1:199,4\n81#1:204,4\n35#1:173\n42#1:178\n50#1:183\n52#1:188\n60#1:193\n69#1:198\n72#1:203\n81#1:208\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.j0 */
/* loaded from: classes3.dex */
public class C11045j0<T extends InterfaceC11047k0 & Comparable<? super T>> {
    @NotNull

    /* renamed from: b */
    public static final AtomicIntegerFieldUpdater f21638b = AtomicIntegerFieldUpdater.newUpdater(C11045j0.class, "_size");
    @Volatile
    private volatile int _size;
    @Nullable

    /* renamed from: a */
    public T[] f21639a;

    @PublishedApi
    /* renamed from: a */
    public final void m259a(@NotNull AbstractC11144u0.AbstractRunnableC11145a abstractRunnableC11145a) {
        abstractRunnableC11145a.mo114f((AbstractC11144u0.C11146b) this);
        T[] tArr = this.f21639a;
        if (tArr == null) {
            tArr = (T[]) new InterfaceC11047k0[4];
            this.f21639a = tArr;
        } else if (m258b() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, m258b() * 2);
            C10843j.m431e(copyOf, "copyOf(this, newSize)");
            tArr = (T[]) ((InterfaceC11047k0[]) copyOf);
            this.f21639a = tArr;
        }
        int m258b = m258b();
        f21638b.set(this, m258b + 1);
        tArr[m258b] = abstractRunnableC11145a;
        abstractRunnableC11145a.f21809b = m258b;
        m254f(m258b);
    }

    /* renamed from: b */
    public final int m258b() {
        return f21638b.get(this);
    }

    @Nullable
    /* renamed from: c */
    public final T m257c() {
        T t;
        synchronized (this) {
            T[] tArr = this.f21639a;
            if (tArr != null) {
                t = tArr[0];
            } else {
                t = null;
            }
        }
        return t;
    }

    /* renamed from: d */
    public final void m256d(@NotNull InterfaceC11047k0 interfaceC11047k0) {
        synchronized (this) {
            if (interfaceC11047k0.mo115c() != null) {
                m255e(interfaceC11047k0.getIndex());
            }
        }
    }

    @PublishedApi
    @NotNull
    /* renamed from: e */
    public final T m255e(int i) {
        T[] tArr = this.f21639a;
        C10843j.m433c(tArr);
        f21638b.set(this, m258b() - 1);
        if (i < m258b()) {
            m253g(i, m258b());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C10843j.m433c(t);
                T t2 = tArr[i2];
                C10843j.m433c(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m253g(i, i2);
                    m254f(i2);
                }
            }
            while (true) {
                int i3 = (i * 2) + 1;
                if (i3 >= m258b()) {
                    break;
                }
                T[] tArr2 = this.f21639a;
                C10843j.m433c(tArr2);
                int i4 = i3 + 1;
                if (i4 < m258b()) {
                    T t3 = tArr2[i4];
                    C10843j.m433c(t3);
                    T t4 = tArr2[i3];
                    C10843j.m433c(t4);
                    if (((Comparable) t3).compareTo(t4) < 0) {
                        i3 = i4;
                    }
                }
                T t5 = tArr2[i];
                C10843j.m433c(t5);
                T t6 = tArr2[i3];
                C10843j.m433c(t6);
                if (((Comparable) t5).compareTo(t6) <= 0) {
                    break;
                }
                m253g(i, i3);
                i = i3;
            }
        }
        T t7 = tArr[m258b()];
        C10843j.m433c(t7);
        t7.mo114f(null);
        t7.setIndex(-1);
        tArr[m258b()] = null;
        return t7;
    }

    /* renamed from: f */
    public final void m254f(int i) {
        while (i > 0) {
            T[] tArr = this.f21639a;
            C10843j.m433c(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C10843j.m433c(t);
            T t2 = tArr[i];
            C10843j.m433c(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            m253g(i, i2);
            i = i2;
        }
    }

    /* renamed from: g */
    public final void m253g(int i, int i2) {
        T[] tArr = this.f21639a;
        C10843j.m433c(tArr);
        T t = tArr[i2];
        C10843j.m433c(t);
        T t2 = tArr[i];
        C10843j.m433c(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }
}
