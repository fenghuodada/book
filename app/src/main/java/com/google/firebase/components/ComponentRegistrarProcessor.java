package com.google.firebase.components;

import androidx.constraintlayout.core.widgets.C0539e;
import java.util.List;

/* loaded from: classes3.dex */
public interface ComponentRegistrarProcessor {
    public static final ComponentRegistrarProcessor NOOP = new C0539e();

    List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar);
}
