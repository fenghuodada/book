package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.InterfaceC3568t;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.resource.gif.C3757c;
import com.bumptech.glide.util.C3860j;

/* renamed from: com.bumptech.glide.load.resource.drawable.b */
/* loaded from: classes.dex */
public abstract class AbstractC3743b<T extends Drawable> implements InterfaceC3573x<T>, InterfaceC3568t {

    /* renamed from: a */
    public final T f9723a;

    public AbstractC3743b(T t) {
        C3860j.m6404b(t);
        this.f9723a = t;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    @NonNull
    public final Object get() {
        T t = this.f9723a;
        Drawable.ConstantState constantState = t.getConstantState();
        return constantState == null ? t : constantState.newDrawable();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3568t
    public void initialize() {
        Bitmap bitmap;
        T t = this.f9723a;
        if (t instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) t).getBitmap();
        } else if (t instanceof C3757c) {
            bitmap = ((C3757c) t).f9743a.f9753a.f9766l;
        } else {
            return;
        }
        bitmap.prepareToDraw();
    }
}
