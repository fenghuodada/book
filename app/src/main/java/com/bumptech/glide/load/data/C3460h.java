package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.h */
/* loaded from: classes.dex */
public final class C3460h extends AbstractC3450b<ParcelFileDescriptor> {
    public C3460h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    @NonNull
    /* renamed from: a */
    public final Class<ParcelFileDescriptor> mo6579a() {
        return ParcelFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC3450b
    /* renamed from: c */
    public final void mo6721c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC3450b
    /* renamed from: f */
    public final ParcelFileDescriptor mo6720f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
