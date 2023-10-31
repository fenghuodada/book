package com.android.tool.adapter;

import android.widget.ImageView;
import com.ambrose.overwall.R;
import com.android.tool.bean.ResultsBean;
import com.chad.library.adapter.base.AbstractC3874b;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.List;

/* renamed from: com.android.tool.adapter.c */
/* loaded from: classes.dex */
public final class C2538c extends AbstractC3874b<ResultsBean, BaseViewHolder> {

    /* renamed from: n */
    public ImageView f6034n;

    public C2538c(List<ResultsBean> list) {
        super(R.layout.recommend_item, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ca  */
    @Override // com.chad.library.adapter.base.AbstractC3874b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo6389a(@org.jetbrains.annotations.NotNull com.chad.library.adapter.base.viewholder.BaseViewHolder r7, com.android.tool.bean.ResultsBean r8) {
        /*
            r6 = this;
            com.android.tool.bean.ResultsBean r8 = (com.android.tool.bean.ResultsBean) r8
            r0 = 2131361981(0x7f0a00bd, float:1.834373E38)
            android.view.View r0 = r7.getView(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.f6034n = r0
            java.lang.String r0 = r8.getImgUrl()
            if (r0 == 0) goto L38
            com.android.tool.a r0 = com.android.tool.ApplicationC2534a.f6025a
            com.bumptech.glide.l r0 = com.bumptech.glide.ComponentCallbacks2C3409b.m6783e(r0)
            java.lang.String r1 = r8.getImgUrl()
            java.lang.String r1 = r1.trim()
            r0.getClass()
            com.bumptech.glide.k r2 = new com.bumptech.glide.k
            java.lang.Class<android.graphics.drawable.Drawable> r3 = android.graphics.drawable.Drawable.class
            com.bumptech.glide.b r4 = r0.f9164a
            android.content.Context r5 = r0.f9165b
            r2.<init>(r4, r0, r3, r5)
            com.bumptech.glide.k r0 = r2.m6731x(r1)
            android.widget.ImageView r1 = r6.f6034n
            r0.m6733v(r1)
        L38:
            int r0 = r7.getAdapterPosition()
            int r0 = r0 + 1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1 = 2131362532(0x7f0a02e4, float:1.8344847E38)
            r7.setText(r1, r0)
            java.lang.String r0 = "LocaleLan"
            int r1 = com.android.tool.util.util.C2603g.m9339a(r0)
            java.lang.String r2 = "』"
            java.lang.String r3 = "\u3000"
            java.lang.String r4 = "『"
            if (r1 != 0) goto L5c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            goto L95
        L5c:
            java.lang.String r1 = r8.getMsg()
            java.lang.String r5 = " "
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto L90
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            java.lang.String r4 = r8.getMsg()
            java.lang.String[] r4 = r4.split(r5)
            int r0 = com.android.tool.util.util.C2603g.m9339a(r0)
            r0 = r4[r0]
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r8.getObjectId()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            goto Lb1
        L90:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
        L95:
            java.lang.String r1 = r8.getMsg()
            java.lang.String r1 = r1.trim()
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = r8.getObjectId()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        Lb1:
            r1 = 2131362528(0x7f0a02e0, float:1.834484E38)
            r7.setText(r1, r0)
            java.lang.Long r0 = r8.getMs()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "999999"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lca
            java.lang.String r8 = "-1ms"
            goto Ldf
        Lca:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Long r8 = r8.getMs()
            r0.append(r8)
            java.lang.String r8 = "ms"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        Ldf:
            r0 = 2131362247(0x7f0a01c7, float:1.834427E38)
            r7.setText(r0, r8)
            com.qmuiteam.qmui.skin.i r8 = com.qmuiteam.qmui.skin.C9135i.m2657a()
            r0 = 2130969988(0x7f040584, float:1.7548673E38)
            r8.m2652f(r0)
            android.view.View r7 = r7.getView(r1)
            int r0 = com.qmuiteam.qmui.skin.C9106f.f17535a
            java.lang.String r8 = r8.m2655c()
            com.qmuiteam.qmui.skin.C9106f.m2677c(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.tool.adapter.C2538c.mo6389a(com.chad.library.adapter.base.viewholder.BaseViewHolder, java.lang.Object):void");
    }
}
