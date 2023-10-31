package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.work.C1837f;
import com.google.ads.mediation.facebook.FacebookAdapter;

@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = C1940p.class, onDelete = 5, onUpdate = 5, parentColumns = {FacebookAdapter.KEY_ID})})
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.model.m */
/* loaded from: classes.dex */
public final class C1934m {
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "work_spec_id")

    /* renamed from: a */
    public final String f4684a;
    @NonNull
    @ColumnInfo(name = "progress")

    /* renamed from: b */
    public final C1837f f4685b;

    public C1934m(@NonNull String str, @NonNull C1837f c1837f) {
        this.f4684a = str;
        this.f4685b = c1837f;
    }
}
