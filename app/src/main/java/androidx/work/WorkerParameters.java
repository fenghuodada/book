package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.C1991q;
import androidx.work.impl.utils.C1993s;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class WorkerParameters {
    @NonNull

    /* renamed from: a */
    public final UUID f4420a;
    @NonNull

    /* renamed from: b */
    public final C1837f f4421b;
    @NonNull

    /* renamed from: c */
    public final HashSet f4422c;
    @NonNull

    /* renamed from: d */
    public final C1827a f4423d;

    /* renamed from: e */
    public final int f4424e;
    @NonNull

    /* renamed from: f */
    public final Executor f4425f;
    @NonNull

    /* renamed from: g */
    public final InterfaceC1998a f4426g;
    @NonNull

    /* renamed from: h */
    public final AbstractC2023w f4427h;
    @NonNull

    /* renamed from: i */
    public final InterfaceC2015p f4428i;
    @NonNull

    /* renamed from: j */
    public final InterfaceC1840h f4429j;

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: androidx.work.WorkerParameters$a */
    /* loaded from: classes.dex */
    public static class C1827a {
        @NonNull

        /* renamed from: a */
        public List<String> f4430a = Collections.emptyList();
        @NonNull

        /* renamed from: b */
        public List<Uri> f4431b = Collections.emptyList();
        @RequiresApi(28)

        /* renamed from: c */
        public Network f4432c;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public WorkerParameters(@NonNull UUID uuid, @NonNull C1837f c1837f, @NonNull List list, @NonNull C1827a c1827a, @IntRange(from = 0) int i, @NonNull ExecutorService executorService, @NonNull InterfaceC1998a interfaceC1998a, @NonNull C2022v c2022v, @NonNull C1993s c1993s, @NonNull C1991q c1991q) {
        this.f4420a = uuid;
        this.f4421b = c1837f;
        this.f4422c = new HashSet(list);
        this.f4423d = c1827a;
        this.f4424e = i;
        this.f4425f = executorService;
        this.f4426g = interfaceC1998a;
        this.f4427h = c2022v;
        this.f4428i = c1993s;
        this.f4429j = c1991q;
    }
}
