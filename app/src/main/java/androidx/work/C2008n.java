package androidx.work;

import androidx.annotation.NonNull;
import androidx.work.AbstractC2020u;

/* renamed from: androidx.work.n */
/* loaded from: classes.dex */
public final class C2008n extends AbstractC2020u {

    /* renamed from: androidx.work.n$a */
    /* loaded from: classes.dex */
    public static final class C2009a extends AbstractC2020u.AbstractC2021a<C2009a, C2008n> {
        public C2009a(@NonNull Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f4890b.f4693d = OverwritingInputMerger.class.getName();
        }
    }

    public C2008n(C2009a c2009a) {
        super(c2009a.f4889a, c2009a.f4890b, c2009a.f4891c);
    }
}
