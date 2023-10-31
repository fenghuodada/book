package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import com.google.ads.mediation.facebook.FacebookAdapter;

@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = C1940p.class, onDelete = 5, onUpdate = 5, parentColumns = {FacebookAdapter.KEY_ID})}, indices = {@Index({"work_spec_id"})}, primaryKeys = {"name", "work_spec_id"})
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.model.j */
/* loaded from: classes.dex */
public final class C1930j {
    @NonNull
    @ColumnInfo(name = "name")

    /* renamed from: a */
    public final String f4680a;
    @NonNull
    @ColumnInfo(name = "work_spec_id")

    /* renamed from: b */
    public final String f4681b;

    public C1930j(@NonNull String str, @NonNull String str2) {
        this.f4680a = str;
        this.f4681b = str2;
    }
}
