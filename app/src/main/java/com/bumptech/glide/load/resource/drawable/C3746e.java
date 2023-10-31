package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.drawable.e */
/* loaded from: classes.dex */
public final class C3746e implements InterfaceC3583k<Drawable, Drawable> {
    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6504a(@NonNull Drawable drawable, @NonNull C3581i c3581i) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    @Nullable
    /* renamed from: b */
    public final InterfaceC3573x<Drawable> mo6503b(@NonNull Drawable drawable, int i, int i2, @NonNull C3581i c3581i) throws IOException {
        Drawable drawable2 = drawable;
        if (drawable2 != null) {
            return new C3744c(drawable2);
        }
        return null;
    }
}
