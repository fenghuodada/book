package com.android.tool.adapter.question;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.ambrose.overwall.R;
import com.android.tool.adapter.question.C2542c;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9135i;
import mva2.adapter.AbstractC11175b;
import mva2.adapter.C11177d;
import mva2.adapter.C11180f;
import mva2.adapter.util.EnumC11188a;

/* renamed from: com.android.tool.adapter.question.c */
/* loaded from: classes.dex */
public final class C2542c extends AbstractC11175b<C2544d, C2543a> {

    /* renamed from: com.android.tool.adapter.question.c$a */
    /* loaded from: classes.dex */
    public static class C2543a extends C11177d<C2544d> {

        /* renamed from: d */
        public final TextView f6036d;

        /* renamed from: e */
        public final TextView f6037e;

        /* renamed from: f */
        public final ImageView f6038f;

        /* renamed from: g */
        public final CardView f6039g;

        public C2543a(View view) {
            super(view);
            this.f6036d = (TextView) view.findViewById(R.id.tv_question);
            this.f6037e = (TextView) view.findViewById(R.id.tv_answer);
            this.f6038f = (ImageView) view.findViewById(R.id.iv_toggle);
            ((LinearLayout) view.findViewById(R.id.layout)).setOnClickListener(new View.OnClickListener() { // from class: com.android.tool.adapter.question.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C2542c.C2543a c2543a = C2542c.C2543a.this;
                    C11180f c11180f = c2543a.f21834c;
                    c11180f.f21838h.mo70n(c2543a.getAdapterPosition(), EnumC11188a.MULTIPLE);
                }
            });
            this.f6039g = (CardView) view.findViewById(R.id.cardview);
        }
    }

    @Override // mva2.adapter.AbstractC11175b
    /* renamed from: a */
    public final void mo93a(C2543a c2543a, C2544d c2544d) {
        int i;
        int i2;
        C2543a c2543a2 = c2543a;
        C2544d c2544d2 = c2544d;
        ImageView imageView = c2543a2.f6038f;
        C11180f c11180f = c2543a2.f21834c;
        if (c11180f.f21838h.mo74j(c2543a2.getAdapterPosition())) {
            i = R.drawable.ic_expand_less;
        } else {
            i = R.drawable.ic_expand_more;
        }
        imageView.setImageResource(i);
        c2543a2.f6036d.setText(c2544d2.f6040a);
        C11180f c11180f2 = c2543a2.f21834c;
        if (c11180f2.f21838h.mo74j(c2543a2.getAdapterPosition())) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        TextView textView = c2543a2.f6037e;
        textView.setVisibility(i2);
        C11180f c11180f3 = c2543a2.f21834c;
        if (c11180f3.f21838h.mo74j(c2543a2.getAdapterPosition())) {
            textView.setText(c2544d2.f6041b);
        }
        C9135i m2657a = C9135i.m2657a();
        m2657a.m2656b(R.attr.app_skin_common_background);
        int i3 = C9106f.f17535a;
        C9106f.m2677c(c2543a2.f6039g, m2657a.m2655c());
    }

    @Override // mva2.adapter.AbstractC11175b
    /* renamed from: c */
    public final boolean mo91c(Object obj) {
        return obj instanceof C2544d;
    }

    @Override // mva2.adapter.AbstractC11175b
    /* renamed from: d */
    public final C2543a mo90d(ViewGroup viewGroup) {
        return new C2543a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_faq, viewGroup, false));
    }
}
