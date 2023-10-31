package com.chad.library.adapter.base.viewholder;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.Keep;
import androidx.annotation.StringRes;
import androidx.appcompat.view.menu.C0235r;
import androidx.databinding.C1084c;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.ambrose.overwall.R;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(m509d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010+\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-J\u001b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u0006*\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001c\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\bH\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\bH\u0016J\u001c\u0010\u0015\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\bH\u0016J\u001c\u0010\u0017\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\bH\u0016J\u001c\u0010\u001a\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u001c\u0010\u001d\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u001c\u0010\u001e\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\bH\u0016J\u001c\u0010 \u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u001f\u001a\u00020\bH\u0016J\u001a\u0010#\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0016J\u001a\u0010%\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010$\u001a\u00020!H\u0016J\u001a\u0010'\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010&\u001a\u00020!H\u0016R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, m508d2 = {"Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$y;", "Landroidx/databinding/ViewDataBinding;", "B", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "Landroid/view/View;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "viewId", "getView", "(I)Landroid/view/View;", "getViewOrNull", "findView", "", "value", "setText", "strId", "color", "setTextColor", "colorRes", "setTextColorRes", "imageResId", "setImageResource", "Landroid/graphics/drawable/Drawable;", AppIntroBaseFragmentKt.ARG_DRAWABLE, "setImageDrawable", "Landroid/graphics/Bitmap;", "bitmap", "setImageBitmap", "setBackgroundColor", "backgroundRes", "setBackgroundResource", "", "isVisible", "setVisible", "isGone", "setGone", "isEnabled", "setEnabled", "Landroid/util/SparseArray;", "views", "Landroid/util/SparseArray;", "view", "<init>", "(Landroid/view/View;)V", "com.github.CymChad.brvah"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes.dex */
public class BaseViewHolder extends RecyclerView.AbstractC1597y {
    private final SparseArray<View> views;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewHolder(@NotNull View view) {
        super(view);
        C10843j.m430f(view, "view");
        this.views = new SparseArray<>();
    }

    @Nullable
    public <T extends View> T findView(int i) {
        return (T) this.itemView.findViewById(i);
    }

    @Deprecated(message = "Please use BaseDataBindingHolder class", replaceWith = @ReplaceWith(expression = "DataBindingUtil.getBinding(itemView)", imports = {"androidx.databinding.DataBindingUtil"}))
    @Nullable
    public <B extends ViewDataBinding> B getBinding() {
        View view = this.itemView;
        int i = C1084c.f2791a;
        int i2 = ViewDataBinding.f2789b;
        if (view != null) {
            return (B) view.getTag(R.id.dataBinding);
        }
        return null;
    }

    @NotNull
    public <T extends View> T getView(@IdRes int i) {
        T t = (T) getViewOrNull(i);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(C0235r.m12816a("No view found with id ", i).toString());
    }

    @Nullable
    public <T extends View> T getViewOrNull(@IdRes int i) {
        T t;
        T t2 = (T) this.views.get(i);
        if (t2 == null && (t = (T) this.itemView.findViewById(i)) != null) {
            this.views.put(i, t);
            return t;
        } else if (t2 instanceof View) {
            return t2;
        } else {
            return null;
        }
    }

    @NotNull
    public BaseViewHolder setBackgroundColor(@IdRes int i, @ColorInt int i2) {
        getView(i).setBackgroundColor(i2);
        return this;
    }

    @NotNull
    public BaseViewHolder setBackgroundResource(@IdRes int i, @DrawableRes int i2) {
        getView(i).setBackgroundResource(i2);
        return this;
    }

    @NotNull
    public BaseViewHolder setEnabled(@IdRes int i, boolean z) {
        getView(i).setEnabled(z);
        return this;
    }

    @NotNull
    public BaseViewHolder setGone(@IdRes int i, boolean z) {
        getView(i).setVisibility(z ? 8 : 0);
        return this;
    }

    @NotNull
    public BaseViewHolder setImageBitmap(@IdRes int i, @Nullable Bitmap bitmap) {
        ((ImageView) getView(i)).setImageBitmap(bitmap);
        return this;
    }

    @NotNull
    public BaseViewHolder setImageDrawable(@IdRes int i, @Nullable Drawable drawable) {
        ((ImageView) getView(i)).setImageDrawable(drawable);
        return this;
    }

    @NotNull
    public BaseViewHolder setImageResource(@IdRes int i, @DrawableRes int i2) {
        ((ImageView) getView(i)).setImageResource(i2);
        return this;
    }

    @Nullable
    public BaseViewHolder setText(@IdRes int i, @StringRes int i2) {
        ((TextView) getView(i)).setText(i2);
        return this;
    }

    @NotNull
    public BaseViewHolder setText(@IdRes int i, @Nullable CharSequence charSequence) {
        ((TextView) getView(i)).setText(charSequence);
        return this;
    }

    @NotNull
    public BaseViewHolder setTextColor(@IdRes int i, @ColorInt int i2) {
        ((TextView) getView(i)).setTextColor(i2);
        return this;
    }

    @NotNull
    public BaseViewHolder setTextColorRes(@IdRes int i, @ColorRes int i2) {
        View itemView = this.itemView;
        C10843j.m431e(itemView, "itemView");
        ((TextView) getView(i)).setTextColor(itemView.getResources().getColor(i2));
        return this;
    }

    @NotNull
    public BaseViewHolder setVisible(@IdRes int i, boolean z) {
        getView(i).setVisibility(z ? 0 : 4);
        return this;
    }
}
