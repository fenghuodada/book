package com.unity3d.services.ads.adunit;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.unity3d.services.ads.adunit.e */
/* loaded from: classes3.dex */
public class C9298e extends RelativeLayout {

    /* renamed from: a */
    private final ArrayList<C9296c> f18163a;

    /* renamed from: b */
    private int f18164b;

    /* renamed from: c */
    private boolean f18165c;

    public C9298e(Context context) {
        super(context);
        this.f18163a = new ArrayList<>();
        this.f18164b = 10000;
        this.f18165c = false;
    }

    /* renamed from: a */
    public SparseArray<SparseArray<C9296c>> m2484a(SparseArray<ArrayList<Integer>> sparseArray) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseArray<SparseArray<C9296c>> sparseArray2 = new SparseArray<>();
        synchronized (this.f18163a) {
            Iterator<C9296c> it = this.f18163a.iterator();
            while (it.hasNext()) {
                C9296c next = it.next();
                ArrayList<Integer> arrayList = sparseArray.get(next.m2497a());
                if (arrayList != null) {
                    int intValue = arrayList.get(0).intValue();
                    if (sparseIntArray.get(next.m2497a(), 0) == intValue) {
                        if (sparseArray2.get(next.m2497a()) == null) {
                            sparseArray2.put(next.m2497a(), new SparseArray<>());
                        }
                        sparseArray2.get(next.m2497a()).put(intValue, next);
                        arrayList.remove(0);
                    }
                    sparseIntArray.put(next.m2497a(), sparseIntArray.get(next.m2497a()) + 1);
                }
            }
        }
        return sparseArray2;
    }

    /* renamed from: a */
    public SparseIntArray m2483a(ArrayList<Integer> arrayList) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        synchronized (this.f18163a) {
            Iterator<C9296c> it = this.f18163a.iterator();
            while (it.hasNext()) {
                C9296c next = it.next();
                Iterator<Integer> it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Integer next2 = it2.next();
                        if (next.m2497a() == next2.intValue()) {
                            sparseIntArray.put(next2.intValue(), sparseIntArray.get(next2.intValue(), 0) + 1);
                            break;
                        }
                    }
                }
            }
        }
        return sparseIntArray;
    }

    /* renamed from: a */
    public void m2486a() {
        synchronized (this.f18163a) {
            this.f18163a.clear();
        }
    }

    /* renamed from: a */
    public void m2485a(int i) {
        this.f18164b = i;
        this.f18165c = true;
    }

    /* renamed from: b */
    public void m2482b() {
        this.f18165c = false;
    }

    public int getCurrentEventCount() {
        int size;
        synchronized (this.f18163a) {
            size = this.f18163a.size();
        }
        return size;
    }

    public int getMaxEventCount() {
        return this.f18164b;
    }

    @Override // android.view.ViewGroup
    @TargetApi(14)
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        if (!this.f18165c || this.f18163a.size() >= this.f18164b) {
            return false;
        }
        boolean z = (motionEvent.getFlags() & 1) != 0;
        synchronized (this.f18163a) {
            this.f18163a.add(new C9296c(motionEvent.getActionMasked(), z, motionEvent.getToolType(0), motionEvent.getSource(), motionEvent.getDeviceId(), motionEvent.getX(0), motionEvent.getY(0), motionEvent.getEventTime(), motionEvent.getPressure(0), motionEvent.getSize(0)));
        }
        return false;
    }
}
