package com.bumptech.glide;

import com.bumptech.glide.AbstractC3779m;
import com.bumptech.glide.request.transition.C3841a;

/* renamed from: com.bumptech.glide.m */
/* loaded from: classes.dex */
public abstract class AbstractC3779m<CHILD extends AbstractC3779m<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a */
    public final C3841a.C3842a f9796a = C3841a.f9928a;

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
