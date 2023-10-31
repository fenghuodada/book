package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface GifDecoder {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface GifDecodeStatus {
    }

    /* renamed from: com.bumptech.glide.gifdecoder.GifDecoder$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3425a {
    }

    @Nullable
    /* renamed from: a */
    Bitmap mo6756a();

    /* renamed from: b */
    void mo6755b();

    /* renamed from: c */
    int mo6754c();

    void clear();

    /* renamed from: d */
    int mo6753d();

    /* renamed from: e */
    int mo6752e();

    /* renamed from: f */
    int mo6751f();

    @NonNull
    ByteBuffer getData();
}
