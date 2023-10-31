package com.qmuiteam.qmui.widget.dialog;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.util.C9145f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qmuiteam.qmui.widget.dialog.j */
/* loaded from: classes3.dex */
public final class C9177j extends LinearLayout {

    /* renamed from: h */
    public static final C9178a f17721h = new C9178a();

    /* renamed from: a */
    public final int f17722a;

    /* renamed from: b */
    public int f17723b;

    /* renamed from: c */
    public final List<Pair<View, LinearLayout.LayoutParams>> f17724c;

    /* renamed from: d */
    public final List<Pair<View, LinearLayout.LayoutParams>> f17725d;

    /* renamed from: e */
    public final int f17726e;

    /* renamed from: f */
    public int f17727f;

    /* renamed from: g */
    public final InterfaceC9179b f17728g;

    /* renamed from: com.qmuiteam.qmui.widget.dialog.j$a */
    /* loaded from: classes3.dex */
    public class C9178a implements InterfaceC9179b {
    }

    /* renamed from: com.qmuiteam.qmui.widget.dialog.j$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC9179b {
    }

    public C9177j(QMUIBottomSheet qMUIBottomSheet, ArrayList arrayList, ArrayList arrayList2) {
        super(qMUIBottomSheet.getContext());
        this.f17723b = -1;
        boolean z = true;
        setOrientation(1);
        setGravity(48);
        this.f17728g = f17721h;
        setPadding(0, C9145f.m2636e(qMUIBottomSheet.getContext(), R.attr.qmui_bottom_sheet_grid_padding_top), 0, C9145f.m2636e(qMUIBottomSheet.getContext(), R.attr.qmui_bottom_sheet_grid_padding_bottom));
        this.f17724c = arrayList;
        this.f17725d = arrayList2;
        this.f17722a = Math.max(arrayList != null ? arrayList.size() : 0, arrayList2 != null ? arrayList2.size() : 0);
        this.f17726e = C9145f.m2636e(qMUIBottomSheet.getContext(), R.attr.qmui_bottom_sheet_padding_hor);
        if (arrayList == null || arrayList.isEmpty()) {
            z = false;
        } else {
            addView(m2588a(qMUIBottomSheet, arrayList), new LinearLayout.LayoutParams(-2, -2));
        }
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        HorizontalScrollView m2588a = m2588a(qMUIBottomSheet, arrayList2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (z) {
            layoutParams.topMargin = C9145f.m2636e(qMUIBottomSheet.getContext(), R.attr.qmui_bottom_sheet_grid_line_vertical_space);
        }
        addView(m2588a, layoutParams);
    }

    /* renamed from: a */
    public final HorizontalScrollView m2588a(QMUIBottomSheet qMUIBottomSheet, ArrayList arrayList) {
        Context context = qMUIBottomSheet.getContext();
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        int i = this.f17726e;
        linearLayout.setPadding(i, 0, i, 0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -2));
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Pair pair = (Pair) arrayList.get(i2);
            linearLayout.addView((View) pair.first, (ViewGroup.LayoutParams) pair.second);
        }
        return horizontalScrollView;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        super.measureChild(view, i, i2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        if (this.f17723b == -1) {
            this.f17723b = C9145f.m2636e(getContext(), R.attr.qmui_bottom_sheet_grid_item_mini_width);
        }
        getContext();
        int i4 = this.f17723b;
        ((C9178a) this.f17728g).getClass();
        int i5 = this.f17726e;
        int i6 = size - i5;
        int i7 = i6 - i5;
        int i8 = this.f17722a;
        if (i8 >= 3 && (i3 = i7 - (i8 * i4)) > 0 && i3 < i4) {
            i4 = i7 / (i7 / i4);
        }
        if (i8 * i4 > i7) {
            i4 = (int) (i6 / ((i6 / i4) + 0.5f));
        }
        this.f17727f = i4;
        List<Pair<View, LinearLayout.LayoutParams>> list = this.f17724c;
        if (list != null) {
            for (Pair<View, LinearLayout.LayoutParams> pair : list) {
                Object obj = pair.second;
                int i9 = ((LinearLayout.LayoutParams) obj).width;
                int i10 = this.f17727f;
                if (i9 != i10) {
                    ((LinearLayout.LayoutParams) obj).width = i10;
                }
            }
        }
        List<Pair<View, LinearLayout.LayoutParams>> list2 = this.f17725d;
        if (list2 != null) {
            for (Pair<View, LinearLayout.LayoutParams> pair2 : list2) {
                Object obj2 = pair2.second;
                int i11 = ((LinearLayout.LayoutParams) obj2).width;
                int i12 = this.f17727f;
                if (i11 != i12) {
                    ((LinearLayout.LayoutParams) obj2).width = i12;
                }
            }
        }
        super.onMeasure(i, i2);
    }
}
