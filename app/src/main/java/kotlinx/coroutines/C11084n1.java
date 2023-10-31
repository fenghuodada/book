package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10738b;
import kotlin.C10868p;
import kotlin.Deprecated;
import kotlin.EnumC10735a;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.C10859x;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC11017h1;
import kotlinx.coroutines.internal.AbstractC11067y;
import kotlinx.coroutines.internal.C11034f0;
import kotlinx.coroutines.internal.C11056q;
import kotlinx.coroutines.internal.C11057r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(level = EnumC10735a.ERROR, message = "This is internal API and may be removed in the future releases")
@SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 7 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 8 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 9 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 10 CompletionHandler.common.kt\nkotlinx/coroutines/CompletionHandler_commonKt\n+ 11 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 12 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 13 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1451:1\n705#1,2:1458\n366#1,2:1468\n368#1,4:1473\n372#1,4:1479\n376#1,2:1486\n366#1,2:1488\n368#1,4:1493\n372#1,4:1499\n376#1,2:1506\n177#1,2:1515\n706#1:1517\n177#1,2:1518\n177#1,2:1537\n177#1,2:1552\n705#1,2:1554\n705#1,2:1556\n177#1,2:1558\n705#1,2:1560\n177#1,2:1562\n177#1,2:1569\n177#1,2:1571\n1#2:1452\n1#2:1477\n1#2:1497\n28#3,4:1453\n28#3,4:1520\n28#3,4:1564\n28#3,4:1573\n20#4:1457\n20#4:1524\n20#4:1568\n20#4:1577\n288#5,2:1460\n288#5,2:1462\n19#6:1464\n162#7:1465\n162#7:1466\n153#7,4:1580\n75#8:1467\n75#8:1478\n75#8:1498\n75#8:1511\n341#9,3:1470\n344#9,3:1483\n341#9,3:1490\n344#9,3:1503\n341#9,3:1508\n344#9,3:1512\n47#10:1525\n22#11:1526\n22#11:1527\n13#11:1548\n13#11:1551\n13#11:1578\n13#11:1579\n13#11:1584\n13#11:1585\n134#12:1528\n73#12,3:1529\n135#12,5:1532\n314#13,9:1539\n323#13,2:1549\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n249#1:1458,2\n331#1:1468,2\n331#1:1473,4\n331#1:1479,4\n331#1:1486,2\n363#1:1488,2\n363#1:1493,4\n363#1:1499,4\n363#1:1506,2\n380#1:1515,2\n425#1:1517\n460#1:1518,2\n552#1:1537,2\n593#1:1552,2\n620#1:1554,2\n629#1:1556,2\n693#1:1558,2\n722#1:1560,2\n735#1:1562,2\n808#1:1569,2\n830#1:1571,2\n331#1:1477\n363#1:1497\n212#1:1453,4\n477#1:1520,4\n738#1:1564,4\n883#1:1573,4\n212#1:1457\n477#1:1524\n738#1:1568\n883#1:1577\n260#1:1460,2\n264#1:1462,2\n272#1:1464\n278#1:1465\n280#1:1466\n1217#1:1580,4\n283#1:1467\n331#1:1478\n363#1:1498\n371#1:1511\n331#1:1470,3\n331#1:1483,3\n363#1:1490,3\n363#1:1503,3\n367#1:1508,3\n367#1:1512,3\n482#1:1525\n494#1:1526\n504#1:1527\n560#1:1548\n576#1:1551\n923#1:1578\n973#1:1579\n1236#1:1584\n1258#1:1585\n525#1:1528\n525#1:1529,3\n525#1:1532,5\n558#1:1539,9\n558#1:1549,2\n*E\n"})
/* renamed from: kotlinx.coroutines.n1 */
/* loaded from: classes3.dex */
public class C11084n1 implements InterfaceC11017h1, InterfaceC11092p, InterfaceC11147u1 {
    @NotNull

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f21687a = AtomicReferenceFieldUpdater.newUpdater(C11084n1.class, Object.class, "_state");
    @NotNull

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f21688b = AtomicReferenceFieldUpdater.newUpdater(C11084n1.class, Object.class, "_parentHandle");
    @Volatile
    @Nullable
    private volatile Object _parentHandle;
    @Volatile
    @Nullable
    private volatile Object _state;

    @SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$AwaitContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1451:1\n1#2:1452\n*E\n"})
    /* renamed from: kotlinx.coroutines.n1$a */
    /* loaded from: classes3.dex */
    public static final class C11085a<T> extends C11020i<T> {
        @NotNull

        /* renamed from: i */
        public final C11084n1 f21689i;

        public C11085a(@NotNull InterfaceC10772d interfaceC10772d, @NotNull C11098r c11098r) {
            super(1, interfaceC10772d);
            this.f21689i = c11098r;
        }

        @Override // kotlinx.coroutines.C11020i
        @NotNull
        /* renamed from: o */
        public final Throwable mo180o(@NotNull C11084n1 c11084n1) {
            Throwable m177b;
            Object m207M = this.f21689i.m207M();
            return (!(m207M instanceof C11087c) || (m177b = ((C11087c) m207M).m177b()) == null) ? m207M instanceof C11137t ? ((C11137t) m207M).f21796a : c11084n1.mo188j() : m177b;
        }

        @Override // kotlinx.coroutines.C11020i
        @NotNull
        /* renamed from: y */
        public final String mo179y() {
            return "AwaitContinuation";
        }
    }

    /* renamed from: kotlinx.coroutines.n1$b */
    /* loaded from: classes3.dex */
    public static final class C11086b extends AbstractC11081m1 {
        @NotNull

        /* renamed from: e */
        public final C11084n1 f21690e;
        @NotNull

        /* renamed from: f */
        public final C11087c f21691f;
        @NotNull

        /* renamed from: g */
        public final C11089o f21692g;
        @Nullable

        /* renamed from: h */
        public final Object f21693h;

        public C11086b(@NotNull C11084n1 c11084n1, @NotNull C11087c c11087c, @NotNull C11089o c11089o, @Nullable Object obj) {
            this.f21690e = c11084n1;
            this.f21691f = c11087c;
            this.f21692g = c11089o;
            this.f21693h = obj;
        }

        @Override // kotlin.jvm.functions.InterfaceC10820l
        public final /* bridge */ /* synthetic */ C10868p invoke(Throwable th) {
            mo110l(th);
            return C10868p.f21418a;
        }

        @Override // kotlinx.coroutines.AbstractC11148v
        /* renamed from: l */
        public final void mo110l(@Nullable Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C11084n1.f21687a;
            C11084n1 c11084n1 = this.f21690e;
            c11084n1.getClass();
            C11089o m201T = C11084n1.m201T(this.f21692g);
            C11087c c11087c = this.f21691f;
            Object obj = this.f21693h;
            if (m201T == null || !c11084n1.m192b0(c11087c, m201T, obj)) {
                c11084n1.mo184t(c11084n1.m211I(c11087c, obj));
            }
        }
    }

    @SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$Finishing\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1451:1\n1#2:1452\n*E\n"})
    /* renamed from: kotlinx.coroutines.n1$c */
    /* loaded from: classes3.dex */
    public static final class C11087c implements InterfaceC10954c1 {
        @NotNull

        /* renamed from: b */
        public static final AtomicIntegerFieldUpdater f21694b = AtomicIntegerFieldUpdater.newUpdater(C11087c.class, "_isCompleting");
        @NotNull

        /* renamed from: c */
        public static final AtomicReferenceFieldUpdater f21695c = AtomicReferenceFieldUpdater.newUpdater(C11087c.class, Object.class, "_rootCause");
        @NotNull

        /* renamed from: d */
        public static final AtomicReferenceFieldUpdater f21696d = AtomicReferenceFieldUpdater.newUpdater(C11087c.class, Object.class, "_exceptionsHolder");
        @Volatile
        @Nullable
        private volatile Object _exceptionsHolder;
        @Volatile
        private volatile int _isCompleting = 0;
        @Volatile
        @Nullable
        private volatile Object _rootCause;
        @NotNull

        /* renamed from: a */
        public final C11100r1 f21697a;

        public C11087c(@NotNull C11100r1 c11100r1, @Nullable Throwable th) {
            this.f21697a = c11100r1;
            this._rootCause = th;
        }

        /* renamed from: a */
        public final void m178a(@NotNull Throwable th) {
            Throwable m177b = m177b();
            if (m177b == null) {
                f21695c.set(this, th);
            } else if (th == m177b) {
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21696d;
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    atomicReferenceFieldUpdater.set(this, th);
                } else if (obj instanceof Throwable) {
                    if (th == obj) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(obj);
                    arrayList.add(th);
                    atomicReferenceFieldUpdater.set(this, arrayList);
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
        }

        @Nullable
        /* renamed from: b */
        public final Throwable m177b() {
            return (Throwable) f21695c.get(this);
        }

        @Override // kotlinx.coroutines.InterfaceC10954c1
        /* renamed from: c */
        public final boolean mo165c() {
            return m177b() == null;
        }

        /* renamed from: d */
        public final boolean m176d() {
            return m177b() != null;
        }

        @Override // kotlinx.coroutines.InterfaceC10954c1
        @NotNull
        /* renamed from: e */
        public final C11100r1 mo164e() {
            return this.f21697a;
        }

        /* renamed from: f */
        public final boolean m175f() {
            return f21694b.get(this) != 0;
        }

        @NotNull
        /* renamed from: g */
        public final ArrayList m174g(@Nullable Throwable th) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21696d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            Throwable m177b = m177b();
            if (m177b != null) {
                arrayList.add(0, m177b);
            }
            if (th != null && !C10843j.m435a(th, m177b)) {
                arrayList.add(th);
            }
            atomicReferenceFieldUpdater.set(this, C11091o1.f21705e);
            return arrayList;
        }

        @NotNull
        public final String toString() {
            return "Finishing[cancelling=" + m176d() + ", completing=" + m175f() + ", rootCause=" + m177b() + ", exceptions=" + f21696d.get(this) + ", list=" + this.f21697a + ']';
        }
    }

    @SourceDebugExtension({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,367:1\n525#2:368\n*E\n"})
    /* renamed from: kotlinx.coroutines.n1$d */
    /* loaded from: classes3.dex */
    public static final class C11088d extends C11057r.AbstractC11058a {

        /* renamed from: d */
        public final /* synthetic */ C11084n1 f21698d;

        /* renamed from: e */
        public final /* synthetic */ Object f21699e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11088d(C11057r c11057r, C11084n1 c11084n1, Object obj) {
            super(c11057r);
            this.f21698d = c11084n1;
            this.f21699e = obj;
        }

        @Override // kotlinx.coroutines.internal.AbstractC11025b
        /* renamed from: c */
        public final C11034f0 mo173c(Object obj) {
            boolean z;
            C11057r c11057r = (C11057r) obj;
            if (this.f21698d.m207M() == this.f21699e) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            return C11056q.f21659a;
        }
    }

    public C11084n1(boolean z) {
        this._state = z ? C11091o1.f21707g : C11091o1.f21706f;
    }

    /* renamed from: T */
    public static C11089o m201T(C11057r c11057r) {
        while (c11057r.mo243k()) {
            c11057r = c11057r.m244j();
        }
        while (true) {
            c11057r = c11057r.m245i();
            if (!c11057r.mo243k()) {
                if (c11057r instanceof C11089o) {
                    return (C11089o) c11057r;
                }
                if (c11057r instanceof C11100r1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: Z */
    public static String m196Z(Object obj) {
        if (obj instanceof C11087c) {
            C11087c c11087c = (C11087c) obj;
            if (c11087c.m176d()) {
                return "Cancelling";
            }
            if (c11087c.m175f()) {
                return "Completing";
            }
        } else if (!(obj instanceof InterfaceC10954c1)) {
            return obj instanceof C11137t ? "Cancelled" : "Completed";
        } else if (!((InterfaceC10954c1) obj).mo165c()) {
            return "New";
        }
        return "Active";
    }

    /* renamed from: B */
    public final boolean m215B(Throwable th) {
        if (mo204Q()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC11082n interfaceC11082n = (InterfaceC11082n) f21688b.get(this);
        if (interfaceC11082n != null && interfaceC11082n != C11103s1.f21718a) {
            if (interfaceC11082n.mo163d(th) || z) {
                return true;
            }
            return false;
        }
        return z;
    }

    @NotNull
    /* renamed from: C */
    public String mo214C() {
        return "Job was cancelled";
    }

    /* renamed from: D */
    public boolean mo107D(@NotNull Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m181z(th) && mo210J();
    }

    /* renamed from: G */
    public final void m213G(InterfaceC10954c1 interfaceC10954c1, Object obj) {
        C11137t c11137t;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21688b;
        InterfaceC11082n interfaceC11082n = (InterfaceC11082n) atomicReferenceFieldUpdater.get(this);
        if (interfaceC11082n != null) {
            interfaceC11082n.mo116b();
            atomicReferenceFieldUpdater.set(this, C11103s1.f21718a);
        }
        C11151w c11151w = null;
        if (obj instanceof C11137t) {
            c11137t = (C11137t) obj;
        } else {
            c11137t = null;
        }
        if (c11137t != null) {
            th = c11137t.f21796a;
        } else {
            th = null;
        }
        if (interfaceC10954c1 instanceof AbstractC11081m1) {
            try {
                ((AbstractC11081m1) interfaceC10954c1).mo110l(th);
                return;
            } catch (Throwable th2) {
                mo206O(new C11151w("Exception in completion handler " + interfaceC10954c1 + " for " + this, th2));
                return;
            }
        }
        C11100r1 mo164e = interfaceC10954c1.mo164e();
        if (mo164e != null) {
            Object m246h = mo164e.m246h();
            C10843j.m432d(m246h, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (C11057r c11057r = (C11057r) m246h; !C10843j.m435a(c11057r, mo164e); c11057r = c11057r.m245i()) {
                if (c11057r instanceof AbstractC11081m1) {
                    AbstractC11081m1 abstractC11081m1 = (AbstractC11081m1) c11057r;
                    try {
                        abstractC11081m1.mo110l(th);
                    } catch (Throwable th3) {
                        if (c11151w != null) {
                            C10738b.m502a(c11151w, th3);
                        } else {
                            c11151w = new C11151w("Exception in completion handler " + abstractC11081m1 + " for " + this, th3);
                            C10868p c10868p = C10868p.f21418a;
                        }
                    }
                }
            }
            if (c11151w != null) {
                mo206O(c11151w);
            }
        }
    }

    /* renamed from: H */
    public final Throwable m212H(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Throwable;
        }
        if (z) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new C11022i1(mo214C(), null, this);
            }
            return th;
        }
        C10843j.m432d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((InterfaceC11147u1) obj).mo113v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I */
    public final Object m211I(C11087c c11087c, Object obj) {
        C11137t c11137t;
        Throwable th;
        Object obj2;
        boolean z;
        Throwable th2 = null;
        if (obj instanceof C11137t) {
            c11137t = (C11137t) obj;
        } else {
            c11137t = null;
        }
        if (c11137t != null) {
            th = c11137t.f21796a;
        } else {
            th = null;
        }
        synchronized (c11087c) {
            c11087c.m176d();
            ArrayList<Throwable> m174g = c11087c.m174g(th);
            if (m174g.isEmpty()) {
                if (c11087c.m176d()) {
                    th2 = new C11022i1(mo214C(), null, this);
                }
            } else {
                Iterator it = m174g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        th2 = next;
                        break;
                    }
                }
                th2 = th2;
                if (th2 == null) {
                    th2 = (Throwable) m174g.get(0);
                }
            }
            if (th2 != null && m174g.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(m174g.size()));
                for (Throwable th3 : m174g) {
                    if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        C10738b.m502a(th2, th3);
                    }
                }
            }
        }
        if (th2 != null && th2 != th) {
            obj = new C11137t(false, th2);
        }
        if (th2 != null) {
            if (!m215B(th2) && !mo109N(th2)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C10843j.m432d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                C11137t.f21795b.compareAndSet((C11137t) obj, 0, 1);
            }
        }
        mo199V(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21687a;
        if (obj instanceof InterfaceC10954c1) {
            obj2 = new C10973d1((InterfaceC10954c1) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c11087c, obj2) && atomicReferenceFieldUpdater.get(this) == c11087c) {
        }
        m213G(c11087c, obj);
        return obj;
    }

    /* renamed from: J */
    public boolean mo210J() {
        return true;
    }

    /* renamed from: K */
    public boolean mo209K() {
        return this instanceof C11098r;
    }

    /* renamed from: L */
    public final C11100r1 m208L(InterfaceC10954c1 interfaceC10954c1) {
        C11100r1 mo164e = interfaceC10954c1.mo164e();
        if (mo164e == null) {
            if (interfaceC10954c1 instanceof C11102s0) {
                return new C11100r1();
            }
            if (interfaceC10954c1 instanceof AbstractC11081m1) {
                m198X((AbstractC11081m1) interfaceC10954c1);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + interfaceC10954c1).toString());
        }
        return mo164e;
    }

    @Nullable
    /* renamed from: M */
    public final Object m207M() {
        while (true) {
            Object obj = f21687a.get(this);
            if (!(obj instanceof AbstractC11067y)) {
                return obj;
            }
            ((AbstractC11067y) obj).mo228a(this);
        }
    }

    /* renamed from: N */
    public boolean mo109N(@NotNull Throwable th) {
        return false;
    }

    /* renamed from: O */
    public void mo206O(@NotNull C11151w c11151w) {
        throw c11151w;
    }

    /* renamed from: P */
    public final void m205P(@Nullable InterfaceC11017h1 interfaceC11017h1) {
        C11103s1 c11103s1 = C11103s1.f21718a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21688b;
        if (interfaceC11017h1 == null) {
            atomicReferenceFieldUpdater.set(this, c11103s1);
            return;
        }
        interfaceC11017h1.start();
        InterfaceC11082n mo187k = interfaceC11017h1.mo187k(this);
        atomicReferenceFieldUpdater.set(this, mo187k);
        if (!(m207M() instanceof InterfaceC10954c1)) {
            mo187k.mo116b();
            atomicReferenceFieldUpdater.set(this, c11103s1);
        }
    }

    /* renamed from: Q */
    public boolean mo204Q() {
        return this instanceof C10951c;
    }

    @Nullable
    /* renamed from: R */
    public final Object m203R(@Nullable Object obj) {
        Object m194a0;
        C11137t c11137t;
        do {
            m194a0 = m194a0(m207M(), obj);
            if (m194a0 == C11091o1.f21701a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof C11137t) {
                    c11137t = (C11137t) obj;
                } else {
                    c11137t = null;
                }
                if (c11137t != null) {
                    th = c11137t.f21796a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (m194a0 == C11091o1.f21703c);
        return m194a0;
    }

    @NotNull
    /* renamed from: S */
    public String mo202S() {
        return getClass().getSimpleName();
    }

    /* renamed from: U */
    public final void m200U(C11100r1 c11100r1, Throwable th) {
        Object m246h = c11100r1.m246h();
        C10843j.m432d(m246h, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C11151w c11151w = null;
        for (C11057r c11057r = (C11057r) m246h; !C10843j.m435a(c11057r, c11100r1); c11057r = c11057r.m245i()) {
            if (c11057r instanceof AbstractC11072j1) {
                AbstractC11081m1 abstractC11081m1 = (AbstractC11081m1) c11057r;
                try {
                    abstractC11081m1.mo110l(th);
                } catch (Throwable th2) {
                    if (c11151w != null) {
                        C10738b.m502a(c11151w, th2);
                    } else {
                        c11151w = new C11151w("Exception in completion handler " + abstractC11081m1 + " for " + this, th2);
                        C10868p c10868p = C10868p.f21418a;
                    }
                }
            }
        }
        if (c11151w != null) {
            mo206O(c11151w);
        }
        m215B(th);
    }

    /* renamed from: V */
    public void mo199V(@Nullable Object obj) {
    }

    /* renamed from: W */
    public void mo170W() {
    }

    /* renamed from: X */
    public final void m198X(AbstractC11081m1 abstractC11081m1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z;
        C11100r1 c11100r1 = new C11100r1();
        abstractC11081m1.getClass();
        C11057r.f21661b.lazySet(c11100r1, abstractC11081m1);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C11057r.f21660a;
        atomicReferenceFieldUpdater2.lazySet(c11100r1, abstractC11081m1);
        while (true) {
            if (abstractC11081m1.m246h() == abstractC11081m1) {
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(abstractC11081m1, abstractC11081m1, c11100r1)) {
                        z = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(abstractC11081m1) != abstractC11081m1) {
                        z = false;
                        continue;
                        break;
                    }
                }
                if (z) {
                    c11100r1.m247g(abstractC11081m1);
                    break;
                }
            } else {
                break;
            }
        }
        C11057r m245i = abstractC11081m1.m245i();
        do {
            atomicReferenceFieldUpdater = f21687a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC11081m1, m245i)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC11081m1);
    }

    /* renamed from: Y */
    public final int m197Y(Object obj) {
        boolean z = obj instanceof C11102s0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21687a;
        boolean z2 = false;
        if (z) {
            if (((C11102s0) obj).f21717a) {
                return 0;
            }
            C11102s0 c11102s0 = C11091o1.f21707g;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c11102s0)) {
                    z2 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!z2) {
                return -1;
            }
            mo170W();
            return 1;
        } else if (!(obj instanceof C10949b1)) {
            return 0;
        } else {
            C11100r1 c11100r1 = ((C10949b1) obj).f21500a;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c11100r1)) {
                    z2 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!z2) {
                return -1;
            }
            mo170W();
            return 1;
        }
    }

    @Override // kotlin.coroutines.InterfaceC10775f.InterfaceC10778b, kotlin.coroutines.InterfaceC10775f
    @Nullable
    /* renamed from: a */
    public final <E extends InterfaceC10775f.InterfaceC10778b> E mo195a(@NotNull InterfaceC10775f.InterfaceC10780c<E> interfaceC10780c) {
        return (E) InterfaceC10775f.InterfaceC10778b.C10779a.m459a(this, interfaceC10780c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Throwable, T] */
    /* renamed from: a0 */
    public final Object m194a0(Object obj, Object obj2) {
        C10973d1 c10973d1;
        boolean z;
        C11087c c11087c;
        C11137t c11137t;
        C11089o c11089o;
        C11034f0 c11034f0;
        if (!(obj instanceof InterfaceC10954c1)) {
            return C11091o1.f21701a;
        }
        boolean z2 = true;
        boolean z3 = false;
        if (((obj instanceof C11102s0) || (obj instanceof AbstractC11081m1)) && !(obj instanceof C11089o) && !(obj2 instanceof C11137t)) {
            InterfaceC10954c1 interfaceC10954c1 = (InterfaceC10954c1) obj;
            if (obj2 instanceof InterfaceC10954c1) {
                c10973d1 = new C10973d1((InterfaceC10954c1) obj2);
            } else {
                c10973d1 = obj2;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21687a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC10954c1, c10973d1)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != interfaceC10954c1) {
                    z = false;
                    break;
                }
            }
            if (!z) {
                z2 = false;
            } else {
                mo199V(obj2);
                m213G(interfaceC10954c1, obj2);
            }
            if (z2) {
                return obj2;
            }
            return C11091o1.f21703c;
        }
        InterfaceC10954c1 interfaceC10954c12 = (InterfaceC10954c1) obj;
        C11100r1 m208L = m208L(interfaceC10954c12);
        if (m208L == null) {
            return C11091o1.f21703c;
        }
        C11089o c11089o2 = null;
        if (interfaceC10954c12 instanceof C11087c) {
            c11087c = (C11087c) interfaceC10954c12;
        } else {
            c11087c = null;
        }
        if (c11087c == null) {
            c11087c = new C11087c(m208L, null);
        }
        C10859x c10859x = new C10859x();
        synchronized (c11087c) {
            if (c11087c.m175f()) {
                c11034f0 = C11091o1.f21701a;
            } else {
                C11087c.f21694b.set(c11087c, 1);
                if (c11087c != interfaceC10954c12) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f21687a;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC10954c12, c11087c)) {
                            z3 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != interfaceC10954c12) {
                            break;
                        }
                    }
                    if (!z3) {
                        c11034f0 = C11091o1.f21703c;
                    }
                }
                boolean m176d = c11087c.m176d();
                if (obj2 instanceof C11137t) {
                    c11137t = (C11137t) obj2;
                } else {
                    c11137t = null;
                }
                if (c11137t != null) {
                    c11087c.m178a(c11137t.f21796a);
                }
                ?? m177b = Boolean.valueOf(true ^ m176d).booleanValue() ? c11087c.m177b() : 0;
                c10859x.f21410a = m177b;
                C10868p c10868p = C10868p.f21418a;
                if (m177b != 0) {
                    m200U(m208L, m177b);
                }
                if (interfaceC10954c12 instanceof C11089o) {
                    c11089o = (C11089o) interfaceC10954c12;
                } else {
                    c11089o = null;
                }
                if (c11089o == null) {
                    C11100r1 mo164e = interfaceC10954c12.mo164e();
                    if (mo164e != null) {
                        c11089o2 = m201T(mo164e);
                    }
                } else {
                    c11089o2 = c11089o;
                }
                if (c11089o2 != null && m192b0(c11087c, c11089o2, obj2)) {
                    return C11091o1.f21702b;
                }
                return m211I(c11087c, obj2);
            }
            return c11034f0;
        }
    }

    /* renamed from: b */
    public final boolean m193b(Object obj, C11100r1 c11100r1, AbstractC11081m1 abstractC11081m1) {
        boolean z;
        boolean z2;
        C11088d c11088d = new C11088d(abstractC11081m1, this, obj);
        do {
            C11057r m244j = c11100r1.m244j();
            C11057r.f21661b.lazySet(abstractC11081m1, m244j);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C11057r.f21660a;
            atomicReferenceFieldUpdater.lazySet(abstractC11081m1, c11100r1);
            c11088d.f21664c = c11100r1;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(m244j, c11100r1, c11088d)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(m244j) != c11100r1) {
                    z = false;
                    break;
                }
            }
            if (!z) {
                z2 = false;
            } else if (c11088d.mo228a(m244j) == null) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        } while (!z2);
        return false;
    }

    /* renamed from: b0 */
    public final boolean m192b0(C11087c c11087c, C11089o c11089o, Object obj) {
        while (InterfaceC11017h1.C11018a.m296a(c11089o.f21700e, false, new C11086b(this, c11087c, c11089o, obj), 1) == C11103s1.f21718a) {
            c11089o = m201T(c11089o);
            if (c11089o == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC11017h1
    /* renamed from: c */
    public boolean mo191c() {
        Object m207M = m207M();
        return (m207M instanceof InterfaceC10954c1) && ((InterfaceC10954c1) m207M).mo165c();
    }

    @Override // kotlin.coroutines.InterfaceC10775f
    @NotNull
    /* renamed from: f */
    public final InterfaceC10775f mo190f(@NotNull InterfaceC10775f interfaceC10775f) {
        return InterfaceC10775f.InterfaceC10778b.C10779a.m457c(this, interfaceC10775f);
    }

    @Override // kotlin.coroutines.InterfaceC10775f.InterfaceC10778b
    @NotNull
    public final InterfaceC10775f.InterfaceC10780c<?> getKey() {
        return InterfaceC11017h1.C11019b.f21607a;
    }

    @Override // kotlinx.coroutines.InterfaceC11017h1
    @Nullable
    public final InterfaceC11017h1 getParent() {
        InterfaceC11082n interfaceC11082n = (InterfaceC11082n) f21688b.get(this);
        if (interfaceC11082n != null) {
            return interfaceC11082n.getParent();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlinx.coroutines.b1] */
    @Override // kotlinx.coroutines.InterfaceC11017h1
    @NotNull
    /* renamed from: h */
    public final InterfaceC11096q0 mo189h(boolean z, boolean z2, @NotNull InterfaceC10820l<? super Throwable, C10868p> interfaceC10820l) {
        AbstractC11081m1 abstractC11081m1;
        boolean z3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C11137t c11137t;
        Throwable th;
        Throwable th2 = null;
        if (z) {
            if (interfaceC10820l instanceof AbstractC11072j1) {
                abstractC11081m1 = (AbstractC11072j1) interfaceC10820l;
            } else {
                abstractC11081m1 = null;
            }
            if (abstractC11081m1 == null) {
                abstractC11081m1 = new C10982f1(interfaceC10820l);
            }
        } else {
            if (interfaceC10820l instanceof AbstractC11081m1) {
                abstractC11081m1 = (AbstractC11081m1) interfaceC10820l;
            } else {
                abstractC11081m1 = null;
            }
            if (abstractC11081m1 == null) {
                abstractC11081m1 = new C11014g1(interfaceC10820l);
            }
        }
        abstractC11081m1.f21686d = this;
        while (true) {
            Object m207M = m207M();
            if (m207M instanceof C11102s0) {
                C11102s0 c11102s0 = (C11102s0) m207M;
                if (c11102s0.f21717a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f21687a;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, m207M, abstractC11081m1)) {
                            z3 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != m207M) {
                            z3 = false;
                            break;
                        }
                    }
                    if (z3) {
                        return abstractC11081m1;
                    }
                } else {
                    C11100r1 c11100r1 = new C11100r1();
                    if (!c11102s0.f21717a) {
                        c11100r1 = new C10949b1(c11100r1);
                    }
                    do {
                        atomicReferenceFieldUpdater = f21687a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, c11102s0, c11100r1)) {
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == c11102s0);
                }
            } else if (m207M instanceof InterfaceC10954c1) {
                C11100r1 mo164e = ((InterfaceC10954c1) m207M).mo164e();
                if (mo164e == null) {
                    C10843j.m432d(m207M, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m198X((AbstractC11081m1) m207M);
                } else {
                    InterfaceC11096q0 interfaceC11096q0 = C11103s1.f21718a;
                    if (z && (m207M instanceof C11087c)) {
                        synchronized (m207M) {
                            th = ((C11087c) m207M).m177b();
                            if (th == null || ((interfaceC10820l instanceof C11089o) && !((C11087c) m207M).m175f())) {
                                if (m193b(m207M, mo164e, abstractC11081m1)) {
                                    if (th == null) {
                                        return abstractC11081m1;
                                    }
                                    interfaceC11096q0 = abstractC11081m1;
                                }
                            }
                            C10868p c10868p = C10868p.f21418a;
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z2) {
                            interfaceC10820l.invoke(th);
                        }
                        return interfaceC11096q0;
                    } else if (m193b(m207M, mo164e, abstractC11081m1)) {
                        return abstractC11081m1;
                    }
                }
            } else {
                if (z2) {
                    if (m207M instanceof C11137t) {
                        c11137t = (C11137t) m207M;
                    } else {
                        c11137t = null;
                    }
                    if (c11137t != null) {
                        th2 = c11137t.f21796a;
                    }
                    interfaceC10820l.invoke(th2);
                }
                return C11103s1.f21718a;
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC11017h1
    @NotNull
    /* renamed from: j */
    public final CancellationException mo188j() {
        Object m207M = m207M();
        CancellationException cancellationException = null;
        if (m207M instanceof C11087c) {
            Throwable m177b = ((C11087c) m207M).m177b();
            if (m177b != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (m177b instanceof CancellationException) {
                    cancellationException = (CancellationException) m177b;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = mo214C();
                    }
                    return new C11022i1(concat, m177b, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(m207M instanceof InterfaceC10954c1)) {
            if (m207M instanceof C11137t) {
                Throwable th = ((C11137t) m207M).f21796a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new C11022i1(mo214C(), th, this);
                }
                return cancellationException;
            }
            return new C11022i1(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    @Override // kotlinx.coroutines.InterfaceC11017h1
    @NotNull
    /* renamed from: k */
    public final InterfaceC11082n mo187k(@NotNull C11084n1 c11084n1) {
        InterfaceC11096q0 m296a = InterfaceC11017h1.C11018a.m296a(this, true, new C11089o(c11084n1), 2);
        C10843j.m432d(m296a, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC11082n) m296a;
    }

    @Override // kotlin.coroutines.InterfaceC10775f
    @NotNull
    /* renamed from: l */
    public final InterfaceC10775f mo186l(@NotNull InterfaceC10775f.InterfaceC10780c<?> interfaceC10780c) {
        return InterfaceC10775f.InterfaceC10778b.C10779a.m458b(this, interfaceC10780c);
    }

    @Override // kotlinx.coroutines.InterfaceC11017h1
    @NotNull
    /* renamed from: m */
    public final InterfaceC11096q0 mo185m(@NotNull InterfaceC10820l<? super Throwable, C10868p> interfaceC10820l) {
        return mo189h(false, true, interfaceC10820l);
    }

    @Override // kotlinx.coroutines.InterfaceC11017h1
    public final boolean start() {
        int m197Y;
        do {
            m197Y = m197Y(m207M());
            if (m197Y == 0) {
                return false;
            }
        } while (m197Y != 1);
        return true;
    }

    /* renamed from: t */
    public void mo184t(@Nullable Object obj) {
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo202S() + '{' + m196Z(m207M()) + '}');
        sb.append('@');
        sb.append(C11016h0.m298a(this));
        return sb.toString();
    }

    @Override // kotlinx.coroutines.InterfaceC11147u1
    @NotNull
    /* renamed from: v */
    public final CancellationException mo113v() {
        Throwable th;
        Object m207M = m207M();
        if (m207M instanceof C11087c) {
            th = ((C11087c) m207M).m177b();
        } else if (m207M instanceof C11137t) {
            th = ((C11137t) m207M).f21796a;
        } else if (m207M instanceof InterfaceC10954c1) {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + m207M).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        return cancellationException == null ? new C11022i1("Parent job is ".concat(m196Z(m207M)), th, this) : cancellationException;
    }

    @Override // kotlin.coroutines.InterfaceC10775f
    /* renamed from: w */
    public final <R> R mo183w(R r, @NotNull InterfaceC10824p<? super R, ? super InterfaceC10775f.InterfaceC10778b, ? extends R> operation) {
        C10843j.m430f(operation, "operation");
        return operation.invoke(r, this);
    }

    @Override // kotlinx.coroutines.InterfaceC11092p
    /* renamed from: x */
    public final void mo171x(@NotNull C11084n1 c11084n1) {
        m181z(c11084n1);
    }

    @Override // kotlinx.coroutines.InterfaceC11017h1
    /* renamed from: y */
    public final void mo182y(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C11022i1(mo214C(), null, this);
        }
        m181z(cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ca, code lost:
        r10 = kotlinx.coroutines.C11091o1.f21701a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fa, code lost:
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ca A[EDGE_INSN: B:96:0x00ca->B:68:0x00ca ?: BREAK  , SYNTHETIC] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m181z(@org.jetbrains.annotations.Nullable java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C11084n1.m181z(java.lang.Object):boolean");
    }
}
