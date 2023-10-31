package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
/* loaded from: classes.dex */
public final class C3676a<DataType> implements InterfaceC3583k<DataType, BitmapDrawable> {

    /* renamed from: a */
    public final InterfaceC3583k<DataType, Bitmap> f9633a;

    /* renamed from: b */
    public final Resources f9634b;

    public C3676a(@NonNull Resources resources, @NonNull InterfaceC3583k<DataType, Bitmap> interfaceC3583k) {
        this.f9634b = resources;
        this.f9633a = interfaceC3583k;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: a */
    public final boolean mo6504a(@NonNull DataType datatype, @NonNull C3581i c3581i) throws IOException {
        return this.f9633a.mo6504a(datatype, c3581i);
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: b */
    public final InterfaceC3573x<BitmapDrawable> mo6503b(@NonNull DataType datatype, int i, int i2, @NonNull C3581i c3581i) throws IOException {
        InterfaceC3573x<Bitmap> mo6503b = this.f9633a.mo6503b(datatype, i, i2, c3581i);
        if (mo6503b == null) {
            return null;
        }
        return new C3733x(this.f9634b, mo6503b);
    }
}
