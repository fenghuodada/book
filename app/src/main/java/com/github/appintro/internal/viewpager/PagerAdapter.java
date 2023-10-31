package com.github.appintro.internal.viewpager;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m508d2 = {"Lcom/github/appintro/internal/viewpager/PagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "fragments", "", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "getCount", "", "getItem", "position", "instantiateItem", "", "container", "Landroid/view/ViewGroup;", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class PagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> fragments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerAdapter(@NotNull FragmentManager fragmentManager, @NotNull List<Fragment> fragments) {
        super(fragmentManager, 1);
        C10843j.m430f(fragmentManager, "fragmentManager");
        C10843j.m430f(fragments, "fragments");
        this.fragments = fragments;
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public int getCount() {
        return this.fragments.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    @NotNull
    public Fragment getItem(int i) {
        return this.fragments.get(i);
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.AbstractC1821a
    @NotNull
    public Object instantiateItem(@NotNull ViewGroup container, int i) {
        C10843j.m430f(container, "container");
        Object instantiateItem = super.instantiateItem(container, i);
        C10843j.m431e(instantiateItem, "super.instantiateItem(container, position)");
        this.fragments.set(i, (Fragment) instantiateItem);
        return instantiateItem;
    }
}
