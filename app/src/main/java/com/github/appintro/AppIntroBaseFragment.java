package com.github.appintro;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.LayoutRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.github.appintro.internal.LogHelper;
import com.github.appintro.internal.TypefaceContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b,\u0010-J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0012\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u0015H\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR$\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u0018\u0010%\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010+\u001a\u00020\u00158eX¤\u0004¢\u0006\u0006\u001a\u0004\b*\u0010#¨\u0006."}, m508d2 = {"Lcom/github/appintro/AppIntroBaseFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/github/appintro/SlideSelectionListener;", "Lcom/github/appintro/SlideBackgroundColorHolder;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/p;", "onCreate", "onActivityCreated", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onResume", "onPause", "outState", "onSaveInstanceState", "onSlideDeselected", "onSlideSelected", "", "backgroundColor", "setBackgroundColor", "", "logTAG", "Ljava/lang/String;", AppIntroBaseFragmentKt.ARG_DRAWABLE, "I", "bgDrawable", "titleColor", "descColor", "<set-?>", "defaultBackgroundColor", "getDefaultBackgroundColor", "()I", AppIntroBaseFragmentKt.ARG_TITLE, "description", "Lcom/github/appintro/internal/TypefaceContainer;", "titleTypeface", "Lcom/github/appintro/internal/TypefaceContainer;", "descTypeface", "getLayoutId", "layoutId", "<init>", "()V", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public abstract class AppIntroBaseFragment extends Fragment implements SlideSelectionListener, SlideBackgroundColorHolder {
    private int bgDrawable;
    private int defaultBackgroundColor;
    private int descColor;
    private TypefaceContainer descTypeface;
    private String description;
    private int drawable;
    private final String logTAG = LogHelper.makeLogTag(AppIntroBaseFragment.class);
    private String title;
    private int titleColor;
    private TypefaceContainer titleTypeface;

    @Override // com.github.appintro.SlideBackgroundColorHolder
    public final int getDefaultBackgroundColor() {
        return this.defaultBackgroundColor;
    }

    @LayoutRes
    public abstract int getLayoutId();

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            this.drawable = bundle.getInt(AppIntroBaseFragmentKt.ARG_DRAWABLE);
            this.title = bundle.getString(AppIntroBaseFragmentKt.ARG_TITLE);
            this.description = bundle.getString(AppIntroBaseFragmentKt.ARG_DESC);
            this.titleTypeface = new TypefaceContainer(bundle.getString(AppIntroBaseFragmentKt.ARG_TITLE_TYPEFACE), bundle.getInt(AppIntroBaseFragmentKt.ARG_TITLE_TYPEFACE_RES, 0));
            this.descTypeface = new TypefaceContainer(bundle.getString(AppIntroBaseFragmentKt.ARG_DESC_TYPEFACE), bundle.getInt(AppIntroBaseFragmentKt.ARG_DESC_TYPEFACE_RES, 0));
            this.defaultBackgroundColor = bundle.getInt(AppIntroBaseFragmentKt.ARG_BG_COLOR);
            this.bgDrawable = bundle.getInt(AppIntroBaseFragmentKt.ARG_BG_DRAWABLE);
            this.titleColor = bundle.getInt(AppIntroBaseFragmentKt.ARG_TITLE_COLOR);
            this.descColor = bundle.getInt(AppIntroBaseFragmentKt.ARG_DESC_COLOR);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        Bundle arguments = getArguments();
        if (arguments == null || arguments.size() == 0) {
            return;
        }
        this.drawable = arguments.getInt(AppIntroBaseFragmentKt.ARG_DRAWABLE);
        this.title = arguments.getString(AppIntroBaseFragmentKt.ARG_TITLE);
        this.description = arguments.getString(AppIntroBaseFragmentKt.ARG_DESC);
        this.bgDrawable = arguments.getInt(AppIntroBaseFragmentKt.ARG_BG_DRAWABLE);
        String string = arguments.getString(AppIntroBaseFragmentKt.ARG_TITLE_TYPEFACE);
        String string2 = arguments.getString(AppIntroBaseFragmentKt.ARG_DESC_TYPEFACE);
        int i = arguments.getInt(AppIntroBaseFragmentKt.ARG_TITLE_TYPEFACE_RES);
        int i2 = arguments.getInt(AppIntroBaseFragmentKt.ARG_DESC_TYPEFACE_RES);
        this.titleTypeface = new TypefaceContainer(string, i);
        this.descTypeface = new TypefaceContainer(string2, i2);
        this.defaultBackgroundColor = arguments.getInt(AppIntroBaseFragmentKt.ARG_BG_COLOR);
        this.titleColor = arguments.getInt(AppIntroBaseFragmentKt.ARG_TITLE_COLOR, 0);
        this.descColor = arguments.getInt(AppIntroBaseFragmentKt.ARG_DESC_COLOR, 0);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C10843j.m430f(inflater, "inflater");
        View inflate = inflater.inflate(getLayoutId(), viewGroup, false);
        TextView titleText = (TextView) inflate.findViewById(C6356R.C6359id.title);
        TextView descriptionText = (TextView) inflate.findViewById(C6356R.C6359id.description);
        ImageView imageView = (ImageView) inflate.findViewById(C6356R.C6359id.image);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(C6356R.C6359id.main);
        C10843j.m431e(titleText, "titleText");
        titleText.setText(this.title);
        C10843j.m431e(descriptionText, "descriptionText");
        descriptionText.setText(this.description);
        int i = this.titleColor;
        if (i != 0) {
            titleText.setTextColor(i);
        }
        int i2 = this.descColor;
        if (i2 != 0) {
            descriptionText.setTextColor(i2);
        }
        TypefaceContainer typefaceContainer = this.titleTypeface;
        if (typefaceContainer != null) {
            typefaceContainer.applyTo(titleText);
        }
        TypefaceContainer typefaceContainer2 = this.descTypeface;
        if (typefaceContainer2 != null) {
            typefaceContainer2.applyTo(descriptionText);
        }
        imageView.setImageResource(this.drawable);
        int i3 = this.bgDrawable;
        if (i3 != 0) {
            if (constraintLayout != null) {
                constraintLayout.setBackgroundResource(i3);
            }
        } else if (constraintLayout != null) {
            constraintLayout.setBackgroundColor(this.defaultBackgroundColor);
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        ImageView imageView = view != null ? (ImageView) view.findViewById(C6356R.C6359id.image) : null;
        if (imageView instanceof Animatable) {
            ((Animatable) imageView).start();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = getView();
        ImageView imageView = view != null ? (ImageView) view.findViewById(C6356R.C6359id.image) : null;
        if (imageView instanceof Animatable) {
            ((Animatable) imageView).start();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        C10843j.m430f(outState, "outState");
        outState.putInt(AppIntroBaseFragmentKt.ARG_DRAWABLE, this.drawable);
        outState.putInt(AppIntroBaseFragmentKt.ARG_BG_DRAWABLE, this.bgDrawable);
        outState.putString(AppIntroBaseFragmentKt.ARG_TITLE, this.title);
        outState.putString(AppIntroBaseFragmentKt.ARG_DESC, this.description);
        outState.putInt(AppIntroBaseFragmentKt.ARG_BG_COLOR, this.defaultBackgroundColor);
        outState.putInt(AppIntroBaseFragmentKt.ARG_TITLE_COLOR, this.titleColor);
        outState.putInt(AppIntroBaseFragmentKt.ARG_DESC_COLOR, this.descColor);
        TypefaceContainer typefaceContainer = this.titleTypeface;
        if (typefaceContainer != null) {
            outState.putString(AppIntroBaseFragmentKt.ARG_TITLE_TYPEFACE, typefaceContainer != null ? typefaceContainer.getTypeFaceUrl() : null);
            TypefaceContainer typefaceContainer2 = this.titleTypeface;
            outState.putInt(AppIntroBaseFragmentKt.ARG_TITLE_TYPEFACE_RES, typefaceContainer2 != null ? typefaceContainer2.getTypeFaceResource() : 0);
        }
        TypefaceContainer typefaceContainer3 = this.descTypeface;
        if (typefaceContainer3 != null) {
            outState.putString(AppIntroBaseFragmentKt.ARG_DESC_TYPEFACE, typefaceContainer3 != null ? typefaceContainer3.getTypeFaceUrl() : null);
            TypefaceContainer typefaceContainer4 = this.descTypeface;
            outState.putInt(AppIntroBaseFragmentKt.ARG_DESC_TYPEFACE_RES, typefaceContainer4 != null ? typefaceContainer4.getTypeFaceResource() : 0);
        }
        super.onSaveInstanceState(outState);
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
        String str = this.logTAG;
        LogHelper.m6363d(str, "Slide " + this.title + " has been deselected.");
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
        String str = this.logTAG;
        LogHelper.m6363d(str, "Slide " + this.title + " has been selected.");
    }

    @Override // com.github.appintro.SlideBackgroundColorHolder
    public void setBackgroundColor(@ColorInt int i) {
        ConstraintLayout constraintLayout;
        View view = getView();
        if (view == null || (constraintLayout = (ConstraintLayout) view.findViewById(C6356R.C6359id.main)) == null) {
            return;
        }
        constraintLayout.setBackgroundColor(i);
    }
}
