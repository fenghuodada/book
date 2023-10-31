package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.resource.bitmap.InterfaceC3729v;
import java.io.IOException;

@RequiresApi(21)
/* renamed from: com.bumptech.glide.load.resource.bitmap.y */
/* loaded from: classes.dex */
public final class C3734y implements InterfaceC3583k<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    public final C3720p f9713a;

    public C3734y(C3720p c3720p) {
        this.f9713a = c3720p;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: a */
    public final boolean mo6504a(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull C3581i c3581i) throws IOException {
        this.f9713a.getClass();
        return true;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    @Nullable
    /* renamed from: b */
    public final InterfaceC3573x<Bitmap> mo6503b(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @NonNull C3581i c3581i) throws IOException {
        C3720p c3720p = this.f9713a;
        return c3720p.m6548a(new InterfaceC3729v.C3731b(parcelFileDescriptor, c3720p.f9687d, c3720p.f9686c), i, i2, c3581i, C3720p.f9682k);
    }
}
