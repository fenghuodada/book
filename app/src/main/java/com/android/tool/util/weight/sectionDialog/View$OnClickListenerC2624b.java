package com.android.tool.util.weight.sectionDialog;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ambrose.overwall.R;
import com.android.tool.ApplicationC2534a;
import com.android.tool.util.util.C2603g;
import com.android.tool.util.weight.sectionDialog.C2640k;
import com.bumptech.glide.C3439k;
import com.bumptech.glide.ComponentCallbacks2C3409b;
import com.bumptech.glide.ComponentCallbacks2C3441l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.android.tool.util.weight.sectionDialog.b */
/* loaded from: classes.dex */
public final class View$OnClickListenerC2624b extends RecyclerView.AbstractC1572e<C2626b> implements View.OnClickListener {

    /* renamed from: h */
    public final LayoutInflater f6163h;

    /* renamed from: i */
    public List<C2627c> f6164i;

    /* renamed from: j */
    public InterfaceC2625a f6165j;

    /* renamed from: com.android.tool.util.weight.sectionDialog.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2625a {
    }

    /* renamed from: com.android.tool.util.weight.sectionDialog.b$b */
    /* loaded from: classes.dex */
    public static class C2626b extends RecyclerView.AbstractC1597y {

        /* renamed from: b */
        public final TextView f6166b;

        /* renamed from: c */
        public final ImageView f6167c;

        /* renamed from: d */
        public final RelativeLayout f6168d;

        public C2626b(@NonNull View view) {
            super(view);
            this.f6166b = (TextView) view.findViewById(R.id.tv_left);
            this.f6167c = (ImageView) view.findViewById(R.id.image);
            this.f6168d = (RelativeLayout) view.findViewById(R.id.rlayout);
        }
    }

    public View$OnClickListenerC2624b(FragmentActivity fragmentActivity) {
        this.f6163h = LayoutInflater.from(fragmentActivity);
    }

    /* renamed from: b */
    public final void m9320b(int i) {
        for (int i2 = 0; i2 < this.f6164i.size(); i2++) {
            C2627c c2627c = this.f6164i.get(i2);
            if (i2 == i) {
                c2627c.f6171c = true;
            } else {
                c2627c.f6171c = false;
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final int getItemCount() {
        if (this.f6164i == null) {
            this.f6164i = new ArrayList();
        }
        return this.f6164i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final void onBindViewHolder(@NonNull C2626b c2626b, int i) {
        RelativeLayout relativeLayout;
        String str;
        C2626b c2626b2 = c2626b;
        C2627c c2627c = this.f6164i.get(i);
        if (c2627c.f6171c) {
            relativeLayout = c2626b2.f6168d;
            str = "#66808080";
        } else {
            relativeLayout = c2626b2.f6168d;
            str = "#00000000";
        }
        relativeLayout.setBackgroundColor(Color.parseColor(str));
        String str2 = c2627c.f6169a;
        if (str2.contains(" ")) {
            c2626b2.f6166b.setText(str2.split(" ")[C2603g.m9339a("LocaleLan")]);
        } else {
            c2626b2.f6166b.setText(str2);
        }
        c2626b2.f6168d.setTag(Integer.valueOf(i));
        c2626b2.f6168d.setOnClickListener(this);
        ComponentCallbacks2C3441l m6783e = ComponentCallbacks2C3409b.m6783e(ApplicationC2534a.f6025a);
        m6783e.getClass();
        new C3439k(m6783e.f9164a, m6783e, Drawable.class, m6783e.f9165b).m6731x(c2627c.f6170b).m6733v(c2626b2.f6167c);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2625a interfaceC2625a = this.f6165j;
        if (interfaceC2625a != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            C2640k.C2641a c2641a = ((C2636g) interfaceC2625a).f6189a;
            c2641a.f6196k.m10377c0(intValue);
            c2641a.f6198m.m9320b(intValue);
            GridLayoutManager gridLayoutManager = c2641a.f6209x;
            if (gridLayoutManager != null) {
                SparseIntArray sparseIntArray = C2640k.f6194a;
                gridLayoutManager.m10418d1(sparseIntArray.get(intValue), 0);
                c2641a.f6204s = sparseIntArray.get(intValue);
                c2641a.f6203r = 0;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    @NonNull
    public final C2626b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C2626b(this.f6163h.inflate(R.layout.item_left, viewGroup, false));
    }
}
