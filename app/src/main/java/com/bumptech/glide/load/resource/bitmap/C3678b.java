package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.EnumC3446c;
import com.bumptech.glide.load.InterfaceC3584l;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
/* loaded from: classes.dex */
public final class C3678b implements InterfaceC3584l<BitmapDrawable> {

    /* renamed from: a */
    public final InterfaceC3485d f9637a;

    /* renamed from: b */
    public final InterfaceC3584l<Bitmap> f9638b;

    public C3678b(InterfaceC3485d interfaceC3485d, C3681c c3681c) {
        this.f9637a = interfaceC3485d;
        this.f9638b = c3681c;
    }

    @Override // com.bumptech.glide.load.InterfaceC3447d
    /* renamed from: a */
    public final boolean mo6512a(@NonNull Object obj, @NonNull File file, @NonNull C3581i c3581i) {
        return this.f9638b.mo6512a(new C3687e(((BitmapDrawable) ((InterfaceC3573x) obj).get()).getBitmap(), this.f9637a), file, c3581i);
    }

    @Override // com.bumptech.glide.load.InterfaceC3584l
    @NonNull
    /* renamed from: b */
    public final EnumC3446c mo6511b(@NonNull C3581i c3581i) {
        return this.f9638b.mo6511b(c3581i);
    }
}
