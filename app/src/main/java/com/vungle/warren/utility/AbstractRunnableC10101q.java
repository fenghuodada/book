package com.vungle.warren.utility;

import androidx.annotation.NonNull;

/* renamed from: com.vungle.warren.utility.q */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC10101q implements Comparable, Runnable {
    /* renamed from: b */
    public abstract Integer mo1252b();

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull Object obj) {
        if (obj instanceof AbstractRunnableC10101q) {
            return ((AbstractRunnableC10101q) obj).mo1252b().compareTo(mo1252b());
        }
        return -1;
    }
}
