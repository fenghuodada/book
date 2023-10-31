package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final String getType(@NonNull Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            if (context.getApplicationContext() != null) {
                C1715a m10013c = C1715a.m10013c(context);
                Context context2 = m10013c.f4176c;
                try {
                    try {
                        Trace.beginSection("Startup");
                        m10013c.m10015a(context2.getPackageManager().getProviderInfo(new ComponentName(context2.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                        return true;
                    } catch (PackageManager.NameNotFoundException e) {
                        throw new C1717c(e);
                    }
                } finally {
                    Trace.endSection();
                }
            }
            return true;
        }
        throw new C1717c();
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
