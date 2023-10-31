package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C7688j;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.x */
/* loaded from: classes3.dex */
public final class C7709x implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ MaterialCalendarGridView f14910a;

    /* renamed from: b */
    public final /* synthetic */ C7710y f14911b;

    public C7709x(C7710y c7710y, MaterialCalendarGridView materialCalendarGridView) {
        this.f14911b = c7710y;
        this.f14910a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean z;
        MaterialCalendarGridView materialCalendarGridView = this.f14910a;
        C7708w adapter2 = materialCalendarGridView.getAdapter2();
        if (i >= adapter2.m4577a() && i <= (adapter2.m4577a() + adapter2.f14904a.f14899e) - 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C7688j.InterfaceC7693e interfaceC7693e = this.f14911b.f14915k;
            long longValue = materialCalendarGridView.getAdapter2().getItem(i).longValue();
            C7688j c7688j = C7688j.this;
            if (c7688j.f14861d.f14816c.mo4594u(longValue)) {
                c7688j.f14860c.m4603j();
                Iterator it = c7688j.f14828a.iterator();
                while (it.hasNext()) {
                    ((AbstractC7712z) it.next()).mo4573a(c7688j.f14860c.m4605A());
                }
                c7688j.f14867j.getAdapter().notifyDataSetChanged();
                RecyclerView recyclerView = c7688j.f14866i;
                if (recyclerView != null) {
                    recyclerView.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }
}
