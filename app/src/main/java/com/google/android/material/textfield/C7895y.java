package com.google.android.material.textfield;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.C0334e1;

/* renamed from: com.google.android.material.textfield.y */
/* loaded from: classes3.dex */
public final class C7895y implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C7896z f15603a;

    public C7895y(C7896z c7896z) {
        this.f15603a = c7896z;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object item;
        int selectedItemPosition;
        View view2 = null;
        C7896z c7896z = this.f15603a;
        if (i < 0) {
            C0334e1 c0334e1 = c7896z.f15604e;
            if (!c0334e1.mo12653a()) {
                item = null;
            } else {
                item = c0334e1.f1198c.getSelectedItem();
            }
        } else {
            item = c7896z.getAdapter().getItem(i);
        }
        C7896z.m4326a(c7896z, item);
        AdapterView.OnItemClickListener onItemClickListener = c7896z.getOnItemClickListener();
        C0334e1 c0334e12 = c7896z.f15604e;
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                if (c0334e12.mo12653a()) {
                    view2 = c0334e12.f1198c.getSelectedView();
                }
                view = view2;
                if (!c0334e12.mo12653a()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = c0334e12.f1198c.getSelectedItemPosition();
                }
                i = selectedItemPosition;
                if (!c0334e12.mo12653a()) {
                    j = Long.MIN_VALUE;
                } else {
                    j = c0334e12.f1198c.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick(c0334e12.f1198c, view, i, j);
        }
        c0334e12.dismiss();
    }
}
