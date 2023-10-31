package com.android.tool.adapter;

import android.graphics.drawable.Drawable;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import com.ambrose.overwall.R;
import com.android.tool.ApplicationC2534a;
import com.android.tool.pref.C2553a;
import com.android.tool.pref.C2556b;
import com.bumptech.glide.C3439k;
import com.bumptech.glide.ComponentCallbacks2C3409b;
import com.bumptech.glide.ComponentCallbacks2C3441l;
import com.bumptech.glide.load.engine.AbstractC3543m;
import com.bumptech.glide.request.C3827g;
import com.chad.library.adapter.base.AbstractC3874b;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.android.tool.adapter.b */
/* loaded from: classes.dex */
public final class C2536b extends AbstractC3874b<C2553a, BaseViewHolder> implements Filterable {

    /* renamed from: n */
    public SwitchCompat f6028n;

    /* renamed from: o */
    public ImageView f6029o;

    /* renamed from: p */
    public final C2556b f6030p;

    /* renamed from: q */
    public List<C2553a> f6031q;

    /* renamed from: r */
    public final List<C2553a> f6032r;

    /* renamed from: com.android.tool.adapter.b$a */
    /* loaded from: classes.dex */
    public class C2537a extends Filter {
        public C2537a() {
        }

        @Override // android.widget.Filter
        public final Filter.FilterResults performFiltering(CharSequence charSequence) {
            String charSequence2 = charSequence.toString();
            boolean isEmpty = charSequence2.isEmpty();
            C2536b c2536b = C2536b.this;
            if (isEmpty) {
                c2536b.f6031q = c2536b.f6032r;
            } else {
                ArrayList arrayList = new ArrayList();
                for (C2553a c2553a : c2536b.f6032r) {
                    if (c2553a.f6047a.toLowerCase().contains(charSequence2.toLowerCase())) {
                        arrayList.add(c2553a);
                    }
                }
                c2536b.f6031q = arrayList;
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = c2536b.f6031q;
            return filterResults;
        }

        @Override // android.widget.Filter
        public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            List list = (List) filterResults.values;
            C2536b c2536b = C2536b.this;
            c2536b.f6031q = list;
            if (list != c2536b.f9967h) {
                if (list == null) {
                    list = new ArrayList();
                }
                c2536b.f9967h = list;
                c2536b.notifyDataSetChanged();
            }
        }
    }

    public C2536b(@Nullable LinkedList linkedList, C2556b c2556b) {
        super(R.layout.app_item, linkedList);
        this.f6030p = c2556b;
        this.f6032r = linkedList;
        this.f6031q = new ArrayList();
    }

    @Override // com.chad.library.adapter.base.AbstractC3874b
    /* renamed from: a */
    public final void mo6389a(@Nullable BaseViewHolder baseViewHolder, C2553a c2553a) {
        SwitchCompat switchCompat;
        boolean z;
        C2553a c2553a2 = c2553a;
        SwitchCompat switchCompat2 = (SwitchCompat) baseViewHolder.getView(R.id.checkbox);
        this.f6028n = switchCompat2;
        switchCompat2.setOnCheckedChangeListener(null);
        this.f6029o = (ImageView) baseViewHolder.getView(R.id.server_flag);
        ComponentCallbacks2C3441l m6783e = ComponentCallbacks2C3409b.m6783e(ApplicationC2534a.f6025a);
        Drawable drawable = c2553a2.f6049c;
        m6783e.getClass();
        new C3439k(m6783e.f9164a, m6783e, Drawable.class, m6783e.f9165b).m6731x(drawable).m6736s(new C3827g().m6468d(AbstractC3543m.f9400a)).m6733v(this.f6029o);
        baseViewHolder.setText(R.id.enter_server_description, c2553a2.f6047a);
        if (c2553a2.f6050d) {
            switchCompat = this.f6028n;
            z = true;
        } else {
            switchCompat = this.f6028n;
            z = false;
        }
        switchCompat.setChecked(z);
        this.f6028n.setOnCheckedChangeListener(new C2535a(this, c2553a2));
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new C2537a();
    }
}
