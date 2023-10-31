package com.applovin.sdk;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.AppLovinContentProviderUtils;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3267o;

/* loaded from: classes.dex */
public class AppLovinInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(Uri uri) {
        return AppLovinContentProviderUtils.getType(uri);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        C3267o.m7148a(getContext());
        C3267o.m7140b(getContext());
        C3214m.m7459a(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return AppLovinContentProviderUtils.openFile(uri);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return AppLovinContentProviderUtils.query(uri);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
