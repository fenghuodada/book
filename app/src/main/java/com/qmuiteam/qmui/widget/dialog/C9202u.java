package com.qmuiteam.qmui.widget.dialog;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.util.C9145f;

/* renamed from: com.qmuiteam.qmui.widget.dialog.u */
/* loaded from: classes3.dex */
public final class C9202u extends ViewGroup {

    /* renamed from: a */
    public final C9204v f17763a;

    /* renamed from: b */
    public final FrameLayout.LayoutParams f17764b;

    /* renamed from: c */
    public int f17765c;

    /* renamed from: d */
    public int f17766d;

    /* renamed from: e */
    public int f17767e;

    /* renamed from: f */
    public int f17768f;

    /* renamed from: g */
    public boolean f17769g;

    /* renamed from: h */
    public float f17770h;

    /* renamed from: i */
    public boolean f17771i;

    /* renamed from: j */
    public InterfaceC9203a f17772j;

    /* renamed from: k */
    public int f17773k;

    /* renamed from: com.qmuiteam.qmui.widget.dialog.u$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC9203a {
    }

    public C9202u(@NonNull Context context, @NonNull C9204v c9204v, @Nullable FrameLayout.LayoutParams layoutParams) {
        super(context);
        this.f17769g = false;
        this.f17770h = 0.75f;
        this.f17771i = false;
        this.f17773k = 0;
        this.f17763a = c9204v;
        this.f17764b = layoutParams;
        addView(c9204v, layoutParams);
        this.f17765c = C9145f.m2636e(context, R.attr.qmui_dialog_min_width);
        this.f17766d = C9145f.m2636e(context, R.attr.qmui_dialog_max_width);
        this.f17767e = C9145f.m2636e(context, R.attr.qmui_dialog_inset_hor);
        this.f17768f = C9145f.m2636e(context, R.attr.qmui_dialog_inset_ver);
        setId(R.id.qmui_dialog_root_layout);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i = this.f17773k;
        if (i > 0) {
            motionEvent.offsetLocation(0.0f, -i);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C9204v getDialogView() {
        return this.f17763a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C9204v c9204v = this.f17763a;
        int measuredWidth = ((i3 - i) - c9204v.getMeasuredWidth()) / 2;
        c9204v.layout(measuredWidth, this.f17768f, c9204v.getMeasuredWidth() + measuredWidth, c9204v.getMeasuredHeight() + this.f17768f);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.widget.dialog.C9202u.onMeasure(int, int):void");
    }

    public void setCheckKeyboardOverlay(boolean z) {
        this.f17769g = z;
    }

    public void setInsetHor(int i) {
        this.f17767e = i;
    }

    public void setInsetVer(int i) {
        this.f17768f = i;
    }

    public void setMaxPercent(float f) {
        this.f17770h = f;
    }

    public void setMaxWidth(int i) {
        this.f17766d = i;
    }

    public void setMinWidth(int i) {
        this.f17765c = i;
    }

    public void setOverlayOccurInMeasureCallback(InterfaceC9203a interfaceC9203a) {
        this.f17772j = interfaceC9203a;
    }
}
