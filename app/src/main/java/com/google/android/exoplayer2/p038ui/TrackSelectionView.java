package com.google.android.exoplayer2.p038ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.ambrose.overwall.R;
import com.google.android.exoplayer2.source.C7178k0;
import com.google.android.exoplayer2.trackselection.C7286f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView */
/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a */
    public final CheckedTextView f13548a;

    /* renamed from: b */
    public final CheckedTextView f13549b;

    /* renamed from: c */
    public final SparseArray<C7286f.C7292e> f13550c;

    /* renamed from: d */
    public boolean f13551d;

    /* renamed from: e */
    public boolean f13552e;

    /* renamed from: f */
    public boolean f13553f;

    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC7315a implements View.OnClickListener {
        public View$OnClickListenerC7315a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            CheckedTextView checkedTextView = trackSelectionView.f13548a;
            SparseArray<C7286f.C7292e> sparseArray = trackSelectionView.f13550c;
            boolean z = true;
            CheckedTextView checkedTextView2 = trackSelectionView.f13549b;
            if (view == checkedTextView) {
                trackSelectionView.f13553f = true;
                sparseArray.clear();
            } else if (view == checkedTextView2) {
                trackSelectionView.f13553f = false;
                sparseArray.clear();
            } else {
                trackSelectionView.f13553f = false;
                Object tag = view.getTag();
                tag.getClass();
                C7316b c7316b = (C7316b) tag;
                sparseArray.get(0);
                throw null;
            }
            trackSelectionView.f13548a.setChecked(trackSelectionView.f13553f);
            if (trackSelectionView.f13553f || sparseArray.size() != 0) {
                z = false;
            }
            checkedTextView2.setChecked(z);
            throw null;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$b */
    /* loaded from: classes.dex */
    public static final class C7316b {
        public C7316b() {
            throw null;
        }
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        this.f13550c = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        View$OnClickListenerC7315a view$OnClickListenerC7315a = new View$OnClickListenerC7315a();
        new C7321e(getResources());
        C7178k0 c7178k0 = C7178k0.f12904d;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f13548a = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(view$OnClickListenerC7315a);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f13549b = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(view$OnClickListenerC7315a);
        addView(checkedTextView2);
    }

    /* renamed from: a */
    public final void m5220a() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 3) {
                this.f13548a.setEnabled(false);
                this.f13549b.setEnabled(false);
                return;
            }
            removeViewAt(childCount);
        }
    }

    public boolean getIsDisabled() {
        return this.f13553f;
    }

    public List<C7286f.C7292e> getOverrides() {
        SparseArray<C7286f.C7292e> sparseArray = this.f13550c;
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(sparseArray.valueAt(i));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f13551d != z) {
            this.f13551d = z;
            m5220a();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f13552e != z) {
            this.f13552e = z;
            if (!z) {
                SparseArray<C7286f.C7292e> sparseArray = this.f13550c;
                if (sparseArray.size() > 1) {
                    for (int size = sparseArray.size() - 1; size > 0; size--) {
                        sparseArray.remove(size);
                    }
                }
            }
            m5220a();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f13548a.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(InterfaceC7340p interfaceC7340p) {
        interfaceC7340p.getClass();
        m5220a();
    }
}
