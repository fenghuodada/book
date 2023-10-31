package com.android.tool.util.manager;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.AbstractC1821a;
import com.android.tool.util.manager.C2560c;
import com.tencent.mmkv.MMKV;
import java.util.HashMap;

/* renamed from: com.android.tool.util.manager.a */
/* loaded from: classes.dex */
public final class C2558a extends AbstractC1821a {

    /* renamed from: a */
    public final AbstractC1821a f6053a;

    /* renamed from: b */
    public final String f6054b;

    /* renamed from: c */
    public final HashMap<Object, Integer> f6055c = new HashMap<>();

    /* renamed from: d */
    public final C2560c f6056d;

    public C2558a(C2560c c2560c, AbstractC1821a abstractC1821a, String str) {
        this.f6056d = c2560c;
        this.f6053a = abstractC1821a;
        this.f6054b = str;
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public final void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        this.f6053a.destroyItem(viewGroup, i, obj);
        Integer remove = this.f6055c.remove(obj);
        if (remove != null) {
            int intValue = remove.intValue();
            C2560c c2560c = this.f6056d;
            SparseArray<HashMap<View, C2560c.C2565e>> sparseArray = c2560c.f6062b;
            c2560c.m9362j(sparseArray.get(intValue));
            sparseArray.remove(intValue);
        }
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public final void finishUpdate(@NonNull ViewGroup viewGroup) {
        this.f6053a.finishUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public final int getCount() {
        return this.f6053a.getCount();
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public final int getItemPosition(@NonNull Object obj) {
        return this.f6053a.getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public final CharSequence getPageTitle(int i) {
        return this.f6053a.getPageTitle(i);
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public final float getPageWidth(int i) {
        return this.f6053a.getPageWidth(i);
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    @NonNull
    public final Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        AbstractC1821a abstractC1821a = this.f6053a;
        Object instantiateItem = abstractC1821a.instantiateItem(viewGroup, i);
        C2560c c2560c = this.f6056d;
        c2560c.getClass();
        if (!(instantiateItem instanceof Fragment) && (instantiateItem instanceof View)) {
            View view = (View) instantiateItem;
            HashMap<View, C2560c.C2565e> hashMap = c2560c.f6062b.get(c2560c.m9368d(view));
            StringBuilder sb = new StringBuilder();
            String str = this.f6054b;
            sb.append(str);
            sb.append("_");
            sb.append(view.getClass().getSimpleName());
            String sb2 = sb.toString();
            c2560c.m9369c(view, sb2, hashMap);
            C2560c.m9364h(hashMap);
            c2560c.m9366f(hashMap);
            MMKV m2534d = MMKV.m2534d();
            StringBuilder m13052b = C0063d.m13052b("p:", str, "@");
            m13052b.append(view.getClass().getName());
            String sb3 = m13052b.toString();
            m2534d.m2536b(sb3, abstractC1821a.getClass().getName() + ";" + sb2);
        }
        this.f6055c.put(instantiateItem, -1);
        return instantiateItem;
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public final boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return this.f6053a.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f6053a.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public final void registerDataSetObserver(@NonNull DataSetObserver dataSetObserver) {
        this.f6053a.registerDataSetObserver(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f6053a.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public final Parcelable saveState() {
        return this.f6053a.saveState();
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public final void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        this.f6053a.setPrimaryItem(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public final void startUpdate(@NonNull ViewGroup viewGroup) {
        this.f6053a.startUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public final void unregisterDataSetObserver(@NonNull DataSetObserver dataSetObserver) {
        this.f6053a.unregisterDataSetObserver(dataSetObserver);
    }
}
