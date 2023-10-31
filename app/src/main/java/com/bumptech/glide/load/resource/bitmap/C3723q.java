package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.bitmap_recycle.C3486e;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d;
import java.util.concurrent.locks.Lock;

/* renamed from: com.bumptech.glide.load.resource.bitmap.q */
/* loaded from: classes.dex */
public final class C3723q {

    /* renamed from: a */
    public static final C3724a f9689a = new C3724a();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.q$a */
    /* loaded from: classes.dex */
    public class C3724a extends C3486e {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.C3486e, com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d
        /* renamed from: d */
        public final void mo6538d(Bitmap bitmap) {
        }
    }

    @Nullable
    /* renamed from: a */
    public static C3687e m6539a(InterfaceC3485d interfaceC3485d, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        StringBuilder sb;
        String str;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
                    sb.append(str);
                    Log.w("DrawableToBitmap", sb.toString());
                }
                bitmap = null;
            } else if (i2 == Integer.MIN_VALUE && current.getIntrinsicHeight() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
                    sb.append(str);
                    Log.w("DrawableToBitmap", sb.toString());
                }
                bitmap = null;
            } else {
                if (current.getIntrinsicWidth() > 0) {
                    i = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i2 = current.getIntrinsicHeight();
                }
                Lock lock = C3682c0.f9647b;
                lock.lock();
                Bitmap mo6692e = interfaceC3485d.mo6692e(i, i2, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(mo6692e);
                    current.setBounds(0, 0, i, i2);
                    current.draw(canvas);
                    canvas.setBitmap(null);
                    lock.unlock();
                    bitmap = mo6692e;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            interfaceC3485d = f9689a;
        }
        return C3687e.m6567b(bitmap, interfaceC3485d);
    }
}
