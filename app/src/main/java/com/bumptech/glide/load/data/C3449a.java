package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.a */
/* loaded from: classes.dex */
public final class C3449a extends AbstractC3466l<AssetFileDescriptor> {
    public C3449a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    @NonNull
    /* renamed from: a */
    public final Class<AssetFileDescriptor> mo6579a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC3466l
    /* renamed from: c */
    public final void mo6715c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC3466l
    /* renamed from: f */
    public final Object mo6714f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
