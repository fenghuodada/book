package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.model.C1940p;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* renamed from: androidx.work.u */
/* loaded from: classes.dex */
public abstract class AbstractC2020u {
    @NonNull

    /* renamed from: a */
    public final UUID f4886a;
    @NonNull

    /* renamed from: b */
    public final C1940p f4887b;
    @NonNull

    /* renamed from: c */
    public final Set<String> f4888c;

    /* renamed from: androidx.work.u$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2021a<B extends AbstractC2021a<?, ?>, W extends AbstractC2020u> {

        /* renamed from: a */
        public UUID f4889a;

        /* renamed from: b */
        public C1940p f4890b;

        /* renamed from: c */
        public final HashSet f4891c;

        public AbstractC2021a(@NonNull Class<? extends ListenableWorker> cls) {
            HashSet hashSet = new HashSet();
            this.f4891c = hashSet;
            this.f4889a = UUID.randomUUID();
            this.f4890b = new C1940p(this.f4889a.toString(), cls.getName());
            hashSet.add(cls.getName());
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r2 == false) goto L16;
         */
        @androidx.annotation.NonNull
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.work.C2008n m9725a() {
            /*
                r6 = this;
                r0 = r6
                androidx.work.n$a r0 = (androidx.work.C2008n.C2009a) r0
                androidx.work.n r1 = new androidx.work.n
                r1.<init>(r0)
                androidx.work.impl.model.p r0 = r6.f4890b
                androidx.work.d r0 = r0.f4699j
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 24
                r4 = 1
                r5 = 0
                if (r2 < r3) goto L23
                androidx.work.e r2 = r0.f4451h
                java.util.HashSet r2 = r2.f4454a
                int r2 = r2.size()
                if (r2 <= 0) goto L20
                r2 = r4
                goto L21
            L20:
                r2 = r5
            L21:
                if (r2 != 0) goto L31
            L23:
                boolean r2 = r0.f4447d
                if (r2 != 0) goto L31
                boolean r2 = r0.f4445b
                if (r2 != 0) goto L31
                boolean r0 = r0.f4446c
                if (r0 == 0) goto L30
                goto L31
            L30:
                r4 = r5
            L31:
                androidx.work.impl.model.p r0 = r6.f4890b
                boolean r0 = r0.f4706q
                if (r0 == 0) goto L42
                if (r4 != 0) goto L3a
                goto L42
            L3a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expedited jobs only support network and storage constraints"
                r0.<init>(r1)
                throw r0
            L42:
                java.util.UUID r0 = java.util.UUID.randomUUID()
                r6.f4889a = r0
                androidx.work.impl.model.p r0 = new androidx.work.impl.model.p
                androidx.work.impl.model.p r2 = r6.f4890b
                r0.<init>(r2)
                r6.f4890b = r0
                java.util.UUID r2 = r6.f4889a
                java.lang.String r2 = r2.toString()
                r0.f4690a = r2
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.AbstractC2020u.AbstractC2021a.m9725a():androidx.work.n");
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public AbstractC2020u(@NonNull UUID uuid, @NonNull C1940p c1940p, @NonNull HashSet hashSet) {
        this.f4886a = uuid;
        this.f4887b = c1940p;
        this.f4888c = hashSet;
    }
}
