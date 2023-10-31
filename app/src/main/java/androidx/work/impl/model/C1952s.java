package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import com.google.ads.mediation.facebook.FacebookAdapter;

@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = C1940p.class, onDelete = 5, onUpdate = 5, parentColumns = {FacebookAdapter.KEY_ID})}, indices = {@Index({"work_spec_id"})}, primaryKeys = {"tag", "work_spec_id"})
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.model.s */
/* loaded from: classes.dex */
public final class C1952s {
    @NonNull
    @ColumnInfo(name = "tag")

    /* renamed from: a */
    public final String f4719a;
    @NonNull
    @ColumnInfo(name = "work_spec_id")

    /* renamed from: b */
    public final String f4720b;

    public C1952s(@NonNull String str, @NonNull String str2) {
        this.f4719a = str;
        this.f4720b = str2;
    }
}
