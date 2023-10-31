package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0157c;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    public int f1066a;

    /* renamed from: b */
    public int f1067b;

    /* renamed from: c */
    public WeakReference<View> f1068c;

    /* renamed from: d */
    public LayoutInflater f1069d;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0283a {
    }

    public ViewStubCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1066a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0157c.f408B, 0, 0);
        this.f1067b = obtainStyledAttributes.getResourceId(2, -1);
        this.f1066a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public final View m12739a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f1066a != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f1069d;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f1066a, viewGroup, false);
                int i = this.f1067b;
                if (i != -1) {
                    inflate.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f1068c = new WeakReference<>(inflate);
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1067b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1069d;
    }

    public int getLayoutResource() {
        return this.f1066a;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1067b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1069d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1066a = i;
    }

    public void setOnInflateListener(InterfaceC0283a interfaceC0283a) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1068c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m12739a();
        }
    }
}
