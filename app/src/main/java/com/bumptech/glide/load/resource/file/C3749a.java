package com.bumptech.glide.load.resource.file;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.file.a */
/* loaded from: classes.dex */
public final class C3749a implements InterfaceC3583k<File, File> {
    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6504a(@NonNull File file, @NonNull C3581i c3581i) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: b */
    public final InterfaceC3573x<File> mo6503b(@NonNull File file, int i, int i2, @NonNull C3581i c3581i) throws IOException {
        return new C3750b(file);
    }
}
