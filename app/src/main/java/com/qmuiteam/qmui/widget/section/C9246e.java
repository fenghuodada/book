package com.qmuiteam.qmui.widget.section;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.qmuiteam.qmui.layout.C9059c;

/* renamed from: com.qmuiteam.qmui.widget.section.e */
/* loaded from: classes3.dex */
public final class C9246e extends C9059c {
    @Override // com.qmuiteam.qmui.layout.C9059c, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public RecyclerView getRecyclerView() {
        return null;
    }

    public int getStickyHeaderPosition() {
        return -1;
    }

    @Nullable
    public View getStickySectionView() {
        throw null;
    }

    public C9059c getStickySectionWrapView() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(@NonNull View view, @NonNull View view2) {
        super.onDescendantInvalidated(view, view2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public <H, T, VH> void setAdapter(AbstractC9241a<H, T, VH> abstractC9241a) {
        new C9243c(new C9245d(this));
        throw null;
    }

    public void setLayoutManager(@NonNull RecyclerView.LayoutManager layoutManager) {
        throw null;
    }
}
