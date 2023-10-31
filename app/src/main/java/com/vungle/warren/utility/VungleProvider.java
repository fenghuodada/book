package com.vungle.warren.utility;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class VungleProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(@NonNull Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            C10069a c10069a = C10069a.f20278j;
            if (!c10069a.f20279a) {
                c10069a.f20284f = new Handler(Looper.getMainLooper());
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(c10069a);
                c10069a.f20279a = true;
            }
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
