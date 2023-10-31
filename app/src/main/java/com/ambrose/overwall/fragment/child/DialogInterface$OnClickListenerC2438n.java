package com.ambrose.overwall.fragment.child;

import android.content.DialogInterface;
import com.android.tool.util.util.C2603g;

/* renamed from: com.ambrose.overwall.fragment.child.n */
/* loaded from: classes.dex */
public final class DialogInterface$OnClickListenerC2438n implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C2603g.m9337c(i + 1, "AnimStyle");
        dialogInterface.dismiss();
    }
}
