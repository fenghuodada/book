package com.qmuiteam.qmui.widget.grouplist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ambrose.overwall.R;
import com.android.tool.util.manager.View$OnClickListenerC2583e;
import com.qmuiteam.qmui.layout.C9063g;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.util.C9145f;
import com.qmuiteam.qmui.util.C9148i;

/* loaded from: classes3.dex */
public class QMUIGroupListView extends LinearLayout {

    /* renamed from: b */
    public static final /* synthetic */ int f17833b = 0;

    /* renamed from: a */
    public final SparseArray<C9214a> f17834a;

    /* renamed from: com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView$a */
    /* loaded from: classes3.dex */
    public static class C9214a {

        /* renamed from: a */
        public final Context f17835a;

        /* renamed from: b */
        public C9215a f17836b;

        /* renamed from: c */
        public C9215a f17837c;

        /* renamed from: e */
        public boolean f17839e = true;

        /* renamed from: f */
        public boolean f17840f = true;

        /* renamed from: g */
        public boolean f17841g = false;

        /* renamed from: h */
        public int f17842h = 0;

        /* renamed from: i */
        public int f17843i = 0;

        /* renamed from: j */
        public int f17844j = -2;

        /* renamed from: k */
        public int f17845k = -2;

        /* renamed from: d */
        public final SparseArray<QMUICommonListItemView> f17838d = new SparseArray<>();

        public C9214a(Context context) {
            this.f17835a = context;
        }

        /* renamed from: a */
        public final void m2572a(QMUICommonListItemView qMUICommonListItemView, View$OnClickListenerC2583e view$OnClickListenerC2583e) {
            if (view$OnClickListenerC2583e != null) {
                qMUICommonListItemView.setOnClickListener(view$OnClickListenerC2583e);
            }
            SparseArray<QMUICommonListItemView> sparseArray = this.f17838d;
            sparseArray.append(sparseArray.size(), qMUICommonListItemView);
        }

        /* renamed from: b */
        public final void m2571b(QMUIGroupListView qMUIGroupListView) {
            Drawable mutate;
            if (this.f17836b == null && this.f17839e) {
                C9215a c9215a = new C9215a(this.f17835a);
                c9215a.setText("");
                this.f17836b = c9215a;
            }
            View view = this.f17836b;
            if (view != null) {
                qMUIGroupListView.addView(view);
            }
            SparseArray<QMUICommonListItemView> sparseArray = this.f17838d;
            int size = sparseArray.size();
            C9135i m2657a = C9135i.m2657a();
            m2657a.m2656b(R.attr.qmui_skin_support_s_common_list_bg);
            m2657a.m2651g(R.attr.qmui_skin_support_common_list_separator_color);
            m2657a.f17563a.put("bottomSeparator", String.valueOf((int) R.attr.qmui_skin_support_common_list_separator_color));
            String m2655c = m2657a.m2655c();
            C9135i.m2653e(m2657a);
            int m2638c = C9145f.m2638c(qMUIGroupListView.getContext(), R.attr.qmui_skin_support_common_list_separator_color);
            for (int i = 0; i < size; i++) {
                QMUICommonListItemView qMUICommonListItemView = sparseArray.get(i);
                int i2 = C9106f.f17535a;
                Drawable m2635f = C9145f.m2635f(R.attr.qmui_skin_support_s_common_list_bg, qMUIGroupListView.getContext(), C9106f.m2678b(qMUIGroupListView));
                if (m2635f == null) {
                    mutate = null;
                } else {
                    mutate = m2635f.mutate();
                }
                C9148i.m2628b(qMUICommonListItemView, mutate);
                C9106f.m2677c(qMUICommonListItemView, m2655c);
                if (this.f17840f) {
                    if (size == 1) {
                        C9063g c9063g = qMUICommonListItemView.f17328r;
                        c9063g.f17355f = 0;
                        c9063g.f17356g = 0;
                        c9063g.f17354e = 1;
                        c9063g.f17357h = m2638c;
                        qMUICommonListItemView.invalidate();
                    } else {
                        if (i == 0) {
                            if (!this.f17841g) {
                                C9063g c9063g2 = qMUICommonListItemView.f17328r;
                                c9063g2.f17355f = 0;
                                c9063g2.f17356g = 0;
                                c9063g2.f17354e = 1;
                                c9063g2.f17357h = m2638c;
                                qMUICommonListItemView.invalidate();
                            }
                        } else if (i == size - 1) {
                            if (this.f17841g) {
                            }
                        }
                        qMUICommonListItemView.m2759w(this.f17842h, this.f17843i, 1, m2638c);
                    }
                    qMUICommonListItemView.m2759w(0, 0, 1, m2638c);
                }
                ConstraintLayout.C0562a c0562a = (ConstraintLayout.C0562a) qMUICommonListItemView.f17828v.getLayoutParams();
                ImageView imageView = qMUICommonListItemView.f17828v;
                ((ViewGroup.MarginLayoutParams) c0562a).width = this.f17844j;
                ((ViewGroup.MarginLayoutParams) c0562a).height = this.f17845k;
                imageView.setLayoutParams(c0562a);
                qMUIGroupListView.addView(qMUICommonListItemView);
            }
            View view2 = this.f17837c;
            if (view2 != null) {
                qMUIGroupListView.addView(view2);
            }
            SparseArray<C9214a> sparseArray2 = qMUIGroupListView.f17834a;
            sparseArray2.append(sparseArray2.size(), this);
        }

        /* renamed from: c */
        public final void m2570c(String str) {
            C9215a c9215a = new C9215a(this.f17835a);
            c9215a.setPadding(c9215a.getPaddingLeft(), c9215a.getPaddingTop(), c9215a.getPaddingRight(), 0);
            c9215a.setText(str);
            this.f17837c = c9215a;
        }
    }

    public QMUIGroupListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f17834a = new SparseArray<>();
        setOrientation(1);
    }

    /* renamed from: a */
    public final QMUICommonListItemView m2574a(@Nullable Drawable drawable, CharSequence charSequence, String str, int i, int i2) {
        QMUICommonListItemView qMUICommonListItemView = new QMUICommonListItemView(getContext());
        qMUICommonListItemView.setOrientation(1);
        qMUICommonListItemView.setLayoutParams(new LinearLayout.LayoutParams(-1, i2));
        qMUICommonListItemView.setImageDrawable(drawable);
        qMUICommonListItemView.setText(charSequence);
        qMUICommonListItemView.setDetailText(str);
        qMUICommonListItemView.setAccessoryType(i);
        return qMUICommonListItemView;
    }

    /* renamed from: b */
    public final QMUICommonListItemView m2573b(String str) {
        return m2574a(null, str, null, 0, C9145f.m2636e(getContext(), R.attr.qmui_list_item_height));
    }

    public int getSectionCount() {
        return this.f17834a.size();
    }
}
