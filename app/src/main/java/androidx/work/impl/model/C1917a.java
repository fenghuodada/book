package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import com.google.ads.mediation.facebook.FacebookAdapter;

@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = C1940p.class, onDelete = 5, onUpdate = 5, parentColumns = {FacebookAdapter.KEY_ID}), @ForeignKey(childColumns = {"prerequisite_id"}, entity = C1940p.class, onDelete = 5, onUpdate = 5, parentColumns = {FacebookAdapter.KEY_ID})}, indices = {@Index({"work_spec_id"}), @Index({"prerequisite_id"})}, primaryKeys = {"work_spec_id", "prerequisite_id"})
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.model.a */
/* loaded from: classes.dex */
public final class C1917a {
    @NonNull
    @ColumnInfo(name = "work_spec_id")

    /* renamed from: a */
    public final String f4667a;
    @NonNull
    @ColumnInfo(name = "prerequisite_id")

    /* renamed from: b */
    public final String f4668b;

    public C1917a(@NonNull String str, @NonNull String str2) {
        this.f4667a = str;
        this.f4668b = str2;
    }
}
