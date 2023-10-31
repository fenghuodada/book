package androidx.room;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.AbstractC1668i;
import androidx.sqlite.p004db.InterfaceC1702c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.room.a */
/* loaded from: classes.dex */
public final class C1656a {
    @NonNull

    /* renamed from: a */
    public final InterfaceC1702c.InterfaceC1705c f4020a;
    @NonNull

    /* renamed from: b */
    public final Context f4021b;
    @Nullable

    /* renamed from: c */
    public final String f4022c;
    @NonNull

    /* renamed from: d */
    public final AbstractC1668i.C1671c f4023d;
    @Nullable

    /* renamed from: e */
    public final List<AbstractC1668i.AbstractC1670b> f4024e;
    @NonNull

    /* renamed from: f */
    public final Executor f4025f;
    @NonNull

    /* renamed from: g */
    public final Executor f4026g;

    /* renamed from: h */
    public final boolean f4027h;

    /* renamed from: i */
    public final boolean f4028i;

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public C1656a(@NonNull Context context, @Nullable String str, @NonNull InterfaceC1702c.InterfaceC1705c interfaceC1705c, @NonNull AbstractC1668i.C1671c c1671c, @Nullable ArrayList arrayList, boolean z, int i, @NonNull Executor executor, @NonNull Executor executor2, boolean z2, boolean z3) {
        this.f4020a = interfaceC1705c;
        this.f4021b = context;
        this.f4022c = str;
        this.f4023d = c1671c;
        this.f4024e = arrayList;
        this.f4025f = executor;
        this.f4026g = executor2;
        this.f4027h = z2;
        this.f4028i = z3;
    }

    /* renamed from: a */
    public final boolean m10085a(int i, int i2) {
        return !((i > i2) && this.f4028i) && this.f4027h;
    }
}
