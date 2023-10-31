package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.i */
/* loaded from: classes.dex */
public final class C3461i extends AbstractC3466l<ParcelFileDescriptor> {
    public C3461i(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    @NonNull
    /* renamed from: a */
    public final Class<ParcelFileDescriptor> mo6579a() {
        return ParcelFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC3466l
    /* renamed from: c */
    public final void mo6715c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC3466l
    /* renamed from: f */
    public final Object mo6714f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
