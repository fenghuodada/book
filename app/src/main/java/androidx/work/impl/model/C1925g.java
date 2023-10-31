package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import com.google.ads.mediation.facebook.FacebookAdapter;

@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = C1940p.class, onDelete = 5, onUpdate = 5, parentColumns = {FacebookAdapter.KEY_ID})})
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.model.g */
/* loaded from: classes.dex */
public final class C1925g {
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "work_spec_id")

    /* renamed from: a */
    public final String f4675a;
    @ColumnInfo(name = "system_id")

    /* renamed from: b */
    public final int f4676b;

    public C1925g(@NonNull String str, int i) {
        this.f4675a = str;
        this.f4676b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1925g) {
            C1925g c1925g = (C1925g) obj;
            if (this.f4676b != c1925g.f4676b) {
                return false;
            }
            return this.f4675a.equals(c1925g.f4675a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f4675a.hashCode() * 31) + this.f4676b;
    }
}
