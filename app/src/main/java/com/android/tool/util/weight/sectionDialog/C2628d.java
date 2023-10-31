package com.android.tool.util.weight.sectionDialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ambrose.overwall.R;
import com.ambrose.overwall.fragment.C2470n;
import com.ambrose.overwall.fragment.View$OnClickListenerC2481q;
import com.android.tool.ApplicationC2534a;
import com.android.tool.util.util.C2603g;
import com.android.tool.util.weight.sectionDialog.C2640k;
import com.qmuiteam.qmui.layout.C9063g;
import com.qmuiteam.qmui.layout.QMUIRelativeLayout;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.util.C9141b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.android.tool.util.weight.sectionDialog.d */
/* loaded from: classes.dex */
public final class C2628d extends RecyclerView.AbstractC1572e<RecyclerView.AbstractC1597y> {

    /* renamed from: h */
    public final Context f6172h;

    /* renamed from: i */
    public final LayoutInflater f6173i;

    /* renamed from: j */
    public List<C2634e> f6174j;

    /* renamed from: k */
    public InterfaceC2632d f6175k;

    /* renamed from: com.android.tool.util.weight.sectionDialog.d$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2629a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f6176a;

        public View$OnClickListenerC2629a(int i) {
            this.f6176a = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            InterfaceC2632d interfaceC2632d = C2628d.this.f6175k;
            if (interfaceC2632d != null) {
                C2640k.C2641a c2641a = ((C2637h) interfaceC2632d).f6190a;
                if (c2641a.f6195j != null) {
                    int m9339a = C2603g.m9339a("LocaleLan");
                    int i = this.f6176a;
                    if (m9339a != 0 && c2641a.f6199n.f6174j.get(i).f6184b.contains(" ")) {
                        str = c2641a.f6199n.f6174j.get(i).f6184b.split(" ")[C2603g.m9339a("LocaleLan")];
                    } else {
                        str = c2641a.f6199n.f6174j.get(i).f6184b;
                    }
                    c2641a.f6207v = str;
                    C2603g.m9336d("SELECTSERVER", c2641a.f6199n.f6174j.get(i).f6185c);
                    C2640k.InterfaceC2642b interfaceC2642b = c2641a.f6195j;
                    C2470n.m9414A(View$OnClickListenerC2481q.this.f5941b, c2641a.f6207v + "\u3000" + c2641a.f6199n.f6174j.get(i).f6183a);
                    c2641a.m9319f();
                }
            }
        }
    }

    /* renamed from: com.android.tool.util.weight.sectionDialog.d$b */
    /* loaded from: classes.dex */
    public class C2630b extends GridLayoutManager.AbstractC1556c {
        public C2630b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1556c
        /* renamed from: d */
        public final int mo6385d(int i) {
            if (C2628d.this.f6174j.get(i).f6186d != 1) {
                return 1;
            }
            return 3;
        }
    }

    /* renamed from: com.android.tool.util.weight.sectionDialog.d$c */
    /* loaded from: classes.dex */
    public static class C2631c extends RecyclerView.AbstractC1597y {

        /* renamed from: b */
        public final TextView f6179b;

        /* renamed from: c */
        public final LinearLayout f6180c;

        /* renamed from: d */
        public final QMUIRelativeLayout f6181d;

        public C2631c(@NonNull View view) {
            super(view);
            this.f6180c = (LinearLayout) view.findViewById(R.id.layout);
            this.f6179b = (TextView) view.findViewById(R.id.tv_right_content);
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_right_content);
            this.f6181d = (QMUIRelativeLayout) view.findViewById(R.id.qlayout);
        }
    }

    /* renamed from: com.android.tool.util.weight.sectionDialog.d$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2632d {
    }

    /* renamed from: com.android.tool.util.weight.sectionDialog.d$e */
    /* loaded from: classes.dex */
    public static class C2633e extends RecyclerView.AbstractC1597y {

        /* renamed from: b */
        public final TextView f6182b;

        public C2633e(@NonNull View view) {
            super(view);
            this.f6182b = (TextView) view.findViewById(R.id.tv_right_title);
        }
    }

    public C2628d(FragmentActivity fragmentActivity) {
        this.f6172h = fragmentActivity;
        this.f6173i = LayoutInflater.from(fragmentActivity);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final int getItemCount() {
        if (this.f6174j == null) {
            this.f6174j = new ArrayList();
        }
        return this.f6174j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final int getItemViewType(int i) {
        return this.f6174j.get(i).f6186d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).f3583K = new C2630b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final void onBindViewHolder(@NonNull RecyclerView.AbstractC1597y abstractC1597y, @SuppressLint({"RecyclerView"}) int i) {
        TextView textView;
        String str;
        C2634e c2634e = this.f6174j.get(i);
        int itemViewType = getItemViewType(i);
        if (itemViewType != 1) {
            if (itemViewType == 2) {
                C2631c c2631c = (C2631c) abstractC1597y;
                TextView textView2 = c2631c.f6179b;
                textView2.setText(this.f6172h.getString(R.string.ic_xianlu) + "\n" + c2634e.f6183a);
                c2631c.f6180c.setOnClickListener(new View$OnClickListenerC2629a(i));
                C9135i m2657a = C9135i.m2657a();
                m2657a.m2652f(R.attr.selecttextround);
                int i2 = C9106f.f17535a;
                C9106f.m2677c(c2631c.f6179b, m2657a.m2655c());
                C9135i m2657a2 = C9135i.m2657a();
                m2657a2.m2656b(R.attr.selectbground);
                String m2655c = m2657a2.m2655c();
                QMUIRelativeLayout qMUIRelativeLayout = c2631c.f6181d;
                C9106f.m2677c(qMUIRelativeLayout, m2655c);
                int m2646a = C9141b.m2646a(ApplicationC2534a.f6025a, 5);
                C9063g c9063g = qMUIRelativeLayout.f17326b;
                if (c9063g.f17331A != m2646a || c9063g.f17332B != 0) {
                    c9063g.m2744v(m2646a, c9063g.f17344N, 0, c9063g.f17343M);
                    return;
                }
                return;
            }
            return;
        }
        C2633e c2633e = (C2633e) abstractC1597y;
        if (C2603g.m9339a("LocaleLan") == 0) {
            textView = c2633e.f6182b;
            str = c2634e.f6184b;
        } else {
            boolean contains = c2634e.f6184b.contains(" ");
            textView = c2633e.f6182b;
            if (contains) {
                str = c2634e.f6184b.split(" ")[C2603g.m9339a("LocaleLan")];
            } else {
                str = c2634e.f6184b;
            }
        }
        textView.setText(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    @NonNull
    public final RecyclerView.AbstractC1597y onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.f6173i;
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return new C2631c(layoutInflater.inflate(R.layout.item_right_content, viewGroup, false));
        }
        return new C2633e(layoutInflater.inflate(R.layout.item_right_title, viewGroup, false));
    }
}
