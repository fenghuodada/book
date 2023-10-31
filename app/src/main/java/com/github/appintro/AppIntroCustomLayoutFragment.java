package com.github.appintro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m508d2 = {"Lcom/github/appintro/AppIntroCustomLayoutFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/p;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "", AppIntroCustomLayoutFragment.ARG_LAYOUT_RES_ID, "I", "<init>", "()V", "Companion", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class AppIntroCustomLayoutFragment extends Fragment {
    private static final String ARG_LAYOUT_RES_ID = "layoutResId";
    @NotNull
    public static final Companion Companion = new Companion(null);
    private int layoutResId;

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m508d2 = {"Lcom/github/appintro/AppIntroCustomLayoutFragment$Companion;", "", "()V", "ARG_LAYOUT_RES_ID", "", "newInstance", "Lcom/github/appintro/AppIntroCustomLayoutFragment;", AppIntroCustomLayoutFragment.ARG_LAYOUT_RES_ID, "", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }

        @JvmStatic
        @NotNull
        public final AppIntroCustomLayoutFragment newInstance(int i) {
            AppIntroCustomLayoutFragment appIntroCustomLayoutFragment = new AppIntroCustomLayoutFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(AppIntroCustomLayoutFragment.ARG_LAYOUT_RES_ID, i);
            appIntroCustomLayoutFragment.setArguments(bundle);
            return appIntroCustomLayoutFragment;
        }
    }

    @JvmStatic
    @NotNull
    public static final AppIntroCustomLayoutFragment newInstance(int i) {
        return Companion.newInstance(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.layoutResId = arguments != null ? arguments.getInt(ARG_LAYOUT_RES_ID) : 0;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C10843j.m430f(inflater, "inflater");
        return inflater.inflate(this.layoutResId, viewGroup, false);
    }
}
