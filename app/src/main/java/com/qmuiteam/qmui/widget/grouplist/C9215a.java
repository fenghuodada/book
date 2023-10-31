package com.qmuiteam.qmui.widget.grouplist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.util.C9143d;

/* renamed from: com.qmuiteam.qmui.widget.grouplist.a */
/* loaded from: classes3.dex */
public final class C9215a extends LinearLayout {

    /* renamed from: a */
    public TextView f17846a;

    public C9215a(Context context) {
        super(context, null, R.attr.QMUIGroupListSectionViewStyle);
        LayoutInflater.from(context).inflate(R.layout.qmui_group_list_section_layout, (ViewGroup) this, true);
        setGravity(80);
        this.f17846a = (TextView) findViewById(R.id.group_list_section_header_textView);
    }

    public TextView getTextView() {
        return this.f17846a;
    }

    public void setText(CharSequence charSequence) {
        TextView textView;
        int i;
        if (C9143d.m2642c(charSequence)) {
            textView = this.f17846a;
            i = 8;
        } else {
            textView = this.f17846a;
            i = 0;
        }
        textView.setVisibility(i);
        this.f17846a.setText(charSequence);
    }

    public void setTextGravity(int i) {
        this.f17846a.setGravity(i);
    }
}
