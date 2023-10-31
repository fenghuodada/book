package com.qmuiteam.qmui.arch;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.InterfaceC1480k0;
import com.ambrose.overwall.R;

/* renamed from: com.qmuiteam.qmui.arch.f */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC9024f extends ActivityC9007a implements InterfaceC9030g {

    /* renamed from: e */
    public C9025a f17242e;

    /* renamed from: f */
    public boolean f17243f = false;

    @SuppressLint({"ViewConstructor"})
    /* renamed from: com.qmuiteam.qmui.arch.f$a */
    /* loaded from: classes3.dex */
    public static class C9025a extends AbstractC9026b {

        /* renamed from: a */
        public final FragmentContainerView f17244a;

        public C9025a(Context context) {
            super(context);
            FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
            this.f17244a = fragmentContainerView;
            fragmentContainerView.setId(R.id.qmui_activity_fragment_container_id);
            addView(fragmentContainerView, new FrameLayout.LayoutParams(-1, -1));
        }

        @Override // com.qmuiteam.qmui.arch.AbstractActivityC9024f.AbstractC9026b
        public FragmentContainerView getFragmentContainerView() {
            return this.f17244a;
        }
    }

    /* renamed from: com.qmuiteam.qmui.arch.f$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC9026b extends FrameLayout {
        public AbstractC9026b(Context context) {
            super(context);
            setId(R.id.qmui_activity_root_id);
        }

        public abstract FragmentContainerView getFragmentContainerView();
    }

    @Override // com.qmuiteam.qmui.arch.InterfaceC9030g
    /* renamed from: a */
    public final boolean mo2795a() {
        return this.f17243f;
    }

    @Override // com.qmuiteam.qmui.arch.InterfaceC9030g
    /* renamed from: b */
    public final InterfaceC1480k0 mo2794b() {
        return this;
    }

    @Override // com.qmuiteam.qmui.arch.InterfaceC9030g
    /* renamed from: c */
    public final FragmentContainerView mo2793c() {
        return this.f17242e.getFragmentContainerView();
    }

    @Override // com.qmuiteam.qmui.arch.InterfaceC9030g
    /* renamed from: d */
    public final void mo2792d(boolean z) {
        this.f17243f = z;
    }

    @Override // com.qmuiteam.qmui.arch.InterfaceC9030g
    /* renamed from: e */
    public final FragmentManager mo2791e() {
        return getSupportFragmentManager();
    }

    @Override // com.qmuiteam.qmui.arch.InterfaceC9030g
    /* renamed from: f */
    public final void mo2790f() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
        if (r1 == false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.qmuiteam.qmui.arch.ActivityC9007a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0629l, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.arch.AbstractActivityC9024f.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.appcompat.app.ActivityC0101d, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.qmui_activity_fragment_container_id);
        if (findFragmentById instanceof AbstractC9008b) {
            AbstractC9008b abstractC9008b = (AbstractC9008b) findFragmentById;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.qmui_activity_fragment_container_id);
        if (findFragmentById instanceof AbstractC9008b) {
            AbstractC9008b abstractC9008b = (AbstractC9008b) findFragmentById;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
