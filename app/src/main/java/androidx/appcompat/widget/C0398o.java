package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.C0158a;
import androidx.core.view.InterfaceC0969m0;
import com.ambrose.overwall.R;

/* renamed from: androidx.appcompat.widget.o */
/* loaded from: classes.dex */
public class C0398o extends ImageButton implements InterfaceC0969m0 {

    /* renamed from: a */
    public final C0326e f1341a;

    /* renamed from: b */
    public final C0401p f1342b;

    /* renamed from: c */
    public boolean f1343c;

    public C0398o(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0398o(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0419u1.m12491a(context);
        this.f1343c = false;
        C0413s1.m12501a(this, getContext());
        C0326e c0326e = new C0326e(this);
        this.f1341a = c0326e;
        c0326e.m12684d(attributeSet, i);
        C0401p c0401p = new C0401p(this);
        this.f1342b = c0401p;
        c0401p.m12541b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0326e c0326e = this.f1341a;
        if (c0326e != null) {
            c0326e.m12687a();
        }
        C0401p c0401p = this.f1342b;
        if (c0401p != null) {
            c0401p.m12542a();
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0326e c0326e = this.f1341a;
        if (c0326e != null) {
            return c0326e.m12686b();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0326e c0326e = this.f1341a;
        if (c0326e != null) {
            return c0326e.m12685c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        C0422v1 c0422v1;
        C0401p c0401p = this.f1342b;
        if (c0401p == null || (c0422v1 = c0401p.f1345b) == null) {
            return null;
        }
        return c0422v1.f1391a;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        C0422v1 c0422v1;
        C0401p c0401p = this.f1342b;
        if (c0401p == null || (c0422v1 = c0401p.f1345b) == null) {
            return null;
        }
        return c0422v1.f1392b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(this.f1342b.f1344a.getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0326e c0326e = this.f1341a;
        if (c0326e != null) {
            c0326e.m12683e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        C0326e c0326e = this.f1341a;
        if (c0326e != null) {
            c0326e.m12682f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0401p c0401p = this.f1342b;
        if (c0401p != null) {
            c0401p.m12542a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        C0401p c0401p = this.f1342b;
        if (c0401p != null && drawable != null && !this.f1343c) {
            c0401p.f1346c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0401p != null) {
            c0401p.m12542a();
            if (!this.f1343c) {
                ImageView imageView = c0401p.f1344a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(c0401p.f1346c);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f1343c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        Drawable drawable;
        C0401p c0401p = this.f1342b;
        ImageView imageView = c0401p.f1344a;
        if (i != 0) {
            drawable = C0158a.m12920a(imageView.getContext(), i);
            if (drawable != null) {
                C0427x0.m12481a(drawable);
            }
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        c0401p.m12542a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        C0401p c0401p = this.f1342b;
        if (c0401p != null) {
            c0401p.m12542a();
        }
    }

    @Override // androidx.core.view.InterfaceC0969m0
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C0326e c0326e = this.f1341a;
        if (c0326e != null) {
            c0326e.m12680h(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C0326e c0326e = this.f1341a;
        if (c0326e != null) {
            c0326e.m12679i(mode);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        C0401p c0401p = this.f1342b;
        if (c0401p != null) {
            if (c0401p.f1345b == null) {
                c0401p.f1345b = new C0422v1();
            }
            C0422v1 c0422v1 = c0401p.f1345b;
            c0422v1.f1391a = colorStateList;
            c0422v1.f1394d = true;
            c0401p.m12542a();
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        C0401p c0401p = this.f1342b;
        if (c0401p != null) {
            if (c0401p.f1345b == null) {
                c0401p.f1345b = new C0422v1();
            }
            C0422v1 c0422v1 = c0401p.f1345b;
            c0422v1.f1392b = mode;
            c0422v1.f1393c = true;
            c0401p.m12542a();
        }
    }
}
