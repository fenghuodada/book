package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.google.android.material.shadow.C7788a;
import com.google.android.material.shape.C7806m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.shape.l */
/* loaded from: classes3.dex */
public final class C7805l extends C7806m.AbstractC7812f {

    /* renamed from: c */
    public final /* synthetic */ List f15270c;

    /* renamed from: d */
    public final /* synthetic */ Matrix f15271d;

    public C7805l(ArrayList arrayList, Matrix matrix) {
        this.f15270c = arrayList;
        this.f15271d = matrix;
    }

    @Override // com.google.android.material.shape.C7806m.AbstractC7812f
    /* renamed from: a */
    public final void mo4443a(Matrix matrix, C7788a c7788a, int i, Canvas canvas) {
        for (C7806m.AbstractC7812f abstractC7812f : this.f15270c) {
            abstractC7812f.mo4443a(this.f15271d, c7788a, i, canvas);
        }
    }
}
