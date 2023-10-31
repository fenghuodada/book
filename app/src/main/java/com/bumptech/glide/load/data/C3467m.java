package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.m */
/* loaded from: classes.dex */
public final class C3467m extends AbstractC3450b<InputStream> {
    public C3467m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d
    @NonNull
    /* renamed from: a */
    public final Class<InputStream> mo6579a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC3450b
    /* renamed from: c */
    public final void mo6721c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC3450b
    /* renamed from: f */
    public final InputStream mo6720f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
