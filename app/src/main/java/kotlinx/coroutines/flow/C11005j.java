package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C11020i;
import kotlinx.coroutines.InterfaceC11017h1;
import kotlinx.coroutines.flow.internal.AbstractC10995b;
import kotlinx.coroutines.flow.internal.C10999f;
import kotlinx.coroutines.internal.C11034f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,428:1\n18#2:429\n18#2:443\n28#3,4:430\n28#3,4:437\n20#4:434\n20#4:441\n13579#5,2:435\n329#6:442\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n*L\n315#1:429\n396#1:443\n324#1:430,4\n352#1:437,4\n324#1:434\n352#1:441\n348#1:435,2\n385#1:442\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.j */
/* loaded from: classes3.dex */
public final class C11005j<T> extends AbstractC10995b<C11008l> implements InterfaceC10992h<T>, InterfaceC10985b {
    @NotNull

    /* renamed from: e */
    public static final AtomicReferenceFieldUpdater f21587e = AtomicReferenceFieldUpdater.newUpdater(C11005j.class, Object.class, "_state");
    @Volatile
    @Nullable
    private volatile Object _state;

    /* renamed from: d */
    public int f21588d;

    @DebugMetadata(m454c = "kotlinx.coroutines.flow.StateFlowImpl", m453f = "StateFlow.kt", m452i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m451l = {384, 396, 401}, m450m = "collect", m449n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, m448s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: kotlinx.coroutines.flow.j$a */
    /* loaded from: classes3.dex */
    public static final class C11006a extends AbstractC10786c {

        /* renamed from: a */
        public C11005j f21589a;

        /* renamed from: b */
        public InterfaceC10986c f21590b;

        /* renamed from: c */
        public C11008l f21591c;

        /* renamed from: d */
        public InterfaceC11017h1 f21592d;

        /* renamed from: e */
        public Object f21593e;

        /* renamed from: f */
        public /* synthetic */ Object f21594f;

        /* renamed from: g */
        public final /* synthetic */ C11005j<T> f21595g;

        /* renamed from: h */
        public int f21596h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11006a(C11005j<T> c11005j, InterfaceC10772d<? super C11006a> interfaceC10772d) {
            super(interfaceC10772d);
            this.f21595g = c11005j;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21594f = obj;
            this.f21596h |= Integer.MIN_VALUE;
            return this.f21595g.mo304a(null, this);
        }
    }

    public C11005j(@NotNull Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e7, code lost:
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00eb, code lost:
        if (kotlin.jvm.internal.C10843j.m435a(r0, r2) != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:14:0x003b, B:51:0x00ce, B:53:0x00d6, B:56:0x00dd, B:57:0x00e1, B:61:0x00e7, B:71:0x0108, B:76:0x011f, B:77:0x0137, B:84:0x014a, B:85:0x014f, B:88:0x0158, B:80:0x0141, B:63:0x00ed, B:67:0x00f4, B:19:0x0052, B:22:0x005d, B:50:0x00bf), top: B:98:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011f A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:14:0x003b, B:51:0x00ce, B:53:0x00d6, B:56:0x00dd, B:57:0x00e1, B:61:0x00e7, B:71:0x0108, B:76:0x011f, B:77:0x0137, B:84:0x014a, B:85:0x014f, B:88:0x0158, B:80:0x0141, B:63:0x00ed, B:67:0x00f4, B:19:0x0052, B:22:0x005d, B:50:0x00bf), top: B:98:0x0029 }] */
    /* JADX WARN: Type inference failed for: r12v3, types: [kotlinx.coroutines.flow.c] */
    /* JADX WARN: Type inference failed for: r12v6, types: [kotlinx.coroutines.flow.c] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r2v2, types: [S extends kotlinx.coroutines.flow.internal.c<?>[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.flow.internal.c[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [S extends kotlinx.coroutines.flow.internal.c<?>[], kotlinx.coroutines.flow.internal.c[]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x011d -> B:51:0x00ce). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x015a -> B:51:0x00ce). Please submit an issue!!! */
    @Override // kotlinx.coroutines.flow.InterfaceC10985b
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo304a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.InterfaceC10986c<? super T> r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.InterfaceC10772d<?> r19) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C11005j.mo304a(kotlinx.coroutines.flow.c, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.InterfaceC10986c
    @Nullable
    /* renamed from: b */
    public final Object mo299b(T t, @NotNull InterfaceC10772d<? super C10868p> interfaceC10772d) {
        setValue(t);
        return C10868p.f21418a;
    }

    /* renamed from: d */
    public final T m303d() {
        C11034f0 c11034f0 = C10999f.f21577a;
        T t = (T) f21587e.get(this);
        if (t == c11034f0) {
            return null;
        }
        return t;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC10992h
    public final void setValue(T t) {
        int i;
        Object obj;
        C11034f0 c11034f0;
        boolean z;
        boolean z2;
        if (t == null) {
            t = (T) C10999f.f21577a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21587e;
            if (!C10843j.m435a(atomicReferenceFieldUpdater.get(this), t)) {
                atomicReferenceFieldUpdater.set(this, t);
                int i2 = this.f21588d;
                if ((i2 & 1) == 0) {
                    int i3 = i2 + 1;
                    this.f21588d = i3;
                    Object obj2 = this.f21571a;
                    C10868p c10868p = C10868p.f21418a;
                    while (true) {
                        C11008l[] c11008lArr = (C11008l[]) obj2;
                        if (c11008lArr != null) {
                            for (C11008l c11008l : c11008lArr) {
                                if (c11008l != null) {
                                    while (true) {
                                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C11008l.f21599a;
                                        Object obj3 = atomicReferenceFieldUpdater2.get(c11008l);
                                        if (obj3 != null && obj3 != (c11034f0 = C11007k.f21598b)) {
                                            C11034f0 c11034f02 = C11007k.f21597a;
                                            if (obj3 == c11034f02) {
                                                while (true) {
                                                    if (atomicReferenceFieldUpdater2.compareAndSet(c11008l, obj3, c11034f0)) {
                                                        z = true;
                                                        break;
                                                    } else if (atomicReferenceFieldUpdater2.get(c11008l) != obj3) {
                                                        z = false;
                                                        break;
                                                    }
                                                }
                                                if (z) {
                                                    break;
                                                }
                                            } else {
                                                while (true) {
                                                    if (atomicReferenceFieldUpdater2.compareAndSet(c11008l, obj3, c11034f02)) {
                                                        z2 = true;
                                                        break;
                                                    } else if (atomicReferenceFieldUpdater2.get(c11008l) != obj3) {
                                                        z2 = false;
                                                        break;
                                                    }
                                                }
                                                if (z2) {
                                                    ((C11020i) obj3).resumeWith(C10868p.f21418a);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        synchronized (this) {
                            i = this.f21588d;
                            if (i == i3) {
                                break;
                            }
                            obj = this.f21571a;
                            C10868p c10868p2 = C10868p.f21418a;
                        }
                        obj2 = obj;
                        i3 = i;
                    }
                    this.f21588d = i3 + 1;
                } else {
                    this.f21588d = i2 + 2;
                }
            }
        }
    }
}
