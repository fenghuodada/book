package kotlinx.coroutines.channels;

import androidx.core.p003os.C0740h;
import androidx.datastore.core.C1105o;
import androidx.datastore.core.C1107q;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.coroutines.intrinsics.C10783b;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.functions.InterfaceC10825q;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10833a0;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C11020i;
import kotlinx.coroutines.C11073k;
import kotlinx.coroutines.InterfaceC10974d2;
import kotlinx.coroutines.InterfaceC11015h;
import kotlinx.coroutines.channels.C10963e;
import kotlinx.coroutines.internal.AbstractC11028c0;
import kotlinx.coroutines.internal.C11032e0;
import kotlinx.coroutines.internal.C11034f0;
import kotlinx.coroutines.internal.C11051m0;
import kotlinx.coroutines.internal.C11065w;
import kotlinx.coroutines.internal.C11066x;
import kotlinx.coroutines.selects.C11119a;
import kotlinx.coroutines.selects.InterfaceC11121b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 7 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n+ 8 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 9 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 10 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3055:1\n273#1,6:3058\n280#1,68:3065\n374#1,18:3156\n244#1:3174\n269#1,10:3175\n280#1,48:3186\n395#1:3234\n334#1,14:3235\n399#1,3:3250\n244#1:3263\n269#1,10:3264\n280#1,68:3275\n244#1:3353\n269#1,10:3354\n280#1,68:3365\n244#1:3437\n269#1,10:3438\n280#1,68:3449\n886#1,52:3519\n964#1,8:3575\n858#1:3583\n882#1,33:3584\n974#1:3617\n916#1,14:3618\n935#1,3:3633\n979#1,6:3636\n886#1,52:3650\n964#1,8:3706\n858#1:3714\n882#1,33:3715\n974#1:3748\n916#1,14:3749\n935#1,3:3764\n979#1,6:3767\n858#1:3782\n882#1,48:3783\n935#1,3:3832\n858#1:3835\n882#1,48:3836\n935#1,3:3885\n244#1:3897\n269#1,10:3898\n280#1,68:3909\n858#1:3978\n882#1,48:3979\n935#1,3:4028\n1#2:3056\n3038#3:3057\n3038#3:3064\n3038#3:3185\n3038#3:3274\n3038#3:3364\n3038#3:3436\n3038#3:3448\n3038#3:3518\n3038#3:3781\n3038#3:3888\n3038#3:3889\n3052#3:3890\n3052#3:3891\n3051#3:3892\n3051#3:3893\n3051#3:3894\n3052#3:3895\n3051#3:3896\n3038#3:3908\n3039#3:4031\n3038#3:4032\n3038#3:4033\n3038#3:4034\n3039#3:4035\n3038#3:4036\n3039#3:4059\n3038#3:4060\n3038#3:4061\n3039#3:4062\n3038#3:4112\n3039#3:4113\n3039#3:4114\n3039#3:4132\n3039#3:4133\n314#4,9:3133\n323#4,2:3150\n332#4,4:3152\n336#4,8:3253\n314#4,9:3344\n323#4,2:3434\n332#4,4:3571\n336#4,8:3642\n332#4,4:3702\n336#4,8:3773\n218#5:3142\n219#5:3145\n218#5:3146\n219#5:3149\n61#6,2:3143\n61#6,2:3147\n61#6,2:3261\n269#7:3249\n269#7:3343\n269#7:3433\n269#7:3517\n269#7:3977\n882#8:3632\n882#8:3763\n882#8:3831\n882#8:3884\n882#8:4027\n37#9,11:4037\n37#9,11:4048\n72#10,3:4063\n46#10,8:4066\n72#10,3:4074\n46#10,8:4077\n46#10,8:4085\n72#10,3:4093\n46#10,8:4096\n46#10,8:4104\n766#11:4115\n857#11,2:4116\n2310#11,14:4118\n766#11:4134\n857#11,2:4135\n2310#11,14:4137\n766#11:4151\n857#11,2:4152\n2310#11,14:4154\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n*L\n113#1:3058,6\n113#1:3065,68\n154#1:3156,18\n154#1:3174\n154#1:3175,10\n154#1:3186,48\n154#1:3234\n154#1:3235,14\n154#1:3250,3\n194#1:3263\n194#1:3264,10\n194#1:3275,68\n225#1:3353\n225#1:3354,10\n225#1:3365,68\n391#1:3437\n391#1:3438,10\n391#1:3449,68\n667#1:3519,52\n696#1:3575,8\n696#1:3583\n696#1:3584,33\n696#1:3617\n696#1:3618,14\n696#1:3633,3\n696#1:3636,6\n732#1:3650,52\n748#1:3706,8\n748#1:3714\n748#1:3715,33\n748#1:3748\n748#1:3749,14\n748#1:3764,3\n748#1:3767,6\n781#1:3782\n781#1:3783,48\n781#1:3832,3\n971#1:3835\n971#1:3836,48\n971#1:3885,3\n1464#1:3897\n1464#1:3898,10\n1464#1:3909,68\n1512#1:3978\n1512#1:3979,48\n1512#1:4028,3\n70#1:3057\n113#1:3064\n154#1:3185\n194#1:3274\n225#1:3364\n278#1:3436\n391#1:3448\n606#1:3518\n771#1:3781\n1007#1:3888\n1056#1:3889\n1374#1:3890\n1376#1:3891\n1406#1:3892\n1416#1:3893\n1425#1:3894\n1426#1:3895\n1433#1:3896\n1464#1:3908\n1865#1:4031\n1867#1:4032\n1869#1:4033\n1882#1:4034\n1893#1:4035\n1894#1:4036\n2196#1:4059\n2209#1:4060\n2219#1:4061\n2222#1:4062\n2539#1:4112\n2541#1:4113\n2566#1:4114\n2628#1:4132\n2629#1:4133\n134#1:3133,9\n134#1:3150,2\n153#1:3152,4\n153#1:3253,8\n221#1:3344,9\n221#1:3434,2\n695#1:3571,4\n695#1:3642,8\n746#1:3702,4\n746#1:3773,8\n138#1:3142\n138#1:3145\n141#1:3146\n141#1:3149\n138#1:3143,2\n141#1:3147,2\n183#1:3261,2\n154#1:3249\n194#1:3343\n225#1:3433\n391#1:3517\n1464#1:3977\n696#1:3632\n748#1:3763\n781#1:3831\n971#1:3884\n1512#1:4027\n2098#1:4037,11\n2153#1:4048,11\n2361#1:4063,3\n2361#1:4066,8\n2416#1:4074,3\n2416#1:4077,8\n2435#1:4085,8\n2465#1:4093,3\n2465#1:4096,8\n2526#1:4104,8\n2575#1:4115\n2575#1:4116,2\n2576#1:4118,14\n2640#1:4134\n2640#1:4135,2\n2641#1:4137,14\n2681#1:4151\n2681#1:4152,2\n2682#1:4154,14\n*E\n"})
/* renamed from: kotlinx.coroutines.channels.a */
/* loaded from: classes3.dex */
public class C10956a<E> {
    @NotNull

    /* renamed from: c */
    public static final AtomicLongFieldUpdater f21506c = AtomicLongFieldUpdater.newUpdater(C10956a.class, "sendersAndCloseStatus");
    @NotNull

    /* renamed from: d */
    public static final AtomicLongFieldUpdater f21507d = AtomicLongFieldUpdater.newUpdater(C10956a.class, "receivers");
    @NotNull

    /* renamed from: e */
    public static final AtomicLongFieldUpdater f21508e = AtomicLongFieldUpdater.newUpdater(C10956a.class, "bufferEnd");
    @NotNull

    /* renamed from: f */
    public static final AtomicLongFieldUpdater f21509f = AtomicLongFieldUpdater.newUpdater(C10956a.class, "completedExpandBuffersAndPauseFlag");
    @NotNull

    /* renamed from: g */
    public static final AtomicReferenceFieldUpdater f21510g = AtomicReferenceFieldUpdater.newUpdater(C10956a.class, Object.class, "sendSegment");
    @NotNull

    /* renamed from: h */
    public static final AtomicReferenceFieldUpdater f21511h = AtomicReferenceFieldUpdater.newUpdater(C10956a.class, Object.class, "receiveSegment");
    @NotNull

    /* renamed from: i */
    public static final AtomicReferenceFieldUpdater f21512i = AtomicReferenceFieldUpdater.newUpdater(C10956a.class, Object.class, "bufferEndSegment");
    @NotNull

    /* renamed from: j */
    public static final AtomicReferenceFieldUpdater f21513j = AtomicReferenceFieldUpdater.newUpdater(C10956a.class, Object.class, "_closeCause");
    @NotNull

    /* renamed from: k */
    public static final AtomicReferenceFieldUpdater f21514k = AtomicReferenceFieldUpdater.newUpdater(C10956a.class, Object.class, "closeHandler");
    @Volatile
    @Nullable
    private volatile Object _closeCause;

    /* renamed from: a */
    public final int f21515a;
    @JvmField
    @Nullable

    /* renamed from: b */
    public final InterfaceC10820l<E, C10868p> f21516b;
    @Volatile
    private volatile long bufferEnd;
    @Volatile
    @Nullable
    private volatile Object bufferEndSegment;
    @Volatile
    @Nullable
    private volatile Object closeHandler;
    @Volatile
    private volatile long completedExpandBuffersAndPauseFlag;
    @Volatile
    @Nullable
    private volatile Object receiveSegment;
    @Volatile
    private volatile long receivers;
    @Volatile
    @Nullable
    private volatile Object sendSegment;
    @Volatile
    private volatile long sendersAndCloseStatus;

    @SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n+ 2 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3055:1\n886#2,52:3056\n964#2,8:3112\n858#2:3120\n882#2,33:3121\n974#2:3154\n916#2,14:3155\n935#2,3:3170\n979#2,6:3173\n332#3,4:3108\n336#3,8:3179\n882#4:3169\n61#5,2:3187\n61#5,2:3190\n1#6:3189\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n*L\n1590#1:3056,52\n1627#1:3112,8\n1627#1:3120\n1627#1:3121,33\n1627#1:3154\n1627#1:3155,14\n1627#1:3170,3\n1627#1:3173,6\n1625#1:3108,4\n1625#1:3179,8\n1627#1:3169\n1663#1:3187,2\n1708#1:3190,2\n*E\n"})
    /* renamed from: kotlinx.coroutines.channels.a$a */
    /* loaded from: classes3.dex */
    public final class C10957a implements InterfaceC10974d2 {
        @Override // kotlinx.coroutines.InterfaceC10974d2
        /* renamed from: b */
        public final void mo137b(@NotNull AbstractC11028c0<?> abstractC11028c0, int i) {
        }
    }

    /* renamed from: kotlinx.coroutines.channels.a$b */
    /* loaded from: classes3.dex */
    public static final class C10958b implements InterfaceC10974d2 {
        @Override // kotlinx.coroutines.InterfaceC10974d2
        /* renamed from: b */
        public final void mo137b(@NotNull AbstractC11028c0<?> abstractC11028c0, int i) {
            throw null;
        }
    }

    /* renamed from: kotlinx.coroutines.channels.a$c */
    /* loaded from: classes3.dex */
    public static final class C10959c extends AbstractC10844k implements InterfaceC10825q<InterfaceC11121b<?>, Object, Object, InterfaceC10820l<? super Throwable, ? extends C10868p>> {

        /* renamed from: a */
        public final /* synthetic */ C10956a<E> f21517a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10959c(C10956a<E> c10956a) {
            super(3);
            this.f21517a = c10956a;
        }

        @Override // kotlin.jvm.functions.InterfaceC10825q
        /* renamed from: a */
        public final InterfaceC10820l<? super Throwable, ? extends C10868p> mo132a(InterfaceC11121b<?> interfaceC11121b, Object obj, Object obj2) {
            return new C10960b(obj2, this.f21517a, interfaceC11121b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10956a(int i, @Nullable InterfaceC10820l<? super E, C10868p> interfaceC10820l) {
        boolean z;
        long j;
        this.f21515a = i;
        this.f21516b = interfaceC10820l;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C10966f<Object> c10966f = C10962d.f21522a;
            if (i != 0) {
                if (i != Integer.MAX_VALUE) {
                    j = i;
                } else {
                    j = Long.MAX_VALUE;
                }
            } else {
                j = 0;
            }
            this.bufferEnd = j;
            this.completedExpandBuffersAndPauseFlag = m335j();
            C10966f<Object> c10966f2 = new C10966f<>(0L, null, this, 3);
            this.sendSegment = c10966f2;
            this.receiveSegment = c10966f2;
            if (m327r()) {
                c10966f2 = C10962d.f21522a;
                C10843j.m432d(c10966f2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = c10966f2;
            if (interfaceC10820l != 0) {
                new C10959c(this);
            }
            this._closeCause = C10962d.f21539r;
            return;
        }
        throw new IllegalArgumentException(C0740h.m11849a("Invalid channel capacity: ", i, ", should be >=0").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
        if ((r12.f21621c * kotlinx.coroutines.channels.C10962d.f21523b) < r9.m333l()) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
        if ((r12.f21621c * kotlinx.coroutines.channels.C10962d.f21523b) < r9.m333l()) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
        r12.m270a();
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlinx.coroutines.channels.C10966f m344a(kotlinx.coroutines.channels.C10956a r9, long r10, kotlinx.coroutines.channels.C10966f r12) {
        /*
            r9.getClass()
            kotlinx.coroutines.channels.f<java.lang.Object> r0 = kotlinx.coroutines.channels.C10962d.f21522a
            kotlinx.coroutines.channels.c r0 = kotlinx.coroutines.channels.C10961c.f21521a
        L7:
            java.lang.Object r1 = kotlinx.coroutines.internal.C11029d.m273a(r12, r10, r0)
            boolean r2 = kotlinx.coroutines.internal.C11030d0.m271b(r1)
            if (r2 != 0) goto L56
            kotlinx.coroutines.internal.c0 r2 = kotlinx.coroutines.internal.C11030d0.m272a(r1)
        L15:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.channels.C10956a.f21510g
            java.lang.Object r4 = r3.get(r9)
            kotlinx.coroutines.internal.c0 r4 = (kotlinx.coroutines.internal.AbstractC11028c0) r4
            long r5 = r4.f21621c
            long r7 = r2.f21621c
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r6 = 1
            if (r5 < 0) goto L27
            goto L49
        L27:
            boolean r5 = r2.m274i()
            r7 = 0
            if (r5 != 0) goto L30
            r6 = r7
            goto L49
        L30:
            boolean r5 = r3.compareAndSet(r9, r4, r2)
            if (r5 == 0) goto L38
            r7 = r6
            goto L3e
        L38:
            java.lang.Object r5 = r3.get(r9)
            if (r5 == r4) goto L30
        L3e:
            if (r7 == 0) goto L4c
            boolean r2 = r4.m276e()
            if (r2 == 0) goto L49
            r4.m267d()
        L49:
            if (r6 == 0) goto L7
            goto L56
        L4c:
            boolean r3 = r2.m276e()
            if (r3 == 0) goto L15
            r2.m267d()
            goto L15
        L56:
            boolean r0 = kotlinx.coroutines.internal.C11030d0.m271b(r1)
            if (r0 == 0) goto L6e
            r9.m339f()
            int r10 = kotlinx.coroutines.channels.C10962d.f21523b
            long r10 = (long) r10
            long r0 = r12.f21621c
            long r0 = r0 * r10
            long r9 = r9.m333l()
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 >= 0) goto Lb1
            goto Lae
        L6e:
            kotlinx.coroutines.internal.c0 r12 = kotlinx.coroutines.internal.C11030d0.m272a(r1)
            kotlinx.coroutines.channels.f r12 = (kotlinx.coroutines.channels.C10966f) r12
            long r0 = r12.f21621c
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 <= 0) goto Lb2
            int r10 = kotlinx.coroutines.channels.C10962d.f21523b
            long r10 = (long) r10
            long r0 = r0 * r10
        L7e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.C10956a.f21506c
            long r4 = r2.get(r9)
            r10 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r10 = r10 & r4
            int r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r3 < 0) goto L8f
            goto La0
        L8f:
            r3 = 60
            long r6 = r4 >> r3
            int r6 = (int) r6
            kotlinx.coroutines.channels.f<java.lang.Object> r7 = kotlinx.coroutines.channels.C10962d.f21522a
            long r6 = (long) r6
            long r6 = r6 << r3
            long r6 = r6 + r10
            r3 = r9
            boolean r10 = r2.compareAndSet(r3, r4, r6)
            if (r10 == 0) goto L7e
        La0:
            int r10 = kotlinx.coroutines.channels.C10962d.f21523b
            long r10 = (long) r10
            long r0 = r12.f21621c
            long r0 = r0 * r10
            long r9 = r9.m333l()
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 >= 0) goto Lb1
        Lae:
            r12.m270a()
        Lb1:
            r12 = 0
        Lb2:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C10956a.m344a(kotlinx.coroutines.channels.a, long, kotlinx.coroutines.channels.f):kotlinx.coroutines.channels.f");
    }

    /* renamed from: b */
    public static final int m343b(C10956a c10956a, C10966f c10966f, int i, C1107q.AbstractC1108a abstractC1108a, long j, C11034f0 c11034f0, boolean z) {
        c10956a.getClass();
        c10966f.m313n(i, abstractC1108a);
        if (!z) {
            Object m316k = c10966f.m316k(i);
            if (m316k == null) {
                if (c10956a.m342c(j)) {
                    if (c10966f.m317j(i, null, C10962d.f21525d)) {
                        return 1;
                    }
                } else if (c11034f0 == null) {
                    return 3;
                } else {
                    if (c10966f.m317j(i, null, c11034f0)) {
                        return 2;
                    }
                }
            } else if (m316k instanceof InterfaceC10974d2) {
                c10966f.m313n(i, null);
                if (c10956a.m322w(m316k, abstractC1108a)) {
                    c10966f.m312o(i, C10962d.f21530i);
                    return 0;
                }
                C11034f0 c11034f02 = C10962d.f21532k;
                if (c10966f.f21544f.getAndSet((i * 2) + 1, c11034f02) != c11034f02) {
                    c10966f.m315l(i, true);
                }
                return 5;
            }
        }
        return c10956a.m346A(c10966f, i, abstractC1108a, j, c11034f0, z);
    }

    /* renamed from: A */
    public final int m346A(C10966f c10966f, int i, C1107q.AbstractC1108a abstractC1108a, long j, C11034f0 c11034f0, boolean z) {
        while (true) {
            Object m316k = c10966f.m316k(i);
            if (m316k == null) {
                if (m342c(j) && !z) {
                    if (c10966f.m317j(i, null, C10962d.f21525d)) {
                        return 1;
                    }
                } else if (z) {
                    if (c10966f.m317j(i, null, C10962d.f21531j)) {
                        c10966f.m315l(i, false);
                        return 4;
                    }
                } else if (c11034f0 == null) {
                    return 3;
                } else {
                    if (c10966f.m317j(i, null, c11034f0)) {
                        return 2;
                    }
                }
            } else if (m316k == C10962d.f21526e) {
                if (c10966f.m317j(i, m316k, C10962d.f21525d)) {
                    return 1;
                }
            } else {
                C11034f0 c11034f02 = C10962d.f21532k;
                if (m316k == c11034f02) {
                    c10966f.m313n(i, null);
                    return 5;
                } else if (m316k == C10962d.f21529h) {
                    c10966f.m313n(i, null);
                    return 5;
                } else if (m316k == C10962d.f21533l) {
                    c10966f.m313n(i, null);
                    m339f();
                    return 4;
                } else {
                    c10966f.m313n(i, null);
                    if (m316k instanceof C10970j) {
                        m316k = ((C10970j) m316k).f21545a;
                    }
                    if (m322w(m316k, abstractC1108a)) {
                        c10966f.m312o(i, C10962d.f21530i);
                        return 0;
                    }
                    if (c10966f.f21544f.getAndSet((i * 2) + 1, c11034f02) != c11034f02) {
                        c10966f.m315l(i, true);
                    }
                    return 5;
                }
            }
        }
    }

    /* renamed from: B */
    public final void m345B(long j) {
        long j2;
        boolean z;
        long j3;
        if (m327r()) {
            return;
        }
        do {
        } while (m335j() <= j);
        int i = C10962d.f21524c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f21509f;
            if (i2 < i) {
                long m335j = m335j();
                if (m335j == (atomicLongFieldUpdater.get(this) & 4611686018427387903L) && m335j == m335j()) {
                    return;
                }
                i2++;
            } else {
                do {
                    j2 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(this, j2, 4611686018427387904L + (j2 & 4611686018427387903L)));
                while (true) {
                    long m335j2 = m335j();
                    long j4 = atomicLongFieldUpdater.get(this);
                    long j5 = j4 & 4611686018427387903L;
                    if ((j4 & 4611686018427387904L) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (m335j2 == j5 && m335j2 == m335j()) {
                        break;
                    } else if (!z) {
                        atomicLongFieldUpdater.compareAndSet(this, j4, j5 + 4611686018427387904L);
                    }
                }
                do {
                    j3 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(this, j3, 0 + (j3 & 4611686018427387903L)));
                return;
            }
        }
    }

    /* renamed from: c */
    public final boolean m342c(long j) {
        return j < m335j() || j < m333l() + ((long) this.f21515a);
    }

    /* renamed from: d */
    public final boolean m341d(@Nullable Throwable th) {
        boolean z;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        long j2;
        int i;
        Object obj;
        C11034f0 c11034f0;
        boolean z2;
        C11034f0 c11034f02 = C10962d.f21539r;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21513j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c11034f02, th)) {
                z = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != c11034f02) {
                z = false;
                break;
            }
        }
        do {
            atomicLongFieldUpdater = f21506c;
            j = atomicLongFieldUpdater.get(this);
            int i2 = (int) (j >> 60);
            if (i2 != 0) {
                if (i2 != 1) {
                    break;
                }
                j2 = j & 1152921504606846975L;
                C10966f<Object> c10966f = C10962d.f21522a;
                i = 3;
            } else {
                j2 = j & 1152921504606846975L;
                C10966f<Object> c10966f2 = C10962d.f21522a;
                i = 2;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, (i << 60) + j2));
        m339f();
        if (z) {
            do {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f21514k;
                obj = atomicReferenceFieldUpdater2.get(this);
                if (obj == null) {
                    c11034f0 = C10962d.f21537p;
                } else {
                    c11034f0 = C10962d.f21538q;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, c11034f0)) {
                        z2 = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        z2 = false;
                        continue;
                        break;
                    }
                }
            } while (!z2);
            if (obj != null) {
                C10833a0.m439b(1, obj);
                ((InterfaceC10820l) obj).invoke(m334k());
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
        r1 = (kotlinx.coroutines.channels.C10966f) ((kotlinx.coroutines.internal.AbstractC11031e) kotlinx.coroutines.internal.AbstractC11031e.f21624b.get(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e7, code lost:
        r4 = kotlinx.coroutines.internal.C11050m.m251a(r4, r6);
        r1.m315l(r5, true);
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.channels.C10966f<E> m340e(long r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C10956a.m340e(long):kotlinx.coroutines.channels.f");
    }

    /* renamed from: f */
    public final void m339f() {
        m329p(f21506c.get(this), false);
    }

    /* renamed from: g */
    public final void m338g(long j) {
        C11051m0 m229b;
        C10966f<E> c10966f = (C10966f) f21511h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f21507d;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.f21515a + j2, m335j())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                long j3 = C10962d.f21523b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (c10966f.f21621c != j4) {
                    C10966f<E> m336i = m336i(j4, c10966f);
                    if (m336i == null) {
                        continue;
                    } else {
                        c10966f = m336i;
                    }
                }
                Object m319z = m319z(c10966f, i, j2, null);
                if (m319z == C10962d.f21536o) {
                    if (j2 < m331n()) {
                        c10966f.m270a();
                    }
                } else {
                    c10966f.m270a();
                    InterfaceC10820l<E, C10868p> interfaceC10820l = this.f21516b;
                    if (interfaceC10820l != null && (m229b = C11066x.m229b(interfaceC10820l, m319z, null)) != null) {
                        throw m229b;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0153, code lost:
        r13 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0012 A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m337h() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C10956a.m337h():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
        if ((r14.f21621c * kotlinx.coroutines.channels.C10962d.f21523b) < m331n()) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
        r14.m270a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00eb, code lost:
        if ((r14.f21621c * kotlinx.coroutines.channels.C10962d.f21523b) < m331n()) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ef, code lost:
        return null;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.channels.C10966f<E> m336i(long r12, kotlinx.coroutines.channels.C10966f<E> r14) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C10956a.m336i(long, kotlinx.coroutines.channels.f):kotlinx.coroutines.channels.f");
    }

    /* renamed from: j */
    public final long m335j() {
        return f21508e.get(this);
    }

    @Nullable
    /* renamed from: k */
    public final Throwable m334k() {
        return (Throwable) f21513j.get(this);
    }

    /* renamed from: l */
    public final long m333l() {
        return f21507d.get(this);
    }

    @NotNull
    /* renamed from: m */
    public final Throwable m332m() {
        Throwable m334k = m334k();
        return m334k == null ? new C10968h("Channel was closed") : m334k;
    }

    /* renamed from: n */
    public final long m331n() {
        return f21506c.get(this) & 1152921504606846975L;
    }

    /* renamed from: o */
    public final void m330o(long j) {
        boolean z;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f21509f;
        if ((atomicLongFieldUpdater.addAndGet(this, j) & 4611686018427387904L) != 0) {
            do {
                if ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } while (z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
        r0.m313n(r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b1, code lost:
        r0.m275h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b8, code lost:
        r0 = (kotlinx.coroutines.channels.C10966f) ((kotlinx.coroutines.internal.AbstractC11031e) kotlinx.coroutines.internal.AbstractC11031e.f21624b.get(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0133, code lost:
        r0 = false;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m329p(long r18, boolean r20) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C10956a.m329p(long, boolean):boolean");
    }

    /* renamed from: q */
    public boolean m328q() {
        return false;
    }

    /* renamed from: r */
    public final boolean m327r() {
        long m335j = m335j();
        return m335j == 0 || m335j == Long.MAX_VALUE;
    }

    /* renamed from: s */
    public final void m326s(long j, C10966f<E> c10966f) {
        boolean z;
        C10966f<E> c10966f2;
        C10966f<E> c10966f3;
        while (c10966f.f21621c < j && (c10966f3 = (C10966f) c10966f.m269b()) != null) {
            c10966f = c10966f3;
        }
        while (true) {
            if (!c10966f.mo268c() || (c10966f2 = (C10966f) c10966f.m269b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21512i;
                    AbstractC11028c0 abstractC11028c0 = (AbstractC11028c0) atomicReferenceFieldUpdater.get(this);
                    z = true;
                    if (abstractC11028c0.f21621c >= c10966f.f21621c) {
                        break;
                    }
                    boolean z2 = false;
                    if (!c10966f.m274i()) {
                        z = false;
                        break;
                    }
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC11028c0, c10966f)) {
                            if (atomicReferenceFieldUpdater.get(this) != abstractC11028c0) {
                                break;
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                    if (z2) {
                        if (abstractC11028c0.m276e()) {
                            abstractC11028c0.m267d();
                        }
                    } else if (c10966f.m276e()) {
                        c10966f.m267d();
                    }
                }
                if (z) {
                    return;
                }
            } else {
                c10966f = c10966f2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlinx.coroutines.i] */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Nullable
    /* renamed from: t */
    public final Object m325t(@NotNull C1105o c1105o) {
        C10966f<E> c10966f;
        C11020i c11020i;
        C11020i c11020i2;
        C11065w c11065w;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21511h;
        C10966f<E> c10966f2 = (C10966f) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f21506c;
            if (!m329p(atomicLongFieldUpdater.get(this), true)) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f21507d;
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
                long j = C10962d.f21523b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (c10966f2.f21621c != j2) {
                    C10966f<E> m336i = m336i(j2, c10966f2);
                    if (m336i == null) {
                        continue;
                    } else {
                        c10966f = m336i;
                    }
                } else {
                    c10966f = c10966f2;
                }
                Object m319z = m319z(c10966f, i, andIncrement, null);
                C11034f0 c11034f0 = C10962d.f21534m;
                if (m319z != c11034f0) {
                    C11034f0 c11034f02 = C10962d.f21536o;
                    if (m319z == c11034f02) {
                        if (andIncrement < m331n()) {
                            c10966f.m270a();
                        }
                        c10966f2 = c10966f;
                    } else if (m319z == C10962d.f21535n) {
                        C11020i m226a = C11073k.m226a(C10783b.m455b(c1105o));
                        C11034f0 c11034f03 = c11034f0;
                        try {
                            Object m319z2 = m319z(c10966f, i, andIncrement, m226a);
                            try {
                                if (m319z2 == c11034f03) {
                                    c11020i2 = m226a;
                                    c11020i2.mo137b(c10966f, i);
                                } else {
                                    c11020i2 = m226a;
                                    InterfaceC10820l<E, C10868p> interfaceC10820l = this.f21516b;
                                    InterfaceC10775f interfaceC10775f = c11020i2.f21612e;
                                    if (m319z2 == c11034f02) {
                                        if (andIncrement < m331n()) {
                                            c10966f.m270a();
                                        }
                                        C10966f<E> c10966f3 = (C10966f) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            if (m329p(atomicLongFieldUpdater.get(this), true)) {
                                                Throwable m334k = m334k();
                                                if (m334k == null) {
                                                    m334k = new C10967g();
                                                }
                                                c11020i2.resumeWith(C10864l.m419a(m334k));
                                            } else {
                                                long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                                                long j3 = C10962d.f21523b;
                                                long j4 = andIncrement2 / j3;
                                                int i2 = (int) (andIncrement2 % j3);
                                                if (c10966f3.f21621c != j4) {
                                                    C10966f<E> m336i2 = m336i(j4, c10966f3);
                                                    if (m336i2 != null) {
                                                        c10966f3 = m336i2;
                                                    }
                                                }
                                                InterfaceC10775f interfaceC10775f2 = interfaceC10775f;
                                                m319z2 = m319z(c10966f3, i2, andIncrement2, c11020i2);
                                                if (m319z2 == C10962d.f21534m) {
                                                    c11020i2.mo137b(c10966f3, i2);
                                                    break;
                                                } else if (m319z2 == C10962d.f21536o) {
                                                    if (andIncrement2 < m331n()) {
                                                        c10966f3.m270a();
                                                    }
                                                    interfaceC10775f = interfaceC10775f2;
                                                } else if (m319z2 != C10962d.f21535n) {
                                                    c10966f3.m270a();
                                                    if (interfaceC10820l != null) {
                                                        c11065w = new C11065w(interfaceC10820l, m319z2, interfaceC10775f2);
                                                    }
                                                } else {
                                                    throw new IllegalStateException("unexpected".toString());
                                                }
                                            }
                                        }
                                    } else {
                                        c10966f.m270a();
                                        if (interfaceC10820l != null) {
                                            c11065w = new C11065w(interfaceC10820l, m319z2, interfaceC10775f);
                                            c11020i2.mo135n(m319z2, c11065w);
                                        }
                                        c11065w = null;
                                        c11020i2.mo135n(m319z2, c11065w);
                                    }
                                }
                                return c11020i2.m288q();
                            } catch (Throwable th) {
                                th = th;
                                c11020i = c11034f03;
                                c11020i.m281z();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c11020i = m226a;
                        }
                    } else {
                        c10966f.m270a();
                        return m319z;
                    }
                } else {
                    throw new IllegalStateException("unexpected".toString());
                }
            } else {
                Throwable m334k2 = m334k();
                if (m334k2 == null) {
                    m334k2 = new C10967g();
                }
                int i3 = C11032e0.f21625a;
                throw m334k2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c3, code lost:
        r3 = (kotlinx.coroutines.channels.C10966f) r3.m269b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ca, code lost:
        if (r3 != null) goto L117;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c3 A[EDGE_INSN: B:121:0x01c3->B:96:0x01c3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C10956a.toString():java.lang.String");
    }

    /* renamed from: u */
    public final void m324u(InterfaceC10974d2 interfaceC10974d2, boolean z) {
        Throwable m332m;
        if (!(interfaceC10974d2 instanceof C10958b)) {
            if (interfaceC10974d2 instanceof InterfaceC11015h) {
                InterfaceC10772d interfaceC10772d = (InterfaceC10772d) interfaceC10974d2;
                if (z) {
                    m332m = m334k();
                    if (m332m == null) {
                        m332m = new C10967g();
                    }
                } else {
                    m332m = m332m();
                }
                interfaceC10772d.resumeWith(C10864l.m419a(m332m));
                return;
            } else if (!(interfaceC10974d2 instanceof C10969i)) {
                if (!(interfaceC10974d2 instanceof C10957a)) {
                    if (interfaceC10974d2 instanceof InterfaceC11121b) {
                        ((InterfaceC11121b) interfaceC10974d2).mo141c(this, C10962d.f21533l);
                        return;
                    }
                    throw new IllegalStateException(("Unexpected waiter: " + interfaceC10974d2).toString());
                }
                ((C10957a) interfaceC10974d2).getClass();
                C10843j.m433c(null);
                throw null;
            } else {
                ((C10969i) interfaceC10974d2).getClass();
                m334k();
                throw null;
            }
        }
        ((C10958b) interfaceC10974d2).getClass();
        throw null;
    }

    @NotNull
    /* renamed from: v */
    public final Object m323v() {
        InterfaceC10974d2 interfaceC10974d2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f21507d;
        long j = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f21506c;
        long j2 = atomicLongFieldUpdater2.get(this);
        if (m329p(j2, true)) {
            return new C10963e.C10964a(m334k());
        }
        int i = (j > (j2 & 1152921504606846975L) ? 1 : (j == (j2 & 1152921504606846975L) ? 0 : -1));
        Object obj = C10963e.f21540b;
        if (i >= 0) {
            return obj;
        }
        C11034f0 c11034f0 = C10962d.f21532k;
        C10966f<E> c10966f = (C10966f) f21511h.get(this);
        while (!m329p(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = C10962d.f21523b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (c10966f.f21621c != j4) {
                C10966f<E> m336i = m336i(j4, c10966f);
                if (m336i == null) {
                    continue;
                } else {
                    c10966f = m336i;
                }
            }
            Object m319z = m319z(c10966f, i2, andIncrement, c11034f0);
            if (m319z == C10962d.f21534m) {
                if (c11034f0 instanceof InterfaceC10974d2) {
                    interfaceC10974d2 = (InterfaceC10974d2) c11034f0;
                } else {
                    interfaceC10974d2 = null;
                }
                if (interfaceC10974d2 != null) {
                    interfaceC10974d2.mo137b(c10966f, i2);
                }
                m345B(andIncrement);
                c10966f.m275h();
            } else if (m319z == C10962d.f21536o) {
                if (andIncrement < m331n()) {
                    c10966f.m270a();
                }
            } else if (m319z != C10962d.f21535n) {
                c10966f.m270a();
                obj = m319z;
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
            return obj;
        }
        return new C10963e.C10964a(m334k());
    }

    /* renamed from: w */
    public final boolean m322w(Object obj, C1107q.AbstractC1108a abstractC1108a) {
        if (obj instanceof InterfaceC11121b) {
            return ((InterfaceC11121b) obj).mo141c(this, abstractC1108a);
        }
        boolean z = obj instanceof C10969i;
        C11065w c11065w = null;
        InterfaceC10820l<E, C10868p> interfaceC10820l = this.f21516b;
        if (z) {
            C10843j.m432d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C10969i c10969i = (C10969i) obj;
            C10963e c10963e = new C10963e(abstractC1108a);
            if (interfaceC10820l != null) {
                throw null;
            }
            C10962d.m318a(null, c10963e, null);
            throw null;
        } else if (!(obj instanceof C10957a)) {
            if (obj instanceof InterfaceC11015h) {
                C10843j.m432d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                InterfaceC11015h interfaceC11015h = (InterfaceC11015h) obj;
                if (interfaceC10820l != null) {
                    c11065w = new C11065w(interfaceC10820l, abstractC1108a, interfaceC11015h.getContext());
                }
                return C10962d.m318a(interfaceC11015h, abstractC1108a, c11065w);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        } else {
            C10843j.m432d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            C10957a c10957a = (C10957a) obj;
            C10843j.m433c(null);
            throw null;
        }
    }

    /* renamed from: x */
    public final boolean m321x(Object obj, C10966f<E> c10966f, int i) {
        char c;
        if (obj instanceof InterfaceC11015h) {
            C10843j.m432d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return C10962d.m318a((InterfaceC11015h) obj, C10868p.f21418a, null);
        } else if (obj instanceof InterfaceC11121b) {
            C10843j.m432d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            C10868p c10868p = C10868p.f21418a;
            int m142e = ((C11119a) obj).m142e(this);
            if (m142e != 0) {
                if (m142e != 1) {
                    c = 3;
                    if (m142e != 2) {
                        if (m142e == 3) {
                            c = 4;
                        } else {
                            throw new IllegalStateException(("Unexpected internal result: " + m142e).toString());
                        }
                    }
                } else {
                    c = 2;
                }
            } else {
                c = 1;
            }
            if (c == 2) {
                c10966f.m313n(i, null);
            }
            if (c == 1) {
                return true;
            }
            return false;
        } else if (obj instanceof C10958b) {
            ((C10958b) obj).getClass();
            C10962d.m318a(null, Boolean.TRUE, null);
            throw null;
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d5, code lost:
        return kotlin.C10868p.f21418a;
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m320y(androidx.datastore.core.C1107q.AbstractC1108a r23) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C10956a.m320y(androidx.datastore.core.q$a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0081, code lost:
        m337h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0090, code lost:
        if (r9 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a4, code lost:
        m337h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
        return r7.m314m(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
        return kotlinx.coroutines.channels.C10962d.f21536o;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m319z(kotlinx.coroutines.channels.C10966f<E> r7, int r8, long r9, java.lang.Object r11) {
        /*
            r6 = this;
            java.lang.Object r0 = r7.m316k(r8)
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.channels.C10956a.f21506c
            if (r0 != 0) goto L27
            long r4 = r3.get(r6)
            long r4 = r4 & r1
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 < 0) goto L3b
            if (r11 != 0) goto L1b
            kotlinx.coroutines.internal.f0 r7 = kotlinx.coroutines.channels.C10962d.f21535n
            return r7
        L1b:
            boolean r0 = r7.m317j(r8, r0, r11)
            if (r0 == 0) goto L3b
            r6.m337h()
            kotlinx.coroutines.internal.f0 r7 = kotlinx.coroutines.channels.C10962d.f21534m
            return r7
        L27:
            kotlinx.coroutines.internal.f0 r4 = kotlinx.coroutines.channels.C10962d.f21525d
            if (r0 != r4) goto L3b
            kotlinx.coroutines.internal.f0 r4 = kotlinx.coroutines.channels.C10962d.f21530i
            boolean r0 = r7.m317j(r8, r0, r4)
            if (r0 == 0) goto L3b
            r6.m337h()
            java.lang.Object r7 = r7.m314m(r8)
            return r7
        L3b:
            java.lang.Object r0 = r7.m316k(r8)
            if (r0 == 0) goto L93
            kotlinx.coroutines.internal.f0 r4 = kotlinx.coroutines.channels.C10962d.f21526e
            if (r0 != r4) goto L46
            goto L93
        L46:
            kotlinx.coroutines.internal.f0 r4 = kotlinx.coroutines.channels.C10962d.f21525d
            if (r0 != r4) goto L53
            kotlinx.coroutines.internal.f0 r4 = kotlinx.coroutines.channels.C10962d.f21530i
            boolean r0 = r7.m317j(r8, r0, r4)
            if (r0 == 0) goto L3b
            goto L81
        L53:
            kotlinx.coroutines.internal.f0 r4 = kotlinx.coroutines.channels.C10962d.f21531j
            if (r0 != r4) goto L58
            goto La7
        L58:
            kotlinx.coroutines.internal.f0 r5 = kotlinx.coroutines.channels.C10962d.f21529h
            if (r0 != r5) goto L5d
            goto La7
        L5d:
            kotlinx.coroutines.internal.f0 r5 = kotlinx.coroutines.channels.C10962d.f21533l
            if (r0 != r5) goto L62
            goto La4
        L62:
            kotlinx.coroutines.internal.f0 r5 = kotlinx.coroutines.channels.C10962d.f21528g
            if (r0 == r5) goto L3b
            kotlinx.coroutines.internal.f0 r5 = kotlinx.coroutines.channels.C10962d.f21527f
            boolean r5 = r7.m317j(r8, r0, r5)
            if (r5 == 0) goto L3b
            boolean r9 = r0 instanceof kotlinx.coroutines.channels.C10970j
            if (r9 == 0) goto L76
            kotlinx.coroutines.channels.j r0 = (kotlinx.coroutines.channels.C10970j) r0
            kotlinx.coroutines.d2 r0 = r0.f21545a
        L76:
            boolean r10 = r6.m321x(r0, r7, r8)
            if (r10 == 0) goto L89
            kotlinx.coroutines.internal.f0 r9 = kotlinx.coroutines.channels.C10962d.f21530i
            r7.m312o(r8, r9)
        L81:
            r6.m337h()
            java.lang.Object r7 = r7.m314m(r8)
            goto Lba
        L89:
            r7.m312o(r8, r4)
            r10 = 0
            r7.m315l(r8, r10)
            if (r9 == 0) goto La7
            goto La4
        L93:
            long r4 = r3.get(r6)
            long r4 = r4 & r1
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 >= 0) goto Laa
            kotlinx.coroutines.internal.f0 r4 = kotlinx.coroutines.channels.C10962d.f21529h
            boolean r0 = r7.m317j(r8, r0, r4)
            if (r0 == 0) goto L3b
        La4:
            r6.m337h()
        La7:
            kotlinx.coroutines.internal.f0 r7 = kotlinx.coroutines.channels.C10962d.f21536o
            goto Lba
        Laa:
            if (r11 != 0) goto Laf
            kotlinx.coroutines.internal.f0 r7 = kotlinx.coroutines.channels.C10962d.f21535n
            goto Lba
        Laf:
            boolean r0 = r7.m317j(r8, r0, r11)
            if (r0 == 0) goto L3b
            r6.m337h()
            kotlinx.coroutines.internal.f0 r7 = kotlinx.coroutines.channels.C10962d.f21534m
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C10956a.m319z(kotlinx.coroutines.channels.f, int, long, java.lang.Object):java.lang.Object");
    }
}
