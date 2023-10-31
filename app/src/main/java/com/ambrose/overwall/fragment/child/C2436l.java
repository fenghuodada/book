package com.ambrose.overwall.fragment.child;

import android.widget.CompoundButton;
import com.android.tool.util.util.C2603g;

/* renamed from: com.ambrose.overwall.fragment.child.l */
/* loaded from: classes.dex */
public final class C2436l implements CompoundButton.OnCheckedChangeListener {
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C2603g.m9336d("LASTCONNECT", z ? "ok" : null);
    }
}
