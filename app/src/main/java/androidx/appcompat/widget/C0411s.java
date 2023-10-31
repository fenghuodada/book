package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.drawable.InterfaceC0710h;

/* renamed from: androidx.appcompat.widget.s */
/* loaded from: classes.dex */
public class C0411s {

    /* renamed from: c */
    public static final int[] f1375c = {16843067, 16843068};

    /* renamed from: a */
    public final ProgressBar f1376a;

    /* renamed from: b */
    public Bitmap f1377b;

    public C0411s(ProgressBar progressBar) {
        this.f1376a = progressBar;
    }

    /* renamed from: a */
    public void mo12463a(AttributeSet attributeSet, int i) {
        ProgressBar progressBar = this.f1376a;
        C0430x1 m12465m = C0430x1.m12465m(progressBar.getContext(), attributeSet, f1375c, i);
        Drawable m12472f = m12465m.m12472f(0);
        if (m12472f != null) {
            if (m12472f instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) m12472f;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable m12522b = m12522b(animationDrawable.getFrame(i2), true);
                    m12522b.setLevel(10000);
                    animationDrawable2.addFrame(m12522b, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                m12472f = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(m12472f);
        }
        Drawable m12472f2 = m12465m.m12472f(1);
        if (m12472f2 != null) {
            progressBar.setProgressDrawable(m12522b(m12472f2, false));
        }
        m12465m.m12464n();
    }

    @VisibleForTesting
    /* renamed from: b */
    public final Drawable m12522b(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof InterfaceC0710h) {
            InterfaceC0710h interfaceC0710h = (InterfaceC0710h) drawable;
            Drawable m11908b = interfaceC0710h.m11908b();
            if (m11908b != null) {
                interfaceC0710h.m11909a(m12522b(m11908b, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id != 16908301 && id != 16908303) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                drawableArr[i] = m12522b(drawable2, z2);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1377b == null) {
                this.f1377b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }
}
