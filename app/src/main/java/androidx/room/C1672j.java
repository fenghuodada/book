package androidx.room;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.sqlite.p004db.InterfaceC1702c;
import androidx.sqlite.p004db.framework.C1707a;
import androidx.work.impl.WorkDatabase_Impl;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.j */
/* loaded from: classes.dex */
public final class C1672j extends InterfaceC1702c.AbstractC1703a {
    @Nullable

    /* renamed from: b */
    public C1656a f4072b;
    @NonNull

    /* renamed from: c */
    public final AbstractC1673a f4073c;

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.room.j$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1673a {

        /* renamed from: a */
        public final int f4074a = 12;

        /* renamed from: a */
        public abstract void mo9891a(C1707a c1707a);

        @NonNull
        /* renamed from: b */
        public abstract C1674b mo9890b(@NonNull C1707a c1707a);
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.room.j$b */
    /* loaded from: classes.dex */
    public static class C1674b {

        /* renamed from: a */
        public final boolean f4075a;
        @Nullable

        /* renamed from: b */
        public final String f4076b;

        public C1674b(boolean z, @Nullable String str) {
            this.f4075a = z;
            this.f4076b = str;
        }
    }

    public C1672j(@NonNull C1656a c1656a, @NonNull WorkDatabase_Impl.C1842a c1842a) {
        super(c1842a.f4074a);
        this.f4072b = c1656a;
        this.f4073c = c1842a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0171 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0076 A[EDGE_INSN: B:90:0x0076->B:37:0x0076 ?: BREAK  , SYNTHETIC] */
    @Override // androidx.sqlite.p004db.InterfaceC1702c.AbstractC1703a
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo10035b(androidx.sqlite.p004db.framework.C1707a r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C1672j.mo10035b(androidx.sqlite.db.framework.a, int, int):void");
    }

    /* renamed from: c */
    public final void m10069c(C1707a c1707a) {
        c1707a.m10030d("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c1707a.m10030d("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }
}
