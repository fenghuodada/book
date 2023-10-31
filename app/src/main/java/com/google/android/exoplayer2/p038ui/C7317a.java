package com.google.android.exoplayer2.p038ui;

import android.content.Context;
import android.view.View;
import com.google.android.exoplayer2.p038ui.SubtitleView;
import com.google.android.exoplayer2.text.Cue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.ui.a */
/* loaded from: classes.dex */
public final class C7317a extends View implements SubtitleView.InterfaceC7314a {

    /* renamed from: a */
    public final ArrayList f13555a;

    /* renamed from: b */
    public List<Cue> f13556b;

    /* renamed from: c */
    public int f13557c;

    /* renamed from: d */
    public float f13558d;

    /* renamed from: e */
    public CaptionStyleCompat f13559e;

    /* renamed from: f */
    public float f13560f;

    public C7317a(Context context) {
        super(context, null);
        this.f13555a = new ArrayList();
        this.f13556b = Collections.emptyList();
        this.f13557c = 0;
        this.f13558d = 0.0533f;
        this.f13559e = CaptionStyleCompat.f13502g;
        this.f13560f = 0.08f;
    }

    @Override // com.google.android.exoplayer2.p038ui.SubtitleView.InterfaceC7314a
    /* renamed from: a */
    public final void mo5181a(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.f13556b = list;
        this.f13559e = captionStyleCompat;
        this.f13558d = f;
        this.f13557c = i;
        this.f13560f = f2;
        while (true) {
            ArrayList arrayList = this.f13555a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new C7336m(getContext()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x043b, code lost:
        if (r6 < r3) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04e9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r44) {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p038ui.C7317a.dispatchDraw(android.graphics.Canvas):void");
    }
}
