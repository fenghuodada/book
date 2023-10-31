package androidx.room.util;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.util.b */
/* loaded from: classes.dex */
public final class C1680b {
    /* renamed from: a */
    public static int m10059a(@NonNull Cursor cursor, @NonNull String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }
}
