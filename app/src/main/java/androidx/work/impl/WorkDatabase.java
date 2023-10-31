package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.AbstractC1668i;
import androidx.room.Database;
import androidx.room.TypeConverters;
import androidx.work.C1837f;
import androidx.work.impl.model.C1917a;
import androidx.work.impl.model.C1921d;
import androidx.work.impl.model.C1925g;
import androidx.work.impl.model.C1930j;
import androidx.work.impl.model.C1934m;
import androidx.work.impl.model.C1940p;
import androidx.work.impl.model.C1952s;
import androidx.work.impl.model.C1956v;
import androidx.work.impl.model.InterfaceC1918b;
import androidx.work.impl.model.InterfaceC1922e;
import androidx.work.impl.model.InterfaceC1926h;
import androidx.work.impl.model.InterfaceC1931k;
import androidx.work.impl.model.InterfaceC1935n;
import androidx.work.impl.model.InterfaceC1942q;
import androidx.work.impl.model.InterfaceC1953t;
import java.util.concurrent.TimeUnit;

@TypeConverters({C1837f.class, C1956v.class})
@Database(entities = {C1917a.class, C1940p.class, C1952s.class, C1925g.class, C1930j.class, C1934m.class, C1921d.class}, version = 12)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class WorkDatabase extends AbstractC1668i {

    /* renamed from: j */
    public static final long f4465j = TimeUnit.DAYS.toMillis(1);

    /* renamed from: k */
    public static final /* synthetic */ int f4466k = 0;

    @NonNull
    /* renamed from: i */
    public abstract InterfaceC1918b mo9898i();

    @NonNull
    /* renamed from: j */
    public abstract InterfaceC1922e mo9897j();

    @NonNull
    /* renamed from: k */
    public abstract InterfaceC1926h mo9896k();

    @NonNull
    /* renamed from: l */
    public abstract InterfaceC1931k mo9895l();

    @NonNull
    /* renamed from: m */
    public abstract InterfaceC1935n mo9894m();

    @NonNull
    /* renamed from: n */
    public abstract InterfaceC1942q mo9893n();

    @NonNull
    /* renamed from: o */
    public abstract InterfaceC1953t mo9892o();
}
