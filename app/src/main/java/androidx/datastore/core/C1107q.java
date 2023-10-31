package androidx.datastore.core;

import androidx.annotation.GuardedBy;
import androidx.datastore.core.handlers.C1098a;
import androidx.datastore.preferences.core.C1137c;
import androidx.datastore.preferences.core.C1142f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C10795h;
import kotlin.C10865m;
import kotlin.C10868p;
import kotlin.collections.C10757m;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.coroutines.intrinsics.C10783b;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.C10856u;
import kotlin.jvm.internal.C10859x;
import kotlinx.coroutines.C11084n1;
import kotlinx.coroutines.C11091o1;
import kotlinx.coroutines.C11098r;
import kotlinx.coroutines.C11099r0;
import kotlinx.coroutines.C11137t;
import kotlinx.coroutines.C11150v1;
import kotlinx.coroutines.InterfaceC10954c1;
import kotlinx.coroutines.InterfaceC10976e0;
import kotlinx.coroutines.InterfaceC11095q;
import kotlinx.coroutines.flow.C10993i;
import kotlinx.coroutines.flow.C11005j;
import kotlinx.coroutines.flow.InterfaceC10985b;
import kotlinx.coroutines.flow.internal.C10999f;
import kotlinx.coroutines.sync.InterfaceC11123a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.datastore.core.q */
/* loaded from: classes.dex */
public final class C1107q<T> implements InterfaceC1099i<T> {
    @GuardedBy("activeFilesLock")
    @NotNull

    /* renamed from: k */
    public static final LinkedHashSet f2828k = new LinkedHashSet();
    @NotNull

    /* renamed from: l */
    public static final Object f2829l = new Object();
    @NotNull

    /* renamed from: a */
    public final InterfaceC10809a<File> f2830a;
    @NotNull

    /* renamed from: b */
    public final InterfaceC1103m<T> f2831b;
    @NotNull

    /* renamed from: c */
    public final InterfaceC1087b<T> f2832c;
    @NotNull

    /* renamed from: d */
    public final InterfaceC10976e0 f2833d;
    @NotNull

    /* renamed from: e */
    public final C10993i f2834e;
    @NotNull

    /* renamed from: f */
    public final String f2835f;
    @NotNull

    /* renamed from: g */
    public final C10865m f2836g;
    @NotNull

    /* renamed from: h */
    public final C11005j f2837h;
    @Nullable

    /* renamed from: i */
    public List<? extends InterfaceC10824p<? super InterfaceC1101k<T>, ? super InterfaceC10772d<? super C10868p>, ? extends Object>> f2838i;
    @NotNull

    /* renamed from: j */
    public final C1106p<AbstractC1108a<T>> f2839j;

    /* renamed from: androidx.datastore.core.q$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1108a<T> {

        /* renamed from: androidx.datastore.core.q$a$a */
        /* loaded from: classes.dex */
        public static final class C1109a<T> extends AbstractC1108a<T> {
            @Nullable

            /* renamed from: a */
            public final AbstractC1088b0<T> f2840a;

            public C1109a(@Nullable AbstractC1088b0<T> abstractC1088b0) {
                this.f2840a = abstractC1088b0;
            }
        }

        /* renamed from: androidx.datastore.core.q$a$b */
        /* loaded from: classes.dex */
        public static final class C1110b<T> extends AbstractC1108a<T> {
            @NotNull

            /* renamed from: a */
            public final InterfaceC10824p<T, InterfaceC10772d<? super T>, Object> f2841a;
            @NotNull

            /* renamed from: b */
            public final InterfaceC11095q<T> f2842b;
            @Nullable

            /* renamed from: c */
            public final AbstractC1088b0<T> f2843c;
            @NotNull

            /* renamed from: d */
            public final InterfaceC10775f f2844d;

            public C1110b(@NotNull InterfaceC10824p interfaceC10824p, @NotNull C11098r c11098r, @Nullable AbstractC1088b0 abstractC1088b0, @NotNull InterfaceC10775f callerContext) {
                C10843j.m430f(callerContext, "callerContext");
                this.f2841a = interfaceC10824p;
                this.f2842b = c11098r;
                this.f2843c = abstractC1088b0;
                this.f2844d = callerContext;
            }
        }
    }

    /* renamed from: androidx.datastore.core.q$b */
    /* loaded from: classes.dex */
    public static final class C1111b extends OutputStream {
        @NotNull

        /* renamed from: a */
        public final FileOutputStream f2845a;

        public C1111b(@NotNull FileOutputStream fileOutputStream) {
            this.f2845a = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            this.f2845a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            this.f2845a.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(@NotNull byte[] b) {
            C10843j.m430f(b, "b");
            this.f2845a.write(b);
        }

        @Override // java.io.OutputStream
        public final void write(@NotNull byte[] bytes, int i, int i2) {
            C10843j.m430f(bytes, "bytes");
            this.f2845a.write(bytes, i, i2);
        }
    }

    @DebugMetadata(m454c = "androidx.datastore.core.SingleProcessDataStore", m453f = "SingleProcessDataStore.kt", m452i = {0, 0, 1, 1, 1, 2}, m451l = {322, 348, 505}, m450m = "readAndInit", m449n = {"updateLock", "initData", "updateLock", "initData", "initializationComplete", "$this$withLock_u24default$iv"}, m448s = {"L$1", "L$2", "L$1", "L$2", "L$3", "L$3"})
    /* renamed from: androidx.datastore.core.q$c */
    /* loaded from: classes.dex */
    public static final class C1112c extends AbstractC10786c {

        /* renamed from: a */
        public C1107q f2846a;

        /* renamed from: b */
        public Object f2847b;

        /* renamed from: c */
        public Serializable f2848c;

        /* renamed from: d */
        public Object f2849d;

        /* renamed from: e */
        public C1113d f2850e;

        /* renamed from: f */
        public Iterator f2851f;

        /* renamed from: g */
        public /* synthetic */ Object f2852g;

        /* renamed from: h */
        public final /* synthetic */ C1107q<T> f2853h;

        /* renamed from: i */
        public int f2854i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1112c(C1107q<T> c1107q, InterfaceC10772d<? super C1112c> interfaceC10772d) {
            super(interfaceC10772d);
            this.f2853h = c1107q;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f2852g = obj;
            this.f2854i |= Integer.MIN_VALUE;
            LinkedHashSet linkedHashSet = C1107q.f2828k;
            return this.f2853h.m11194d(this);
        }
    }

    /* renamed from: androidx.datastore.core.q$d */
    /* loaded from: classes.dex */
    public static final class C1113d implements InterfaceC1101k<T> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC11123a f2855a;

        /* renamed from: b */
        public final /* synthetic */ C10856u f2856b;

        /* renamed from: c */
        public final /* synthetic */ C10859x<T> f2857c;

        /* renamed from: d */
        public final /* synthetic */ C1107q<T> f2858d;

        public C1113d(InterfaceC11123a interfaceC11123a, C10856u c10856u, C10859x<T> c10859x, C1107q<T> c1107q) {
            this.f2855a = interfaceC11123a;
            this.f2856b = c10856u;
            this.f2857c = c10859x;
            this.f2858d = c1107q;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #0 {all -> 0x00d4, blocks: (B:30:0x008f, B:32:0x0093, B:51:0x00d6, B:52:0x00dd), top: B:55:0x008f }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b3 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ab, B:38:0x00b3), top: B:56:0x0050 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00d6 A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #0 {all -> 0x00d4, blocks: (B:30:0x008f, B:32:0x0093, B:51:0x00d6, B:52:0x00dd), top: B:55:0x008f }] */
        @Override // androidx.datastore.core.InterfaceC1101k
        @org.jetbrains.annotations.Nullable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object mo11187a(@org.jetbrains.annotations.NotNull androidx.datastore.core.C1094g r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.InterfaceC10772d r12) {
            /*
                Method dump skipped, instructions count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C1107q.C1113d.mo11187a(androidx.datastore.core.g, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @DebugMetadata(m454c = "androidx.datastore.core.SingleProcessDataStore", m453f = "SingleProcessDataStore.kt", m452i = {0}, m451l = {302}, m450m = "readAndInitOrPropagateAndThrowFailure", m449n = {"this"}, m448s = {"L$0"})
    /* renamed from: androidx.datastore.core.q$e */
    /* loaded from: classes.dex */
    public static final class C1114e extends AbstractC10786c {

        /* renamed from: a */
        public C1107q f2859a;

        /* renamed from: b */
        public /* synthetic */ Object f2860b;

        /* renamed from: c */
        public final /* synthetic */ C1107q<T> f2861c;

        /* renamed from: d */
        public int f2862d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1114e(C1107q<T> c1107q, InterfaceC10772d<? super C1114e> interfaceC10772d) {
            super(interfaceC10772d);
            this.f2861c = c1107q;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f2860b = obj;
            this.f2862d |= Integer.MIN_VALUE;
            LinkedHashSet linkedHashSet = C1107q.f2828k;
            return this.f2861c.m11193e(this);
        }
    }

    @DebugMetadata(m454c = "androidx.datastore.core.SingleProcessDataStore", m453f = "SingleProcessDataStore.kt", m452i = {0}, m451l = {311}, m450m = "readAndInitOrPropagateFailure", m449n = {"this"}, m448s = {"L$0"})
    /* renamed from: androidx.datastore.core.q$f */
    /* loaded from: classes.dex */
    public static final class C1115f extends AbstractC10786c {

        /* renamed from: a */
        public C1107q f2863a;

        /* renamed from: b */
        public /* synthetic */ Object f2864b;

        /* renamed from: c */
        public final /* synthetic */ C1107q<T> f2865c;

        /* renamed from: d */
        public int f2866d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1115f(C1107q<T> c1107q, InterfaceC10772d<? super C1115f> interfaceC10772d) {
            super(interfaceC10772d);
            this.f2865c = c1107q;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f2864b = obj;
            this.f2866d |= Integer.MIN_VALUE;
            LinkedHashSet linkedHashSet = C1107q.f2828k;
            return this.f2865c.m11192f(this);
        }
    }

    @DebugMetadata(m454c = "androidx.datastore.core.SingleProcessDataStore", m453f = "SingleProcessDataStore.kt", m452i = {0}, m451l = {381}, m450m = "readData", m449n = {"this"}, m448s = {"L$0"})
    /* renamed from: androidx.datastore.core.q$g */
    /* loaded from: classes.dex */
    public static final class C1116g extends AbstractC10786c {

        /* renamed from: a */
        public C1107q f2867a;

        /* renamed from: b */
        public FileInputStream f2868b;

        /* renamed from: c */
        public /* synthetic */ Object f2869c;

        /* renamed from: d */
        public final /* synthetic */ C1107q<T> f2870d;

        /* renamed from: e */
        public int f2871e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1116g(C1107q<T> c1107q, InterfaceC10772d<? super C1116g> interfaceC10772d) {
            super(interfaceC10772d);
            this.f2870d = c1107q;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f2869c = obj;
            this.f2871e |= Integer.MIN_VALUE;
            LinkedHashSet linkedHashSet = C1107q.f2828k;
            return this.f2870d.m11191g(this);
        }
    }

    @DebugMetadata(m454c = "androidx.datastore.core.SingleProcessDataStore", m453f = "SingleProcessDataStore.kt", m452i = {0, 1, 2, 2}, m451l = {359, 362, 365}, m450m = "readDataOrHandleCorruption", m449n = {"this", "ex", "ex", "newData"}, m448s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: androidx.datastore.core.q$h */
    /* loaded from: classes.dex */
    public static final class C1117h extends AbstractC10786c {

        /* renamed from: a */
        public Object f2872a;

        /* renamed from: b */
        public Object f2873b;

        /* renamed from: c */
        public /* synthetic */ Object f2874c;

        /* renamed from: d */
        public final /* synthetic */ C1107q<T> f2875d;

        /* renamed from: e */
        public int f2876e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1117h(C1107q<T> c1107q, InterfaceC10772d<? super C1117h> interfaceC10772d) {
            super(interfaceC10772d);
            this.f2875d = c1107q;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f2874c = obj;
            this.f2876e |= Integer.MIN_VALUE;
            LinkedHashSet linkedHashSet = C1107q.f2828k;
            return this.f2875d.m11190h(this);
        }
    }

    @DebugMetadata(m454c = "androidx.datastore.core.SingleProcessDataStore", m453f = "SingleProcessDataStore.kt", m452i = {0, 0, 0}, m451l = {426}, m450m = "writeData$datastore_core", m449n = {"this", "scratchFile", "stream"}, m448s = {"L$0", "L$1", "L$4"})
    /* renamed from: androidx.datastore.core.q$i */
    /* loaded from: classes.dex */
    public static final class C1118i extends AbstractC10786c {

        /* renamed from: a */
        public C1107q f2877a;

        /* renamed from: b */
        public File f2878b;

        /* renamed from: c */
        public FileOutputStream f2879c;

        /* renamed from: d */
        public FileOutputStream f2880d;

        /* renamed from: e */
        public /* synthetic */ Object f2881e;

        /* renamed from: f */
        public final /* synthetic */ C1107q<T> f2882f;

        /* renamed from: g */
        public int f2883g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1118i(C1107q<T> c1107q, InterfaceC10772d<? super C1118i> interfaceC10772d) {
            super(interfaceC10772d);
            this.f2882f = c1107q;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f2881e = obj;
            this.f2883g |= Integer.MIN_VALUE;
            return this.f2882f.m11188j(null, this);
        }
    }

    public C1107q(@NotNull C1137c c1137c, @NotNull List list, @NotNull C1098a c1098a, @NotNull InterfaceC10976e0 interfaceC10976e0) {
        C1142f c1142f = C1142f.f2939a;
        this.f2830a = c1137c;
        this.f2831b = c1142f;
        this.f2832c = c1098a;
        this.f2833d = interfaceC10976e0;
        this.f2834e = new C10993i(new C1122u(this, null));
        this.f2835f = ".tmp";
        this.f2836g = C10795h.m446a(new C1126w(this));
        Object obj = C1090c0.f2797a;
        this.f2837h = new C11005j(obj == null ? C10999f.f21577a : obj);
        this.f2838i = C10757m.m471r(list);
        this.f2839j = new C1106p<>(interfaceC10976e0, new C1119r(this), C1120s.f2885a, new C1121t(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m11196b(androidx.datastore.core.C1107q r8, androidx.datastore.core.C1107q.AbstractC1108a.C1110b r9, kotlin.coroutines.InterfaceC10772d r10) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C1107q.m11196b(androidx.datastore.core.q, androidx.datastore.core.q$a$b, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.datastore.core.InterfaceC1099i
    @Nullable
    /* renamed from: a */
    public final Object mo11184a(@NotNull InterfaceC10824p<? super T, ? super InterfaceC10772d<? super T>, ? extends Object> interfaceC10824p, @NotNull InterfaceC10772d<? super T> interfaceC10772d) {
        Object m207M;
        C11098r c11098r = new C11098r(null);
        this.f2839j.m11197a(new AbstractC1108a.C1110b(interfaceC10824p, c11098r, (AbstractC1088b0) this.f2837h.m303d(), interfaceC10772d.getContext()));
        do {
            m207M = c11098r.m207M();
            if (!(m207M instanceof InterfaceC10954c1)) {
                if (!(m207M instanceof C11137t)) {
                    return C11091o1.m172a(m207M);
                }
                throw ((C11137t) m207M).f21796a;
            }
        } while (c11098r.m197Y(m207M) < 0);
        C11084n1.C11085a c11085a = new C11084n1.C11085a(C10783b.m455b(interfaceC10772d), c11098r);
        c11085a.m287s();
        c11085a.m285u(new C11099r0(c11098r.mo185m(new C11150v1(c11085a))));
        return c11085a.m288q();
    }

    /* renamed from: c */
    public final File m11195c() {
        return (File) this.f2836g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARN: Type inference failed for: r11v6, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r13v0, types: [androidx.datastore.core.q<T>, androidx.datastore.core.q] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlinx.coroutines.sync.a] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m11194d(kotlin.coroutines.InterfaceC10772d<? super kotlin.C10868p> r14) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C1107q.m11194d(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m11193e(kotlin.coroutines.InterfaceC10772d<? super kotlin.C10868p> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.C1107q.C1114e
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.q$e r0 = (androidx.datastore.core.C1107q.C1114e) r0
            int r1 = r0.f2862d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2862d = r1
            goto L18
        L13:
            androidx.datastore.core.q$e r0 = new androidx.datastore.core.q$e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f2860b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
            int r2 = r0.f2862d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.datastore.core.q r0 = r0.f2859a
            kotlin.C10864l.m418b(r5)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C10864l.m418b(r5)
            r0.f2859a = r4     // Catch: java.lang.Throwable -> L44
            r0.f2862d = r3     // Catch: java.lang.Throwable -> L44
            java.lang.Object r5 = r4.m11194d(r0)     // Catch: java.lang.Throwable -> L44
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlin.p r5 = kotlin.C10868p.f21418a
            return r5
        L44:
            r5 = move-exception
            r0 = r4
        L46:
            kotlinx.coroutines.flow.j r0 = r0.f2837h
            androidx.datastore.core.l r1 = new androidx.datastore.core.l
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C1107q.m11193e(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m11192f(kotlin.coroutines.InterfaceC10772d<? super kotlin.C10868p> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.C1107q.C1115f
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.q$f r0 = (androidx.datastore.core.C1107q.C1115f) r0
            int r1 = r0.f2866d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2866d = r1
            goto L18
        L13:
            androidx.datastore.core.q$f r0 = new androidx.datastore.core.q$f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f2864b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
            int r2 = r0.f2866d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.datastore.core.q r0 = r0.f2863a
            kotlin.C10864l.m418b(r5)     // Catch: java.lang.Throwable -> L29
            goto L4d
        L29:
            r5 = move-exception
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C10864l.m418b(r5)
            r0.f2863a = r4     // Catch: java.lang.Throwable -> L41
            r0.f2866d = r3     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r4.m11194d(r0)     // Catch: java.lang.Throwable -> L41
            if (r5 != r1) goto L4d
            return r1
        L41:
            r5 = move-exception
            r0 = r4
        L43:
            kotlinx.coroutines.flow.j r0 = r0.f2837h
            androidx.datastore.core.l r1 = new androidx.datastore.core.l
            r1.<init>(r5)
            r0.setValue(r1)
        L4d:
            kotlin.p r5 = kotlin.C10868p.f21418a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C1107q.m11192f(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.q$g] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m11191g(kotlin.coroutines.InterfaceC10772d<? super T> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.C1107q.C1116g
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.q$g r0 = (androidx.datastore.core.C1107q.C1116g) r0
            int r1 = r0.f2871e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2871e = r1
            goto L18
        L13:
            androidx.datastore.core.q$g r0 = new androidx.datastore.core.q$g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f2869c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
            int r2 = r0.f2871e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.io.FileInputStream r1 = r0.f2868b
            androidx.datastore.core.q r0 = r0.f2867a
            kotlin.C10864l.m418b(r5)     // Catch: java.lang.Throwable -> L2b
            goto L53
        L2b:
            r5 = move-exception
            goto L5e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.C10864l.m418b(r5)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L64
            java.io.File r2 = r4.m11195c()     // Catch: java.io.FileNotFoundException -> L64
            r5.<init>(r2)     // Catch: java.io.FileNotFoundException -> L64
            androidx.datastore.core.m<T> r2 = r4.f2831b     // Catch: java.lang.Throwable -> L5a
            r0.f2867a = r4     // Catch: java.lang.Throwable -> L5a
            r0.f2868b = r5     // Catch: java.lang.Throwable -> L5a
            r0.f2871e = r3     // Catch: java.lang.Throwable -> L5a
            androidx.datastore.preferences.core.a r0 = r2.mo11180b(r5)     // Catch: java.lang.Throwable -> L5a
            if (r0 != r1) goto L50
            return r1
        L50:
            r1 = r5
            r5 = r0
            r0 = r4
        L53:
            r2 = 0
            kotlin.p061io.C10805a.m443a(r1, r2)     // Catch: java.io.FileNotFoundException -> L58
            return r5
        L58:
            r5 = move-exception
            goto L66
        L5a:
            r0 = move-exception
            r1 = r5
            r5 = r0
            r0 = r4
        L5e:
            throw r5     // Catch: java.lang.Throwable -> L5f
        L5f:
            r2 = move-exception
            kotlin.p061io.C10805a.m443a(r1, r5)     // Catch: java.io.FileNotFoundException -> L58
            throw r2     // Catch: java.io.FileNotFoundException -> L58
        L64:
            r5 = move-exception
            r0 = r4
        L66:
            java.io.File r1 = r0.m11195c()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L77
            androidx.datastore.core.m<T> r5 = r0.f2831b
            androidx.datastore.preferences.core.a r5 = r5.mo11181a()
            return r5
        L77:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C1107q.m11191g(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.datastore.core.InterfaceC1099i
    @NotNull
    public final InterfaceC10985b<T> getData() {
        return this.f2834e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m11190h(kotlin.coroutines.InterfaceC10772d<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.C1107q.C1117h
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.q$h r0 = (androidx.datastore.core.C1107q.C1117h) r0
            int r1 = r0.f2876e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2876e = r1
            goto L18
        L13:
            androidx.datastore.core.q$h r0 = new androidx.datastore.core.q$h
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f2874c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
            int r2 = r0.f2876e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f2873b
            java.lang.Object r0 = r0.f2872a
            androidx.datastore.core.a r0 = (androidx.datastore.core.C1085a) r0
            kotlin.C10864l.m418b(r8)     // Catch: java.io.IOException -> L33
            goto L85
        L33:
            r8 = move-exception
            goto L88
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            java.lang.Object r2 = r0.f2873b
            androidx.datastore.core.a r2 = (androidx.datastore.core.C1085a) r2
            java.lang.Object r4 = r0.f2872a
            androidx.datastore.core.q r4 = (androidx.datastore.core.C1107q) r4
            kotlin.C10864l.m418b(r8)
            goto L77
        L49:
            java.lang.Object r2 = r0.f2872a
            androidx.datastore.core.q r2 = (androidx.datastore.core.C1107q) r2
            kotlin.C10864l.m418b(r8)     // Catch: androidx.datastore.core.C1085a -> L51
            goto L61
        L51:
            r8 = move-exception
            goto L64
        L53:
            kotlin.C10864l.m418b(r8)
            r0.f2872a = r7     // Catch: androidx.datastore.core.C1085a -> L62
            r0.f2876e = r5     // Catch: androidx.datastore.core.C1085a -> L62
            java.lang.Object r8 = r7.m11191g(r0)     // Catch: androidx.datastore.core.C1085a -> L62
            if (r8 != r1) goto L61
            return r1
        L61:
            return r8
        L62:
            r8 = move-exception
            r2 = r7
        L64:
            androidx.datastore.core.b<T> r5 = r2.f2832c
            r0.f2872a = r2
            r0.f2873b = r8
            r0.f2876e = r4
            java.lang.Object r4 = r5.mo11198a(r8)
            if (r4 != r1) goto L73
            return r1
        L73:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L77:
            r0.f2872a = r2     // Catch: java.io.IOException -> L86
            r0.f2873b = r8     // Catch: java.io.IOException -> L86
            r0.f2876e = r3     // Catch: java.io.IOException -> L86
            java.lang.Object r0 = r4.m11188j(r8, r0)     // Catch: java.io.IOException -> L86
            if (r0 != r1) goto L84
            return r1
        L84:
            r1 = r8
        L85:
            return r1
        L86:
            r8 = move-exception
            r0 = r2
        L88:
            kotlin.C10738b.m502a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C1107q.m11190h(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m11189i(kotlin.coroutines.InterfaceC10772d r8, kotlin.coroutines.InterfaceC10775f r9, kotlin.jvm.functions.InterfaceC10824p r10) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.C1129z
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.z r0 = (androidx.datastore.core.C1129z) r0
            int r1 = r0.f2918f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2918f = r1
            goto L18
        L13:
            androidx.datastore.core.z r0 = new androidx.datastore.core.z
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f2916d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
            int r2 = r0.f2918f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r9 = r0.f2914b
            androidx.datastore.core.q r10 = r0.f2913a
            kotlin.C10864l.m418b(r8)
            goto L86
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r9 = r0.f2915c
            java.lang.Object r10 = r0.f2914b
            androidx.datastore.core.c r10 = (androidx.datastore.core.C1089c) r10
            androidx.datastore.core.q r2 = r0.f2913a
            kotlin.C10864l.m418b(r8)
            goto L6b
        L43:
            kotlin.C10864l.m418b(r8)
            kotlinx.coroutines.flow.j r8 = r7.f2837h
            java.lang.Object r8 = r8.m303d()
            androidx.datastore.core.c r8 = (androidx.datastore.core.C1089c) r8
            r8.m11203a()
            androidx.datastore.core.a0 r2 = new androidx.datastore.core.a0
            T r6 = r8.f2795a
            r2.<init>(r6, r3, r10)
            r0.f2913a = r7
            r0.f2914b = r8
            r0.f2915c = r6
            r0.f2918f = r5
            java.lang.Object r9 = kotlinx.coroutines.C10975e.m309b(r0, r9, r2)
            if (r9 != r1) goto L67
            return r1
        L67:
            r2 = r7
            r10 = r8
            r8 = r9
            r9 = r6
        L6b:
            r10.m11203a()
            boolean r10 = kotlin.jvm.internal.C10843j.m435a(r9, r8)
            if (r10 == 0) goto L75
            goto L98
        L75:
            r0.f2913a = r2
            r0.f2914b = r8
            r0.f2915c = r3
            r0.f2918f = r4
            java.lang.Object r9 = r2.m11188j(r8, r0)
            if (r9 != r1) goto L84
            return r1
        L84:
            r9 = r8
            r10 = r2
        L86:
            kotlinx.coroutines.flow.j r8 = r10.f2837h
            androidx.datastore.core.c r10 = new androidx.datastore.core.c
            if (r9 == 0) goto L91
            int r0 = r9.hashCode()
            goto L92
        L91:
            r0 = 0
        L92:
            r10.<init>(r9, r0)
            r8.setValue(r10)
        L98:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C1107q.m11189i(kotlin.coroutines.d, kotlin.coroutines.f, kotlin.jvm.functions.p):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4 A[Catch: IOException -> 0x00bb, TRY_ENTER, TryCatch #2 {IOException -> 0x00bb, blocks: (B:31:0x0094, B:35:0x00a4, B:36:0x00ba, B:24:0x006a, B:41:0x00c0), top: B:53:0x006a }] */
    @org.jetbrains.annotations.Nullable
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m11188j(T r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.InterfaceC10772d<? super kotlin.C10868p> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Unable to rename "
            boolean r1 = r9 instanceof androidx.datastore.core.C1107q.C1118i
            if (r1 == 0) goto L15
            r1 = r9
            androidx.datastore.core.q$i r1 = (androidx.datastore.core.C1107q.C1118i) r1
            int r2 = r1.f2883g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f2883g = r2
            goto L1a
        L15:
            androidx.datastore.core.q$i r1 = new androidx.datastore.core.q$i
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.f2881e
            kotlin.coroutines.intrinsics.a r2 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
            int r3 = r1.f2883g
            r4 = 1
            if (r3 == 0) goto L3c
            if (r3 != r4) goto L34
            java.io.FileOutputStream r8 = r1.f2880d
            java.io.FileOutputStream r2 = r1.f2879c
            java.io.File r3 = r1.f2878b
            androidx.datastore.core.q r1 = r1.f2877a
            kotlin.C10864l.m418b(r9)     // Catch: java.lang.Throwable -> L31
            goto L8a
        L31:
            r8 = move-exception
            goto Lbd
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            kotlin.C10864l.m418b(r9)
            java.io.File r9 = r7.m11195c()
            java.io.File r3 = r9.getCanonicalFile()
            java.io.File r3 = r3.getParentFile()
            if (r3 != 0) goto L4e
            goto L57
        L4e:
            r3.mkdirs()
            boolean r3 = r3.isDirectory()
            if (r3 == 0) goto Ld0
        L57:
            java.io.File r3 = new java.io.File
            java.io.File r9 = r7.m11195c()
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.String r5 = r7.f2835f
            java.lang.String r9 = kotlin.jvm.internal.C10843j.m425k(r5, r9)
            r3.<init>(r9)
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lbb
            r9.<init>(r3)     // Catch: java.io.IOException -> Lbb
            androidx.datastore.core.m<T> r5 = r7.f2831b     // Catch: java.lang.Throwable -> Lbf
            androidx.datastore.core.q$b r6 = new androidx.datastore.core.q$b     // Catch: java.lang.Throwable -> Lbf
            r6.<init>(r9)     // Catch: java.lang.Throwable -> Lbf
            r1.f2877a = r7     // Catch: java.lang.Throwable -> Lbf
            r1.f2878b = r3     // Catch: java.lang.Throwable -> Lbf
            r1.f2879c = r9     // Catch: java.lang.Throwable -> Lbf
            r1.f2880d = r9     // Catch: java.lang.Throwable -> Lbf
            r1.f2883g = r4     // Catch: java.lang.Throwable -> Lbf
            kotlin.p r8 = r5.mo11179c(r8, r6)     // Catch: java.lang.Throwable -> Lbf
            if (r8 != r2) goto L87
            return r2
        L87:
            r1 = r7
            r8 = r9
            r2 = r8
        L8a:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L31
            r8.sync()     // Catch: java.lang.Throwable -> L31
            kotlin.p r8 = kotlin.C10868p.f21418a     // Catch: java.lang.Throwable -> L31
            r8 = 0
            kotlin.p061io.C10805a.m443a(r2, r8)     // Catch: java.io.IOException -> Lbb
            java.io.File r8 = r1.m11195c()     // Catch: java.io.IOException -> Lbb
            boolean r8 = r3.renameTo(r8)     // Catch: java.io.IOException -> Lbb
            if (r8 == 0) goto La4
            kotlin.p r8 = kotlin.C10868p.f21418a
            return r8
        La4:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lbb
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbb
            r9.<init>(r0)     // Catch: java.io.IOException -> Lbb
            r9.append(r3)     // Catch: java.io.IOException -> Lbb
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lbb
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lbb
            r8.<init>(r9)     // Catch: java.io.IOException -> Lbb
            throw r8     // Catch: java.io.IOException -> Lbb
        Lbb:
            r8 = move-exception
            goto Lc6
        Lbd:
            r9 = r2
            goto Lc0
        Lbf:
            r8 = move-exception
        Lc0:
            throw r8     // Catch: java.lang.Throwable -> Lc1
        Lc1:
            r0 = move-exception
            kotlin.p061io.C10805a.m443a(r9, r8)     // Catch: java.io.IOException -> Lbb
            throw r0     // Catch: java.io.IOException -> Lbb
        Lc6:
            boolean r9 = r3.exists()
            if (r9 == 0) goto Lcf
            r3.delete()
        Lcf:
            throw r8
        Ld0:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Unable to create parent directories of "
            java.lang.String r9 = kotlin.jvm.internal.C10843j.m425k(r9, r0)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C1107q.m11188j(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }
}
