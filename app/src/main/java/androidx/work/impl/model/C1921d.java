package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.model.d */
/* loaded from: classes.dex */
public final class C1921d {
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "key")

    /* renamed from: a */
    public final String f4671a;
    @Nullable
    @ColumnInfo(name = "long_value")

    /* renamed from: b */
    public final Long f4672b;

    public C1921d(@NonNull String str, long j) {
        this.f4671a = str;
        this.f4672b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1921d) {
            C1921d c1921d = (C1921d) obj;
            if (this.f4671a.equals(c1921d.f4671a)) {
                Long l = c1921d.f4672b;
                Long l2 = this.f4672b;
                return l2 != null ? l2.equals(l) : l == null;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4671a.hashCode() * 31;
        Long l = this.f4672b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
