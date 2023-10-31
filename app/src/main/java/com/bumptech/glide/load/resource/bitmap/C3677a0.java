package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d;
import com.bumptech.glide.load.resource.drawable.AbstractC3743b;
import com.bumptech.glide.load.resource.drawable.C3745d;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a0 */
/* loaded from: classes.dex */
public final class C3677a0 implements InterfaceC3583k<Uri, Bitmap> {

    /* renamed from: a */
    public final C3745d f9635a;

    /* renamed from: b */
    public final InterfaceC3485d f9636b;

    public C3677a0(C3745d c3745d, InterfaceC3485d interfaceC3485d) {
        this.f9635a = c3745d;
        this.f9636b = interfaceC3485d;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: a */
    public final boolean mo6504a(@NonNull Uri uri, @NonNull C3581i c3581i) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    @Nullable
    /* renamed from: b */
    public final InterfaceC3573x<Bitmap> mo6503b(@NonNull Uri uri, int i, int i2, @NonNull C3581i c3581i) throws IOException {
        InterfaceC3573x m6519c = this.f9635a.m6519c(uri);
        if (m6519c == null) {
            return null;
        }
        return C3723q.m6539a(this.f9636b, (Drawable) ((AbstractC3743b) m6519c).get(), i, i2);
    }
}
