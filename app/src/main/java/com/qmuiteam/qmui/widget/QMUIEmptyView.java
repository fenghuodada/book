package com.qmuiteam.qmui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.C9056b;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.skin.annotation.QMUISkinChangeNotAdapted;

/* loaded from: classes3.dex */
public class QMUIEmptyView extends ConstraintLayout {

    /* renamed from: q */
    public QMUILoadingView f17601q;

    /* renamed from: r */
    public TextView f17602r;

    /* renamed from: s */
    public TextView f17603s;

    /* renamed from: t */
    public Button f17604t;

    public QMUIEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        LayoutInflater.from(getContext()).inflate(R.layout.qmui_empty_view, (ViewGroup) this, true);
        this.f17601q = (QMUILoadingView) findViewById(R.id.empty_view_loading);
        this.f17602r = (TextView) findViewById(R.id.empty_view_title);
        this.f17603s = (TextView) findViewById(R.id.empty_view_detail);
        this.f17604t = (Button) findViewById(R.id.empty_view_button);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9056b.f17316k);
        boolean z = obtainStyledAttributes.getBoolean(2, false);
        String string = obtainStyledAttributes.getString(3);
        String string2 = obtainStyledAttributes.getString(1);
        String string3 = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        setLoadingShowing(z);
        setTitleText(string);
        setDetailText(string2);
        this.f17604t.setText(string3);
        Button button = this.f17604t;
        if (string3 != null) {
            i = 0;
        } else {
            i = 8;
        }
        button.setVisibility(i);
        this.f17604t.setOnClickListener(null);
        setVisibility(0);
    }

    public void setBtnSkinValue(C9135i c9135i) {
        Button button = this.f17604t;
        int i = C9106f.f17535a;
        C9106f.m2677c(button, c9135i.m2655c());
    }

    @QMUISkinChangeNotAdapted
    public void setDetailColor(int i) {
        this.f17603s.setTextColor(i);
    }

    public void setDetailSkinValue(C9135i c9135i) {
        TextView textView = this.f17603s;
        int i = C9106f.f17535a;
        C9106f.m2677c(textView, c9135i.m2655c());
    }

    public void setDetailText(String str) {
        this.f17603s.setText(str);
        this.f17603s.setVisibility(str != null ? 0 : 8);
    }

    public void setLoadingShowing(boolean z) {
        this.f17601q.setVisibility(z ? 0 : 8);
    }

    public void setLoadingSkinValue(C9135i c9135i) {
        QMUILoadingView qMUILoadingView = this.f17601q;
        int i = C9106f.f17535a;
        C9106f.m2677c(qMUILoadingView, c9135i.m2655c());
    }

    @QMUISkinChangeNotAdapted
    public void setTitleColor(int i) {
        this.f17602r.setTextColor(i);
    }

    public void setTitleSkinValue(C9135i c9135i) {
        TextView textView = this.f17602r;
        int i = C9106f.f17535a;
        C9106f.m2677c(textView, c9135i.m2655c());
    }

    public void setTitleText(String str) {
        this.f17602r.setText(str);
        this.f17602r.setVisibility(str != null ? 0 : 8);
    }
}
